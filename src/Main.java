public class Main {
    
    public static void main( String[] args ) {
       int resultado;
       resultado = suma (7, 15);
    
       System.out.println(resultado);;
    
       Coche miCoche = new Coche();

       miCoche.AgregarPuerta();
      

       System.out.println(miCoche.puertasCoche);
    }
    
    public static int suma (int a, int b) {
        return a + b;
    }
    }

   