public class TrinomioCC {
    private int a, b, c;

    // Constructor
    public TrinomioCC(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Obtener valores de los coeficientes
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    // Suma de trinomios
    public TrinomioCC sumar(TrinomioCC otro) {
        int nuevoA = this.a + otro.a;
        int nuevoB = this.b + otro.b;
        int nuevoC = this.c + otro.c;
        return new TrinomioCC(nuevoA, nuevoB, nuevoC);
    }

    // Resta de trinomios
    public TrinomioCC restar(TrinomioCC otro) {
        int nuevoA = this.a - otro.a;
        int nuevoB = this.b - otro.b;
        int nuevoC = this.c - otro.c;
        return new TrinomioCC(nuevoA, nuevoB, nuevoC);
    }

    // Multiplicación de trinomios
    public TrinomioCC multiplicar(TrinomioCC otro) {
        int nuevoA = this.a * otro.a;
        int nuevoB = this.a * otro.b + this.b * otro.a;
        int nuevoC = this.a * otro.c + this.b * otro.b + this.c * otro.a;
        return new TrinomioCC(nuevoA, nuevoB, nuevoC);
    }

    // Representación en formato de cadena
    @Override
    public String toString() {
        return a + "x^2 + " + b + "x + " + c;
    }
}