import java.util.Scanner;

class program27
{
    public static void main(String A[])
    {
        Scanner scanner = null;
        String Name = null;
        int iAge = 0;
        float fMarks = 0.0;                         //Error

        scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String sName = scanner.next();

        System.out.println("ENter your Age : ");
        iAge = scanner.nextInt();

        System.out.println("Enter your Marks :");
        iMarks = scanner.nextFloat();

        System.out.println("Welcome "+ sName);
        System.out.println("Your Age is :"+ iAge);
        System.out.println("Your Marks are :"+ fMarks);
    }
}