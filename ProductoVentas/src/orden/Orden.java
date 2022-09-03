package orden;

import producto.Producto;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private static int contadorProducto;
    private final static int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProductos(Producto producto) {
        if (Orden.contadorProducto < Orden.MAX_PRODUCTOS) {
            this.productos[Orden.contadorProducto++] = producto;
        } else {
            System.out.println("Ya no se puede agregar mas productos");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < Orden.contadorProducto; i++) {
            total = (double)Math.round((total + this.productos[i].getPrecio()) * 100) / 100;
        }
        return total;
    }

    public void mostrarProductos() {

        if (Orden.contadorProducto <= 0) {
            System.out.println("No hay productos para consultar");
        } else {
            for (int i = 0; i < Orden.contadorProducto; i++) {
                System.out.println(this.productos[i]);
            }
        }
    }

    public void Total() {
        System.out.println("TOTAL : " + this.calcularTotal());
    }
}
