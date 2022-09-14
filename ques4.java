import java.util.Scanner;

public class ques4 {
    public static void main(String[] args){
        int yr;
        double sal;
        double bonus=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        yr= sc.nextInt();
        System.out.println("Enter salary");
        sal= sc.nextInt();
        if(yr>5){
            bonus=sal *.05;
            System.out.println("Net bonus amount for employees who works more than 5 year is Rs."+bonus);
        }
        else{
            System.out.println("Net bonus amount for employees who works less than 5 year is Rs."+sal);
        }

    }
}
