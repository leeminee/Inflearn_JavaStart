package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료) : ");
            int num = scanner.nextInt();

            sum += num;
            if(num == 0) {
                System.out.println("모든 정수의 합 : "+sum);
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
