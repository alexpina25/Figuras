package figuras;

/**
 *
 * @author Alejandro Pina
 */
public class FiguraTest {


    public static void main(String[] args) {

        Figura[] f = new Figura[5];
        f[0] = new Rectangulo(160, 50);
        f[1] = new Rectangulo(160, 50);
        f[2] = new Circulo(160);
        f[3] = new Triangulo(160, 51);
        f[4] = new Circulo(150);

        for (Figura figura : f) {
            System.out.print(figura);
            if (figura instanceof Rectangulo) {
                System.out.printf(" y su area es %.2f", ((Rectangulo) figura).calcularArea());
                System.out.println();
            } else if (figura instanceof Triangulo) {
                System.out.printf(" y su area es %.2f", ((Triangulo) figura).calcularArea());
                System.out.println();
            } else if (figura instanceof Circulo) {
                System.out.printf(" y su area es %.2f", ((Circulo) figura).calcularArea());
                System.out.println();
            }
        }
        if (f[0].equals(f[1])) {
            System.out.println("Las figuras son iguales.");
        }
    }
}
