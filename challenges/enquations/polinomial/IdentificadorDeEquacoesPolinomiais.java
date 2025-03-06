package enquations.polinomial;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentificadorDeEquacoesPolinomiais {


    private String expressao;
    private ArrayList<Integer> graus;
    private Integer maiorGrau;
    private Pattern padrao;
    private Matcher matcher;

    public IdentificadorDeEquacoesPolinomiais(String expressao){
        this.expressao = expressao;
        this.maiorGrau = 1;
        this.graus = new ArrayList<>();
        this.padrao = Pattern.compile("([-+]?\\d*\\.?\\d*)x?(\\^\\d+)");
        this.matcher = padrao.matcher(expressao);
        this.encontrarMaiorGrau();

    }

    public void encontrarMaiorGrau() {
        while(matcher.find()){
            graus.add(Integer.parseInt(matcher.group(2).replace("^","")));
        }
        for (Integer grau : graus){
            maiorGrau = maiorGrau>grau?maiorGrau:grau;
        }
    }

    public Integer getMaiorGrau(){
        return maiorGrau;
    }
}
