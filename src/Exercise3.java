import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddnumber;
        do {
            System.out.println("please enter an odd number which is also bigger than 3");
            oddnumber = scanner.nextInt();
        } while (oddnumber <= 3 || oddnumber % 2 == 0);
        for (int i = 1; i <= oddnumber; i+=2) {
            for (int x = 0; x < (oddnumber - i) / 2; x++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int k = oddnumber - 2; k >=1;k-=2){
            for (int z = 0; z < (oddnumber - k) / 2; z++){
                System.out.print(" ");
            }
            for(int m = 1; m<=k;m++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
