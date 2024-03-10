
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            СheckAuthorized.checkAuthorized("login", "122цчч3123", "123123");
        } catch (WrongPasswordException | WrongLoginException r) {
            r.printStackTrace();
        }

    }
}
