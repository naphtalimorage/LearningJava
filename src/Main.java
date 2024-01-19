import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int day;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = myObj.nextLine();
        System.out.println("Enter your Age: ");
        int age = myObj.nextInt();
        System.out.println("Enter your choice: ");
        int choice = myObj.nextInt();
        switch (day = 7) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Sorry your choice is beyond 7");

        }
        System.out.println("NAME:"+ name);
        System.out.println("AGE:"+ age);
    }
}