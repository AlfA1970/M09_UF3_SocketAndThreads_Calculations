package server;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Operations {

    private ArrayList<Integer> numbers;

    public Operations(ArrayList<Integer> numbers){

        this.numbers = numbers;

    }

    public int sum(){

        int sum, acum = 0;
        for(int i = 0; i < numbers.size(); i++ ){
            sum = numbers.get(i);
            acum = acum + sum;
        }
        return acum;
    }



}
