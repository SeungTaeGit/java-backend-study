package seungtae.product.management.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seungtae.product.management.entity.Product;
import seungtae.product.management.dto.ProductDto;
import seungtae.product.management.repository.DatabaseProductRepository;
import seungtae.product.management.repository.ListProductRepository;

import java.util.List;
import java.util.stream.Stream;

@Service
public class ProductService {

//    private ListProductRepository listProductRepository;
    private DatabaseProductRepository databaseProductRepository;
    private ModelMapper modelMapper;
    private ValidationService validationService;

    @Autowired
    ProductService(ListProductRepository listProductRepository,
                   DatabaseProductRepository databaseProductRepository,
                   ModelMapper modelMapper,
                   ValidationService validationService) {
//        this.listProductRepository = listProductRepository;
        this.databaseProductRepository = databaseProductRepository;
        this.modelMapper = modelMapper;
        this.validationService = validationService;
    }

    public ProductDto add(ProductDto productDto) {

        // Dto -> Entity
        Product product = modelMapper.map(productDto, Product.class);
        validationService.checkValid(product);

        // 레포지토리 호출
        Product savedProduct = databaseProductRepository.add(product);

        // Entity -> Dto
        ProductDto savedProductDto = modelMapper.map(savedProduct, ProductDto.class);

        // Dto 리턴
        return savedProductDto;
    }

    public ProductDto findById(Long id) {
        Product product = databaseProductRepository.findById(id);   //
        ProductDto productDto = modelMapper.map(product, ProductDto.class);
        return productDto;
    }

    public List<ProductDto> findALl() {
        List<Product> products = databaseProductRepository.findAll();   //
        List<ProductDto> productDtos = products.stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .toList();
        return productDtos;
    }

    public List<ProductDto> findByNameContaining(String name) {
        List<Product> products = databaseProductRepository.findByNameContaining(name);
        List<ProductDto> productDtos = products.stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .toList();
        return productDtos;
    }

    public ProductDto update(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        Product updatedProduct = databaseProductRepository.update(product);
        ProductDto updatedProductDto = modelMapper.map(updatedProduct, ProductDto.class);
        return updatedProductDto;
    }

    public void delete(Long id) {
        databaseProductRepository.delete(id);
    }
}
