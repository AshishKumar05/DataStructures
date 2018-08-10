/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching1;

import java.util.Scanner;

/**
 *
 * @author ashish gupta
 */
public class Searching1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size,i,j;
        int arr[]= new int [10];
        Scanner Myscanner =new Scanner(System.in); 
        System.out.println("Enter the Size of array");
        size=Myscanner.nextInt();
        System.out.println("Enter the Array");
        for(i=0;i<size;i++)
        {
            arr[i]=Myscanner.nextInt();
        }
        System.out.println("Repeating Element are: ");
        for(i=0;i<size;i++)
        { for(j=i+1;j<size;j++){
            if(arr[i]==arr[j]){
            System.out.println(""+arr[i]);
            }
        }
        }
    }
    
}
