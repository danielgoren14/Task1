
public class exercise7
{
    public static void main(String[]args) {
        int sum;
        int firstDigit;
        int secondDigit;
        int thirdDigit = 0;
        int fourthDigit = 0;
        int checkedNumber;

        for (int i = 1; i <= 9; i++){
            System.out.print(i + " ");
        }


        for (int i = 10; i <= 1000; i++) {
            checkedNumber = i;
            firstDigit = ((checkedNumber % 10) * (checkedNumber % 10) * (checkedNumber % 10));
            checkedNumber /= 10;
            secondDigit = ((checkedNumber % 10) * (checkedNumber % 10) * (checkedNumber % 10));
            checkedNumber /= 10;
            if(i >= 100 && i <=999){
                thirdDigit = ((checkedNumber % 10) * (checkedNumber % 10) * (checkedNumber % 10));
                checkedNumber /= 10;
            }
            if(i == 1000) {
                fourthDigit = ((checkedNumber % 10) * (checkedNumber % 10) * (checkedNumber % 10) * (checkedNumber % 10));
            }
            sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
