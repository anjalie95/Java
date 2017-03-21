import java.util.Scanner;

class User{
    public static void main(String args[]){
        String fname, lname;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name : ");
        fname = scanner.nextLine();
        System.out.print("Enter last name : ");
        lname = scanner.nextLine();
        System.out.println(fname + lname);
    }
}
