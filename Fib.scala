/**
 * fib.scala
 * @author Chhaya Yadav
 * Compiled on 11th Nov 2017
 */
//package declaration

package assign132mypack

//importing the scanner package for user input at runtime

import java.util.Scanner;

//scala object declaration

object Fib {

//main function declaration
  
  def main(args :Array[String])={
    
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    
    println("This program logic will display the fibonacci series with help of function of standard loop.")
    
    println("Enter the Nth Digit in the sequence.")
    
//Taking user input at runtime
    
    var n = readInt()
    
// Invocation of function for fibonacci series by standard loop    
    
    standardloop(n)
    
    

  
    
    
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    
    println("This program logic will display the fibonacci series with help of recursion.")
    
    println("Enter the mth Digit in the sequence.")
    
//Taking user input at runtime
    
    var m = readInt()
    
  
//if user enters negative position  number in fibonacci series
    
    if(m < 0 )  println("Please enter a positive position number for fibonacci series.")
    
//if user enters positive position number in fibonacci series
    
    else        println("Number at "+m+"th position in fib series :"+recursion(m))
      
    

  }//end of main function
  
 
//function declaration for implementing recursion with integer return type
  
def recursion(m :Int) :Int = {
  
  
  if(m==0) return 0 
  
  else if(m==1) return 1
  
  else
  
  return (recursion(m-1) + recursion(m-2))
}//end of recursion function definition



// function declaration and definition for standardloop

def standardloop(n:Int):Unit = {
  
//variable declaration and assignment    
    
    var a = 0
    
    var b = 1
    
    var i = 0
    
    var cnt = 0
  
    while(n>i){    
      
       var cnt = b + a 
       
       a = b
       
       b=cnt
       
       i+=1
       
//Below logic will print the number present at nth position in fibonacci series starting with 0.

       if(i==(n-1)) println("Number at "+n+ "th position in fib series :" +cnt) 
 
    }//end of while loop
}

}