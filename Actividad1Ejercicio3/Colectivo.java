import java.util.Scanner;

/**
 * 
 */
public class Colectivo
{
    public void main(){
        Scanner teclado = new Scanner(System.in);
        double Nv;
        double Np, Nt, Dt, Dc;
        int tiquete = 10000;
        int viaje = 2000;
        
        System.out.println("Ingrese los datos solicitados");
        System.out.println("");
        System.out.println("Numero de personas que caben en el colectivo");
        Np = teclado.nextInt();
        System.out.println("Numero de turistas que van al hotel");
        Nt = teclado.nextInt();
        Nv = Math.ceil(Nt/Np);
        Dt = Nt * tiquete;
        Dc = Nv * viaje;
        
        System.out.println("El colectivo debera hacer "+ Nv + " viajes.");
        System.out.println("El total que deberan pagar los turistas al conductor sera de " + Dt + " pesos");
        System.out.println("El total que debera pagar el conductor a la empresa dueña del colectivo es de " + Dc + "pesos");
                        
    }
}
