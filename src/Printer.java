public class Printer {
    private String estado;
    private String listaArchivos;

    public Printer(String estado, String listaArchivos) {
        this.estado = estado;
        this.listaArchivos = listaArchivos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getListaArchivos() {
        return listaArchivos;
    }

    public void setListaArchivos(String listaArchivos) {
        this.listaArchivos = listaArchivos;
    }
}
