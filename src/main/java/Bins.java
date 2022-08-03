
public class Bins {
private int[] bin;
private int minBin;
public Bins(int min, int max){
    minBin = min; //min of sum of die or dice rolled
    bin = new int[max-min+1]; //number of element in the array..

}

    public Bins() {

    }

    public void  incrementBin(int number){
    bin[number-minBin]++;
} // bin[number-minBin] index of the tossandsum answer in array
public int[] getBin(){

    return bin;
}

public void printBins(){
   for(int i=0; i<=bin.length;i++){

       System.out.println((i+2)+"\t"+bin[i] +"\t"+  String.format("%.2f", bin[i]*.00001 ));   //%. 2f
   }

}

}
