// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Configurador configurador = Configurador.obtenerInstancia();


        configurador.setConfiguracion("Configuración especial");

        System.out.println(configurador.getConfiguracion());
    }

}