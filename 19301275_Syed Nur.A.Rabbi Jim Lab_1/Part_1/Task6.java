import java.util.*;
public class Task6{
  public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    int[]a=new int[5];
    for(int i=0;i<a.length;i++){
      a[i]=input.nextInt();
    }
    if(a[0]==a[a.length-1]){
      System.out.println("This aaray is a palindrome!");
    }
    else{
      System.out.println("This is not palindrome.");
    }
  }
}