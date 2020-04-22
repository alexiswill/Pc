package pc;

public class Pc {
    private Case cases;
    private Motherboard motherboard;
    private Monitor monitor;


    Pc(Case cases, Motherboard motherboard, Monitor monitor ){
        this.cases = cases;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public Case getCases() {
        return cases;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    private void drawLogo() {

    }
    public void description(){

    }
    public void powerUp(){

    }
}
