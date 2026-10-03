import java.util.Scanner;

class Homework3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.print("수를 입력하세요: ");

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        int max = num[0];
        int min = num[0];

        for(int i = 1; i < n; i++){
            if(num[i] > max){
                max = num[i];
            }

            if(num[i] < min){
                min = num[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}