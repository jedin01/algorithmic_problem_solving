import java.util.ArrayList;

public class QuadraticEquation {
    private double a, b, c;
    private String equation;
    private double discriminante;
    private ArrayList<Double> solutionsList;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.equation = "ax²+b"
                .replace("a", a == 1 ? "" : String.valueOf(a))
                .replace("+b", b == 1 ? "+" : b < 0 ? String.valueOf(b) : "+" + String.valueOf(b))
                .replace("c", String.valueOf(c));
        discriminante = Math.pow(b, 2) - 4 * a * c;
        solutionsList = new ArrayList<>();
    }

    public String getEquation() {
        return this.equation;
    }

    public ArrayList<Double> getSolutions() {
        this.calculate();
        return this.solutionsList;
    }

    public void calculate() {

        if (this.discriminante > 0) {
            solutionsList.add((-b + Math.sqrt(this.discriminante)) / (2 * this.a));
            solutionsList.add((-b - Math.sqrt(this.discriminante)) / (2 * this.a));
        } else if (this.discriminante == 0) {
            solutionsList.add((-b) / (2 * this.a));
        }
    }

    public double getDiscriminante() {
        return this.discriminante;
    }

    public int getHowManySolutions() {
        this.calculate();
        return this.solutionsList.size();
    }

}
