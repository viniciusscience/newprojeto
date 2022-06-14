package br.com.triersistemas.solar.repository;

import br.com.triersistemas.solar.domain.Cliente;
import br.com.triersistemas.solar.domain.Farmaceutico;
import br.com.triersistemas.solar.domain.Produto;
import br.com.triersistemas.solar.model.FarmaceuticoModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FarmaceuticoRepository {
    List<Farmaceutico> consultar();

    Optional<Farmaceutico> consultar(UUID id);

    void cadastrar(Farmaceutico farmaceutico);

    void remover(Farmaceutico farmaceutico);

}
