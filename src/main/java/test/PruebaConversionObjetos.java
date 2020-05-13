package test;
import ejemploconversionesobjetos.TipoEscritura;
import ejemploconversionesobjetos.Empleado;
import ejemploconversionesobjetos.Escritor;

public class PruebaConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Jose Luis",5000,TipoEscritura.CLASICO);
        //empleado.getTipoDeEscrituraEnTexto();   //--No es posible llamarlo 
        System.out.println(empleado.obtenerDetalles()); //--Podemos llamar este metodo por el Polimorfismo, por que heredo de 
                                                            //Empleado y actua como metodo de clase Escritor por que apunta
                                                            //a esta Clase...
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoDeEscrituraEnTexto());
        
        System.out.println(((Escritor) empleado).getTipoDeEscrituraEnTexto());
        
    }
}