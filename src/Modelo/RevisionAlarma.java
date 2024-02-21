package Modelo;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    int alarmasRevisar;

    public RevisionAlarma(String cliente, int alarmasRevisar) {
        super(cliente);
        this.alarmasRevisar = alarmasRevisar;
        this.trabajador = "Revisor Especialista Contra Incendios";
    }
}
