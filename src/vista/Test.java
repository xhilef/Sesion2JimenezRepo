package vista;

import estructurascontroliterativas.EstructurasIterativas;
import estructurascontrolselectivas.EstructurasSelectivas;
import java.util.Scanner;

public class Test {//Inicia clase
    
    public static void menuGeneral(){//Inicia metodo menu
        int menu; //vaiable global, tiene alcance en todos los metodos y estructuras de control

        do {//inicia do para realizar, ciclar

            System.out.println("Menu Estructuras de control Jimenez"
                    + "\nSelecciona"
                    + "\n1.Selectivas"
                    + "\n2.Iterativas"
                    + "\n3.Salir");
            Scanner entradaMenu = new Scanner(System.in);//objeto para capturar valores desde teclado
            menu = entradaMenu.nextInt();//guarda la opcion capturada tipo de dato entero
            switch (menu) {
                case 1:
                    //Llamada del metodo selectivasIf() por medio de un objeto apuntador "a"
                    EstructurasSelectivas a = new EstructurasSelectivas();
                    a.selectivaIf();//invocacion de metodo
                    a.selectivaSwitch();

                    break;
                case 2:
                    //Llamada del metoo iterativaFor() por medio de un obketo apuntador "b"
                    EstructurasIterativas b = new EstructurasIterativas();
                    b.iterativaFor();
                    b.estructuraForEach();
                    b.estructuraWhile();
                    break;
                case 3:
                    System.out.println("Finalizó Progama!!!!");
                    break;
                default:
                    System.out.println("Opcion invalida, solo tengo 1,2,3,");
                    break;
            }//termina switch
        } while (menu != 3);//termina do-while

    }//termina metodo menu

    public static void main(String[] args) {//inicia main para llaamr metodos-ejecutarlo
        menuGeneral();//invocacion del metodo
    }//termina main
}//termina clase