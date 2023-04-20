package clase.pkg9a11;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;
import java.util.*;

public class ejercicio3 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int unDig = 0;
        int dosDig = 0;
        int tresDig = 0;
        int cuatroDig = 0;
        int cincoDig = 0;

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99999 + 1);
            System.out.println(vector[i]);
        }
        for (int i = 0; i < n; i++) {
            String cifras = Integer.toString(vector[i]);
            int longitud = cifras.length();
            switch (longitud) {
                case 1:
                    unDig++;
                    break;
                case 2:
                    dosDig++;
                    break;
                case 3:
                    tresDig++;
                    break;
                case 4:
                    cuatroDig++;
                    break;
                case 5:
                    cincoDig++;
                    break;
            }
        }
        System.out.println("Se encotró " + unDig + " numeros de un Digito.");
        System.out.println("Se encotró " + dosDig + " numeros de dos Digitos.");
        System.out.println("Se encotró " + tresDig + " numeros de tres Digitos.");
        System.out.println("Se encotró " + cuatroDig + " numeros de cuatro Digito.");
        System.out.println("Se encotró " + cincoDig + " numeros de cinco Digito.");
    }
}
