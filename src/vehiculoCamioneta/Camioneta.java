package src.vehiculoCamioneta;
import src.vehiculo.*;
public class Camioneta extends Vehiculo implements TrasportaPersonas{  
    public Camioneta(String tipoCombustible, int cantCombustible, int pasajeros, int maxVelocidad, double AceleracionBase) {
        super(tipoCombustible, cantCombustible, pasajeros, maxVelocidad, AceleracionBase);
    }
    @Override
    public void cantidadPersonas() {
        
    }
    
}
