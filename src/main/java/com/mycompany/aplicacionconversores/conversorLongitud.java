/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicacionconversores;

import java.util.ArrayList;
import java.lang.reflect.Array;
import javafx.scene.Parent;

/**
 *
 * @author Friné
 */
public class conversorLongitud {

    static public Parent getLayout() {
        double tasaPulgada = 0.0254;
        double tasaPie = 0.3048;
        double tasaMilla = 1609.34;
        double tasaYarda = 0.9144;
        double tasaKilometro = 1000;
        ArrayList<String[]> datos = new ArrayList<>();

        datos.add(new String[]{"De Metros a Pulgadas", "pulgadas", String.valueOf(1 /tasaPulgada)});
        datos.add(new String[]{"De Pulgadas a Metros", "metros", String.valueOf(tasaPulgada)});

        datos.add(new String[]{"De Metros a Pies", "pies", String.valueOf(1 / tasaPie)});
        datos.add(new String[]{"De Pies a Metros", "metros", String.valueOf(tasaPie)});

        datos.add(new String[]{"De Metros a Millas", "millas", String.valueOf(1 / tasaMilla)});
        datos.add(new String[]{"De Millas a Metros", "metros", String.valueOf(tasaMilla)});

        datos.add(new String[]{"De Metros a Yardas", "yardas", String.valueOf(1 / tasaYarda)});
        datos.add(new String[]{"De Yardas a Metros", "metros", String.valueOf(tasaYarda)});

        datos.add(new String[]{"De Metros a Kilometros", "kilometros", String.valueOf(1 / tasaKilometro)});
        datos.add(new String[]{"De Kilometros a Metros", "metros", String.valueOf(tasaKilometro)});
        
        Conversor conversorLongitud=new Conversor(datos);
        return conversorLongitud.getLayout();
    }

}
