package Myfristproject.Array;

public class BinarySearch {
    public static void main (String [] args){

        int[] a = {1,2,3,20,50,88,90,100,120,150};
        int item = 100;

        int left = 0 , right = a.length-1, middle;
        while(left<=right){

        middle = (left +right)/2;
        if (a[middle]==item){
            System.out.println("item found at index :" +   middle);
            return;
        }
        else if ( a [middle]<item){
            left = middle + 1;

        }
        else{
            right = middle -1;    
            }

     }
     System.out.println("item not found");
  }
    
}
