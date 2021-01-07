import java.util.Scanner;

public class smartBabyBox {
    private Scanner sc = new Scanner(System.in);
    private String username;
    private String email;
    private String purchaseCode;

    private static smartBabyBox uniqueInstance;

    private smartBabyBox() {
    }

    public static smartBabyBox getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new smartBabyBox();
        }
        return uniqueInstance;
    }

    public void register() {
        System.out.println("Register");
        System.out.print("Username: ");
        username = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.print("purchaseCode: ");
        purchaseCode = sc.nextLine();
    }

    public void Login() {
        System.out.println("Login");
        System.out.print("Username: ");
        username = sc.nextLine();
        System.out.print("purchaseCode: ");
        purchaseCode = sc.nextLine();

    }

}
