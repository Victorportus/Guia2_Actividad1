import java.util.Scanner;

/**
 * 
 */
public class Conversion
{
       
    public void main() {
        double dato;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Seleccione la unidad que desea convertir");
        System.out.println("1 para Pies");
        System.out.println("2 para Centimetros");
        System.out.println("3 para Leguas");
        System.out.println("4 para Yardas");
        System.out.println("0 para salir del programa");
        dato = teclado.nextDouble();
        
        if (dato == 1){
            Pies();
        }
        if (dato == 2){
            Centimetros();
        }
        if (dato == 3){
            Leguas();
        }
        if (dato == 4){
            Yardas();
        }
        if (dato == 0){
            System.exit(0);
        }
       
    }     
    
    public void Pies(){
        double P = 0;
        double pulgada;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Ingrese el numero de pies");
        P = teclado.nextDouble();
        
        pulgada = P / 0.0833;
        
        System.out.println(P + " pies, son " + pulgada + " pulgadas.");
        
        System.out.println("");
        main();       
    }
    
    public void Centimetros(){
        double C;
        double pulgada;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Ingrese el numero de centimetros");
        C = teclado.nextDouble();
        
        pulgada = C / 2.54;
        
        System.out.println(C + " centimetros, son " + pulgada + " pulgadas.");
        
        System.out.println("");
        main();
   }
   
   public void Leguas(){
        double L;
        double pulgada;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Ingrese el numero de leguas");
        L = teclado.nextDouble();
        
        pulgada = L * 190080.02;
        
        System.out.println(L + " leguas, son " + pulgada + " pulgadas.");
        
        System.out.println("");
        main();
   }
   
   public void Yardas(){
        double Y;
        double pulgada;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Ingrese el numero de yardas");
        Y = teclado.nextDouble();
        
        pulgada = Y * 36;
        
        System.out.println(Y + " yardas, son " + pulgada + " pulgadas.");
        
        System.out.println("");
        main();
   }
}

