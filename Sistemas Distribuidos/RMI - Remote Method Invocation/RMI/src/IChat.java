import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IChat extends Remote {
    
    public void lerMensagem(String mensagem) throws RemoteException;

    public ArrayList getHistoricoMensagens() throws RemoteException;
}
