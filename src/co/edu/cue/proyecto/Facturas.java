package co.edu.cue.proyecto;
// 3 facturas, 5 productos
public class Facturas {
    String nombre;
    int precio;
    int cantidadProducto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int imprimirC(String nombre, int precio, int cantidadProducto) {
        precio = cantidadProducto*precio;
        return precio;
    }
    public Facturas(){

    }
    public Facturas(String nombre,int precio,int cantidadProducto){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidadProducto=cantidadProducto;
    }

}
[7:09 a. m., 28/7/2022] Cristhian Correa U: package co.ed.cue.proyecto;

public class Producto {
    private String nombre;
    private String tipo;
    private int precio;


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo= tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Producto(String nombre, String tipo,int precio){
        this.nombre = nombre;
        this.tipo= tipo;
        this.precio=precio;
    }
}