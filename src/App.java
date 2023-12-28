import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
       
     // User Registration validation \

     String password ="sadasdfds$fDs4@" ; 
     String regex = "(?=.*[A-Z])(.){8,}" ; 
     regex ="(?=.*[0-9])" + regex  ;  
     // ..$......
     regex ="(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$)(?=.*[0-9])"+ regex ; 
      System.out.println(regex);
     System.out.println(Pattern.matches(regex,password)); 
  
    
    }
}
