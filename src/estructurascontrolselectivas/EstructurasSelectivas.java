package estructurascontrolselectivas;

public class EstructurasSelectivas {
    //funcion para conocer la estructura de control selectiva if
    public void selectivaIf(){
        //declaracion de variable doubl decimal
        double calificacion=9.5;
        if (calificacion>=6.0) {//para condicion true
            System.out.println("Aprobado tienes calificacion: "+calificacion);
        } else {//para condicion falsa
            System.out.println("Reprobado, tienes calificacion: "+calificacion);
        }      
    }//termina funcion selectiva
    //metodo-funcion para conocer la estructura dd control selectiva sitch
    public void selectivaSwitch(){
        int dia=2;
        switch (dia) {
            case 1:System.out.println("Seleccionaste 1. Dia Lunes");break;
            case 2:System.out.println("Seleccionaste 2. Dia Martes");break;
            case 3:System.out.println("Seleccionaste 3. Dia Miercoles");break;
            case 4:System.out.println("Seleccionaste 4. Dia Jueves");break;
            case 5:System.out.println("Seleccionaste 5. Dia Viernes");break;
            default:System.out.println("Opcion invalida tengo solo 1,2,3,4,5");break;      
        }
    }
    
    
}//termina clase
