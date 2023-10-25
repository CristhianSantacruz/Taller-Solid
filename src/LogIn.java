public class LogIn{
    
	//Principio de responsabilidad unica 
	//La clase Insert hace la responsabilidad de insertar el usuario en la base de datos
	
	public void log (User user)  {
    	
        System.out.println("Has access to the website");
        InsertUserInDatabase.insertUserInDatabase(user);
        // Logic
    }
   
}

