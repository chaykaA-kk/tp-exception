package TP; 
import java.io.IOException;
import java.util.Scanner;  

public class Authentification{  
    final String LoginCorrect="scott";  
    final String PwdCorrect="tiger";  

    public Authentification() throws WrongInputLength, WrongLoginException, WrongPwdException, IOException {  
        Scanner sc=new Scanner(System.in);  
        getUserLogin(sc);  
        getUserPwd(sc);  
    }  

    public void getUserLogin(Scanner sc) throws WrongInputLength, WrongLoginException {  
        System.out.println("Entrer le Login:");
        String login=sc.nextLine();
        if(login.length()>10)
        {
        	throw new WrongInputLength("");
        }
        if(!login.equals(LoginCorrect))
        {
        	throw new WrongLoginException("Login est incorrecte ");
        }
    }
    
    public void getUserPwd(Scanner sc) throws WrongPwdException {  
        System.out.println("Donner le Password:");
        String Pwd=sc.nextLine();
        if(!Pwd.equals(PwdCorrect))
        {
        	throw new WrongPwdException("Mot de passe est incorrecte ");
        }
    }
}