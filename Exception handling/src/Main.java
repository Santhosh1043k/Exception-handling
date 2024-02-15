import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    try {


        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 / num2);
    }
    catch (ArithmeticException a){
        System.out.println("you should not enter '0' in num2");
    }
    }
}