import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Chat extends UnicastRemoteObject implements IChat {
    
    ArrayList<String> historico;

    public Chat() throws RemoteException {
        historico= new ArrayList<>();
    }
    
    @Override
    public void lerMensagem(String mensagem) throws RemoteException {
        historico.add(mensagem);
    }

    @Override
    public ArrayList<String> getHistoricoMensagens() throws RemoteException {
        return historico;
    }
}
