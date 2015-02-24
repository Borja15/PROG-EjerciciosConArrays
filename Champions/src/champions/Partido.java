package champions;

import org.w3c.dom.*;

public class Partido {

    private String equipoA;
    private String equipoB;

    public Partido(String equipoA, String equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;        
    }
    
    public Element toElement(Document documento) {
        Element elementoPartido = documento.createElement("PARTIDO");
        //Crear los elementos de los equipos con sus textos correspondientes
        Element elementoEquipoA = documento.createElement("EQUIPO");
        elementoEquipoA.setTextContent(equipoA);
        Element elementoEquipoB= documento.createElement("EQUIPO");
        elementoEquipoB.setTextContent(equipoB);
        //Colgar los equipos en la etiqueta PARTIDO
        elementoPartido.appendChild(elementoEquipoA);
        elementoPartido.appendChild(elementoEquipoB);
        //Retornar el elemento completo del partido
        return elementoPartido;
    }
}
