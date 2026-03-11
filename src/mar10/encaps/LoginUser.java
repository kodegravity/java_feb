package mar10.encaps;

public class LoginUser {
    private String userName;  // get the username ? but cannot set
    private String password; // set the password but cannot get it

    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void userAuthentication(String userName, String password){
        if(userName.equals(this.userName) && password.equals(this.password)){
            System.out.println("User is authenticated");
            System.out.println("Welcome to my app");
        }else {
            System.out.println("Invalid user credentials");
            System.out.println("Please try again!!!");
        }
    }
}
