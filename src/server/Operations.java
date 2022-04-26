package server;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Operations {

    private ArrayList<Integer> numbers;

    public Operations(ArrayList<Integer> numbers){

        this.numbers = numbers;

    }

    public int sum(ArrayList<Integer> numbers){

        int sum, acum = 0;
        for(int n : numbers){
            sum = numbers.indexOf(n);
            acum = acum + sum;
        }
        return acum;
    }



}
