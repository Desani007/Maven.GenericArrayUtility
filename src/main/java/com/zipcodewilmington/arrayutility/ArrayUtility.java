package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T> {
    String t;
    List<T> inputArray;
  T[] array;
    public ArrayUtility() {
        inputArray = new ArrayList<>();

    }

    public ArrayUtility(T[] inputArray) {

       this.inputArray= new ArrayList<>(Arrays.asList(inputArray));
       this.array=inputArray;

    }




    public T getMostCommonFromMerge(T [] arrayToMerge) {
        List<T> lis = Arrays.asList(arrayToMerge);
        List  array = merge(lis);
        int count =0;
        Object r =  "";
        for (Object a :array){
            int num = Collections.frequency(array,a);
            if (num> count){
                count=num;
                r=  a;


            }

        }
        return (T) r ;
    }




    public T[] removeValue(T valueToRemove) {
        this.t = valueToRemove.getClass().getName();
         int v= Collections.frequency(inputArray,valueToRemove);
         for (int k =0; k<v;k++){
             inputArray.remove(valueToRemove);

         }

        T[] a = Arrays.copyOf(array, inputArray.size());
        for ( int i =0; i<a.length;i++){

            a[i]=inputArray.get(i);
        }



       return a ;
    }

    public Integer  countDuplicatesInMerge(T [] arrayToMerge, T  valueToEvaluate) {
        List<T> lis = Arrays.asList(arrayToMerge);


        List  array = merge(lis);



        int num =Collections.frequency(array, valueToEvaluate);


        return num;
    }


    public Integer getNumberOfOccurrences(T valueToEvaluate) {
     int count = Collections.frequency(inputArray,valueToEvaluate);
        return count;
    }

    public ArrayList merge (List<T> lis){
        List<T> array = new ArrayList<T>( inputArray.size() +lis.size());
        for (T l : lis ){
            array.add(l);

        }
        for (T k : inputArray){
            array.add(k);
        }
        return (ArrayList) array;


    }
}
