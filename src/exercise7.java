public class exercise7 {
    public static void main(String[]args) {
        int sum;
        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int checkedNumber;

        for (int i = 1; i <= 9; i++){
            System.out.print(i + "\t");
        }

        for (int i = 100; i <= 999; i++) {
            checkedNumber = i;
            firstDigit = ((checkedNumber % 10) * (checkedNumber % 10) * (checkedNumber % 10));
            checkedNumber /= 10;
            secondDigit = ((checkedNumber % 10) * (checkedNumber % 10) * (checkedNumber % 10));
            checkedNumber /= 10;
            thirdDigit = ((checkedNumber % 10) * (checkedNumber % 10) * (checkedNumber % 10));
            sum = firstDigit + secondDigit + thirdDigit;
            if (sum == i) {
                System.out.print(i + "\t");
            }
        }
    }
}
