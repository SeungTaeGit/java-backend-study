package seungtae.product.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seungtae.product.management.dto.ProductDto;
import seungtae.product.management.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("")
//@RequiredArgsConstructor
public class ProductController {

    private ProductService productService;

    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {

        return productService.add(productDto);
    }

    @GetMapping("/products/{id}")
    public ProductDto findProductById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping("/products")
    public List<ProductDto> findAllProduct(
            @RequestParam(required = false) String name
    ) {
        if (name == null) {
            return productService.findALl();
        }
        return productService.findByNameContaining(name);
    }


}
