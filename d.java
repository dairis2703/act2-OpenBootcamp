public static void main(String[]args){
    int numeroIf;

    if (numeroIf =< 0){
        System. out. println("numero negativo");}
    else if (numeroIf =>1){
        System. out. println("numero positivo");
        }}

    
public class EjemploWhile 
{
    public static void main(String args[]) 
    {
        int numeroWhile = 0; 
        
        while (numeroWhile < 10) 
        { 
            //CONDICIÓN A EVALUAR QUE DETERMINARÁ LA CONTINUIDAD O NO DEL BUCLE
            
            System.out.println(numeroWhile);  //EJECUCIÓN DE LAS INSTRUCCIONES DEL CUERPO DEL WHILE
            i++;  // CONTADOR, VARIABLE ENTERA DE CONTROL

        }
    }}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para leer
        int num1; // Variable de entero para guardar lo leído.

        do {
            System.out.print("Introduce un número válido del 1 al 10: ");

            // Convirtiendo el tipo String a int con parseInt
            num1 = Integer.parseInt(sc.nextLine());

            // Usando el método que te da la clase Scanner para leer enteros
            // num1 = sc.nextInt();
        } while (num1 < 1 || num1 > 10); // Fíjate que he quitado los = porque si no el 1 y el 10 no sería válido.
    }
}
public class Main {
    public static void main(String[] args) {

for( numeroFor=1; numeroFor<=3; numeroFor++){ System.out.println( numeroFor); }}}



