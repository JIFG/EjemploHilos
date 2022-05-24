package Ejercicio2;

import javax.swing.JOptionPane;
/**
 *
 * @author isaac
 */ 
    public class HilosFuego extends Thread{
    javax.swing.JLabel jLabel1;
    int F;

    public HilosFuego(){
        F=0;
    }
    

public void run() {
    while(true){
    if(F<=4){
 JOptionPane.showMessageDialog(null, "Hay Fuego","advertencia",JOptionPane.WARNING_MESSAGE);
 F++;
}else{
F=0;
}
try{
sleep(500);
        }catch(InterruptedException e){
        JOptionPane.showMessageDialog(null,"Error");

        }
    }
}} 