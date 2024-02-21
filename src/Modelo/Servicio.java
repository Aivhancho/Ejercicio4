package Modelo;

import java.time.LocalDate;

public abstract class Servicio {
    String trabajador;
    LocalDate FechaInicio;
    String Cliente;

    public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        FechaInicio = fechaInicio;
        Cliente = cliente;
    }

    public Servicio(String Cliente) {
        this.Cliente = Cliente;
    }


    public abstract double costeMaterial();
    public abstract double costeManoObra();
    public abstract double costeTotal();
    public abstract String detalleServicio();

}
