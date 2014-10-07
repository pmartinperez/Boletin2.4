import java.util.Scanner;

public class operaciones {

   
    public static void main(String[] args) {
        //Declaracion variables
        float num1;
        float num2;
        float suma, resta, producto, division;
        
        //Creamos objeto Scanner 
         Scanner dato = new Scanner (System.in);
         
         //Pedimos que nos introduzcan los datos por teclado
        System.out.println ("Primer número?:");
        num1=dato.nextFloat();
        System.out.println ("Segundo número?:");
        num2=dato.nextFloat();
        
        //Operacion a calcular
        suma= num1+num2;
        resta= num1-num2;
        producto= num1*num2;
        division= num1/num2;
        
        //Mostramos por pantalla el resultado
         System.out.println ("El resultado de la suma es: " + suma);
         System.out.println ("El resultado de la resta es: " + resta);
         System.out.println ("El resultado de la producto es: " + producto);
         System.out.println ("El resultado de la division es: " + division);
    }
    
}
