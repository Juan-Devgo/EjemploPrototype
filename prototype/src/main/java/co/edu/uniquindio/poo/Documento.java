package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Documento implements Clonable {
    private double tamañoMB;
    private String titulo;
    private String ubicacion;
    private LocalDate fechaCreacion;

    public Documento(double tamañoMB, String titulo, String ubicacion, LocalDate fechaCreacion){
        assert tamañoMB > 0;
        assert titulo != null;
        assert ubicacion != null && !ubicacion.isBlank();
        assert fechaCreacion != null;
        this.tamañoMB = tamañoMB;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
        this.fechaCreacion = fechaCreacion;
    }

    public double getTamañoMB() {
        return tamañoMB;
    }public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }public String getTitulo() {
        return titulo;
    }public String getUbicacion() {
        return ubicacion;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public Documento clon(){
        Documento documentoClon = new Documento(getTamañoMB(), getTitulo(), getUbicacion(), getFechaCreacion());
        return documentoClon;
    }
}
