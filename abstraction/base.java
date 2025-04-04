import java.util.Scanner;

public class base {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Member login or Manager login: ");
        String ask = inp.nextLine().toLowerCase();

        System.out.print("Signup or Login: ");
        String akss = inp.nextLine().toLowerCase();

        if (ask.equals("member login")) {
            Member member = new Member();
            if (akss.equals("signup")) {
                member.signup();
            }
            member.login();
        } else if (ask.equals("manager login")) {
            Manager manager = new Manager();
            if (akss.equals("signup")) {
                manager.signup();
            }
            manager.login();
        } else {
            System.out.println("Invalid option.");
        }
        inp.close();
    }
}

abstract class Hello {
    protected String usr;
    protected String psw;
    protected Scanner inp = new Scanner(System.in);

    abstract void signup();
    abstract void login();
}

class Member extends Hello {
    void signup() {
        System.out.print("Enter your username: ");
        usr = inp.nextLine();
        System.out.print("Enter your password: ");
        psw = inp.nextLine();
        System.out.println("Thank you for signing up, member.");
    }
    void login() {
        System.out.print("Enter username: ");
        String user = inp.nextLine();
        System.out.print("Enter password: ");
        String pswd = inp.nextLine();

        if (user.equals(usr) && pswd.equals(psw)) {
            System.out.println("Welcome back, member " + user);
        } else {
            System.out.println("Incorrect username or password.");
        }
    }
}

class Manager extends Hello {
    void signup() {
        System.out.print("Enter your username: ");
        usr = inp.nextLine();
        System.out.print("Enter your password: ");
        psw = inp.nextLine();
        System.out.println("Thank you for signing up, manager.");
    }
    void login() {
        System.out.print("Enter username: ");
        String user = inp.nextLine();
        System.out.print("Enter password: ");
        String pswd = inp.nextLine();

        if (user.equals(usr) && pswd.equals(psw)) {
            System.out.println("Welcome back, manager " + user);
        } else {
            System.out.println("Incorrect username or password.");
        }
    }
}
