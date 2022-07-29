public class Main {
    public static void main (String[] args) {
        Simulation simulation = new Simulation(2,100000);
        simulation.runSimulations();
        simulation.printResults();

    }
}
