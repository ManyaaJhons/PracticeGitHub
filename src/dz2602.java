import java.util.Scanner;

public class dz2602 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int counter = 0;
        System.out.println("четные числа:");
    for(int i = a; i <= b; i++ ){
    if (i % 2 == 0){

        counter = counter + i;

        System.out.print(i + " ");}

    }

    }
}
