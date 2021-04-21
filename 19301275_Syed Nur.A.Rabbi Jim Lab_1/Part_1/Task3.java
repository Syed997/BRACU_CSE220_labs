import java.util.*;
public class Task3{
  public static void main(String [] args){
    Scanner input= new Scanner(System.in);
    int temp=0;
    int [] a= new int[5];
    a[0]=input.nextInt();
    for(int i=1; i<a.length; i++){
      a[i]=input.nextInt();
      if(a[i]>a[i-1]){
        temp=a[i];
        a[i]=a[i-1];
        a[i-1]=temp;
      }
      else{
      }
    }
    for(int i=0; i<a.length;i++)
      System.out.print(a[i]);
  
  for(int i=0; i<a.length;i++){
    if(a[i]%2==0){
      System.out.print(a[i]);
    }
  }
}
}