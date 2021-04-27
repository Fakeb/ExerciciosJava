
import java.awt.event.KeyEvent;
import javax.swing.JButton;

public class Logica extends Thread{

    Integer c;
    JButton p1 = null;
    JButton p2 = null;
    JButton p4;
   
    Logica(Integer pressed, JButton p1, JButton p2, JButton p4){
        
        this.c = pressed;
        this.p1 = p1;
        this.p2 = p2;
        this.p4 = p4;
        
    }
    
    @Override
    public void run(){
        
        
        switch(c){
             
            case KeyEvent.VK_W : new Thread() {
                @Override
                public void run() {
                    
                    if((p1.getY()+1) != 3){
                        p1.move(p1.getX(), p1.getY()-1);
                    }
                }
            }.start(); break;
            
            case KeyEvent.VK_S : new Thread() {
                @Override
                public void run() {
                    if((p1.getY()+1 != 377)){
                        p1.move(p1.getX(), p1.getY()+1);
                    }
                }
            }.start(); break;
            
            case KeyEvent.VK_A : new Thread() {
                @Override
                public void run() {
                    if(p1.getX() + 1 != 3){
                        p1.move(p1.getX()-1, p1.getY());
                    }
                }
            }.start(); break;
            
            case KeyEvent.VK_D : new Thread() {
                @Override
                public void run() {
                    if((p1.getX() + 1 != 478))
                        p1.move(p1.getX()+1, p1.getY());
                    
                }
            }.start(); break;
            
            case KeyEvent.VK_UP : new Thread() {
                @Override
                public void run() {
                    if(p2.getY() + 1 != 3){
                        p2.move(p2.getX(), p2.getY()-1);
                    }
                }
            }.start(); break;
            
            case KeyEvent.VK_DOWN : new Thread() {
                @Override
                public void run() {
                    if(p2.getY() + 1 != 377){
                        p2.move(p2.getX(), p2.getY()+1);
                    }
                }
            }.start(); break;
            
            case KeyEvent.VK_LEFT : new Thread() {
                @Override
                public void run() {
                    if(p2.getX() + 1 != 3){
                        p2.move(p2.getX()-1, p2.getY());
                    }
                }
            }.start(); break;
            
            case KeyEvent.VK_RIGHT : new Thread() {
                @Override
                public void run() {
                    if(p2.getX() + 1 != 478){
                        p2.move(p2.getX()+1, p2.getY());
                    }
                }
            }.start(); break;
            
            case KeyEvent.VK_X : new Thread() {
                @Override
                public void run() {
                    
                    System.out.println("X: " + p1.getX());
                    System.out.println("Y: " + p1.getY());
                    
                }
            }.start(); break;
        }       
    }
}
