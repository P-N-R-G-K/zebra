package db;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation 
{
    public static boolean isValidUsername(String name) 
    { 
        String regex = "^[A-Za-z]\\w{5,29}$"; 
        Pattern p = Pattern.compile(regex); 
        if (name == null) { 
            return false; 
        } 
        Matcher m = p.matcher(name); 
        return m.matches(); 
    }
    public static boolean isValid(String email) 
    { //password should like="Geeks@portal20"
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    }
    public static boolean
    isValidPassword(String password)
    {
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
    }
}
