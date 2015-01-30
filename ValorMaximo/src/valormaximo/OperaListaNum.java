
package valormaximo;

public class OperaListaNum {
    
    private static int posicion = 0;
    private static int[] listaNum = new int[10];
    
    public static int getMaximo() {
        int max = listaNum[0];
        for(int valor : listaNum) {
            if(valor > max) {
                max = valor;
            }
        }
        return max;
    }
    
    public static void guardar(int valor) {
        listaNum[posicion] = valor;
        posicion++;
    }
    
    public static boolean estaLlena() {
        if(posicion == 10) {
            return true;
        } else {
            return false;
        }
    }
    
}
