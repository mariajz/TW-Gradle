package org.example.factorial;

public class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }
    public static void main(String[] args){
        Factorial factObj = new Factorial(5);
        int result = factObj.check();
        System.out.println(result);
    }

    public int check() {
        int factorial = 1;
        if(number == 0){
            return factorial;
        }
        for(int multiplier =1; multiplier <= number; multiplier++){
            factorial = getFactorial(factorial, multiplier);
        }
        return factorial;
    }

    private int getFactorial(int factorial, int multiplier) {
        factorial *= multiplier;
        return factorial;
    }
}
