package br.com.triersistemas.solar.repository.impl;

import br.com.triersistemas.solar.domain.Cliente;
import br.com.triersistemas.solar.domain.PessoaFisica;
import br.com.triersistemas.solar.domain.Produto;
import br.com.triersistemas.solar.model.ClienteModel;
import br.com.triersistemas.solar.repository.ClienteRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public class ClienteRepositoryimpl implements ClienteRepository {
    private static final List<Cliente> LIST = new ArrayList<>();

    @Override
    public List<Cliente> consultar() {
        return LIST;
    }

    @Override
    public Optional<Cliente> consultar(UUID id) {
        return LIST.stream().filter(Cliente -> id.equals(Cliente.getId())).findFirst();
    }

    @Override
    public void cadastrar(Cliente cliente) {
        LIST.add(cliente);
    }

    @Override
    public void remover(Cliente cliente) {
        LIST.remove(cliente);
    }
}
