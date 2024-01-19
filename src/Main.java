import java.util.Scanner;
public class Main {
    static void checkAge(int age) {
        if(age < 18) {
            System.out.print("Sorry you are not eligible to vote!");
        }
        else{
            System.out.print("Congratulation! You are eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = myObj.nextLine();
        System.out.print("Enter your Age: ");
        int age = myObj.nextInt();
        System.out.print("Enter your ID: ");
        int id = myObj.nextInt();
        checkAge(age);
    }
}