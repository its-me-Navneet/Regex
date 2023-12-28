import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
       
     // User Registration validation 

     String name = "Navneet Kumar" ; 
     String regex = "^[A-Z]+[A-Za-z]*\\s*[A-Z]+[A-Za-z]*$";
     Pattern pattern = Pattern.compile(regex) ; 
     Matcher matcher = pattern.matcher(name) ; 
     boolean match = matcher.matches() ;
     System.out.println(match);

    }
}
