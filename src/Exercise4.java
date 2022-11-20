import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFromUser;
        int counter = 0;
        int theCheckedNumber = 2;
        do {
            System.out.println("Please enter a number");
            numberFromUser = scanner.nextInt();
        } while (numberFromUser <= 0);
        while(counter < numberFromUser){
            for(int i = 2;i <= theCheckedNumber; i++) {
                if (i == theCheckedNumber) {
                    System.out.print(theCheckedNumber);
                    counter++;
                    if(numberFromUser - counter >=1){
                        System.out.print(",");
                    }
                }
                else if(theCheckedNumber % i == 0 ){
                    break;
                }
            }
            theCheckedNumber++;
        }
    }
}
