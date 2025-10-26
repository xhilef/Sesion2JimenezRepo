package estructuradedatos;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> listaNombres=new ArrayList<>();
        
        listaNombres.add("Adrian");
        listaNombres.add("Bryan");
        listaNombres.add("Christian");
        listaNombres.add("Ernesto");
        listaNombres.add("Félix");
        listaNombres.add("Gabriel");
        listaNombres.add("Jose");
        listaNombres.add("Teresa");
        
        for (String listaNombre : listaNombres) {
            System.out.println("Nombre: "+listaNombre+" !!!!");
            
        }
    }
}
