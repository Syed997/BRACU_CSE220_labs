import java.util.*;
public class Task4{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int [] a=new int[10];
    a[0]=input.nextInt();
    for(int i=1; i<a.length; i++){
      a[i]=input.nextInt();
      for(int j=0;j<i;j++){
        if(a[j]==a[i]){
          System.out.println(a[i]+" is already in the entered numbers, please try another one");
          i--;
        }
      }
    }
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }
                         
  }
}