
package cn4000server;

import java.net.ServerSocket;



public class Server {
    
    private ServerSocket serverSocket;
    private final int port=5678;
        
    }       
    
  
    
private Server() {
 try{
serverSocket= new ServerSocket(port);
}catch(IOException e){
  e.printStackTrace();
}
}
 

          
}

}
