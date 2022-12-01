package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int i){
        return  i%3 == 0 ? "Fizz" :
                i%5 == 0 ? "Buzz":
                String.valueOf(i);
    }
}
