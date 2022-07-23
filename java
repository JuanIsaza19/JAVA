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

---------------------------------------------------------------------------------------
EJERCICIO CON CONSTRUCTOR 


public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche(5, 4,  150);  //instanciar
        System.out.println(coche1.numeroDeLLantas);
        System.out.println(coche1.numeroDePuertas);
        System.out.println(coche1.velocidadMax);
        System.out.println((coche1.velocidadActual));

        //Coche coche2 = new Coche();
        //System.out.println(coche2.velocidadActual);
        //Coche coche3 = new  Coche();  //No tiene nada que ver con las demas instancias -  comparten propiedades pero no son los mismos.

    }
}
class Coche{
    int numeroDeLLantas;
    int numeroDePuertas;
    int velocidadMax;
    float velocidadActual; // por los decimales se escoje float, o tambien podria ser double.

    public Coche(){
        numeroDeLLantas = 5;
        numeroDePuertas = 4;
        velocidadMax = 120;
        System.out.println("Estoy en el constructor sin parametros");
    }


    public Coche( int llantas, int puertas, int velocidad){
    numeroDeLLantas = llantas;
    numeroDePuertas = puertas;
    velocidadMax = velocidad;
    System.out.println("Estoy en el constructor con parametros");
    }
}

------------------------------------------------------------------------------------------------------------


public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche(5, 4,  150);  //instanciar
        System.out.println(coche1.numeroDeLLantas);
        System.out.println(coche1.numeroDePuertas);
        System.out.println(coche1.velocidadMax);
        System.out.println((coche1.velocidadActual));

        Coche coche2 = new Coche();    //SOBRECARGA DEL CONSTRUCTOR
        System.out.println(coche2.numeroDeLLantas);
        System.out.println(coche2.numeroDePuertas);
        System.out.println(coche2.velocidadMax);
        System.out.println((coche2.velocidadActual));

        //Coche coche3 = new  Coche();  //No tiene nada que ver con las demas instancias -  comparten propiedades pero no son los mismos.

    }
}
class Coche{
    int numeroDeLLantas;
    int numeroDePuertas;
    int velocidadMax;
    float velocidadActual; // por los decimales se escoje float, o tambien podria ser double.

    public Coche(){
        numeroDeLLantas = 5;
        numeroDePuertas = 4;
        velocidadMax = 120;
        System.out.println("Estoy en el constructor sin parametros");
    }


    public Coche( int llantas, int puertas, int velocidad){
    numeroDeLLantas = llantas;
    numeroDePuertas = puertas;
    velocidadMax = velocidad;
    System.out.println("Estoy en el constructor con parametros");
    }
}

//Para buenas practicas se debe llamar los int igual ejemplo: se le agg this.
    // public Coche( int numeroDeLLantas , int numeroDePuertas, int velocidadMax){
    // this.numeroDeLLantas = numeroDeLLantas;
    // this.numeroDePuertas = numeroDePuertas;
    // this.velocidadMax = velocidadMax;
    // System.out.println("Estoy en el constructor con parametros");
}

----------------------------------------------------------------------------------------------------------------------------------------


IMPRIMIR EN PANTALLA VARIABLE PUBLICA

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo ();
        vehiculo.tipo = "cilca";
        System.out.println(vehiculo.tipo);

    }
}
class Vehiculo{
    String tipo;
}


-----------------------------------------------------------------------------------------------------------------------------------------------------

IMPRIMIR VARIABLE PRIVADAS CON set y get //get: optener un valor // set: cambiar un valor


public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo ();
        coche.setTipo("DMAX");

        Vehiculo moto = new Vehiculo();
        moto.setTipo("RX 115");

    System.out.println(coche.getTipo());
    System.out.println(moto.getTipo());

    }
}
class Vehiculo {
    private String tipo;

    public void setTipo (String tipo) {
        this.tipo = tipo;
    }
        public String getTipo (){
        return this.tipo;
    }
}

---------------------------------------------------------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {

        Vehiculo coche = new Vehiculo ();
        coche.setTipo("DMAX");
        coche.setVelocidadMax(120);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("RX 115");
        moto.setVelocidadMax(80);

    System.out.println(coche.getTipo());
    System.out.println(coche.getVelocidadMax());

    System.out.println(moto.getTipo());
    System.out.println(moto.getVelocidadMax());

    //System.out.println(coche.getTipo() + " " + coche.getVelocidadMax());  OTRA OPCION DE IMPRIMIR. PARA QUE QUEDE ASI: DMAX 120
    //System.out.println(moto.getTipo() + " " + moto.getVelocidadMax());
    
}
class Vehiculo {
    private String tipo;
    private int velocidadMax;
    
    public void setVelocidadMax (int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    public  int getVelocidadMax (){
        return  this.velocidadMax;
    }
    public void setTipo (String tipo) {
        this.tipo = tipo;
    }
    public String getTipo (){
        return this.tipo;
    }
}










