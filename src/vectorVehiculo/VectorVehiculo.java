package src.vectorVehiculo;

import src.vehiculoCamioneta.*;
import src.vehiculoCarga.*;
import src.vehiculoCarrera.*;
import src.vehiculo.*;
public class VectorVehiculo {
    public VectorVehiculo(){
        
    }
    private Camioneta[] a=new Camioneta[5];
    private Carga[] b=new Carga[10];
    private Carrera[] c=new Carrera[5];
    public void crearVehi(){
        for(int i=0;i<5;i++){
            a[i]=new Camioneta("gasolina",12,15,20,10);
            c[i]=new Carrera("diesel",8,1,25,10);  
        }
        for(int i=0;i<10;i++){
            b[i]=new Carga("gasolina",14,4,15,10);
        }
        Vehiculo[] v={a[3],b[2],c[2],a[0],a[1]};
        recibir(v);
    }
    public void recibir(Vehiculo[] v1){
       for(int i=0;i<v1.length;i++){
           if(v1[i] instanceof Camioneta){
               System.out.println("Es una Camioneta");
           }else if(v1[i] instanceof Carrera){
               System.out.println("Es un vehiculo que si se puede hacer una carrera");
           }else if(v1[i] instanceof Carga){
               System.out.println("Es un vehiculo de carga");
           }
       }
    }
}
