package itm;

public class Calculator {

    public int Add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public int Substract(int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    public boolean isPrime(int number){
        if (number <= 0 || number == 1){
            return false;
        }
        
        for(int i = 2 ; i < number ; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public int getNextPrime(int number){
        int index = number;

        while (true) {
            index += 1;
            if (isPrime(index)) {
                return index;
            }
            
        }
    }
    
}
