package OopsConcepts.StaticMethodsT9;

public class P2 {
    public static void main(String[] args) {
        System.out.println(MathOperations.sqrt(4));
    }
}



class MathOperations{
    static double  sqrt(float num){
      return Math.sqrt(num);
    } 
}