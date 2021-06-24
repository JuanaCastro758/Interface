package src.vehiculoCarrera;
import src.vehiculo.Vehiculo;
public class Carrera extends Vehiculo implements TripleAceleracion{
    public Carrera(String tipoCombustible, int cantCombustible, int pasajeros, int maxVelocidad, double AceleracionBase) {
        super(tipoCombustible, cantCombustible, pasajeros, maxVelocidad, AceleracionBase);
    }

    @Override
    public void aceleracionTriple() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
