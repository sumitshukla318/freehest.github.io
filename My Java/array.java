/*import java.util.*;
public class array {
 public static int binarysearch(int numbers[], int key ){
  int start=0 , end = numbers.length-1;
  while (start <=end) {
    int mid =(start+end)/2;
   if (numbers[mid] == key) {
    return mid;
    
   }
   if (numbers[mid]<key) {
    start = mid+1;
    
   }
   else{
    end = mid-1;
   }
    
  }
  return -1;
 }  

/*public static int binarysearch(int numbers[]){
 int largest = Integer.MAX_VALUE;
 for(int i=0;i<numbers.length;i++){
  if (largest>numbers[i]) {
    largest=numbers[i];
    
  }
 } 
 return largest;
}
public static void reverse(int number[]){
  int first =0, last =number.length -1;
  while (first<last) {
    int temp =number[last];
    number[last]= number[first];
    number[first]= temp;
    first++;
    last--;

    
  }
}
  public static void main(String[] args) {
    int numbers[]= {1,55,14,63,44,147,7,55}; 
    reverse(numbers);
    for(int i=0;i<numbers.length;i++){
      System.out.print(numbers[i]+" ");
    }
System.out.println();
  }
}

import java.util.*;
public class array {
  /*public static void printpair(int numbers[]){
    int tp =0;
    for(int i=0;i<numbers.length;i++){
       int curr =numbers[i];
       for(int j=i+1;j<numbers.length;j++){
        System.out.print("("+curr+","+numbers[j]+")");
tp++;
       }
       System.out.println();
    }
    System.out.println("total paiir"+tp);
  }
  public static void printsubarray(int numbers[]){
    int tsb=0;
    for(int i=0;i<numbers.length;i++){
      int start =i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        for (int k = start; k < end; k++) {
          System.out.print(numbers[k]+" ");
          
        }
        tsb++;
        System.out.println();
      }
      
      System.out.println();
    }
    
    System.out.println(tsb);
  }
  public static  int trappedwater(int height[]){
    
    int  n =height.length;
    int leftMax=  new int[n];
    leftMax[0] =height[0];
    for (int i=1;j<n;i++) {
      leftMax[i] = Math.max(height[i], leftMax[i-1]);
      int rightMax[] =  new int[n];
      rightMax [n-1]=height[n-1];
      for (i=n-2;i>=0;i--) {
        rightMax[i]=Math.max(height[i],rightMax[i+1]);

        
      }
      int trappedwater  =0;
      for (int i = 0; i <n; i++) {
        int waterlevel =Math.min(leftMax[i], rightMax[i]);
        trappedwater += waterlevel-height[i];

        
      }
      return  trappedwater;
      
    }

  
/*public static void kadane(int number[]){
  int ms= Integer.MIN_VALUE;
  int cs=0;
  for (int i = 0; i < number.length; i++) {
    cs = cs+number[i];
    if (cs<0) {
      cs=0;
      
    }
    ms = Math.max(cs, ms);
  }
  System.out.println(ms);
}
  public static void main(String[] args) {
    int numbers[] ={4,2,0,6,3,2,5};
  trappedwater(height);
  }
}

import java.util.*;
public class array {
  public static void bubblesort(int arr[]){
    int swap =0;
    for ( int turn =0;turn<arr.length-1;turn++) {
      for (int j = 0; j < arr.length-1-turn; j++) {
        if (arr[j]>arr[j+1]) {
          int temp= arr[j];
          arr[j]=arr[j+1];
          arr[j+1] =temp;
          swap++;
          
        }
        System.out.println(swap+" ");
      }
      
    }
    
  }
public static void printarray(int arr[]){
  for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+" ");
  }
  System.out.println();
}
  public static void main(String[] args) {
    int arr[] ={0,2,05,8,34,12,17};
    bubblesort(arr);
    printarray(arr);
  }
}

// Create 2D Array 

import java.util.*;
public class array {

  public static void main(String[] args) {
    
    int matrix[][]= new int[4][3];
    int n=matrix.length;
    int m=matrix[0].length;
    Scanner Sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = Sc.nextInt();
        
      }
      
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j]+" ");

  }
  System.out.println();
}
  }
}
  // spiral matrix problem in 2-D  array
  
import java.util.*;
public class array {
  public static void printspiral(int matrix[][]){
    int startRow =0;
    int startCol =0;
    int endRow = matrix.length-1;
    int endCol = matrix[0].length-1;

    while (startRow<=endRow && startCol<=endCol) {
      //top 
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(matrix[startRow][j]+" ");
        
      }
// right
        for (int i = startRow+1; i <=endRow; i++) {
          System.out.print(matrix[i][endCol]+" ");
          
        }
        //down
        for (int j =endCol-1;j<=startCol; j--) {
          System.out.print(matrix[endRow][j]+" ");
          
        }
// left
        for (int i = endRow-1; i <= startRow+1; i++) {
          if (startCol==endCol) {
            break;
            
          }
          System.out.print(matrix[i][startCol]+" ");
          
        }
      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
    System.out.println();
  }

 public static void main(String[] args) {
  int matrix[][] ={ {1,3,6,4,9},
                {5,8,9,6,4},
              {7,8,9,6,2}  };
              printspiral(matrix);
 }
}
// check for palindrome are not


import java.util.*;
public class array {
  /*public static boolean palindrome( String str ){
  for(int i= 0;i<=str.length()/2;i++){
    int n = str.length();
    if (str.charAt(i)!=str.charAt( n-1-i)) {
      return false;
      
    }
  }
  return true;
  }
  public static float getshortestPath(String path){
    int x=0;
    int y=0;
    for(int i=0;i<path.length();i++){
      char dir = path.charAt(i);
      if (dir=='s') {
        y--;
        
      }
      else if(dir=='n'){
        y++;
      }
      else if (dir=='w') {
        x--;
        
      }
      else {
        x++;
      }
    }
    int X2 =x*x;
    int Y2=y*y;
    return (float)Math.sqrt(X2+Y2);
  }
  public static void main(String[] args) {
    String fruits[] ={"apple","mango","banana"};
    String largest = fruits[0];
    for (int i = 0; i < fruits.length; i++) {
  if (largest.compareTo(fruits[i])<0) {
    largest =  fruits[i];

    
  }    
    }
    System.out.println(largest);
  }
} 

 
import java.util.*;
 public class array {
  public static String toupperCase(String str){
    StringBuilder Sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    Sb.append(ch);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) ==' '&& i<str.length()-1) {
        Sb.append(str.charAt(i));
        i++;
        Sb.append(Character.toupperCase(str.charAt(i)));

        
      }
      else 
      {
        Sb.append(str.charAt(i));
      }
    }
    return Sb.toString();
  }
 
  public static void main(String[] args) {
    String str ="hi, i am abhishek";
    System.out.println(toupperCase(str));
    //StringBuilder sb = new StringBuilder("");
    /*for ( char ch ='a';ch<='z';ch++) {
      sb.append(ch);
      
    }
System.out.println(sb);*/




import  java.util.*;
public  class array {
 public static int SetIthBit(int n, int i){
  int bitMask =1<<i;
  return  n|bitMask;
 }
  public static void main(String[] args) {
    System.out.println(SetIthBit(15,3));
  }
}