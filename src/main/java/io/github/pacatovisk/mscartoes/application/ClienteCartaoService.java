package io.github.pacatovisk.mscartoes.application;

import io.github.pacatovisk.mscartoes.domain.ClienteCartao;
import io.github.pacatovisk.mscartoes.infra.repository.ClienteCartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteCartaoService {


    @Autowired
    private ClienteCartaoRepository clienteCartaoRepository;

    public List<ClienteCartao> listCartoesByCpf(String cpf) {
        return clienteCartaoRepository.findByCpf(cpf);
    }

}
