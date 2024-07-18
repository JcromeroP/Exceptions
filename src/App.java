import Exceptions.CalculadoraException;

public class App {
    public static void main(String[] args) throws Exception {

        //Excepciones: eventos que interrumpen el flujo normal de la aplicación
        //Unchecked exception: una excepción no verificada
        //Checked exception:  

        int numero1 = 10;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();

        //Para manejar errores se utiliza una estructura llamda try:intenta caht
        try {
            //El casteo es convertir de un tipo a otro tipo de dato
            resultado = calculadora.dividir(numero1, numero2);
            System.out.println(resultado);

        } catch (CalculadoraException e) {
            //Imprime el error y deja que siga el flujo de la aplicación
            e.printStackTrace();
            System.out.println("Esto va después de la excepcion");
        } finally {
            System.out.println("Hemos finalizado el cálculo ya sea exitoso o no");
        }

    }
}
