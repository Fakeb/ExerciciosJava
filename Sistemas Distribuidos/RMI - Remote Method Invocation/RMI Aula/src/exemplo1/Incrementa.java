package exemplo1;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Incrementa extends UnicastRemoteObject implements IIncrementa  {

    public Incrementa() throws RemoteException {
    }

    public int inc(int x) throws RemoteException {
        System.out.println("Cliente chamou");
        x++;
        return x;
    }
    public int dec(int x) throws RemoteException {
        System.out.println("Cliente chamou");
        x--;
        return x;
    }
    
}