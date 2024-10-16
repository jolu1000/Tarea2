package Reunion;
import Departamento.Empleado;
import java.time.Duration;

public class ReunionVirtual extends Reunion {
    private String enlace;

    public ReunionVirtual(Empleado organizador, tipoReunion tipo, String enlace, Duration duracionPrevista) {
        super(organizador, tipo, duracionPrevista);
        this.enlace = enlace;
    }
    public String getEnlace() {
        return enlace;
    }
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    // Método toString para representar la información de la reunión virtual
    @Override
    public String toString() {
        return "Reunion Virtual [enlace=" + enlace + ", organizador=" + getOrganizador().getNombre() + "]";
    }
}

