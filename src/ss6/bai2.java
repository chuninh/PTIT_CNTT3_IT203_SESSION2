package ss6;

class Account {

    private String username;
    private String password;
    private String email;

    Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    void changePassword(String newPassword) {
        this.password = newPassword;
    }

    void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("----------------------");
    }
}

public class bai2 {
    public static void main(String[] args) {

        Account acc1 = new Account(
                "user01",
                "123456",
                "user01@gmail.com"
        );

        acc1.displayInfo();
        acc1.changePassword("newpass123");
        acc1.displayInfo();
    }
}
