package br.com.triersistemas.solar.service.impl;

import br.com.triersistemas.solar.controller.ClienteController;
import br.com.triersistemas.solar.controller.FarmaceuticoController;
import br.com.triersistemas.solar.domain.Cliente;
import br.com.triersistemas.solar.domain.Farmaceutico;
import br.com.triersistemas.solar.domain.Pedido;
import br.com.triersistemas.solar.exceptions.NaoExisteException;
import br.com.triersistemas.solar.model.PagarPedidoModel;
import br.com.triersistemas.solar.model.PedidoModel;
import br.com.triersistemas.solar.repository.PedidoRepository;
import br.com.triersistemas.solar.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;


    @Override
    public Pedido cadastrar(PedidoModel model) {
        var farmaceutico = pedidoRepository.consultar().stream()
                .filter(f -> f.getId().equals(model.getIdFarmaceutico()))
                .findFirst()
                .orElseThrow(NaoExisteException::new);
        var cliente = pedidoRepository.consultar().stream()
                .filter(f -> f.getId().equals(model.getIdCliente()))
                .findFirst()
                .orElseThrow(NaoExisteException::new);

        var domain = new Pedido();
        pedidoRepository.cadastrar(domain);

    }

    @Override
    public List<Pedido> consultar() {
        return pedidoRepository.consultar();
    }

    @Override
    public Pedido consultar(UUID id) {
        return pedidoRepository.consultar(id).orElseThrow(NaoExisteException::new);
    }


    @Override
    public Pedido Adicionar(UUID id, PagarPedidoModel model) {
        return null;
    }

    @Override
    public Pedido Pagar(UUID id, PagarPedidoModel model) {
        return null;
    }
}
