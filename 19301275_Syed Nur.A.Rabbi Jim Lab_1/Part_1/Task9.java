import java.util.*;
public class Task9{
  private static void mt1(int[]b){
    for(int i=0;i<b.length;i++){
      b[i]=b[i]*b[i];
    }
    for(int i=0;i<b.length;i++){
      System.out.print(b[i]+", ");
    }
  }
  public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    int []a=new int[10];
    for(int i=0;i<a.length;i++){
      a[i]=input.nextInt();
    }
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+", ");
    }
    System.out.println();
   mt1(a);
  }
}