package br.com.gomide.hello.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gomide.hello.mapper.DozerMapper;
import br.com.gomide.hello.model.Barber;
import br.com.gomide.hello.service.BarberService;
import br.com.gomide.hello.vo.BarberVO;
import br.com.gomide.hello.model.Cortes;
import br.com.gomide.hello.service.CortesService;
import br.com.gomide.hello.vo.CortesVO;

@RestController
@RequestMapping("/api/v2/barber")
public class BarberController {

    @Autowired
    private BarberService barberService;

    @Autowired
    private CortesService cortesService;

    @GetMapping
    public List<BarberVO> findAll() {
        List<Barber> barber = barberService.findAll();
        return DozerMapper.parseListObjects(barber, BarberVO.class);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        barberService.delete(id);
    }

    @GetMapping("/{id}/cortes")
    public List<CortesVO> findCortesByBarberId(@PathVariable Long id) {
        List<Cortes> cortes = cortesService.findByBarbeariaId(id);
        return DozerMapper.parseListObjects(cortes, CortesVO.class);
    }

    @PostMapping
    public BarberVO create(@RequestBody Barber barber) {
        return DozerMapper.parseObject(barberService.create(barber), BarberVO.class);
    }
}
