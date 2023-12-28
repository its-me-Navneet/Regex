import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
       
     // User Registration validation 
    
     String password ="xyhssabsd" ; 
     String regex = "(.){8,}" ;
     System.out.println(Pattern.matches(regex,password));

    }
}
