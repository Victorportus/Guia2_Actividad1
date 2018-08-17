import java.util.Scanner;

/**
 * 
 */
public class Impuestos
{
    Scanner teclado = new Scanner(System.in);
    double Cc, Ca;
    
    public void main(){
        double dato = 0;
        
        System.out.println("Seleccione su tipo de vehiculo");
        System.out.println("1 para Camioneta");
        System.out.println("2 para Automovil");
        System.out.println("0 para salir del programa");
        dato = teclado.nextDouble();
        
        if (dato == 1){
            Camioneta();
        }
        if (dato == 2){
            Automovil();
        }
        if (dato == 0){
            System.exit(0);
        }
                        
    }
    
    public void Camioneta(){
        System.out.println("");
        System.out.println("Idique el precio de su Camioneta");
        Cc = teclado.nextDouble();
        double impuesto, Pn;
        
        if (Cc < 80){
            impuesto = 0;
            Pn = impuesto + Cc;
            System.out.println("Su impuesto es 0, es decir que no debe pagar nada.");
            System.out.println("El precio neto de su camioneta es " + Pn + "pesos.");
        }
        if (Cc >= 80){
            impuesto = Cc / 2;
            Pn = impuesto + Cc;
            System.out.println("Usted debe pagar " + impuesto + " pesos de impuesto.");
            System.out.println("El precio neto de su camioneta es " + Pn + "pesos.");
        }
        
        System.out.println("");
        main();
        
    }
    
    public void Automovil(){
        System.out.println("");
        System.out.println("Idique el precio de su automovil");
        Ca = teclado.nextDouble();
        double impuesto, Pn;
        
        if (Ca < 20){
            impuesto = 5;
            Pn = impuesto + Ca;
            System.out.println("Su impuesto es de 5 pesos");
            System.out.println("El precio neto de su automovil es " + Pn + "pesos.");
        }
        if ((Ca >= 20) && (Ca <= 40)){
            impuesto = Ca / 5;
            Pn = impuesto + Ca;
            System.out.println("Usted debe pagar " + impuesto + " pesos de impuesto.");
            System.out.println("El precio neto de su automovil es " + Pn + "pesos.");
        }
        if (Ca > 40){
            impuesto = 9;
            Pn = impuesto + Ca;
            System.out.println("Su impuesto es de 9 pesos");
            System.out.println("El precio neto de su automovil es " + Pn + "pesos.");
        }
        
        System.out.println("");
        main();       
        
    }
}
