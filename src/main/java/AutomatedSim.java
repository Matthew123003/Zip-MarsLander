public class AutomatedSim {
    private final Vehicle vehicle;

    public AutomatedSim(Vehicle v) {
        this.vehicle = v;
    }

    DescentEvent de = new DescentEvent(1, 200, 20000, 10000, 1);
    BurnDataStream bd = new BurnDataStream();

}
