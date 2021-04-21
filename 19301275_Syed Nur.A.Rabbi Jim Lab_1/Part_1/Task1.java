
public class Task1{
  public static boolean firstlast6(int [] numArray){
  if (numArray[0]==6 || numArray[numArray.length-1]==6){
    return true;
  }
  else{
    return false;
  }
}
  public static void main(String [] args){
    int[] numArray={13,6,1,4,6};
    System.out.println(firstlast6(numArray));
  }
}