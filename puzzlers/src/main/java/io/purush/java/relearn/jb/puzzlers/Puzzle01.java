package io.purush.java.relearn.jb.puzzlers;

public class Puzzle01 {

  static boolean yesOrNo(String s){
    s = s.toLowerCase();
    if(s.equals("yes") || s.equals("y") || s.equals("t")) s = "true";
    return Boolean.getBoolean(s); // OUCH!
  }
  public static void main(String[] args){
    System.out.println(yesOrNo("true") + " " + yesOrNo("YeS"));
  }
  static boolean goodCodeYesOrNo(String s){
    s = s.toLowerCase();
    return s.equals("yes") || s.equals("y")
      || s.equals("true") || s.equals("t"); //clearly works not merely works!
    
  }
}
/**
   Moral: Strange and terrible methods lurk in libraries!
*/
