import java.util.Scanner;

public class Dzz {
    public static void main(String[] args) {
        //1 ex
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a % 2 != 0) {
//            a++;
//        }
//
//        while (a <= b){
//
//            System.out.println(a);
//            a = a +2;
//        }

        //2 ex
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a > b) {
//            int myVar = a;
//            a = b;
//            b = myVar;
//
//
//        }
//        if (a % 2 != 1){
//            a++;
//        }
//        while (a <= b) {
//
//            System.out.println(a);
//            a = a + 2;
//
//        }

//          4 задача
        int start = 10000;
        int end = 99999;

        while (start <= end){
            if (start % 133 == 125 && start % 134 == 111){
                System.out.println(start);

            }
            start++;
      }
    }
}