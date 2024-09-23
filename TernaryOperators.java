package op_er_at_ors;

public class TernaryOperators {
    public static void main(String[] args) {
        boolean isAuthenticated = true;

        if(isAuthenticated){
            System.out.println("You are logged in successfully.");
        }else{
            System.out.println("You are not logged in.");
        }

        // Below is ternary operator in use
        String result = (isAuthenticated)?"loggedIn":"Not LoggedIn";
        System.out.println(result);
    }
}
