import java.util.Scanner;

public class ques1 {
    public static void main(String[] args){
        int length,breadth;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        length= sc.nextInt();
        System.out.println("Enter breadth");
        breadth= sc.nextInt();
        if(length==breadth){
            System.out.println("Square");
        }
        else{
            System.out.println("Not Square");
        }

    }
}
