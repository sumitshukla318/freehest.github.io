/*import java.util.*;
public class abhi {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a");
  int a = sc.nextInt();
  System.out.println("enter b");
  int b =sc.nextInt();
  System.out.println("enter operator");
  char operator = sc.next().charAt(0);
  switch(operator){
              case'+': System.out.println(a+b);
              break;
              case'-': System.out.println(a-b);
              case'*':System.out.println(a*b);
              break;
              case'%':System.out.println(a%b);
              break;
              default:System.out.println("not calculated");
  }

}
              
}

import java.util.*;
public class abhi {

  public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    //int counter = 1;
    for(int i = 1; i<=5;i++){
      System.out.println("hello");
  
    }
    //System.out.println();
  }
}
public class abhi {

  public static void main(String[] args) {
    int i = 1354;
    while(i>0){
      int lastdigit = i%10;
      System.out.println(lastdigit);
      i = i/10;

    }
    System.out.println();

  }
}
public class abhi {

  public static void main(String[] args) {
    int counter = 1;
    do{
      System.out.println("hello");
      counter++;
    }
    while(counter<10);
  }
}
import java.util.*;
public class abhi {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 if(n==2){
  System.out.println("n is prime");
 }
 else{
 boolean  isPrime = true;
 for( int i = 2;i<=n-1;i++);{
 if(n%i==0){
  isPrime false;
 } 
}
 if(isPrime == true){
  System.out.println("n is prime");
 }
 else{
  System.out.println("not prime");
 }
 }
}
  
}

import java.util.*;
public class abhi {
  public static int factorial(int n){
    int i ;
    int f = 1;
    for(i= 1;i<=n;i++){
      f = f*i; 
    }
      return f;
    }     
   public static int binCoeff( int n,int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);
    int binCoeff = fact_n/(fact_r*fact_nmr);

   return binCoeff;
  }
  
 public static int sum(int a , int b){
  return a+b;
 }
 public static int sum( int a, int b , int c ){
  return a+b+c;
 }
 public static boolean isprime(int n){
  boolean isprime = true;
  for(int i=2;i<=n-1;n++){
    if(n % i == 0){
      isprime = false;
    }
  } 
  return isprime;
 }
  public static void main(String[] args) {
    System.out.println(isprime(7));
  
    
  }
}




import java.util.*;
public class abhi {

  public static void binToDec( int binNum){
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;
    while (binNum > 0) {
       int lastDigit = binNum % 10;
     decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
   pow++;
   binNum = binNum/10;
      
    }
    System.out.println("decimal of" + myNum +" = " +decNum);
  }
  public static void main(String[] args) {
     binToDec(111);
  }
}



import java.util.*;
public class abhi {
public static void hallow_rectangle(int totrows ,int totcolns){
  for( int i = 1;i<=totrows;i++){
    for( int j=1; j<=totcolns;j++){
      if(i==1||i==totrows||j==1||j==totcolns){
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}
 public static void inverted_star( int n){
  for(int i =1;i<=n;i++){
    for(int j=1; j<=n-1;j++){
      System.out.print("  " );
    }
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();

  }
 }
  public static void main(String[] args) {
   // hallow_rectangle(4,7);
    inverted_star(4);
  }
}


coding for  butterfly pattern

 import java.util.*;
 public class abhi {
 public static void butterfly(int n) {
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    for(int j=1;j<=2*(n-i);j++){
      System.out.print(" ");

    }
    for(int j=1;j<=i;j++){
      System.out.print("*");
  }
    System.out.println();
    }
    
    
  for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
    System.out.print("*");
  
  }
  for(int j=1;j<=2*(n-i);j++){
    System.out.print(" ");

  }
  for(int j=1;j<=i;j++){
    System.out.print("*");
}
  System.out.println();
  }

  }
  
 
  public static void main(String[] args) {
    butterfly(10);
  }
 }

 // Array chapter

 import java.util.*;
 public class abhi {
 public static void update(int marks[]){
  for(int i=0;i<marks.length;i++){
    marks[i]= marks[i]+1;
  }
 }
  public static void main(String[] args) {
    int marks[] ={99,96,86};
    update(marks);
    for(int i=0;i<marks.length;i++){
      System.out.print(marks[i]+" ");

    }
    System.out.println();
  }
 }*/

 import java.util.*;
public class abhi {

 public static int linearSearch(int numbers[], int key ){
   for(int i=0; i<numbers.length;i++){
   if(numbers[i]==key){
   return i;           
   }
   } 
return -1;
 }             

  public static void main(String[] args) {
    int num[]= {1,55,14,63,44,147,7,55};
    int key =44; 
      int index = linearSearch(numbers, key); 
      if (index==-1) {
              System.out.println(" not found");    
      }
      else{
              System.out.println("key is atr index:" +index);

      }
      
  } 


}
