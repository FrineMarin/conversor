//Menu inicio de la aplicacion escalable, funciona igual a el primer menu que teniamos
package com.mycompany.aplicacionconversores;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Friné
 */
public class menuInicio {

    static public Parent getLayout() {

        IntegerProperty conversor = new SimpleIntegerProperty(-1);

        //create elements
        Label texto = new Label("Seleccione una opcion de conversion");
        ChoiceBox seleccion = new ChoiceBox(FXCollections.observableArrayList("Conversor de moneda", "Conversor de unidades de longitud"));
        Button continuar = new Button("Continuar");
        Alert enDesarrollo = new Alert(Alert.AlertType.ERROR, "En desarrollo :)");
        Alert noSeleccionado = new Alert(Alert.AlertType.ERROR, "Por favor selecciona un conversor");

        //add elements
        GridPane inicio = new GridPane();
        inicio.add(texto, 5, 4);
        inicio.add(seleccion, 5, 5);
        inicio.add(continuar, 5, 6);

        //add style to the ui
        inicio.setHgap(10);
        inicio.setVgap(10);
        inicio.setPadding(new Insets(10, 10, 10, 10));

        //the choicebox selects which convertor we're gonna use
        seleccion.getSelectionModel().selectedIndexProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
            conversor.set((int) new_val);
        });

        //the button changes the view
        continuar.setOnAction((event) -> {
            switch (conversor.getValue()) {
                case -1:
                    noSeleccionado.show();
                    break;
                case 0:
                    continuar.getScene().setRoot(conversorMonedas.getLayout());

                    break;
                case 1:
                    continuar.getScene().setRoot(conversorLongitud.getLayout());
                    break;

            }
        });

        return inicio;
    }
}
