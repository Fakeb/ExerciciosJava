
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IComunicacaoCliente extends Remote {
    
    public void recebeMensagemDoServidor(String msg) throws RemoteException;
}
