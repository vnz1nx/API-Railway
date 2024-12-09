package br.com.gomide.hello.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gomide.hello.mapper.DozerMapper;
import br.com.gomide.hello.model.Person;
import br.com.gomide.hello.service.PersonService;
import br.com.gomide.hello.vo.PersonVO;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

  @Autowired
  private PersonService personService;

  @GetMapping
  public List<PersonVO> findAll() {
    List<Person> people = personService.findAll();
    return DozerMapper.parseListObjects(people, PersonVO.class);
  }

  @GetMapping("/{id}")
  public PersonVO findById(@PathVariable Long id) {
    Optional<Person> personOptional = personService.findById(id);

    if (personOptional.isPresent()) {
      return DozerMapper.parseObject(personOptional.get(), PersonVO.class);
    } else {
      throw new RuntimeException("Usuário não encontrado com o ID: " + id);
    }
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    personService.delete(id);
  }

  @PostMapping("/login")
  public ResponseEntity <?> login(@RequestBody Person personRequest) {
    try {
      Person person = personService.authenticate(personRequest.getEmail(), personRequest.getSenha());
      PersonVO personVO = DozerMapper.parseObject(person, PersonVO.class);
      return ResponseEntity.ok(personVO);
    } catch (RuntimeException e) {
      return ResponseEntity.status(401).body("Falha na autenticação: " + e.getMessage());
    }
  }

  @PostMapping
  public PersonVO create(@RequestBody Person person) {
    return DozerMapper.parseObject(personService.create(person), PersonVO.class);
  }

  @PutMapping("/{id}")
  public PersonVO update(@PathVariable Long id, @RequestBody Person person) {
    Optional<Person> existingPersonOptional = personService.findById(id);

    if (existingPersonOptional.isPresent()) {
      Person existingPerson = existingPersonOptional.get();

      if (person.getUsuario() != null) {
        existingPerson.setUsuario(person.getUsuario());
      }
      if (person.getEmail() != null) {
        existingPerson.setEmail(person.getEmail());
      }
      if (person.getSenha() != null) {
        existingPerson.setSenha(person.getSenha());
      }
      
      Person updatedPerson = personService.update(existingPerson);
      return DozerMapper.parseObject(updatedPerson, PersonVO.class);
    } else {
      throw new RuntimeException("Usuário não encontrado com o ID: " + id);
    }
  }
  }