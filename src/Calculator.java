public class Calculator {

    private double num1 ;
    private double num2 ;
    private double resultado;

    public Calculator(double num1, double num2, double resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    public void sumar(){
        this.resultado = num1 + num2;
    }

    public void restar(){
        this.resultado = num1 - num2;
    }

    public void multiplicar(){
        this.resultado = num1 * num2;
    }
    public void dividir(){

        if( num2 == 0){
            throw new ArithmeticException();
        }
        this.resultado = num1 / num2;
    }

    public void potencia(){ // raiz con base negativa

        if( num1 < 0 && num2 <= 1  ){
            throw new ArithmeticException();
        }
        this.resultado = Math.pow(num1 , num2);
    }

    public double getResultado(){
        return this.resultado;
    }


}
