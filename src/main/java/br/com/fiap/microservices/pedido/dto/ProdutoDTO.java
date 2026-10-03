package br.com.fiap.microservices.pedido.dto;

import java.math.BigDecimal;

public record ProdutoDTO(
        Long id,
        String nome,
        String descricao,
        BigDecimal preco,
        Integer estoque
) {
}
