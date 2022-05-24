package Ejercicio1;

import javax.swing.JLabel;
import javax.swing.JPanel;
import sun.awt.SunToolkit;
public class HiloCarro extends Thread{

    JLabel Car;
    int Barrera;
    // 600 es el rango máximo
   
    public HiloCarro(JLabel carro) {
        this.Car = carro;
        
    }
    @Override 
    public void run() {
        for (int i = 0; i <=i; i++) {
            Car.setLocation(Car.getX()+3, Car.getY());
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
               

            }
        }
    }
}



