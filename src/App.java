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
 
    String []valid ={"abc@yahoo.com" , "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"} ;
    
     // char digit not all digit - @
     String email ="xyz@ge.com" ; 
     String regexE = "^[a-zA-Z0-9](?!.*[.][.])(?!.*[@][.])(?!.*[.][@])(?=[^@]*[@][^@]*$)[a-zA-z0-9@.+-]{3,}[a-zA-Z]{2,2}$" ; 
 
      for(String Email :valid ){
      String ans =Pattern.matches(regexE, Email)==true ? "Valid":"Invalid" ; 
      System.out.println(Email + " is "+ ans);
      }
      System.out.println("************");
    
      String invalid[] = {"abc", "abc@.com.my","3. abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"} ;
  
       for(String Email : invalid){
          String ans =Pattern.matches(regexE, Email)==true ? "Valid":"Invalid" ; 
          System.out.println(Email + " is "+ ans);
      }
       }
    }

