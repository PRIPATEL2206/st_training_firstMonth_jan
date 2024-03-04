package OopsConcepts.IteratorPatternT19;

interface IteratorInterface{
    int next();
    boolean hasNext();
}

class Iterator implements IteratorInterface{
    int current;
    int n;
    int[] iterater;

    Iterator(int[]iter){
        iterater=iter;
        current=-1;
        n=iter.length;
    }
    @Override
    public int next() {
        if (current<n-1){
            current+=1;
            return iterater[current];


        }
        return -1;
    }

    @Override
    public boolean hasNext() {
        return current<n-1 ;
    }
}


public class p2 {
   public static void main(String[] args) {
    int[] arr={1,23,45,67,89};

    IteratorInterface it=new Iterator(arr);
    while(it.hasNext()){
        System.out.print(it.next()+" -> ");
    }
   }
}
