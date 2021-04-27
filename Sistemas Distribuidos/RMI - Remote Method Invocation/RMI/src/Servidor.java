import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class Servidor {
    InetAddress inetAddress;
    String HOST_URL;
    public Servidor() {
        try {
            inetAddress = InetAddress.getLocalHost();
            HOST_URL = "rmi://" + inetAddress.getHostAddress() + "/Chat";
        } catch (UnknownHostException ex) {
            System.err.println("Erro :)");
        }
    }
    
    public void comecar(){
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Chat remoteChatObject = new Chat();
            Naming.bind(HOST_URL, remoteChatObject);       
        } catch (MalformedURLException | AlreadyBoundException | RemoteException ex) {
            System.err.println("Erro :)");
        }
    }
    
    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        servidor.comecar();
    }
}
