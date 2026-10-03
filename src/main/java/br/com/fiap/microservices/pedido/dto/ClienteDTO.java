package br.com.fiap.microservices.pedido.dto;

public record ClienteDTO(
        Long id,
        String nome,
        String email,
        String telefone,
        String endereco,
        Boolean ativo
) {
}

