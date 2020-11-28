package figuras;

/**
 *
 * @author Alejandro Pina
 */
public class Circulo extends Figura implements PoligonoRegular {

    /**
     *
     * @param radio Valor de radio del circulo
     */
    public Circulo(double radio) {
        super(radio, 0);
    }

    /**
     *
     * @return Metodo sobreescrito de calcularArea() para circulo
     */
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.getBase(), 2);
    }

    /**
     *
     * @return Metodo sobreescrito de calcularPerimetro() para circulo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.getBase();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circulo) {
            if (((Circulo) obj).getBase() == this.getBase()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Es un circulo, su radio es " + this.getBase();
    }
}
