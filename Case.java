package pc;



public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions){
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
    private void pressPowerButton(){

    }

    @Override
    public String toString() {
        return "Case{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }
}
