public class LogInAdmin extends LogIn {
    private boolean userIsAdmin;
    @Override
    public void log (User user) {
        this.userIsAdmin = VerifyIfTheUserIsAdmin.verifyIfTheUserIsAdmin(user);
        if(userIsAdmin){
        		System.out.println("Has access to the website in admin mode");
        		//Logic
        }else {
        	super.log(user);
           
        }
       
    }
    
}

