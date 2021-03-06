package ex2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ComunicadorObjetos {

    public ComunicadorObjetos() {

    }

    public Pessoa recebeMensagem(Socket s) {
        try {
            //Cria um objeto de fluxo de dados de entrada, para poder receber um objeto do tipo Pessoa de um socket s
            ObjectInputStream dis = new ObjectInputStream(s.getInputStream());
            Pessoa p = (Pessoa) dis.readObject();
            return p;
        } catch (Exception e) {
            return null;
        }
    }

    public void enviaMensagem(Socket s, Pessoa p) {
        try {
            //Cria um objeto de fluxo de dados de de saída, para poder enviar dados pelo socket s
            ObjectOutputStream dos = new ObjectOutputStream(s.getOutputStream());
            System.out.println("Enviarei " + p.getNome()+","+p.getIdade());
            dos.writeObject(p);
        } catch (Exception e) {
        }
    }
}
