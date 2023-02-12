//Guarda un arrayList que contiene arrays que a su vez tienen la tasa de conversion, unidad y opciones
package com.mycompany.aplicacionconversores;

import java.lang.reflect.Array;
import java.util.ArrayList;
import javafx.scene.Parent;

/**
 *
 * @author Friné
 */
public class conversorMonedas {
    static public Parent getLayout(){
        
        //Tasas de conversion a peso
        double tasaDolar = 18.711288;
        double tasaEuro = 20.074959;
        double tasaLibra = 22.648995;
        double tasaYen = 0.14344274;
        double tasaWon = 0.020793465;
        
        //La estructura del array es {Opcion, unidades, tasa}
        ArrayList<String[]> datos=new ArrayList<>();
//        String[] toDolar={"De Pesos a Dolar","dolares",String.valueOf(tasaDolar)};
//        String[] fromDolar={"De Dolar a Pesos","pesos",String.valueOf(1/tasaDolar)};
//        
//        String[] toEuro={"De Pesos a Euros","euros",String.valueOf(tasaEuro)};
//        String[] fromEuro={"De Euro a Pesos","pesos",String.valueOf(1/tasaEuro)};
//        
//        String[] toLibra={"De Pesos a Libras","libras",String.valueOf(tasaLibra)};
//        String[] fromLibra={"De Libras a Pesos","pesos",String.valueOf(1/tasaLibra)};
//        
//        String[] toYen={"De Pesos a Yen","yens",String.valueOf(tasaYen)};
//        String[] fromYen={"De Yen a Pesos","pesos",String.valueOf(1/tasaYen)};
//        
//        String[] toWon={"De Pesos a Won","wons",String.valueOf(tasaWon)};
//        String[] fromWon={"De Won a Pesos","pesos",String.valueOf(1/tasaWon)};
        
       
        datos.add(new String[]{"De Pesos a Dolar","dolares",String.valueOf(1/tasaDolar)});
        datos.add(new String[]{"De Dolar a Pesos","pesos",String.valueOf(tasaDolar)});
        
        datos.add(new String[]{"De Pesos a Euros","euros",String.valueOf(1/tasaEuro)});
        datos.add(new String[]{"De Euro a Pesos","pesos",String.valueOf(tasaEuro)});
        
        datos.add(new String[]{"De Pesos a Libras","libras",String.valueOf(1/tasaLibra)});
        datos.add(new String[]{"De Libras a Pesos","pesos",String.valueOf(tasaLibra)});
        
        datos.add(new String[]{"De Pesos a Yen","yens",String.valueOf(1/tasaYen)});
        datos.add(new String[]{"De Yen a Pesos","pesos",String.valueOf(tasaYen)});
        
        datos.add(new String[]{"De Pesos a Won","wons",String.valueOf(1/tasaWon)});
        datos.add(new String[]{"De Won a Pesos","pesos",String.valueOf(tasaWon)});
        Conversor conversorMonedas=new Conversor(datos);
       
       return conversorMonedas.getLayout();
        
        
        
    }
}
