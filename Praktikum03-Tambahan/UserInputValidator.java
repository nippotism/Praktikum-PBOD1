public class UserInputValidator {

    public static void validateUsername(String username){
        assert username.matches("[a-zA-Z][a-zA-Z0-9_]+") : "Invalid username";
        
    }

    public static void validateEmail(String email) {
        assert email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") : "Invalid email";
        
    }

    public static void validateAge(int age) {
        assert age >= 17 && age <=99 : "Invalid age";
    }

    
}
