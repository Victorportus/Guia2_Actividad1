import java.util.Scanner;

/**
 * 
 */
public class AreaSombreada
{
    public void main(){
        Scanner teclado = new Scanner(System.in);
        double R, Aci, L, Acu, Aso;
        
        System.out.println("Ingese el radio del circulo");
        R = teclado.nextDouble();
        System.out.println("");
        
        Aci = (Math.PI)*(Math.pow(R,2));
        L = Math.sqrt((Math.pow(R,2))+(Math.pow(R,2)));
        Acu = Math.pow(L,2);
        Aso = Aci - Acu;
        
        System.out.println("El area sombeada entre el circulo y el cuadrado es " + Aso);
    }
}
