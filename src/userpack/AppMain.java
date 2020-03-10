
package userpack;


public class AppMain {


    public static void main(String[] args) {
       
//        try 
//        {
//        String username = "12";
//        String password = "12345";
//        
//        if(password.equals(username.substring(0, 5))) {
//            
//            System.out.println("Login Successful");
//        }
//        
//        else {
//            
//            System.out.println("Something went wrong");
//        }
//        }
//        
//        catch(StringIndexOutOfBoundsException se)
//        {
//            System.out.println("Username should be atleast 5 characters");
//        }
//
//        catch(ArrayIndexOutOfBoundsException ae) 
//        {
//            System.out.println("Array error occurred");
//        }


        String username = "12";
        String password = "12345";
        
        if(username.length() >= 5) {
        
            if(password.equals(username.substring(0, 5))) {
            
            System.out.println("Login Successful");
            }
        
            else {
            
            System.out.println("Something went wrong");
            }
        }
        
        else {
            
            System.out.println("Username Characters should be 5 or more");
        }
    }
    
}
