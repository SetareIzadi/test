import java.util.Scanner;

public class sacnnnner {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Are you above 18?- ");  
           Scanner sc = new Scanner(System.in);  
           boolean bn = sc.nextBoolean();  
           if (bn == true) {  
               System.out.println("You are over 18");  
           } else if (bn == false) {  
               System.out.println("You are under 18");  
           }  
           sc.close();
    }
}