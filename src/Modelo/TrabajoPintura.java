package Modelo;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
    double Superficie;
    double PrecioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        Superficie = superficie;
        PrecioPintura = precioPintura;
    }

    public double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(double superficie) {
        Superficie = superficie;
    }

    public double getPrecioPintura() {
        return PrecioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        PrecioPintura = precioPintura;
    }
    public double costeMaterial(){
        return((this.Superficie/7.8)*this.PrecioPintura);
    }
    public double costeManoObra(){
        return((this.Superficie/10)*9.5);
    }
    public double costeTotal(){
        double coste = (this.costeMaterial()+this.costeManoObra());
        if (this.Superficie<50){
            coste = coste*1.15;
            return coste;
        }else {
            return coste;
        }
    }
    public String detalleServicio() {
        String cadena = "";

        cadena += "TRABAJO DE PINTURA\n";
        cadena += "Cliente: "+Cliente+"\n";
        cadena += "Fecha de Inicio: "+FechaInicio+"\n";
        cadena += "------------------\n";
        cadena += "Pintor: "+trabajador+"\n";
        cadena += "Coste Material: "+costeMaterial()+"\n";
        cadena += "Coste Mano Obra: "+costeManoObra()+"\n";
        cadena += "TOTAL: "+costeTotal()+"\n";
        cadena += "------------------\n";
        return cadena;
    }
}
