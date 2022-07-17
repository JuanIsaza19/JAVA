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
        int numerolf = 10;

        if (numerolf >= 1) {
            System.out.println("es positivo");
        }
        if (numerolf == 0) {
            System.out.println("Es 0");
        }
        if (numerolf <= -1){
            System.out.println("es negativo");
        }
    }
}    
  
---------------------------------------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile ahora es:"+ numeroWhile);
        }
    }
}

---------------------------------------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {
        int numeroDoWhile = 10;

        do {
            numeroDoWhile++;
            System.out.println("numeroDoWhile ahora es:" + numeroDoWhile);
        }while (numeroDoWhile < 3);

    }
}
    
--------------------------------------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {
    for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
        System.out.println(numeroFor);
        }
    }
}

-------------------------------------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {

        var estacion = "soleado";

        switch (estacion) {
            case "verano":
                System.out.println("Es Verano");
                    break;
            case "invierno":
                System.out.println("Es Invierno");
                    break;
            case "otoño":
                System.out.println("Es Otoño");
                    break;
            case "primavera":
                System.out.println("Es Primavera");
                    break;
            default:
                System.out.println("Esto no es una estacion");
        }
    }
}


