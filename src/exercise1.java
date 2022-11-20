import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c;
        double x1,x2;
        System.out.println("enter the parameter a (not 0)");
        do{
            a = scan.nextInt();
            if(a == 0){
                System.out.println("try again");
            }
        }while(a==0);
        System.out.println("enter the parameter b");
        b = scan.nextInt();
        System.out.println("enter the parameter c");
        c = scan.nextInt();
        double sum = (b*b)-(4*a*c);
        if(sum<0){
            System.out.println("there is no solution");
        }
        else if(sum == 0){
            x1=-b/(a*2);
            System.out.println("x1 = "+x1);
        }
        else{
            x1 = (-b + Math.sqrt(sum))/(a*2);
            x2 = (-b - Math.sqrt(sum))/(a*2);
            System.out.println("x1 = "+x1+ " , x2 = "+x2);
        }
    }
}