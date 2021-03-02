import java.util.Locale;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class lesson3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
//        int a = myScanner.nextInt();
//        int b = myScanner.nextInt();
//        int c = myScanner.nextInt();
//        if (a >= b && a > c) {
//            System.out.println(a);
//
//        } else {
//            if (b > c) {
//                System.out.println(b);
//
//            } else {
//                System.out.println(c);
//            }
//
//
//        }
//    }
//}
//        int age = myScanner.nextInt();
//        if (age >= 25 && age <= 40) {
//            System.out.println("подходит");
//
//        } else
//            System.out.println("ne podhodit");
//
//
//
//
//
//
//
//
//
//
//    int a = myScanner.nextInt();
//    switch (a) {
//        case 1:
//            System.out.println("январь");
//            break;
//        case 2:
//            System.out.println("февраль");
//            break;
//        case 3:
//            System.out.println("март");
//            break;
//        case 4:
//            System.out.println("апрель");
//            break;
//        case 5:
//            System.out.println("май");
//            break;
//        case 6:
//            System.out.println("июнь");
//            break;
//        case 7:
//            System.out.println("июль");
//            break;
//        case 8:
//            System.out.println("август");
//            break;
//        case 9:
//            System.out.println("сентябрь");
//            break;
//        case 10:
//            System.out.println("октябрь");
//            break;
//        case 11:
//            System.out.println("ноябрь");
//            break;
//        case 12:
//        System.out.println("декарь");
//            break;
//        default:
//            System.out.println("Ошибка");
//            break;


        System.out.println("все хорошо?");
        String r = myScanner.next();

        if (r.equals("да")) {
            System.out.println("любишь воду?");
            r = myScanner.next();
            r = r.toLowerCase();


        }
        if (r.equals("да")) {
            System.out.println("а хлеб любишь?");
            r = myScanner.next();
            r = r.toLowerCase();
        }
        else{

        }
        if (r.equals("да")) {
            System.out.println("точно любишь?");
            r = myScanner.next();
            r = r.toLowerCase();
        }
        if (r.equals("да")) {

            r = myScanner.next();
            r = r.toLowerCase();
        }
        if (r.equals("да")) {
            r = myScanner.next();
            r = r.toLowerCase();
        }


    }
}