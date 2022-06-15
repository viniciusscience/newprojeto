package br.com.triersistemas.solar.controller;

import br.com.triersistemas.solar.domain.Farmaceutico;
import br.com.triersistemas.solar.exceptions.NaoExisteException;
import br.com.triersistemas.solar.model.FarmaceuticoModel;
import br.com.triersistemas.solar.service.FarmaceuticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/farmaceutico")
public class FarmaceuticoController {
    @Autowired
    private FarmaceuticoService FarmaceuticoService;

    @GetMapping("/consultar")
    public List<Farmaceutico> consultar() {
        return FarmaceuticoService.consultar();
    }
    @PostMapping
    public Farmaceutico cadastrarRandom(){
        return FarmaceuticoService.cadastrarRandom()
    }

    @PostMapping("/cadastrar")
    public Farmaceutico cadastrar(@RequestBody FarmaceuticoModel model) {
        return FarmaceuticoService.cadastrar(model);
    }

    @PutMapping("/alterar/{id}")
    public Farmaceutico alterar(@PathVariable UUID id, @RequestBody FarmaceuticoModel model) {
        return FarmaceuticoService.alterar(id, model);
    }

    @DeleteMapping("/remover/{id}")
    public Farmaceutico remover(@PathVariable UUID id) {
        return FarmaceuticoService.remover(id);
    }
}