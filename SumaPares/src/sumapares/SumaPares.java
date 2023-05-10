package sumapares;

/**
 *
 * @author maryse
 *
 * Ciclo for
 * Suma de los M primeros números pares.
 *
 */
public class SumaPares {

    static final int M = 12;
        static int suma = 0;
    
    
    public void entrada () {
    
       
    for (int n = 1; n <= M; n++) {
            suma += 2 * n;
        }    
}
    
    
    
    
    
    public static void main(String[] args) {
        
        
        System.out.println("La suma de los " + M
                + " primeros números pares: " + suma);
    }
}
