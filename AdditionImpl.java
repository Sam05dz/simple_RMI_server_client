import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdditionImpl extends UnicastRemoteObject implements Addition {

public AdditionImpl() throws RemoteException {

super(); }

   

    public double addition(double a, double b) throws RemoteException {
        return a+b;}
    
}

