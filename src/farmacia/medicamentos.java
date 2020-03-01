
package farmacia;

public class medicamentos extends facturacion{
    public String fechaexpedicion;
    public String regulado;
    
      private double total;
      private double costo;
      private int cantidad;

    
    
      public medicamentos ()
{
    super.Cedula=null;
    super.Nombres=null;
    super.Apellidos=null;
    super.Codigo=null;
    super.Descripcion=null;
    super.Cantidad=null;
    super.Costo=null;
    this.fechaexpedicion=null;
    this.regulado=null;
    
    cantidad = 0;
    costo = 0;
    total = 0;
    
}
      
       public medicamentos (String cedula, String nombres, String apellidos, 
               String codigo, String descripcion, String cantidad,
               String costo, String fechaexpedicion, String regulado)
    {
 
 super.Cedula= cedula;     
 super.Nombres= nombres;
 super.Apellidos= apellidos;
 super.Codigo= codigo;
 super.Descripcion= descripcion;
 super.Cantidad=cantidad;
 super.Costo=costo;
 this.fechaexpedicion= fechaexpedicion;
 this.regulado= regulado;
 
    }
       
        public String Registrarmedicamentos(String cedula, String nombres, 
                String apellidos, String codigo, String descripcion,
             String cantidad, String costo, String fechaexpedicion, String regulado)
            
    {
      this.fechaexpedicion= fechaexpedicion;
      this.regulado= regulado;
      String i = super.Registroproducto(cedula, nombres, apellidos, codigo, 
              descripcion, cantidad, costo) +"Fecha expedicion: "
              + this.fechaexpedicion+"\n"+"Regulado: "+ this.regulado+ "\n";
    return i;

    }
        
         public double medicamentonoregulado (int cant, double Costo)
    {
      cantidad= cant;
      costo = Costo;
      total = (((costo * (0.12)) + costo) * cantidad);
      return total;
    }
         
          public double medicamentoregulado (int cant, double Costo)
    {
      cantidad= cant;
      costo = Costo;
      total = costo  * cantidad;
      return total;
    }
    
}
