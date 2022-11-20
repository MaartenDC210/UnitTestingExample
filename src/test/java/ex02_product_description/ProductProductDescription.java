package ex02_product_description;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductProductDescription {
    Product product = new Product("somthing");

    @Test
    void happyFlow(){
        product.setSize(33);
        product.setPercentage(6.3);
        assertEquals("• 33CL 6,3%", product.productDescription());
    }

    @Test
    void roundPercentage(){
        product.setSize(33);
        product.setPercentage(6.0);
        assertEquals("• 33CL 6%", product.productDescription());
    }

    @Test
    void moreThenOneNumberAfterTheComma(){
        product.setSize(33);
        product.setPercentage(6.12);
        assertEquals("• 33CL 6,1%", product.productDescription());
    }

    @Test
    void nullPercentage(){
        product.setSize(33);
        assertEquals("• 33CL 0%", product.productDescription());
    }

    @Test
    void nullSize(){
        product.setPercentage(6.1);
        assertEquals("• 0CL 6,1%", product.productDescription());
    }
}
