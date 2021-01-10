import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.InetAddress;

public class Server {
    

public static void main(String[] args) {

try {
	LocateRegistry.createRegistry(1099);
	System.out.println("Mis en place du Security Manager");

	AdditionImpl add = new AdditionImpl();

	String url = "rmi://"+InetAddress.getLocalHost().getHostAddress()+"/Addition";
	System.out.println("Enregistrement de l'objet avec l'url: "+url);
	Naming.rebind(url, add);

System.out.println("Server Start");

}

catch(MalformedURLException | RemoteException e) {

System.err.println("Erreur: " + e.getMessage());

}catch(UnknownHostException e){

e.printStackTrace();
}
}
}