package datospersona;
import java.util.Scanner;

public class DatosPersona {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i,nPersona,maPe=0,meEst=0;

        double menorEstatura = 10000;
        double mayorPeso = 0;
        
        
        System.out.print("¿Cuantas personas ingresara?: ");
        nPersona = entrada.nextInt();
        
        String[] nombre = new String[nPersona];
        Double[] peso = new Double[nPersona];
        Double[] estatura = new Double[nPersona];
        
        
        for(i=0;i<nPersona;i++){
            System.out.print((i+1)+". Digite su nombre: ");
            entrada.nextLine();
            nombre[i] = entrada.nextLine();
            System.out.print((i+1)+". Digite su peso: ");
            peso[i] = entrada.nextDouble();
            System.out.print((i+1)+". Digite su astatura: ");
            estatura[i] = entrada.nextDouble();
              
            if (peso[i] > mayorPeso) {
              mayorPeso = peso[i];
              maPe = i;
            }
            if (estatura[i] < menorEstatura){
              menorEstatura = estatura[i];
              meEst = i;
            }
            System.out.println("");
        }
        System.out.println(nombre[maPe]+" tiene el mayor peso con "+mayorPeso+" kg");
        System.out.println(nombre[meEst]+" tiene la menor estatura con "+menorEstatura+ " m");
        
    }
}
