package br.com.triersistemas.solar.service;

import br.com.triersistemas.solar.domain.Pedido;
import br.com.triersistemas.solar.domain.Produto;
import br.com.triersistemas.solar.model.PagarPedidoModel;
import br.com.triersistemas.solar.model.PedidoModel;
import br.com.triersistemas.solar.model.ProdutoModel;

import java.util.List;
import java.util.UUID;

public interface PedidoService {
    List<Pedido> consultar();

    Pedido consultar(UUID id);

    Pedido cadastrar(PedidoModel model);

    Pedido Adicionar(UUID id, PagarPedidoModel model);

    Pedido Pagar(UUID id, PagarPedidoModel model);
}
