package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력 하세요 : ");
        int count = sc.nextInt();
        int[][] arr = new int[count][3];
        String[] subjects = {"국어","영어","수학"};

        for (int i = 0; i < count; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요.");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j]+"점수 :");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < count; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            double avg = (double) sum / 3;
            System.out.println((i+1)+"번 학생의 총점 : "+sum+", 평균 : "+avg);
        }
    }
}
