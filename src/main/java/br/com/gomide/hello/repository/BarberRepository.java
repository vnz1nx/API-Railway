package br.com.gomide.hello.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gomide.hello.model.Barber;

public interface BarberRepository extends JpaRepository<Barber, Long> {

    public List<Barber> findAllByOrderByNomeBarbeariaDesc();
    
    public Barber findByNomeBarbearia(String nomeBarbearia);
}
