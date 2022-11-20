import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first Arithmetic organ of the Arithmetic progression");
        int firstOrgan = scanner.nextInt();
        System.out.println("please enter the difference Arithmetic organ of the Arithmetic progression");
        int difference = scanner.nextInt();
        int amountOfOrgans;
        do{
            System.out.println("please enter a positive number of the amount of the organs in the Arithmetic progression");
            amountOfOrgans = scanner.nextInt();
        }while (amountOfOrgans <= 0);
        for(int i = 1;i <= amountOfOrgans;i++){
            System.out.print(firstOrgan + " ");
            firstOrgan += difference;
        }
    }
}
