import java.util.Scanner;

public class ques3 {
    public static void main(String[] args){
        int qty;
        double cost;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter quantity");
        qty= sc.nextInt();
        if(qty>1000){
            cost=qty*.1;
            System.out.println("The cost for "+qty+" is Rs."+cost);
        }
        else {
            System.out.println("The cost is: "+qty);
        }
    }
}

