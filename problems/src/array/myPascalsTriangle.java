Pascal.java

Below is the syntax highlighted version of Pascal.java from §1.4 Arrays. 

/******************************************************************************
 *  Compilation:  javac Pascal.java
 *  Execution:    java Pascal n
 *  
 *  Computes and prints out Pascal's triangle or order n.
 *  Illustrated ragged arrays in Java.
 * 
 *  % java Pascal 7
 *  1 
 *  1 1 
 *  1 2 1 
 *  1 3 3 1 
 *  1 4 6 4 1 
 *  1 5 10 10 5 1 
 *  1 6 15 20 15 6 1 
 *  1 7 21 35 35 21 7 1 
 *
 ******************************************************************************/

public class Pascal { 
    
    public int[][] pascal = null;
    
    //given the triangle up to the n-th row of the triangle
    public int[][] buildTriangle(int n) {
    
        private int[][] pascal  = new int[n+1][];
        
        // initialize first row
        pascal[1] = new int[1+2];
        pascal[1][1] = 1;
        
        // fill in Pascal's triangle
        for (int i = 2; i <= n; i++) {
            pascal[i] = new int[i+2];
            for (int j = 1; j < pascal[i].length - 1; j++)
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
        }
        
        return pascal;
    }
    
    //stub to test the buildTrangle function
    public static void main(String[] args) { 
        
        int n = 4;
        pascal = buildTriangle(n);
       
        // print the n-th row of the pascal's triange 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < pascal[i].length - 1; j++) {
                if(i == n){
                    System.out.print(pascal[i][j] + " ");
                }
            }
            //System.out.println();
        }
    }
}

//Copyright © 2000–2017, Robert Sedgewick and Kevin Wayne. 
//Last updated: Fri Oct 20 14:12:12 EDT 2017. 
