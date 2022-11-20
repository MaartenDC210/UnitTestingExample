package ex02_product_description;

public class Product {
    private String name;
    private Integer size;
    private Double percentage;

    public Product(String name) {
        this.name = name;
        this.size = 0;
        this.percentage = 0.0;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String productDescription(){
        var string = "• ";
        var p = getPercentage();
        var percentage = p%1 == 0 ? String.format("%,.0f", p) : String.format("%,.1f", p);

        return string + getSize() + "CL " + percentage + "%";

    }
}
