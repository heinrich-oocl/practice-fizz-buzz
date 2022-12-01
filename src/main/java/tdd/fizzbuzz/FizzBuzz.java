package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int sequence) {
        String output = "";
        if (sequence % 3 == 0) {
            output += "Fizz";
        }
        if (sequence % 5 == 0) {
            output += "Buzz";
        }
        if (sequence % 7 == 0) {
            output += "Whizz";
        }



        return output.isEmpty() ? String.valueOf(sequence) : output;
    }
}
