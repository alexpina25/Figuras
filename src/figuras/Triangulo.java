package figuras;

/**
 *
 * @author Alejandro Pina
 */
public class Triangulo extends Figura implements PoligonoRegular {

    /**
     *
     * @param base Valor de base para triangulo
     * @param altura Valor de altura para triangulo
     */
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    /**
     *
     * @return Metodo sobreescrito de calcularArea() para triangulo
     */
    @Override
    public double calcularArea() {
        return (this.getBase() * this.getAltura()) / 2;
    }

    /**
     *
     * @return Metodo sobreescrito de calcularPerimetro() para triangulo
     */
    @Override
    public double calcularPerimetro() {
        return 3 * this.getBase();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangulo) {
            if (((Triangulo) obj).getBase() == this.getBase() && ((Triangulo) obj).getAltura() == this.getAltura()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Es un triangulo, su base es " + this.getBase() + ", la altura es " + this.getAltura();
    }
}
