public class documentoOfimatico {
    private String nombreArchivo;
    private int tamañoArchivo;

    public documentoOfimatico(String nombreArchivo, int tamañoArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.tamañoArchivo = tamañoArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getTamañoArchivo() {
        return tamañoArchivo;
    }

    public void setTamañoArchivo(int tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }
}
