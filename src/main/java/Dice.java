public class Dice {
//in this class, we can pull the sum of total dice rolled based on the number of dice rolled...


    private int singleDie;


    public Dice(int numberOfDice){
        this.singleDie=numberOfDice;

    }
    public int tossAndSum(){
        int sum = 0;
        for(int i=1; i <= singleDie; i++){
            sum = sum + (int) (Math.floor((Math.random()* (6)+1)));
        }
        return sum;
    }



}
