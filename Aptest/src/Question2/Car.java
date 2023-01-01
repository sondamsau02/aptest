package Question2;

public class Car {
    private String maker;

    private Integer price;

    public Car() {
    }

    public Car(String maker, Integer price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", price=" + price +
                '}';
    }
    public void setData(String maker,Integer price){
        price = price + 20;
        System.out.println("XZ"+maker+","+ price);

    }
}
