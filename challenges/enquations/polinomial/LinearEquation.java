package enquations.polinomial;

import java.util.List;

public class LinearEquation {

    private String leiFormacao;
    private Double coeficienteAngular;
    private Double coeficienteLinear;
    private List<Integer> raizes;
    private int grau;
    public LinearEquation(Double coeficienteLinear, Double coeficienteAngular){
        this.grau = 1;
        this.leiFormacao = coeficienteAngular+""+grau+"x+"+coeficienteLinear;
    }

    public String getLeiFormacao(){
        return leiFormacao;
    }
}
