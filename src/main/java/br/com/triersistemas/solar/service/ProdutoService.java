package br.com.triersistemas.solar.service;

import br.com.triersistemas.solar.domain.Produto;
import br.com.triersistemas.solar.model.ProdutoModel;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.UUID;

public interface ProdutoService {

    List<Produto> consultar();

    Produto consultar(UUID id);

    Produto cadastrar(ProdutoModel model);

    Produto alterar(UUID id, ProdutoModel model);

    Produto remover(UUID id);

}
