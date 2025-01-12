public class QuadraticEquation {
    private int a, b, c;
    private String equation;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.equation = "ax²+bx+c=0"
                .replace("a", a == 1 ? "" : String.valueOf(a))
                .replace("+b", b == 1 ? "+" : b < 0 ? String.valueOf(b) : "+" + String.valueOf(b))
                .replace("c", String.valueOf(c));
    }

    public String getEquation() {
        return this.equation;
    }

}
