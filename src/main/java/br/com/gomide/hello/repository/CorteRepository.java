package br.com.gomide.hello.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.gomide.hello.model.Cortes;

public interface CorteRepository extends JpaRepository<Cortes, Long> {

    List<Cortes> findAllByBarbearia_IdOrderByNomeCorteDesc(Long barbeariaId);

    List<Cortes> findByBarbearia_Id(Long barberId);
}
