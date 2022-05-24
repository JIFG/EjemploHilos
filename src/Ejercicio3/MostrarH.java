package Ejercicio3;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class MostrarH implements Runnable {
  DefaultListModel modelo = new DefaultListModel();
     
  public Thread Hilo;
    String N_hilo;
    static String texto="";
    static String cadena="";
    
    public MostrarH(String n){
          Hilo=new Thread(this, n); 
          N_hilo = n;
    }
    @Override
    public void run() {
        try{
            if(N_hilo=="Subhilo1"){
                LeerArchivo("C:\\Users\\isaac\\Documents\\Texto\\Isaac4.txt");
            }
             if(N_hilo=="Subhilo2"){
            
            for(int i =0;i<11;i++){
                if(Hilo.isAlive())
                System.out.println(" El Subhilo2 tiene vida");
                modelo.addElement("Subhilo2: "+i);
                Ejercicio3.Lista2.setModel(modelo);

                Thread.sleep(1000);
                
            
        }
             }
             if(N_hilo=="Subhilo3"){
                 
                  
                 for(char i='a';i<='j';i++){
                     modelo.addElement(i);
                      modelo.addElement("Prioridad: "+Hilo.getPriority());
                     Ejercicio3.Lista3.setModel(modelo);
                     
                    Thread.sleep(1000);
                     
                 }
             }
             if(N_hilo=="Subhilo4"){
              
              ImprimirArchivo("C:\\Users\\isaac\\Documents\\Texto\\Isaac4.txt");
             }
             if(N_hilo=="Subhilo5"){
             for (int i=1;i<6;i++){
             modelo.addElement("Main "+i);
             Ejercicio3.Lista4.setModel(modelo);
             Thread.sleep(1000);
             }
             }
             
            
        }catch(InterruptedException ex){
            JOptionPane.showMessageDialog(null,"Error");
        }
        
       
      
    }
    void LeerArchivo(String Archivo){
   try{
    Thread.sleep(110);
    try{
    String cadena;
    BufferedReader obj2 = new BufferedReader(new FileReader(Archivo));
    cadena=obj2.readLine();     
    obj2.close();  
}
    catch(Exception e)
   {
       System.out.println("Excepcion"+e);
   }
}
   catch(InterruptedException e2)
   {
       System.out.println("excepcion"+e2);
   }
   }
    void ImprimirArchivo(String Archivo){
   try{
    Thread.sleep(1000);
    try{
    String cadena;
    FileReader obj1= new FileReader(Archivo);
    BufferedReader obj2= new BufferedReader(obj1);
    cadena=obj2.readLine();
    obj2.close();
    texto+=cadena+"\n";
    Ejercicio3.Area.setText(texto);
}
    catch(Exception e)
   {
       System.out.println("Excepcion"+e);
   }
}
   catch(InterruptedException e2)
   {
       System.out.println("excepcion"+e2);
   }
   }
  

}