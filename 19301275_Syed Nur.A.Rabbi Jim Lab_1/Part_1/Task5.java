import java.util.*;
public class Task5{
  public static void main(String []args){
    Scanner input=new Scanner(System.in);
    int [] a=new int[10];
    for(int i=0; i<15;i++){
      int j=input.nextInt();
      if(j>9){
        System.out.println("Sir, you are suppose to give number between 0-9. Try again.");
        i--;
      }
      else{
        a[j]=a[j]+1;
      }
    }
    for(int i=0; i<a.length; i++){
      System.out.println(i+" was found "+a[i]+" times");
    }
  }
}