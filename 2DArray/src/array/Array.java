/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author ashish gupta
 */
public class Array {
   
    public static void main(String[] args) {
        int n,i,j;
int sum=0;
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
System.out.println("Enter the no. of array");
Scanner Myscanner=new Scanner(System.in);
n=Myscanner.nextInt();
System.out.println("Enter 1st array");
        for(i=0;n>i;i++)
        {
            for(j=0;n>j;j++){
           a[i][j]=Myscanner.nextInt();
            }
        }
        System.out.println("Enter 2nd array");
        for(i=0;n>i;i++)
        {
            for(j=0;n>j;j++){
           b[i][j]=Myscanner.nextInt();
            }
        }
        for(i=0;n>i;i++){
            for(j=0;n>j;j++){
            c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of array ");
        for(i=0;n>i;i++){
            for(j=0;n>j;j++){
            System.out.println(c[i][j]);
            }
        }
// TODO ode application logic here
    }
    
}
