package application;

public class Main {

    public static void main(String[] args) {

        //Test input: String[] a = new String[]{"-mode", "enc", "-data", "Hello there!", "-key", "5", "-alg", "unicode"};

        new Controller(args).runCipher();
    }
}
