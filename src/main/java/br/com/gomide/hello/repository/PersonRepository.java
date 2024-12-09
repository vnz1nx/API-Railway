package br.com.gomide.hello.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gomide.hello.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

  public List<Person> findAllByOrderByUsuarioDesc();

  Optional <Person> findByEmail(String email);

}