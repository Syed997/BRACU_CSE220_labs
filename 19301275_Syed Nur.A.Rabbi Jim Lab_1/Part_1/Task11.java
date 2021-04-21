import java.util.*;
public class Task11{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int[]a=new int[5];
    for(int i=0;i<a.length;i++){
      a[i]=input.nextInt();
    }
  
  System.out.println(allDigitsOdd(a));
  }
  public static Boolean allDigitsOdd(int []b){
    int c=0;
    for(int i=0;i<b.length;i++){
      if(b[i]%2==0){
        c++;
      }
    }
    if(c==0){
      return true;
    }
    else{
      return false;
    }
  }
}