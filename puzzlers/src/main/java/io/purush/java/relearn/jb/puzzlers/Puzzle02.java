package io.purush.java.relearn.jb.puzzlers;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Puzzle02 {
  static Comparator<Integer> cmp = (x,y) -> {
    return x<y ? -1 : (x==y ? 0 :1);
  };
  public static void main(String[] args){
    String[] strings = { "0", "1", "2", "3", "4", "5"};
    List<Integer> integers = new ArrayList<>();
    for(String s: strings){
      integers.add(Integer.valueOf(s));
    }
    System.out.println(Collections.binarySearch(integers, 1, cmp));
    
  }
}
