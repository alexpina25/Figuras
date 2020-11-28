package figuras;

/**
 *
 * @author Alejandro Pina
 */
public abstract class Figura {

    private double base;
    private double altura;

    /**
     *
     * @param base Valor de la base(o radio para circulo) de la figura
     * @param altura Valor de la altura de la figura
     */
    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     *
     * @return Metodo get para devolver el valor de base
     */
    public double getBase() {
        return base;
    }

    /**
     *
     * @return Metodo get para devolver el valor de altura
     */
    public double getAltura() {
        return altura;
    }
}
