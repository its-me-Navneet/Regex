import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
       
     // User Registration validation 
    
     String password ="asdbs2hAasdas" ; 
     String regex = "(?=.*[A-Z])(.){8,}" ; 
     regex ="(?=.*[0-9])" + regex  ;
     System.out.println(Pattern.matches(regex,password));
     
    }
}
