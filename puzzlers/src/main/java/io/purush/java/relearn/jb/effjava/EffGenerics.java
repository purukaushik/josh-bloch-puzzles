package io.purush.java.relearn.jb.effjava;


public class EffGenerics {
  static Object[] badApples = new Object[100];
  //throws ArrayStoreException
  public static void put(Object[] args){
    if(args.length > 100) return;
    int i = 0;
    for(Object arg:args) badApples[i++] = (String)arg;
    args[0] = -1; // ArrayStoreException!!!
  }


  // Idea is to see that Arrays provide runtime generic type safety
  // while collections provide good compile time generic type safety
  public static void main(String[] args){
    String[] arguments = {"1", "0", "2", "0"};
    put(arguments);

  }
  // generic types unlike arrays are invariant
  // wildcard types provide API flexibility

  // The PECS pmnemonic-> Producer extends Consumer super
  // for a T producer use `Foo< ? extends T>`
  // for a T consumer use `Foo< ? super T>`

  // pushAll -> caller can pushAll from a Collection<Long> or anything that extends Number
  // into a Stack<Number>
  static void pushAll(Collection<? extends E> src){}

  // popAll -> caller can popAll from a Collection<Object> or Collection<Number>
  // from a Stack<Number>
  static void popAll(Collection<? super E> dst) {}

  // Again PECS
  // s1, s2 are E producers hence -> extends
  // return types should not have wildcard types -> wildcards should vanish
  // before the API user's eyes
  static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2){
    return null;
  }
}
