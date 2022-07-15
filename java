public class Main {
    public static void main(String[] args) {
        var hoy_es = "Jueves";

        switch (hoy_es ) {
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("hoy es laborable");
            break;
            default:
                System.out.println("hoy NO es laborable");

            }
        }
    }
    
    
   EJERCICIO MODULO 4
    
   public class Main {
    public static void main(String[] args) {
        int numerolf = -5;

        if (numerolf >= 1) ;{
            System.out.println("es positivo");
        else if (numerolf == 0)
            System.out.println("Es 0");
        else (numerolf <= -1)
            System.out.println("es negativo");
        }
    }
} 

public class Main {
    public static void main(String[] args) {
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile ahora es:"+ numeroWhile);
        }


    }
}

public class Main {
    public static void main(String[] args) {
        int numeroWhile = 0;

        do {
            numeroWhile++;
            System.out.println("numeroWhile ahora es:" + numeroWhile);
           }while (numeroWhile < 3);

        }
    }
    

