/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo2;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            IServerString c = (IServerString) Naming.lookup("rmi://localhost/ServerString");
            int cont = c.contaCaracteres("Teste");
            System.out.println("A palavra Teste tem " + cont + " caracteres");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
