public class CloudServicePlatform {
	
    //private int cloudServicePlatform;
	private Plataforma plataforma;
    
    public void hostingTo (AppWeb app,Plataforma plataforma) {
    	
    	this.plataforma = plataforma;
    	this.plataforma.connect();
    	//Logic
    	
    	
    	
       /* if (cloudServicePlatform==1) {
            System.out.println("Connect to AWS");
            // Logic
        }if (cloudServicePlatform==2) {
            System.out.println("Connect to Microsoft Azure");
            // Logic
        }else{
            System.out.println("Connect to Google Cloud");
            // Logic
        }*/
    }
    // More Methods
}

