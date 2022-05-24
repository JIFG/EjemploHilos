package Ejercicio4;
import javax.swing.DefaultListModel;

public class MostrarT implements Runnable {
    public Thread Hilo;
    String N_hilo;
    
    static Metodos obj = new Metodos();
    DefaultListModel modelo = new DefaultListModel();
    
    
    MostrarT(String nombrehilo){
        Hilo = new Thread(this, nombrehilo);
        N_hilo = nombrehilo;
    }
    
    public void run()  
    {
      synchronized(obj)
        {
           
            if(N_hilo=="SubHilo1")
            {
                obj.CicloHilo1();
            }
            
            if(N_hilo=="SubHilo2"){
                
                obj.Letras();
              }
            if(N_hilo=="SubHilo3"){
            
                obj.CicloHilo3();
            }
            if(N_hilo=="SubHilo4")
            {
            
                obj.Letras2();
               }
          
        }
    }
    }    
    
