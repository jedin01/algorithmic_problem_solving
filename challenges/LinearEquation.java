public class LinearEquation {
    private double a;
    private double b;
    private String equation;
    public LinearEquation(double a, double b){
        a = this.a;
        b = this.b;
        this.equation = "ax²+b"
                .replace("a", a == 1 ? "" : String.valueOf(a))
                .replace("+b", b == 1 ? "+" : b < 0 ? String.valueOf(b) : "+" + String.valueOf(b))
    }

    public String getDomain(){
        return "R";
    }


}
