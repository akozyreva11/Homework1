public class СheckAuthorized {

    public static void checkAuthorized(String login, String password, String confirmPassword) {

        if (login.length() > 20) {
            throw new WrongLoginException("Слишком длинный пароль");
        }
        if (!login.matches("[a-zA-z0-9_]+")) {
            throw new WrongLoginException("Недопустимые символы");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Слишком длинный пароль");
        }
        if (!password.matches("[a-zA-z0-9_]+")) {
            throw new WrongPasswordException("Недопустимые символы");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
