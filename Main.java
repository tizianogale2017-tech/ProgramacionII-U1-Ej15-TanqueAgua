package Ejercicio15_tanqueAgua;

public class Main {
    public static void main(String[] args) {
        TanqueAgua tanque = new TanqueAgua(1000.0, 200.0);
        System.out.println("Nivel inicial: " + tanque.getNivelActualLitros() + " L (" + tanque.getPorcentajeLlenado() + "%)");

        double cargado = tanque.llenar(500.0);
        System.out.println("Se cargaron " + cargado + " L. Nivel: " + tanque.getNivelActualLitros() + " L (" + tanque.getPorcentajeLlenado() + "%)");

        tanque.consumir(300.0);
        System.out.println("Se consumieron 300.0 L. Nivel: " + tanque.getNivelActualLitros() + " L (" + tanque.getPorcentajeLlenado() + "%)");

        cargado = tanque.llenar(800.0);
        System.out.println("Se intentó cargar 800.0 L y solo entraron " + cargado + " L. Nivel: " + tanque.getNivelActualLitros() + " L (" + tanque.getPorcentajeLlenado() + "%)");

        if (!tanque.consumir(1500.0)) {
            System.out.println("No se pueden consumir 1500.0 L: no hay suficiente agua.");
        }
    }
}
