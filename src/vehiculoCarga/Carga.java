package src.vehiculoCarga;
import src.vehiculo.Vehiculo;
public class Carga extends Vehiculo implements Material{
    
    public Carga(String tipoCombustible, int cantCombustible, int pasajeros, int maxVelocidad, double AceleracionBase) {
        super(tipoCombustible, cantCombustible, pasajeros, maxVelocidad, AceleracionBase);
    }

    @Override
    public void tipoMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cantidadMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
