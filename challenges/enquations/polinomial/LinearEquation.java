package enquations.polinomial;

import java.util.ArrayList;
import java.util.List;

public class LinearEquation {

    private String leiFormacao;
    private Double coeficienteAngular;
    private Double coeficienteLinear;
    private List<Double> raizes;
    private int grau;
    private String monotonia;

    public LinearEquation(Integer coeficienteAngular, Integer coeficienteLinear){
        this.grau = 1;
        this.monotonia = coeficienteAngular>0?"funcao crescente":"funcao decrescente";
        this.raizes = new ArrayList<>();
        this.coeficienteLinear=Double.parseDouble(coeficienteLinear.toString());
        this.coeficienteAngular=Double.parseDouble(coeficienteAngular.toString());
        this.leiFormacao = coeficienteAngular+(coeficienteLinear<0?"x":"x+")+coeficienteLinear;
    }

    public LinearEquation(Double coeficienteAngular, Double coeficienteLinear){
        this.grau = 1;
        this.monotonia = coeficienteAngular>0?"funcao crescente":"funcao decrescente";
        this.coeficienteLinear=Double.parseDouble(coeficienteLinear.toString());
        this.coeficienteAngular=Double.parseDouble(coeficienteAngular.toString());
        this.leiFormacao = coeficienteAngular+(coeficienteLinear<0?"x":"x+")+coeficienteLinear;
    }

    public String getLeiFormacao(){
        return leiFormacao;
    }

    public List<Double> getRaizes(){
        calcularRaizes();
        return this.raizes;
    }

    public Double getCoeficienteAngular() {
        return coeficienteAngular;
    }

    public Double getCoeficienteLinear() {
        return coeficienteLinear;
    }

    public int getGrau() {
        return grau;
    }

    public String getMonotonia() {
        return monotonia;
    }


    // logica
    private void calcularRaizes() {
        if(coeficienteLinear>0){
            this.raizes.add(coeficienteLinear/coeficienteAngular);
        }
        else{
            this.raizes.add(-coeficienteLinear/coeficienteAngular);
        }
    }
}
