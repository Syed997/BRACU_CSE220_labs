import java.util.*;
public class Task10{
  public static String season(int e, int n){
    if(n==1||n==2){
      return "Winter";
    }
    else if(n==4 || n==5){
      return "Spring";
    }
    else if(n==7 || n==8){
      return "Summer";
    }
    else if(n==10 || n==11){
      return "Fall";
    }
    else if(n==12){
      if(e>15){
        return "Winter";
      }
      else{
        return "Fall";
      }
    }
    else if(n==3){
      if(e>15){
        return "Spring";
      }
      else{
        return "Winter";
      }
    }
    else if(n==6){
      if(e>15){
        return "Summer";
      }
      else{
        return "Spring";
      }
    }
    else if(n==9){
      if(e>15){
        return "Fall";
      }
      else{
        return "Summer";
      }
    }
    return "Jim";
  }
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int d=0;
    int m=0;
    for(int i=0;i<1;i++){
      System.out.println("Give your Date.");
      d=input.nextInt();
      if(d<1 || d>31){
        System.out.println("You were suppose to give number between 1 to 31. Try again.");
        i--;
      }
    }
    for(int i=0;i<1;i++){
      System.out.println("Give your Month.");
      m=input.nextInt();
      if(m<1 || m>12){
        System.out.println("You were suppose to give number between 1 to 12. Try again.");
        i--;
      }
      else{
      }
    }
    System.out.println(season(d,m));
  }
}