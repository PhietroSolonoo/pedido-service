package br.com.fiap.microservices.pedido.service;

import br.com.fiap.microservices.pedido.dto.CriarPedidoDTO;
import br.com.fiap.microservices.pedido.feign.CatalogoFeignClient;
import br.com.fiap.microservices.pedido.feign.ClienteFeignClient;
import br.com.fiap.microservices.pedido.model.Pedido;
import br.com.fiap.microservices.pedido.repository.PedidoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PedidoService {
    private static final Logger logger = LoggerFactory.getLogger(PedidoService.class);
    private final PedidoRepository pedidoRepository;
    private final CatalogoFeignClient catalogoFeignClient;
    private ClienteFeignClient clienteFeignClient;

    public PedidoService(PedidoRepository pedidoRepository,
                         CatalogoFeignClient catalogoFeignClient,
                         ClienteFeignClient clienteFeignClient) {
        this.pedidoRepository = pedidoRepository;
        this.catalogoFeignClient = catalogoFeignClient;
        this.clienteFeignClient = clienteFeignClient;
    }

    @Transactional
    public Pedido criar(CriarPedidoDTO dto) {
        logger.info("Criando novo pedido para cliente ID: {}", dto.clieteId());

        //1. Validar se o cliente existe(ClienteFeignClient)
        //2. Processar os itens do pedido(CatalagoFeignClient
        //3. Validar estoque
        //.4 Criar item do pedido com preço do catálogo
        //5. Calcular o valor total
        //6. Criar e persistir o pedido
        //7. Retornar o Pedido populado com os dados do cliente e dos produtos
        return null;
    }
}
