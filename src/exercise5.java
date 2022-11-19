import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Please enter a number");
            userInput = scanner.nextInt();
        } while (userInput < 0);
        System.out.print("0 ");
        int number1 = 0;
        int number2 = 1;
        int number3 = 0;
        while(number3 < userInput){
            System.out.print(number2 + " ");
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }
        System.out.print(number3);
        if(number3 == userInput)
        {

            System.out.println(" the number "+ userInput +" belongs to fibonacci arithmetic progression");
        }
        else
        {
            System.out.println(" the number "+ userInput + " doesn't belong to fibonacci arithmetic progression");
        }
    }
}
