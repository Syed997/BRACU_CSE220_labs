import java.util.*;
public class Task2{
  public static void main(String[]args){
    int[]a=new int[5];
    Scanner input= new Scanner(System.in);
    int max=0;
    int min=0;
    int temp=0;
    for(int i=0; i<a.length; i++){
      a[i]=input.nextInt();
      if(max<a[i]){
        max=i;
      }
      if(min>a[i]){
        min=i;
      }
    }
    temp=a[max];
    a[max]=a[min];
    a[min]=temp;
    
    for(int i=0; i<a.length;i++)
      System.out.println(a[i]);
    
}
}
      
    