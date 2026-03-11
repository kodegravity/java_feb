package mar10.encaps;

public class LoginMain {
    public static void main(String[] args) {
        // initial username and password
        LoginUser loginUser = new LoginUser("myuser","12345");

        loginUser.userAuthentication("myuser","112233");

        // Hacker
        System.out.println(loginUser.getUserName());
        loginUser.setPassword("mypassword");

        loginUser.userAuthentication("myuser","mypassword");
    }
}
