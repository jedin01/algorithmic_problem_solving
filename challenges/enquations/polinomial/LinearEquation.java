package enquations.polinomial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class LinearEquation {

    private String leiFormacao;
    private Double coeficienteAngular;
    private Double coeficienteLinear;
    private List<Object> raizes;
    private int grau;
    private String monotonia;
    private HashMap<String, Object> coeficientes;
    private HashMap<String, Object> estudoCompleto;
    public LinearEquation(String expressao){

        this.grau = 1;
        this.raizes = new ArrayList<>();
        this.estudoCompleto = new HashMap<>();
        this.coeficienteAngular=Double.parseDouble(expressao.substring(0, expressao.indexOf("x")));
        this.coeficienteLinear=Double.parseDouble(expressao.substring(expressao.indexOf("x")+1, expressao.length()));
        this.monotonia = coeficienteAngular>0?"funcao crescente":"funcao decrescente";
        this.coeficientes = new HashMap<String, Object>();
        this.coeficientes.put("coeficiente_angular", coeficienteAngular);
        this.coeficientes.put("coeficiente_linear", coeficienteLinear);
        this.calcularRaizes();
        this.leiFormacao = coeficienteAngular+(coeficienteLinear<0?"x":"x+")+coeficienteLinear;
    }

    public String getLeiFormacao(){
        return leiFormacao;
    }

    public List<Object> getRaizes(){
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
            this.raizes.add(-coeficienteLinear/coeficienteAngular);
        }
        else{
            this.raizes.add(coeficienteLinear/coeficienteAngular);
        }
    }

    public HashMap<String, Object> getEstudoCompleto(){
        estudoCompleto.put("raizes", raizes);
        estudoCompleto.put("dominio", "R");
        estudoCompleto.put("coeficientes", coeficientes);
        return estudoCompleto;
    }


}
