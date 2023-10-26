package org.example.alghoritms.condicionalesCompuestos;

import java.util.Scanner;

/*

    Una empresa dedicada al alquiler de carros cobra un monto fijo de $3000 para cualquier
    tipo de km acumulados hasta 300km.
    - A partir de ahí si el km va de 300km - 1000km le cobran
    $1500 mas x cada kilometro extra.
    - Si por otro lado, supera los 1000km se le cobrara 1000 x cada km en exceso.
    Recordar que al monto final se le debe adicionar el iva del 18%

    (Input)
    -  Ingrese los kilometros recorridos en el vehiculo que rento.

    (Constant)
    - costoBase(Haste300km) = 3000
    - iva = 0.18;

    (Conditional)
    - Si el recorrido es > 300km || <1001km se le suman 1500 por cada km de mas.
    - Si el recorrido es > 1000km se le suman 1000 por cada km de mas.

    (?) = montoAPagar
 */
public class CarRental {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los kilometros que recorrio en el carro que rento: ");
        //(Input)
        double kilometrosRecorridos = input.nextDouble();

        input.nextLine();

        //(Constants)
        double valorStandartRenta = 3000;
        double iva = 1.18;
        double valorKilometroInferior = 1500;
        double valorKilometroSuperior = 1000;

        if (kilometrosRecorridos <= 300){
            double valorFinal = (valorStandartRenta * iva);
            System.out.println("El valor final a pagar es: " + valorFinal);
        } else if (kilometrosRecorridos > 300 && kilometrosRecorridos <= 1000) {
            double kilometrosExtra = (kilometrosRecorridos - 300);
            double montoExtra = (kilometrosExtra * valorKilometroInferior);
            double valorFinal = (valorStandartRenta + montoExtra) * iva;
            System.out.println("El valor extra por los kilometros recorridos de mas (" + kilometrosExtra + ") es de: " + montoExtra );
            System.out.println("El valor Final a pagar es de: " + valorFinal);
        } else if (kilometrosRecorridos > 1000 ) {
            double kilometrosExtra = (kilometrosRecorridos - 300);
            double montoExtra = (kilometrosExtra * valorKilometroSuperior);
            double valorFinal = (montoExtra + valorStandartRenta) * iva;
            System.out.println("El valor Final a pagar es de: " + valorFinal);
        }
    }
}
