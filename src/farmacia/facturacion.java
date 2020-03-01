
package farmacia;

public class facturacion {
    
    public String Cedula;
    public String Nombres;
    public String Apellidos;
    
    public String Codigo;
    public String Descripcion;
    public String Cantidad;
    public String Costo;
    
    public String Registroproducto (String cedula, String nombres, String apellidos, 
            String codigo, String descripcion, String cantidad, String costo)
    {
        
        this.Cedula = cedula;
        this.Nombres =nombres;
        this.Apellidos = apellidos;
        this.Codigo = codigo;
        this.Descripcion = descripcion;
        this.Cantidad = cantidad;
        this.Costo = costo;
    
        

        String i= "Cedula: " +this.Cedula+"\n"+ "Nombres : " +this.Nombres+"\n"
                +"Apellidos: "+ this.Apellidos+"\n"+"Codigo: " +this.Codigo+"\n"
                + "Descripción : " +this.Descripcion+"\n" +"Cantidad: "+ 
                this.Cantidad+"\n"+ "Costo : "+this.Costo+"\n";
        return i;

    }
    
}
