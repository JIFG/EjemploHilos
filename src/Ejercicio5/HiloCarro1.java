/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import Ejercicio1.Carro;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sun.awt.SunToolkit;
public class HiloCarro1 extends Thread{

    JLabel carrito1;
    JLabel carrito2;
    JLabel carrito3;
    JLabel lbl_barrera;
   
    public HiloCarro1(JLabel carro,JLabel barrera) {
        this.carrito1 = carro;
        this.lbl_barrera=lbl_barrera;
        
    }
    public void HiloCarro2(JLabel carro2) {
        this.carrito2 = carro2;
        this.lbl_barrera=lbl_barrera;

    }
        public void HiloCarro3(JLabel carro3) {
        this.carrito3 = carro3;
        this.lbl_barrera=lbl_barrera;

    }
            
        
    @Override 
    public void run() {
        for (int i = 0; i <=1000; i++) {
            carrito1.setLocation(carrito1.getX()+10, carrito1.getY());
            try {
                Thread.sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
                
            }
        }
     for(int i = 0; i <=1000; i++) {
            carrito2.setLocation(carrito2.getX()+10, carrito3.getY());
            try {
                Thread.sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
                
            }
        }
     for(int i = 0; i <=1000; i++) {
            carrito3.setLocation(carrito3.getX()+10, carrito3.getY());
            try {
                Thread.sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
                
            }
        }
    }
        
}
