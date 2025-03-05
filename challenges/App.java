import enquations.polinomial.IdentificadorDeEquacoesPolinomiais;
import enquations.polinomial.LinearEquation;
import enquations.polinomial.QuadraticEquation;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        new LinearEquation("3x+6").getEstudoCompleto()
                .forEach((chave, valor) -> System.out.println(chave + " -> " + valor));

    }
}
