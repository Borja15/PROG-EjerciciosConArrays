package horarioclases;

public class Horario {
    
    private SesionClase[][] matriz;
    private int sesionesDia;
    private int dias;
    
    public Horario(int sesionesDia, int dias) {
        matriz = new SesionClase[sesionesDia][dias];
        this.sesionesDia = sesionesDia;
        this.dias = dias;
    }
    
    public SesionClase getSesion(int sesionDia, int dia) {
        return matriz[sesionDia][dia];
    }
    
    public void setSesionClase(int sesionDia, int dia, String asignatura, String aula, String profesorado) {
        SesionClase sesion = new SesionClase(asignatura, aula, profesorado);
        matriz[sesionDia][dia] = sesion;
    }
  
    public String toString() {
        String resultado = "";
        for(int i=0; i<dias; i++) {
            resultado += "Día: " + (i+1);
            resultado += "\n--------\n";
            for(int j=0; j<sesionesDia; j++) {
                resultado += "Sesión "+ (j+1) + ": ";
                if(matriz[j][i]!=null) {
                    resultado += matriz[j][i].toString();
                } else {
                    resultado += "Vacío\n";
                }
            }
            resultado += "\n";
        }
        return resultado;
    }
}
