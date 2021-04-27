package exemplo2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerString extends UnicastRemoteObject implements IServerString  {

    public ServerString() throws RemoteException {
    }

    public int contaCaracteres(String s) throws RemoteException {
        int cont = s.length();
        return cont;
    }

    

}
