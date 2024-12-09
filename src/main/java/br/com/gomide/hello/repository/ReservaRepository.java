package br.com.gomide.hello.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gomide.hello.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

    List<Reserva> findByUserId(Long userId);

    List<Reserva> findAllByOrderByNomeCorte();
}
