package TP;

import java.io.IOException;
public class testauth {

	public static void main(String[] args) {
		boolean est;
		est=false;
		do {
			try 
			{
				Authentification a=new Authentification();
				est=true;
			}
		    catch(WrongLoginException b)
			{
		    	System.out.println(b.getMessage());
		    }
		    catch(WrongInputLength c)
		    {
		    	System.exit(0);
		    }
		    catch(WrongPwdException d) 
		    {
		    	System.out.println(d.getMessage());
		    }
		    catch(IOException e)
		    {
		    	System.exit(0);
		    }

	}while(est==false);
	}
}
