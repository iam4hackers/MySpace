package com.esh.servlet;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 

public static void main(String[] args) {
	 
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int K=in.nextInt();
        int[] intArr =new int[N];
        int sum=0;int i=0;
        for(int c=0;c<N;c++){
        	
         intArr[c]=in.nextInt();
         
        }
     //   intArr=bubbleSort(intArr);
      //  Arrays.sort(intArr);
        int temp=0;
        for( int m = 0; m < intArr.length/2; ++m ) 
        { 
          temp = intArr[i]; 
          intArr[i] = intArr[intArr.length - i - 1]; 
          intArr[intArr.length - i - 1] = temp; 
        }
        
        for (int number : intArr) {
            System.out.println("Number = " + number);
          }
        for(i=0; i<N/K;i++){
        	
        	for(int j=0;j<K;j++){
        	sum= (intArr[(K*i)+j]*(i+1))+sum;
        	}
        	
        }
        
        for(int l=0;l<N%K;l++){
        	sum= (intArr[(K*i)+l]*(i))+sum;
        	}	
        
        System.out.println(sum);
       
   }

}

