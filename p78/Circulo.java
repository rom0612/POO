package mx.unam.fi.poo.p78;

import java.awt.Dimension;
import java.awt.Graphics2D;

public class Circulo extends Figura {
    // 1. Atributo encapsulado (privado)
    private double radio;

    // 2. Constructor para inicializar el atributo
    public Circulo(double radio) {
        this.radio = radio;
    }

    // 3. Getter para acceso controlado
    public double getRadio() {
        return radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void dibujar(Graphics2D g, Dimension size) {
        double margen = 20;
        double maxDiametroPanel = Math.min(size.width, size.height) - 2 * margen;
        // Se usa el getter getRadio()
        double diametroFigura = 2 * Math.max(getRadio(), 1.0);
        double escala = maxDiametroPanel / diametroFigura;

        int d = (int) Math.round(2 * getRadio() * escala);
        int x = (size.width - d) / 2;
        int y = (size.height - d) / 2;
        g.drawOval(x, y, d, d);
    }
}
