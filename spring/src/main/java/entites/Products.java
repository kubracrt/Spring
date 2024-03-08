package entites;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Products {
    @Id
    Long id;

    String productName;
    float productPrice;
    int productCount;


}
