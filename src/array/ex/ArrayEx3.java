package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("출력");
        for (int j = 4 ; j >=  0; j--) {
            System.out.print(numbers[j]);
            if (j > 0) {
                System.out.print(", ");
            }
        }
    }
}
