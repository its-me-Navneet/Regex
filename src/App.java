import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
       
     // User Registration validation 

    //  String name = "Navneet Kumar" ; 
    //  String regex = "^[A-Z]+[A-Za-z]{2,}\\s[A-za-z]*$";
    //  Pattern pattern = Pattern.compile(regex) ; 
    //  Matcher matcher = pattern.matcher(name) ; 
    //  boolean match = matcher.matches() ;
    //  System.out.println(match); 

 
     // char digit not all digit - @
     String email ="xyz@ge.com" ; 
     String regexE = "^[a-zA-Z0-9](?!.*[.][.])(?!.*[@][.])(?!.*[.][@])(?=[^@]*[@][^@]*$)[a-zA-z0-9@.+-]{3,}[a-zA-Z]{2,2}$" ;  
          
     System.out.println(Pattern.matches(regexE, email));

    }
}
