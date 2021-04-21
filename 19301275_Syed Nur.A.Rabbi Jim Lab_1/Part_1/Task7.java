import java.util.*;
public class Task7{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int []a=new int[10];
    for(int i=0;i<a.length;i++){
      a[i]=input.nextInt();
    }
    System.out.println("Please give a number between 0-9");
    int n=input.nextInt();
    if(n>9 || n<0){
      System.out.println("Sir!You were suppose to give between 0-9!! Try again.");
      n=input.nextInt();
    }
    for(int i=1;i<a[n];i++){
      System.out.print("*");
    }
  }
}