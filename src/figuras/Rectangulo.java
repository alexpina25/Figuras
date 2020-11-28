package figuras;

/**
 *
 * @author Alejandro Pina
 */
public class Rectangulo extends Figura implements PoligonoRegular {

    /**
     *
     * @param base Valor de base del rectangulo
     * @param altura Valor de altura del rectangulo
     */
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    /**
     *
     * @return Metodo sobreescrito de calcularArea() para rectangulo
     */
    @Override
    public double calcularArea() {
        return this.getBase() * this.getAltura();
    }

    /**
     *
     * @return Metodo sobreescrito de calcularPerimetro() para rectangulo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (this.getBase() + this.getAltura());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangulo) {
            if (((Rectangulo) obj).getBase() == this.getBase() && ((Rectangulo) obj).getAltura() == this.getAltura()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Es un rectangulo, su base es " + this.getBase() + ", la altura es " + this.getAltura();
    }
}
