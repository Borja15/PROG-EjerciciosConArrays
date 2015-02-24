package horarioclases;

public class SesionClase {

    private String asignatura;
    private String aula;
    private String profesorado;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getProfesorado() {
        return profesorado;
    }

    public void setProfesorado(String profesorado) {
        this.profesorado = profesorado;
    }

    
    
    public SesionClase(String asignatura, String aula, String profesorado) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.profesorado = profesorado;
    }

    @Override
    public String toString() {
        return asignatura + ";" + aula + ";" + profesorado+"\r\n";
    }

}