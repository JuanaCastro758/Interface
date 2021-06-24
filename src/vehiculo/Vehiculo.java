package src.vehiculo;
public class Vehiculo implements Girar {
    private String tipoCombustible;
    private int cantCombustible;
    private int pasajeros;
    private int maxVelocidad;
    private double AceleracionBase;

    public Vehiculo(String tipoCombustible, int cantCombustible, int pasajeros, int maxVelocidad, double AceleracionBase) {
        this.tipoCombustible = tipoCombustible;
        this.cantCombustible = cantCombustible;
        this.pasajeros = pasajeros;
        this.maxVelocidad = maxVelocidad;
        this.AceleracionBase = AceleracionBase;
    }

    public Vehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCantCombustible() {
        return cantCombustible;
    }

    public void setCantCombustible(int cantCombustible) {
        this.cantCombustible = cantCombustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getMaxVelocidad() {
        return maxVelocidad;
    }

    public void setMaxVelocidad(int maxVelocidad) {
        this.maxVelocidad = maxVelocidad;
    }

    public double getAceleracionBase() {
        return AceleracionBase;
    }

    public void setAceleracionBase(double AceleracionBase) {
        this.AceleracionBase = AceleracionBase;
    }
    public void crearVehiculo(int can){
    }
    @Override
    public void derecha() {
        System.out.println("Gira a la derecha");
    }

    @Override
    public void izquierda() {
        System.out.println("Gira a la izquierda");
    }
    
}
