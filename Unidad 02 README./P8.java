import java.util.Scanner;

public class P8 {
    public static void main(String[] args)
    {
        //declaracion de las variables
        int a1,a2, d1,d2,m1, m2, dias;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Fecha 1: Introduzca día: ");
        d1=entrada.nextInt();
        System.out.print("Fecha 1: Introduzca mes: ");
        m1=entrada.nextInt();
        System.out.print("Fecha 1: Introduzca año: ");
        a1=entrada.nextInt();
        
        System.out.print("Fecha 2: Introduzca día: ");
        d2=entrada.nextInt();
        System.out.print("Fecha 2: Introduzca mes: ");
        m2=entrada.nextInt();
        System.out.print("Fecha 2: Introduzca año: ");
        a2=entrada.nextInt();
        
       
        System.out.println ("Días de diferencia: " + dias);
    }
}