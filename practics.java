import java.util.Scanner;
public class practics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: "); 
        String name = sc.next();
        System.out.println("Hello, " + name + " !");


        System.out.print("Enter you age: ");
        int age = sc.nextInt();
        System.out.print("Your age is: " + age);

        System.out.print("\nEnter your salary: ");
        double salary = sc.nextDouble();
        System.out.println("Your salary is: " + salary);

        System.out.print("Do you like Java: ");
        boolean likes = sc.nextBoolean();
        System.out.println("Likes Java: " + likes);
    }
}