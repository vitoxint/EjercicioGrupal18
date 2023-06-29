public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator(27 , (double)1/3 , 0);
        c.sumar();
        System.out.println(c.getResultado());

        c.dividir();
        System.out.println(c.getResultado());

        c.potencia();
        System.out.println(c.getResultado());

    }
}
