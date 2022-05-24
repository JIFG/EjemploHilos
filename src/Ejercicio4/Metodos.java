package Ejercicio4;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class Metodos extends JFrame{
    DefaultListModel modelo = new DefaultListModel();
    synchronized void CicloHilo1(){
        
        modelo.addElement("Inicio:\tSubProceso1");
       for(int i=1; i<=5; i++)
       {
      modelo.addElement("Hilo: "+i);
      Ejercicio4.Lista.setModel(modelo);
         try
            {
            Thread.sleep(1000);
            }
             catch(InterruptedException exc)
             {
                 System.out.println("Error en hilo");
              }
        }
        modelo.addElement("Termino Subproceso1");
       Ejercicio4.Lista.setModel(modelo);
    }
    
    synchronized void Letras()
    {
        modelo.addElement("Inicio:\tSubProceso2");
        for(char i='a'; i<='e'; i++)
        {
         modelo.addElement("Hilo: "+i);
          Ejercicio4.Lista.setModel(modelo);
         try
            {
            Thread.sleep(1000);
            }
             catch(InterruptedException exc)
             {
              System.out.println("Interrupcion en Hilo");
              }
        }
         modelo.addElement("Termino Subproceso2");
        Ejercicio4.Lista.setModel(modelo);
    }
    
    synchronized void CicloHilo3()
    {
       
        modelo.addElement("Inicio:\tSubProceso3");
        for(int i=1; i<=5; i++)
        {
           modelo.addElement("Hilo: "+i);
           try
            {
            Thread.sleep(1000); 
            }
             catch(InterruptedException exc)
             {
              System.out.println("Interrupcion en Hilo");
              } 
        }   
        modelo.addElement("Termino Subproceso3");
        Ejercicio4.Lista.setModel(modelo);
    }
    
    synchronized void Letras2(){
        
        modelo.addElement("Inicio:\tSubProceso4");
        for(char i='a'; i<='e'; i++)
        {
         System.out.println("Hilo: "+i);
         modelo.addElement("Hilo: "+i);
         try
            {
            Thread.sleep(1000);
            }
             catch(InterruptedException exc)
             {
              System.out.println("Interrupcion en Hilo");
              } 
        }
        
        modelo.addElement("Termino Subproceso4");
        Ejercicio4.Lista.setModel(modelo);
    }
    
}
