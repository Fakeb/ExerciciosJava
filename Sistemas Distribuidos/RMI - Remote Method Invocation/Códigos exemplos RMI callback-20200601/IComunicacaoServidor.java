
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IComunicacaoServidor extends Remote {
    
    public void recebeCilente(IComunicacaoCliente c) throws RemoteException;
    public void recebeMensagemDoCliente(String msg) throws RemoteException;
}
