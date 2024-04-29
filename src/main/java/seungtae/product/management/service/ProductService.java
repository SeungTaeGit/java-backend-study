package seungtae.product.management.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seungtae.product.management.entity.Product;
import seungtae.product.management.dto.ProductDto;
import seungtae.product.management.repository.ListProductRepository;

@Service
public class ProductService {

    private ListProductRepository listProductRepository;
    private ModelMapper modelMapper;

    @Autowired
    ProductService(ListProductRepository listProductRepository, ModelMapper modelMapper) {
        this.listProductRepository = listProductRepository;
        this.modelMapper = modelMapper;
    }

    public ProductDto add(ProductDto productDto) {

        // Dto -> Entity
        Product product = modelMapper.map(productDto, Product.class);

        // 레포지토리 호출
        Product savedProduct = listProductRepository.add(product);

        // Entity -> Dto
        ProductDto savedProductDto = modelMapper.map(savedProduct, ProductDto.class);

        // Dto 리턴
        return savedProductDto;
    }

}
