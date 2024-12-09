package br.com.gomide.hello.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.gomide.hello.mapper.DozerMapper;
import br.com.gomide.hello.model.Reserva;
import br.com.gomide.hello.service.ReservaService;
import br.com.gomide.hello.vo.ReservaVO;

@RestController
@RequestMapping("/api/v7/reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping("/usuario/{userId}")
    public List<ReservaVO> findByUserId(@PathVariable Long userId) {
        List<Reserva> reservas = reservaService.findByUserId(userId);
        return DozerMapper.parseListObjects(reservas, ReservaVO.class);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservaVO> findById(@PathVariable Long id) {
        Optional<Reserva> reserva = reservaService.findById(id);
        return reserva.map(value -> new ResponseEntity<>(DozerMapper.parseObject(value, ReservaVO.class), HttpStatus.OK))
                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
public ResponseEntity<ReservaVO> create(@RequestBody Reserva reserva) {
    ReservaVO reservaVO = DozerMapper.parseObject(reserva, ReservaVO.class);
    Reserva reservaSalva = reservaService.create(reservaVO);
    return new ResponseEntity<>(DozerMapper.parseObject(reservaSalva, ReservaVO.class), HttpStatus.CREATED);
}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        reservaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
