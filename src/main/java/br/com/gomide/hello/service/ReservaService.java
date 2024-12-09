package br.com.gomide.hello.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gomide.hello.model.Reserva;
import br.com.gomide.hello.repository.ReservaRepository;
import br.com.gomide.hello.vo.ReservaVO;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> findAll() {
        return reservaRepository.findAllByOrderByNomeCorte();
    }

    public Optional<Reserva> findById(Long id) {
        return reservaRepository.findById(id);
    }

    public void delete(Long id) {
        reservaRepository.deleteById(id);
    }

    public Reserva create(ReservaVO reservaVO) {
        String nomeBarbearia = reservaVO.getNomeBarbearia();
        reservaVO.setNomeBarbearia(nomeBarbearia);

        Reserva reserva = toEntity(reservaVO);
        return reservaRepository.save(reserva);
    }

    public List<Reserva> findByUserId(Long userId) {
        return reservaRepository.findByUserId(userId); 
    }

    

    private Reserva toEntity(ReservaVO reservaVO) {
        Reserva reserva = new Reserva();
        reserva.setNomeCorte(reservaVO.getNomeCorte());
        reserva.setValor(reservaVO.getValor());
        reserva.setNomeBarbearia(reservaVO.getNomeBarbearia());
        reserva.setHorario(reservaVO.getHorario());
        reserva.setUserId(reservaVO.getUserId());
        reserva.setBarberId(reservaVO.getBarberId());
        reserva.setCorteId(reservaVO.getCorteId());
        reserva.setDataReserva(reservaVO.getDataReserva());
        return reserva;
    }
}
