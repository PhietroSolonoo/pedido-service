package br.com.fiap.microservices.pedido.dto;

import br.com.fiap.microservices.pedido.model.ItemPedido;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

public record CriarPedidoDTO(
        @NotNull(message = "ID do cliente é obrigatório")
        Long clieteId,
        @NotEmpty(message = "Pedido deve ter pelo menos um item")
        List<ItemPedido> itens
) {
}
