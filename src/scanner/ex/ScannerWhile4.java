package scanner.ex;

import java.util.Scanner;

public class ScannerWhile4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        while (true) {
        System.out.println("1. 상품입력, 2. 결제, 3. 프로그램 종료");
        int input = scanner.nextInt();

        if(input == 1) {
            System.out.print("상명을 입력하세요 : ");
            String item = scanner.next();
            System.out.print("상품의 가격을 입력하세요 : ");
            int price = scanner.nextInt();
            System.out.print("구매 수량을 입력하세요 : ");
            int num = scanner.nextInt();
            int sum = price * num;

            System.out.println("상품명 : " + item + ", 가격 : " + price + ", 수량 : " + num + ", 합계 : " + sum + "원");
            total += sum;
        } else if (input == 2) {
            System.out.println("총 비용 : "+total);
            total = 0;
        } else if (input == 3) {
            System.out.println("프로그램을 종료합니다.");
            break;
        } else {
            System.out.println("옵션의 1,2,3 숫자 중에서만 입력하세요.");
        }
        }
    }
}
