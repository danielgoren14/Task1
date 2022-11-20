import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coefficient1;
        do{
            System.out.println("Please enter the coefficient of the first variable in the quadratic equation which not equals to 0");
            coefficient1 = scanner.nextInt();
        }while(coefficient1 == 0);
        int coefficient2;
        do{
            System.out.println("Please enter the coefficient of the second variable in the quadratic equation which not equals to 0");
            coefficient2 = scanner.nextInt();
        }while(coefficient2 == 0);
        int coefficient3;
        do{
            System.out.println("Please enter the coefficient of the third variable in the quadratic equation which not equals to 0");
            coefficient3 = scanner.nextInt();
        }while(coefficient3 == 0);

        double discriminant = coefficient2*coefficient2 - 4 * coefficient1 * coefficient3;
        double solution1;
        double solution2;
        double oneSolution;
        if(discriminant == 0){
            oneSolution = (-1 * coefficient2) / (2 * coefficient1);
            System.out.println("There is only one solution for this quadratic equation, which equals to " + oneSolution);
        }
        else if(discriminant > 0){
            solution1 = ((-1 * coefficient2)+ Math.sqrt(discriminant))/ (2 * coefficient1);
            solution2 = ((-1 * coefficient2)- Math.sqrt(discriminant))/ (2 * coefficient1);
            System.out.println("There are 2 solutions for this quadratic equation, which equals to "+ solution1 + " and to " + solution2);
        }
        else{
            System.out.println("There are no any solutions for this quadratic equation");
        }
    }
}