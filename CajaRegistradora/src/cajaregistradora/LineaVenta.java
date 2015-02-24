package cajaregistradora;

import java.text.NumberFormat;

public class LineaVenta {
    private int cantidad;
    private String producto;
    private float precioUni;
    public static final int ANCHO_CANT = 5;
    public static final int ANCHO_PROD = 20;
    public static final int ANCHO_IMP = 10;
    
    public LineaVenta() {
        
    }
    
    public LineaVenta(int cantidad, String producto, float precioUni) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.precioUni = precioUni;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getPrecioUni() {
        return precioUni;
    }

    public void setPrecioUni(float precioUni) {
        this.precioUni = precioUni;
    }
    
    public float getImporte() {
        return cantidad * precioUni;
    }

    @Override
    public String toString() {
        //Asignar un ancho fijo a la cantidad alineado a la derecha
        String strCantidad = String.format("%"+ANCHO_CANT+"d", cantidad);        
        //Asignar un ancho fijo al nombre del producto alineado a la izquierda
        String strProducto = String.format(" %-"+ANCHO_PROD+"s", producto);        
        
        //Formato de moneda para precios
        NumberFormat formatoPrecio = NumberFormat.getCurrencyInstance();
        //Dar formato de moneda al precio unitario y asignar ancho fijo
        String strPrecioUni = formatoPrecio.format(precioUni);
        String strPrecioUniAlin = String.format(" %"+ANCHO_IMP+"s", strPrecioUni);        
        //Dar formato de moneda al importe de la línea y asignar ancho fijo
        String strImporte = formatoPrecio.format(getImporte());
        String strImporteAlin = String.format(" %"+ANCHO_IMP+"s", strImporte);        
        
        return strCantidad + strProducto + strPrecioUniAlin + strImporteAlin;
    }
    
    
}
