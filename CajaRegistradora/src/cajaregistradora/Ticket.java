package cajaregistradora;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Ticket {
    private ArrayList<LineaVenta> listaLineaVenta = new ArrayList();
    
    public void insertLineaVenta(LineaVenta lineaVenta) {
        listaLineaVenta.add(lineaVenta);
    }
    
    public void insertLineaVenta(int cantidad, String producto, float precioUni) {
        LineaVenta lineaVenta = new LineaVenta(cantidad, producto, precioUni);
        insertLineaVenta(lineaVenta);
    }
    
    public void updateLineaVenta(int index, LineaVenta lineaVenta) {
        listaLineaVenta.set(index, lineaVenta);
    }    
    
    public void updateLineaVenta(int index, int cantidad, String producto, float precioUni) {
        LineaVenta lineaVenta = new LineaVenta(cantidad, producto, precioUni);
        updateLineaVenta(index, lineaVenta);
    }    

    public void deleteLineaVenta(int index) {
        listaLineaVenta.remove(index);        
    }
    
    public void deleteLineaVenta(LineaVenta lineaVenta) {
        listaLineaVenta.remove(lineaVenta);        
    }
    
    public Object[] getListaLineaVenta() {
        return listaLineaVenta.toArray();
    } 
    
    public String getImporteTotal() {
        float importeTotal = 0;
        for(LineaVenta lineaVenta:listaLineaVenta) {
            importeTotal += lineaVenta.getImporte();
        }
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
        return formatoMoneda.format(importeTotal);
    }
}
