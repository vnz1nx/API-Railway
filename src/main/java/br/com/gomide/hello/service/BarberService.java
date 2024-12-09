package br.com.gomide.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gomide.hello.model.Barber;
import br.com.gomide.hello.repository.BarberRepository;

@Service
public class BarberService {

  @Autowired
  private BarberRepository barberRepository;

  public List<Barber> findAll() {
    return barberRepository.findAllByOrderByNomeBarbeariaDesc();
  }

  public void delete(Long id) {
    barberRepository.deleteById(id);
  }

  public Barber create(Barber barber) {
    return barberRepository.save(barber);
  }
}
