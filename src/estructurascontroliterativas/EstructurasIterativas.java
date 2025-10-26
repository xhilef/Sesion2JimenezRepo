package estructurascontroliterativas;

public class EstructurasIterativas {//inicia clase
    //estructura de control for imprimir abecedario
    public void iterativaFor(){
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            System.out.println("Letra es: "+letra);
        }
    }
    //Metodo-fiuncion estructuras de control for-each imprime datos arreglo
    //arreglo es un tipo de dato que permite almacenar millones de valores
    public void estructuraForEach(){
        //declaracion de un arreglo tipo entero
        int arregloNumeros[]={3,2,100,500,1};//indexacion  comenzar a contar desde 0
        for (int arregloNumero : arregloNumeros) {//inicia foreach
            System.out.println("Cantidad arreglo es: "+arregloNumero);
        }//termina foreach    
    }//termina metodo
    
    //metodo funcion-while repite hasta que cumple una condicion
    public void estructuraWhile(){
        int contador=1; //variable de tipo entero, inicializada en 0
        while (contador<=5) {            
            System.out.println("Numero es con While: "+contador);
            contador++;//contador incrementado por cada ciclo en unidad
            
        }
    }//termina metodo


}//termina clase
