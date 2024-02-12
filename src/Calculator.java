import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int operator;
        double firstNumber;
        double secondNumber;
        double result = 0;


        System.out.println("First number: ");
        firstNumber = x.nextDouble();


        System.out.println("Second number: ");
        secondNumber = x.nextDouble();

        System.out.println("Choose operation: \n 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division");
        operator = x.nextInt();

        switch (operator){
            case 1: result = firstNumber + secondNumber;
            break;
            case 2: result = firstNumber - secondNumber;
            break;
            case 3: result = firstNumber * secondNumber;
            break;
            case 4: result = firstNumber / secondNumber;
            break;
            default: System.out.println("This operator does not exist");
        }

        System.out.println("Result is: " + result);
    }
}
