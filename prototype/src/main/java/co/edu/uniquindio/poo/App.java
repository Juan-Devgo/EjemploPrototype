package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Registro registroDocumental = new Registro();
        Documento documento = new Documento(600.6, "ausjdvna", "C:/Usuarios/Usuario/Escritorio",
                            LocalDate.now());
        Documento documentoClon = documento.clon();
        registroDocumental.agregarDocumento(documentoClon);
    }
}
