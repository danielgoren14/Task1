import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberFromUser;
        int sum = 0;
        System.out.println("please enter a number");
        numberFromUser = scan.nextInt();
        do {
            sum += numberFromUser % 10;
            numberFromUser /= 10;
        } while (numberFromUser > 0);
        System.out.print("the sum is:" + sum);
    }
}
