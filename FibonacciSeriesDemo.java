package com.company;

import java.util.LinkedList;
import java.util.List;

public class FibonacciSeriesDemo {

    public static void main(String[] args){

        List<Integer> list = new LinkedList<>();

        Integer sum = 0;
        Integer next = 0;
        list.add(1);
        list.add(2);

        for (int i = 2; i <= list.size(); i++){
            next = list.get(i-2) + list.get(i-1);
            if (next <= 4000000) {
                list.add(next);
            }
        }
        for ( Integer value : list )
            System.out.printf("%s ", value);

        System.out.println();
        for ( Integer value : list ) {
            if(value % 2 == 0){
                sum = sum + value;
                System.out.printf("%s ", value);
            }
        }
        System.out.println();
        System.out.println("The sum of the even valued terms less than or equal to 4000000 is " + sum);
    }
}
