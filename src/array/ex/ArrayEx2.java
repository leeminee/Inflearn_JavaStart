package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("출력");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j]);
            if (j < numbers.length-1) {
                System.out.print(", ");
            }
        }


    }
}
