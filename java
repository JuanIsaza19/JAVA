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

--------------------------------------------------------------------------------------------------------------------------------------------------


public class Main {
    public static void main(String[] args) {

        Vehiculo coche = new Vehiculo ();
        coche.setTipo("DMAX");
        coche.setVelocidadMax(220);
        coche.setRapido(true);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("RX 115");
        moto.setVelocidadMax(150);
        moto.setRapido(false);


    //System.out.println(coche.getTipo());
    //System.out.println(coche.getVelocidadMax());

    //System.out.println(moto.getTipo());
    //System.out.println(moto.getVelocidadMax());

    System.out.println(coche.getTipo() + " " + coche.getVelocidadMax());
    System.out.println(moto.getTipo() + " " + moto.getVelocidadMax());
    System.out.println(coche.isRapido());      // DEPENDE SI SELECCIONO COCHE O  MOTO EL VERDADERO Y FALSO //

    }
}
class Vehiculo {
    private String tipo;
    private int velocidadMax;
    private boolean rapido;  //los boolean son falso o verdadero//

    public void setRapido (boolean rapido){
        this.rapido = rapido;
    }
    public boolean isRapido(){  //cuando es boolean el get se llama is.//
        return this.rapido;
    }
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
        return this.tipo;                                                                   //ejercicio importante de set y get con propiedad boolean//
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------


EJERCICIO MODULO 8 



public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Juan Pablo");
        System.out.println("Soy " + persona.getNombre());   // Así imprimi propiedad por propiedad -  Pendiente del parentecis dentro de getTipo -  String lleva (" ")//

        persona.setEdad(25);     //dar valores a las propiedades   - importante a los int no colocar ""//
        System.out.println("Tengo " + persona.getEdad());    //imporrtante dejar un espacio en la ultima comilla " )

        persona.setTelefono(315521456);
        System.out.println("Mi telefono es " + persona.getTelefono());

    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre (String nombre) {
        this.nombre = nombre;
        }
    public String getNombre() {   //PENDIENTE DE NO PONER ; //
        return this.nombre;
        }

    public void setEdad(int edad) {   //Es void, no int no devuelve nada. Pero si acepta datos int;
        this.edad = edad;
        }
    public int getEdad () {
        return this.edad;
        }

    public  void setTelefono (int telefono) {    //por que es void y no int?? //
        this.telefono = telefono;
        }
    public int getTelefono () {
        return this.telefono;
        }
}

                                                                                //EJERCICIO MODULO 8 (CREAR CLASE PERSONA - CREAR VARIABLES PRIVADAS NOMBRE, EDAD, TELEFONO
                                                                                CREAR get Y set PARA CADA PROPIEDAD - CREAR OBJETO PERSONA - UTILIZAR get Y set PARA
                                                                                DARLE VALORES A LAS PROPIEDADES Y LUEGO MOSTRAR EN PANTALLA //

---------------------------------------------------------------------------------------------------------------------------------------------------------------


HERENCIA



public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto();
        moto.velocidadMax = 12;   // herencia, por que la clase Moto no tiene la propiedad velocidadMax, pero la puedo utilizar //
        moto.matricula = "ABC 1236 CO";

    System.out.println(moto.compruebaMatricula("ABC 1236 CO"));   // El numero a imprimir debe coincidir con el if de la funcion publica //
    }
}
class Vehiculo {
    int velocidadMax;
    String matricula;

    public boolean compruebaMatricula (String matricula){     //crear funcion dentro de {} //
        if (matricula == "ABC 1236 CO"){      //debe coincidir con la linea de imprimir //     //PARA PROGRAMAR QUE ES IGUAL (==)//
            return true;
        }
        return false;
    }
}

class Coche extends Vehiculo {       //nunca olvida que class es con c minuscula//

    }

class Moto extends Coche {    //IMPORTANTE EL extends PARA HACER HERENCIA//

}

                                                                        
                                                                        
                                                                       //ESTA HERENCIA, CONSISTE EN UTILIZAR LAS VARIABLES (int velocidadMax y String matricula) 
                                                                       QUE PERTENECEN A LA CLASE VEHICULO, EN LAS OTRAS CLASES HIJAS (extends) - LUEGO CREAR UN OBJETO 
                                                                       (moto) Y DARLE VALORES A LAS VARIABLES. ESTE EJEMPLO ES CON UNA FUNCION PUBLICA BOOLEAN (compuebaMatricula) 
                                                                       QUE IGUALMENTE HEREDA LA VARIABLE (moto), SE LE DAN VALORES, LUEGO SE IMPRIME Y LA COMPARACACION
                                                                       (true o flase) SALE DEL VALOR QUE SE LE DIO EN EL if Y EL VALOR DE PARENTECIS DE LA IMPRESION//
                                                              
-----------------------------------------------------------------------------------------------------------------------------------------------------------



public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto();
        moto.setSonido("BRRRRRRR");
        System.out.println(moto.getSonido());   //get PARA IMPRIMIR y set para el nombre//

    }
}                                               //  IMPORTANTE SIEMPRE CERRAR } LA CLASS MAIN//
 class Moto {                        //CLASE PADRE//
        int velocidadMaxima;
        String matricula;
        String sonido;

        public Moto() {                           //CONSTRUCTOR - SE DEBE LLAMAR IGUAL QUE LA CLASS//
            System.out.println("estoy en el construcor de Moto");
        }

        public String getSonido() {
            return this.sonido;                //AL PARECER NO IMPORTA SI VA PRIMERO EL get O EL set//
        }

        public void setSonido(String sonido) {
            this.sonido = sonido;
        }
    }

class Carro extends Moto{

}
                                                                    EJERCICIO PARA IMPRIMIR LA VARIABLE (String sonido), SE CREA UNA CLASS (Moto) CON VARIABLES (VelocidadMaxima;
                                                                    matricula y sonido) SE COLOCA UNA FUNCION PUBLICA (CONSTRUCTOR) PARA QUE IMPRIMA EL TEXTO (estoy en el
                                                                    constructor ....) EL ORDEN DEL get Y set NO IMPORTA, SE HACE UNA INSTANCIA EN EL Main PARA DARLE VALORES
                                                                    A LAS VARIABLES. SE PUEDE CREAR OTRA CLASE HIJA Y HACER HERENCIA. 
                          
---------------------------------------------------------------------------------------------------------------------------------------------------------------




public class Main {
    public static void main(String[] args) {
        Carro carro  = new Carro();           //DISPARA CONSTRUCTOR//
        carro.setSonido("BRRRRRRR");
        System.out.println(carro.getSonido());   //get PARA IMPRIMIR y set para el nombre//

    }
}                                               //  IMPORTANTE SIEMPRE CERRAR } LA CLASS MAIN//
 abstract class Moto {                        //CLASE PADRE//
        int velocidadMaxima;
        String matricula;
        String sonido;
        
        public Moto() {                           //CONSTRUCTOR - SE DEBE LLAMAR IGUAL QUE LA CLASS//
            System.out.println("estoy en el constructor de Moto");
        }

        abstract public String getSonido();
        abstract public void setSonido(String sonido);
    }
class Carro extends Moto{

    public String getSonido() {
        return "Soy un super sonido: " + this.sonido;  //sirve para imprimir//
    }                                                   
                                            // EJEMPLO DE CLASE HIJA UTILIZANDO ABSTRACCION (abstrac) IGUAL SE PUEDE TRABAJAR POR QUE A LA HIJA SE LE DIERON PUBLICAS //

    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}

class Patineta extends Carro{

    public String getSonido() {
        return "Soy un sonidillo: " + this.sonido;  //sirve para imprimir//
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }                                                                                 
}

                                                                                          //SE AGREGO CLASES ABSTRACTAS (CLASES QUE SE DEJAN RESEÑADAS PARA PODER SER UTILIZADAS
                                                                                         EN OTRAS CLASES HIJAS, ESTO IMPRIME (Soy un super sonido) POR QUE EN EL MAIN SE LE INDICHO
                                                                                         IMPRIMIR carro. !!!DERIVAR CLASE!!!  //
                                                                                         
                                                                                    
------------------------------------------------------------------------------------------------------------------------------------------------------------------



public class Main {
    public static void main(String[] args) {

        Moto moto = new Moto();                        // EL ORDEN DE ESTO ALTERA EL RESULTADO//
        moto.diHola();

        Coche coche = new Coche();
        coche.diHola();
        
    }
}
class Moto {
    int velocidadMax;                                    //PROPIEDAD, AVECES NO ES NECESARIO PONERLA//
    public void diHola(){                                //NOMBRE DE LA FUNCION PUBLICA//
       System.out.println("HOLAAAAAAA");                 //IMPRIMIR//
    }
}

class Coche extends Moto {
    public void diHola(){
        System.out.println("SOY UN COCHEEEE");
    }

}
                                                                POLIMORFISMO - SI VEMOS LA FUNCION (diHola) PERTENECE A LA CLASE MOTO, DONDE SE LE DA UN VALOR DE (HOLAAAA
                                                                PERO EN LA CLASE HIJA (Coche) DA COMO RESULTADO (SOY UN COCHEEE).


------------------------------------------------------------------------------------------------------------------------------------------------------------



public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.diHola();   //NO SE LE PUEDE PASAR A PRINTLN, POR QUE ES UNA FUNCION QUE NO DEVUELVE NADA (void)//



    }
}
class Moto {
    int velocidadMax;       //PROPIEDAD, AVECES NO ES NECESARIO PONERLA//

    public void diHola() {       //NOMBRE DE LA FUNCION PUBLICA//
        System.out.println("HOLAAAAAAA");    //IMPRIMIR//
    }
}

class Coche extends Moto {
    public void diHola() {
        System.out.println("SOY UN COCHEEEEEE");
    }                            // SI LA FUNCION diHola EN MI CLASE Coche NO EXISTE, EJECUTARA LA FUNCION DE MI CLASE PADRE Moto//
}



                                                                            // EJEMPLO DE POLIMORFISMO //
                                                                            
---------------------------------------------------------------------------------------------------------------------------------------------------------                                                                            



public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.diHola();   //NO SE LE PUEDE PASAR A PRINTLN, POR QUE ES UNA FUNCION QUE NO DEVUELVE NADA (void)//



    }
}
class Moto {
    int velocidadMax;       //PROPIEDAD, AVECES NO ES NECESARIO PONERLA//

    public void diHola() {       //NOMBRE DE LA FUNCION PUBLICA//
        System.out.println("HOLAAAAAAA");    //IMPRIMIR//
    }
}

class Coche extends Moto {

}                        























































   public int sumaNumeros(int a, int b) {      //IMPORTANTE PONER (int a, int b) //
        System.out.println("Soy el suma numeros de int");
        return a + b;
    }

    public float sumaNumeros(float a, float b) {     //FLOTANTES//
        System.out.println("Soy el suma numeros de float");
        return a + b * (float) 9.0;                 //IMPORTANTE PONER EL (float) //
    }

    double sumaNumeros(double a, double b) {
        //System.out.println("EL RESULTADO ES: " + (a + b));    //IMPRIMIR//
    }

































