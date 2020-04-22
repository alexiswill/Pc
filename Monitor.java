package pc;

public class Monitor {
    private Resolution resolution;
    private String model;
    private String manufacturer;

    public Monitor(Resolution resolution, String model, String manufacturer) {
        this.resolution = resolution;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void drawPixelArt(int x, int y, String color){

    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}


