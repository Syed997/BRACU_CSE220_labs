import java.util.*;
public class Task8{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int m=input.nextInt();
    int []a= new int[m];
    int []b= new int[m];
    int []c=new int[m];
    for(int i=0;i<a.length;i++){
      System.out.println("Give a number for first Matrix");
      a[i]=input.nextInt();
    }
    for(int i=0;i<b.length;i++){
      System.out.println("Give a number for second Matrix");
      b[i]=input.nextInt();
    }
    for(int i=0;i<c.length; i++){
      c[i]=5*a[i]-b[i];
    }
    for(int i=0;i<c.length;i++){
      System.out.println(c[i]);
    }
  }
}
    