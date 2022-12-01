package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int i){
        return  i%21 == 0 ? "FizzWhizz":
                i%15 == 0 ? "FizzBuzz":
                i%7 == 0 ? "Whizz":
                i%3 == 0 ? "Fizz":
                i%5 == 0 ? "Buzz":
                String.valueOf(i);
    }
}
