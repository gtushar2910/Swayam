//In the following program, an array of type integer (arr[]) is declared. The array can store any integer value. 
//The following program is to print the average value of all the even numbers including zero stored in the array (arr[] ).

//Note: Integer type array 'arr[]' is already defined and initialized. Use double type variables wherever applicable.

import java.util.Scanner;

public class Test3 {
    public static void main(String args[]) {
        int n;
        
        
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2 == 0)
                sum+=i;
        }
        System.out.println(sum);
    }
}
