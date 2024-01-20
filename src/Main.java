import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int fnum,pnum,operator;
        System.out.println("\tOPTIONS");
        System.out.println("1.Multiplication");
        System.out.println("2.Subtraction");
        System.out.println("3.Addition");
        System.out.println("4.Division\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Option: ");
        operator = sc.nextInt();
        System.out.println("Enter your first number: ");
        fnum = sc.nextInt();
        System.out.println("Enter your second number: ");
        pnum = sc.nextInt();
        double answer = 0;
        switch (operator) {
            case 1:
                answer = fnum * pnum;
                break;
            case 2:
                answer = fnum - pnum;
                break;
            case 3:
                answer = fnum + pnum;
                break;
            case 4:
                answer = fnum / pnum;
                break;
            default:
                System.out.println("Entered number is invalid");
        }
        System.out.println("Your answer is: " + answer);
    }
}