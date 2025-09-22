public class Raio {
    private final double PI = 3.14159;

    public void printRaio(double r) {
        double area = PI * Math.pow(r, 2);
        System.out.printf("A=%.4f%n", area);
    }

    public static void main(String[] args) {
        
    }
}
