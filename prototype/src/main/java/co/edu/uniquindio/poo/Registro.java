package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Registro {
    private Collection<Clonable> documentos;

    public Registro(){
        this.documentos = new ArrayList<>();
    }

    public Collection<Clonable> getDocumentos() {
        return documentos;
    }

    public void agregarDocumento(Clonable documento){
        assert documento != null;
        documentos.add(documento);
    }
}
