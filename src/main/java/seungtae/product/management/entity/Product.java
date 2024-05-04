package seungtae.product.management.entity;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import java.util.Objects;

//@Getter
public class Product {

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;            // 고유 인덱스

    @Size(min = 1, max = 100)
    private String name;        // 상품 이름

    @Min(0)
    @Max(1_000_000)
    private Integer price;      // 상품 가격

    @Min(0)
    @Max(9_999)
    private Integer quantity;   // 상품 갯수

    public Boolean sameId(Long id) {
        return this.id.equals(id);
    }

    public Boolean containsName(String name) {
        return this.name.contains(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
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
}
