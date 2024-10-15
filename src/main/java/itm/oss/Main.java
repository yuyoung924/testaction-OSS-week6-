package itm.oss;

import itm.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("This is my calculator. 5 + 5 = " + calc.Add(5,5));
        
        System.out.println("This is my calculator. 10 - 5 = " + calc.Substract(10,5));
    }
}