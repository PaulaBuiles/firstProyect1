package co.edu.cue.proyecto;

public class Producto {
    String nombre;
    String color;
    String material;
    double peso;
    int precioVenta;
    int costo;
    int cantidad;

    public void imprimirCaractersiticas(){
        System.out.println("las caracterisitcas del producto son: "+nombre+", "+color+", "+material+", "+peso+", "+precioVenta+", "+costo+", "+cantidad+".");
    }

    public Producto(){

    }

    public Producto(nombre,color,material,peso,precioVenta,costo,cantidad){
        this.nombre=nombre;
        this.color=color;
        this.material=material;
        this.peso=peso;
        this.precioVenta=precioVenta;
        this.costo=costo;
        this.cantidad=cantidad;
    }
}
