package Ejercicio15_tanqueAgua;

public class TanqueAgua {
    private double capacidadMaximaLitros;
    private double nivelActualLitros;

    public TanqueAgua(double capacidadMaximaLitros, double nivelActualLitros) {
        if (capacidadMaximaLitros <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser mayor a cero.");
        }
        if (nivelActualLitros < 0 || nivelActualLitros > capacidadMaximaLitros) {
            throw new IllegalArgumentException("El nivel actual debe estar entre 0 y la capacidad máxima.");
        }
        this.capacidadMaximaLitros = capacidadMaximaLitros;
        this.nivelActualLitros = nivelActualLitros;
    }

    public double llenar(double litros) {
        if (litros <= 0) {
            throw new IllegalArgumentException("Los litros a cargar deben ser mayores a cero.");
        }
        double espacioLibre = capacidadMaximaLitros - nivelActualLitros;
        double cargado = Math.min(litros, espacioLibre);
        nivelActualLitros += cargado;
        return cargado;
    }

    public boolean consumir(double litros) {
        if (litros <= 0) {
            throw new IllegalArgumentException("Los litros a consumir deben ser mayores a cero.");
        }
        if (litros > nivelActualLitros) {
            return false;
        }
        nivelActualLitros -= litros;
        return true;
    }

    public double getNivelActualLitros() {
        return nivelActualLitros;
    }

    public double getPorcentajeLlenado() {
        return nivelActualLitros / capacidadMaximaLitros * 100;
    }
}
