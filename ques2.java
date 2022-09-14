import java.util.Scanner;

public class ques2 {
    public static void main(String[] args){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    a= sc.nextInt();
    System.out.println("Enter 2nd number");
    b= sc.nextInt();
    if(a>b){
        System.out.println(a+" is greatest number.");
    }
    else{
        System.out.println(b+" is greatest number.");
    }

}
}
