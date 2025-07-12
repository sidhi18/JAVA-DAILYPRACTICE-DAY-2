import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        Scanner sj = new Scanner(System.in);
        System.out.print("enter your name");
        String name = sj.next();
        System.out.print("enter your age ");
        int age = sj.nextInt();
        System.out.println("hello" + name + ",you are " + age + " years old");

    }
}


