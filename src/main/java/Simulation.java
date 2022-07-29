public class Simulation {
    Dice dice;
    Bins bin;
    int max;
    int min;

    int numberOfTosses;

    public Simulation (int numberOfDie,int numberOfTosses){
        dice = new Dice(numberOfDie);
        bin = new Bins(numberOfDie,numberOfDie*6); //min to max
        this.numberOfTosses=numberOfTosses;
    }

    public int getNumberOfTosses(){
        return numberOfTosses;
    }
//    public Bins getBin(){
//        return bin;
//    }

    public void setNumberOfTosses(int numberOfTosses){
        this.numberOfTosses= numberOfTosses;
    }

    public void runSimulations(){
        for(int i=0; i<numberOfTosses; i++){
            bin.incrementBin(dice.tossAndSum());
        }
    }


    public void printResults(){
        bin.printBins();
    }

}
