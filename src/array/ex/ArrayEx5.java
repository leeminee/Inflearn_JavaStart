package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg;

        System.out.println("입력 받을 숫자의 개수를 입력하세요 : ");
        int[] arr = new int[sc.nextInt()];

        System.out.println(arr.length + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = (double) sum / arr.length;
        System.out.println("입력한 정수의 합계 : "+sum);
        System.out.println("입력한 정수의 평균 : "+avg);
    }
}
