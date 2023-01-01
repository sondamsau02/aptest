package Question2;

public class SpecCar extends Car{
    private Integer type;

    public SpecCar(String maker, Integer price, Integer type) {
        super(maker, price);
        this.type = type;
    }

    public SpecCar() {
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SpecCar{" + "maker= '+ maker +' +" + ", price=+ price + " + "type=" + type + '}';
    }
}
