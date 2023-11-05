import java.util.*;
public class lotteryGen{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (int i = 1; i <= 70; i++) { 
            list.add(i); 
        } 
        Collections.shuffle(list); 
        for (int i = 0; i < 5; i++) { 
            System.out.println("Number "+(i+1)+": "+list.get(i)); 
        } 
        int lastNum = (int)(Math.random()*(26)+1);
        System.out.println("Last num to play is: "+lastNum);
    }
}