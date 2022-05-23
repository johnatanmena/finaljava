
package calculadora;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Calculadora {

    public static void main(String[] args) {
       int menu;
       double valor1;
       double valor2;
       double valor3;
       double resultado;
       Scanner in = new Scanner(System.in);
        System.out.println("1.Suma, 2. Multiplicación. 3 dividir. 4 restar y 5 modulo");
       menu = in.nextInt();
      
      
        switch(menu){
            case 1:{
                System.out.println("Sumar.");
                valor1 = in.nextDouble();
                valor2 = in.nextDouble();
                valor3 = in.nextDouble();
                resultado = valor1 + valor2 + valor3;
                System.out.println(resultado);
                break;

            }

            case 2:{

                System.out.println("multiplicar.");
                valor1 = in.nextDouble();
                valor2 = in.nextDouble();
                valor3 = in.nextDouble();
                resultado = valor1 * valor2 * valor3;
                System.out.println(resultado);
                break;

            }

            case 3:{
                System.out.println("Dividr.");
                valor1 = in.nextDouble();
                valor2 = in.nextDouble();
                valor3 = in.nextDouble();
                resultado = valor1 / valor2 ;
                System.out.println(resultado);
                break;


            }
              case 4:{

                 System.out.println("Restar.");
                valor1 = in.nextDouble();
                valor2 = in.nextDouble();
                valor3 = in.nextDouble();
                resultado = valor1 - valor2 - valor3;
                System.out.println(resultado);
                break;


            }
                case 5:{

                System.out.println("Modulo.");
                valor1 = in.nextDouble();
                valor2 = in.nextDouble();
                valor3 = in.nextDouble();
                resultado = valor1 % valor2;
                System.out.println(resultado);
                break;
            }

  

      }
    }
    
}
