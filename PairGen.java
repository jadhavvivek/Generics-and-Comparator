public class PairGen<V, A> {
 
    private V v1;
    private A a1;

    public PairGen(V v1, A a1){
        this.v1=v1;
        this.a1=a1;
    }
    public V getFirst(){
        return v1;
    }

    public A getSecond(){
        return a1;
    }
    public void setv1(V v1){
        this.v1=v1;
    }
    public void setSecond(A a1){
        this.a1=a1;
    }

     public PairGen<A, V> reverse(){
        return new PairGen<>(a1, v1);

     }

     public String toString(){
        return "PairGen{" +
               "v1="+v1+
               ", a1="+ a1 +
               '}';
     }
     
   public static void main(String[] args) {
    PairGen<Integer, String> originalPairGen=new PairGen<>(1, "one");
    System.out.println("Original Pair: " +originalPairGen);

    PairGen<String, Integer> revPairGen=originalPairGen.reverse();
    System.out.println("Reversed Pair: "+revPairGen);
   } 
}
