package ejemploconversionesobjetos;

public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura; //--Variable Objeto de clase TipoEscritura
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipoEscritura: "+tipoEscritura.getDescripcion();
    }
    
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    
    public String getTipoDeEscrituraEnTexto(){
        return tipoEscritura.getDescripcion();
    }
}