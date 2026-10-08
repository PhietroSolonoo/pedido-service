package br.com.fiap.microservices.pedido.feign;

import br.com.fiap.microservices.pedido.dto.ClienteDTO;
import jakarta.validation.constraints.NotNull;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "cliente-service",
        url = "${app.cliente-service.url}"
)
public interface ClienteFeignClient {
    @GetMapping("/api/clientes/{id}")
    ClienteDTO buscarClientePorid(@PathVariable Long id);

    ClienteDTO buscarCliente(@NotNull(message = "ID do cliente é obrigatório") Long aLong);

    ClienteDTO buscarClientePorId(Long aLong);
}
