package enquations.polinomial;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation {
    private Double coeficienteAngular, coeficienteX, coeficienteLinear;
    private String leiFormacao;
    private double discriminante;
    private List<Double> solutionsList;
    private Integer grau;

    public QuadraticEquation(Double coeficienteAngular, Double coeficienteX, Double coeficienteLinear) {
        this.coeficienteAngular = coeficienteAngular;
        this.grau=2;
        this.coeficienteX = coeficienteX;
        this.coeficienteLinear = coeficienteLinear;
        this.leiFormacao = coeficienteAngular+"x^"+grau+"+"+coeficienteX+"x^"+(grau-1)+"+"+coeficienteLinear;
        this.discriminante = Math.pow(this.coeficienteX, 2) - 4 * coeficienteAngular * coeficienteLinear;
        this.solutionsList = new ArrayList<>();
    }
    public QuadraticEquation(Integer coeficienteAngular, Integer coeficienteX, Integer coeficienteLinear) {
        this.coeficienteLinear=Double.parseDouble(coeficienteLinear.toString());
        this.coeficienteAngular=Double.parseDouble(coeficienteAngular.toString());
        this.grau=2;
        this.coeficienteX = Double.parseDouble(coeficienteX.toString());
        this.leiFormacao = coeficienteAngular+"x^"+grau+"+"+coeficienteX+"x^"+(grau-1)+"+"+coeficienteLinear;
        this.discriminante = Math.pow(this.coeficienteX, 2) - 4 * coeficienteAngular * coeficienteLinear;
        this.solutionsList = new ArrayList<>();
    }

    public String getLeiFormacao() {
        return this.leiFormacao;
    }

    public List<Double> getSolutions() {
        this.calculate();
        return this.solutionsList;
    }

    public void calculate() {

        if (this.discriminante > 0) {
            solutionsList.add((-coeficienteX + Math.sqrt(this.discriminante)) / (2 * this.coeficienteAngular));
            solutionsList.add((-coeficienteX - Math.sqrt(this.discriminante)) / (2 * this.coeficienteAngular));
        } else if (this.discriminante == 0) {
            solutionsList.add((-coeficienteX) / (2 * this.coeficienteAngular));
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
