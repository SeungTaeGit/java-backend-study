package seungtae.product.management.entity;


//@Getter
public class Product {

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;            // 고유 인덱스
    private String name;        // 상품 이름
    private Integer price;      // 상품 가격
    private Integer quantity;   // 상품 갯수
}
