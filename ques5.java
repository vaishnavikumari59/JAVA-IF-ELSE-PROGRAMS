import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {

        double marks;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        marks = sc.nextDouble();
        if (marks > 80) {
            System.out.println("Your grade is A");
        } if (marks > 60 && marks <= 80) {
            System.out.println("Your grade is B");
        } if (marks > 50 && marks <= 60) {
            System.out.println("Your grade is C");
        } if (marks > 45 && marks <= 50) {
            System.out.println("Your grade is D");
        } if (marks > 25 && marks <= 45) {
            System.out.println("Your grade is E");
        } if (marks <= 25) {
            System.out.println("Your grade is F");
        }


    }
}
