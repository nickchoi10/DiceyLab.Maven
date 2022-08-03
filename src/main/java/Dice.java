import java.util.Random;

public class Dice {
//in this class, we can pull the sum of total dice rolled based on the number of dice rolled...


    private int singleDie;


    public Dice(int numberOfDice){
        this.singleDie=numberOfDice;

    }
    public int tossAndSum(){
        Random rand = new Random();
        int sum = 0;
        for(int i=1; i <= singleDie; i++){
            sum = sum + (rand.nextInt(6)+1);

        }
        return sum;
    }



}
