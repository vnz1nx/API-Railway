package br.com.gomide.hello.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gomide.hello.model.Person;
import br.com.gomide.hello.repository.PersonRepository;

@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  public List<Person> findAll() {
    return personRepository.findAllByOrderByUsuarioDesc();
  }

  public Optional<Person> findById(Long id) {
    return personRepository.findById(id);
  }

  public Person update(Person person) {
    return personRepository.save(person);
}

  public void delete(Long id) {
    personRepository.deleteById(id);
  }

  public Person authenticate(String email,String senha){
    Person person = personRepository.findByEmail(email)
    .orElseThrow(() -> new RuntimeException("E-mail não encontrado"));

    if (!person.getSenha().equals(senha)) {
      throw new RuntimeException("Senha incorreta");
  }

  return person;
  }

  public Person create(Person personDTO) {
    if (personRepository.findByEmail(personDTO.getEmail()).isPresent()) {
        throw new IllegalArgumentException("Email já cadastrado!");
    }
    return personRepository.save(personDTO);
}

}
