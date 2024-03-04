package ctMetaProcessing;

public class Main {

    @CompileTimeComputed(value = "5")
    public static int factorial5() {
        return 0; // Dummy return; the value will be computed at compile-time
    }

    @CompileTimeComputed(value = "10")
    public static int factorial10() {
        return 0; // Dummy return; the value will be computed at compile-time
    }

    public static void main(String[] args) {
        System.out.println(factorial5());
        System.out.println(factorial10());
    }
}
