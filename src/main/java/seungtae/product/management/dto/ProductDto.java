package seungtae.product.management.dto;

import jakarta.validation.constraints.NotNull;

public class ProductDto {

    private Long id;            // 고유 인덱스

    @NotNull
    private String name;        // 상품 이름

    @NotNull
    private Integer price;      // 상품 가격

    @NotNull
    private Integer quantity;   // 상품 갯수

    // 추후 Lombok의 'Getter' 이노테이션으로 대체
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
