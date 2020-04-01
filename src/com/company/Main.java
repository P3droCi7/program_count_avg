package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] integerTable = {10,20,14,23,8,11,12,12,32,8,9,12};
        for(int ingeger:integerTable){
            System.out.print(ingeger + " ");
        }
        System.out.println();
        Set<Integer> returnTableWithoutDuplicates = returnTableWithoutDuplicates(integerTable);
        System.out.println(returnTableWithoutDuplicates);
        double countAvg = countAvg(returnTableWithoutDuplicates);
        System.out.println(countAvg);
    }
    public static double countAvg(Set<Integer> set){
        //licz średnią
        double sum = 0;
        int amount = set.size();
        for (Integer integerr:set){
            sum+=integerr;
        }
        return sum/amount;
    }
    public static Set<Integer> returnTableWithoutDuplicates(int[] integerTable){
        //wyeliminuj duplikaty
        Set set = new HashSet();
        for(int integerr:integerTable){
            set.add(integerr);
        }
        return set;
    }
}
