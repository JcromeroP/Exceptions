import Exceptions.CalculadoraException;

public class Calculadora {

    public int dividir(int dividendo, int divisor) throws CalculadoraException{
        
        if (divisor == 0) throw new CalculadoraException("No se puede dividir por cero");
        return dividendo / divisor;
        

    }

}
