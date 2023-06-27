package conversor_dinero;

import java.util.Scanner;

public class Conversor_dinero {

    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        int conversion;
        double dolarAcantidad = 0;
        double CantidadAdolar = 0;
        System.out.println("De que moneda es tu pais ");//preguntar la moneda del pais que quieras
        String pais = escaner.next();
        System.out.println("Que conversion quieres hacer ");
        System.out.println("\n1. De dolar a peso " + pais + " \n2 De  peso " + pais + " a dolar \n Elige una opcion ");//pregunta que conversion quiere hacer en este caso dos opciones de dolar a pais especifico y de pais especifico a dolar
        conversion = escaner.nextInt();
        System.out.println(" ");
        System.out.println("A cuanto esta el dolar en tu pais  ");//Aqui preguntar cuanto esta el dolar en el pais que quieres hacer la conversion
        int valor = escaner.nextInt();

        switch (conversion) {//un switch para que el usuario tenga dos opciones a la cual quiere hacer su conversion 

            case 1:
                System.out.println("Escogistes de dolar a peso " + pais);
                System.out.println("");
                System.out.println("ingresa la cantidad a convertir");
                double Dolar = escaner.nextDouble();// se guarda el valor de la cantidad de dolares en la variable dolar
                dolarAcantidad = Dolar * valor;//aqui se multiplica la cantidad de dolares por el valor de dolar del pais 
                System.out.println("De dolar a peso " + pais + " es : " + dolarAcantidad);
                break;
            case 2:
                System.out.println("Escogistes de peso " + pais + " a dolar ");
                System.out.println("ingresa la cantidad a convertir");// se guarda el valor de la cantidad de dinero del pais en la variable P
                double P = escaner.nextInt();
                CantidadAdolar = P / valor;//Se divide la cantidad de dinero del pais que anteriormente digitastes en el valor del dolar que esta en el pais 
                System.out.println("De peso " + pais + " es  :" + CantidadAdolar);
                break;
                default:
                System.out.println("Opción inválida");
                break;
        }

    }

}
