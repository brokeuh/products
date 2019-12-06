package petit.jochem.products.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productNaam;
    @DecimalMin(value = "0.01")
    private BigDecimal productPrijs;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductNaam() {
        return productNaam;
    }

    public void setProductNaam(String productNaam) {
        this.productNaam = productNaam;
    }

    public BigDecimal getProductPrijs() {
        return productPrijs;
    }

    public void setProductPrijs(BigDecimal productPrijs) {
        this.productPrijs = productPrijs;
    }
}
