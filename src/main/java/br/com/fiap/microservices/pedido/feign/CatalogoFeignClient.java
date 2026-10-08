package br.com.fiap.microservices.pedido.feign;

import br.com.fiap.microservices.pedido.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "catalogo-service",
        url = "${app.catologo-service.url}"
)
public interface CatalogoFeignClient {
    // http://localhost:8081/api/catalogo/produtos/{id}
    @GetMapping("/api/catalogos/produtos/{id}")
    ProdutoDTO buscarProdutoPorid(@PathVariable Long id);

    ProdutoDTO buscarProdutoPorId(Long produtoId);
}
