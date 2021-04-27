package ex1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Comunicador {

    public Comunicador() {

    }

    public String recebeMensagem(Socket s) {
        try {
            //Cria um objeto de fluxo de dados de entrada, para poder receber dados de um socket s
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String mensagem = dis.readUTF();
            return mensagem;
        } catch (Exception e) {
            return null;
        }
    }

    public void enviaMensagem(Socket s, String mensagem) {
        try {
            //Cria um objeto de fluxo de dados de de saída, para poder enviar dados pelo socket s
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            System.out.println("Enviarei " + mensagem);
            dos.writeUTF(mensagem);
        } catch (Exception e) {
        }
    }
}
