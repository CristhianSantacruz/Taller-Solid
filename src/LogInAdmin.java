public class LogInAdmin extends LogIn implements Logger {
    private boolean userIsAdmin;
    @Override
    public void log (User user) {
        this.userIsAdmin = VerifyIfTheUserIsAdmin.verifyIfTheUserIsAdmin(user);
        if(!userIsAdmin){
            return;
        }
        System.out.println("Has access to the website in admin mode");
        // Logic
    }
    
}

