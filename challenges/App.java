import enquations.polinomial.IdentificadorDeEquacoesPolinomiais;
import enquations.polinomial.LinearEquation;
import enquations.polinomial.QuadraticEquation;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        System.out.println(new LinearEquation("2x-4").getEstudoCompleto());

    }
}
