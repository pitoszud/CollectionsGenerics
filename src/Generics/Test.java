/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author UPatryk
 */
public class Test {
    public static void main(String[] args) {
        //List<Number> nums = Arrays.asList(1, 2);  - this won't work as Number does not have add method
        List<Number> nums = new ArrayList<>();
        List<Integer> ints = Arrays.asList(1, 2);  // <T> List<T> asList(T... a) {return new ArrayList<>(a);}
        List<Double> dbls = Arrays.asList(2.78, 3.14);  // <T> List<T> asList(T... a) {return new ArrayList<>(a);}
        List<Object> anyNum = Arrays.<Object>asList(2.50, "four", 87, 0.585);
        nums.addAll(ints);
        nums.addAll(dbls);
        Collections.copy(anyNum, nums); // <T> void copy(List<? super T> dest, List<? extends T> src)
        for (Number eachNum : nums) {
            System.out.println(eachNum);
        }
    }
    
   
    
    



}
