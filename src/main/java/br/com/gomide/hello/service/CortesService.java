package br.com.gomide.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.gomide.hello.model.Cortes;
import br.com.gomide.hello.repository.CorteRepository;

@Service
public class CortesService {

    @Autowired
    private CorteRepository corteRepository;

    public List<Cortes> findAll(Long barbeariaId) {
        return corteRepository.findAllByBarbearia_IdOrderByNomeCorteDesc(barbeariaId);
    }

    public void delete(Long id) {
        try {
            corteRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            System.out.println("Corte com ID " + id + " não encontrado.");
        }
    }

    public List<Cortes> findByBarbeariaId(Long barbeariaId) {
        return corteRepository.findByBarbearia_Id(barbeariaId);
    }

    public Cortes create(Cortes cortes) {
        return corteRepository.save(cortes);
    }
}
