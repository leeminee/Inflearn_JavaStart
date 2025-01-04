package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요 : ");
        int count = sc.nextInt();
        int[] arr = new int[count];
        int minNum, maxNum;

        System.out.println(count+"개의 정수를 입력하세요 : ");
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        minNum = maxNum = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        System.out.println("가장 작은 정수 : "+minNum);
        System.out.println("가장 큰 정수 : "+maxNum);
    }
}

