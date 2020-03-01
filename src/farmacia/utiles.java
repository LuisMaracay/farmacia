
package farmacia;

public class utiles extends facturacion{
    public String proveedor;
    
    private double total;
    private double costo;
    private int cantidad;
    
     public utiles ()
{
    super.Cedula= null;     
    super.Nombres= null;
    super.Apellidos= null;
    super.Codigo=null;
    super.Descripcion=null;
    super.Cantidad=null;
    super.Costo=null;
    this.proveedor=null;
    
    cantidad = 0;
    costo = 0;
    total = 0;
    
}
     
      public utiles (String cedula, String nombres, String apellidos, String codigo,
              String descripcion, String cantidad, String costo, String proveedor)
    {
        
 super.Cedula= cedula;     
 super.Nombres= nombres;
 super.Apellidos= apellidos;       
 super.Codigo= codigo;
 super.Descripcion= descripcion;
 super.Cantidad=cantidad;
 super.Costo=costo;
 this.proveedor=proveedor;

    }
     
      public String Registrarutiles(String cedula, String nombres, String apellidos, 
              String codigo, String descripcion, String cantidad, String costo, 
              String proveedor)
            
    {
      this.proveedor=proveedor;
      String i = super.Registroproducto(cedula, nombres, apellidos, codigo, 
              descripcion, cantidad, costo) +"Proveedor: "+ this.proveedor+"\n";
    return i;

    }
      
             public double calculoutiles (int cant, double Costo)
    {
      cantidad= cant;
      costo = Costo;
      total = (costo * (0.12)) * cantidad;
      return total;
    }
}
