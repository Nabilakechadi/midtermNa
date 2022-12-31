package algorithm;

import  static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestSorting<unSortedArray> {


public static void main(String[] args) {


                int [] unSortedArray = {6,9,2,5,1,0,4};
                int [] sortedArray =   {0,1,2,4,5,6,9};

                Sort sort = new Sort();

                sort.selectionSort(unSortedArray);

                try {
                        Assert.assertEquals(sortedArray, unSortedArray);
                }catch(Exception ex){
                        ex.getMessage();
                }






            System.out.println("After Selection Sort");

    for (int i : sortedArray) {

        System.out.print(i + " ");

    }


    }



    public void checkIfDataSorted() {

        Sort sort = new Sort();

        int [] sortedArray;

        int [] unSortedArray;

        try {

            unSortedArray = new int []{1,5,4,8,2,6,9};

            sort.selectionSort(unSortedArray);

            System.out.println();

           unSortedArray = new int []{5,1,7,9,3,2,6};

            sort.selectionSort(unSortedArray);

            System.out.println();

        }catch(Exception ex){

            ex.getMessage();

        }

    }

}
