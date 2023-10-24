public class Configurador {
    private String configuracion;

    private static Configurador instancia;

    public static Configurador obtenerInstancia() {
        if (instancia == null) {
            instancia = new Configurador();
        }
        return instancia;
    }

    public void setConfiguracion(String nuevaConfiguracion) {
        this.configuracion = nuevaConfiguracion;
    }


    public String getConfiguracion() {

        return configuracion;
    }
}
