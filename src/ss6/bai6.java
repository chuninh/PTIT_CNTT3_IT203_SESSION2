package ss6;

class User {
    private String id;
    private String username;
    private String password;
    private String email;

    User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    String getId() {
        return id;
    }

    String getUsername() {
        return username;
    }

    String getEmail() {
        return email;
    }

    void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Password khong duoc rong!");
        }
    }

    void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email khong hop le!");
        }
    }

    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("----------------------");
    }
}

public class bai6 {
    public static void main(String[] args) {

        User u1 = new User("U001", "ninhchu", "123456", "ninhchu@gmail.com");
        u1.displayInfo();

        User u2 = new User("U002", "user02", "", "user02gmail.com");
        u2.displayInfo();

        u2.setPassword("newpass789");
        u2.setEmail("user02@gmail.com");
        u2.displayInfo();
    }
}
