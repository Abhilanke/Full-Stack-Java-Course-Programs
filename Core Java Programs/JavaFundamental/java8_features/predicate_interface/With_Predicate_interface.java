package java8_features.predicate_interface;

import java.util.function.Predicate;

//Predicate/condition interface => java.util.function.Predicate;
//Runnable ,ActionListener,Predicate=> functional
//Cloneable,Serializable           => Marker

//Predicate is having 1 method i.e test()
/*
interface Predicate<T a>
{
    boolean test(Object o);
}*/

public class With_Predicate_interface {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Xyz x1=  () -> System.out.println("Msg : hello everyone!!!!");
        
        Predicate<Integer> p1=( n) -> n%2==0;     //here, "( n) -> n%2==0;" this code is an implmentation of test method of Predicate interface
        
        System.out.println("Is given number is even? = "+p1.test(45));
        
    }

}
