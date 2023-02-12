/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicacionconversores;

import java.util.ArrayList;
import java.util.Optional;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Friné
 */
public class Conversor {

    private ArrayList<String[]> datos;

    public Conversor(ArrayList datos) {
        this.datos = datos;
    }

    public Parent getLayout() {
        GridPane conversor = new GridPane();

        //La tasa que vamos a ocupar para la conversion
        DoubleProperty tasaConversion = new SimpleDoubleProperty(-1);
        StringProperty unidadResultado = new SimpleStringProperty("");

        //Elementos y layout
        Label elige = new Label("Elije las unidades que deseas convertir");

        ChoiceBox seleccion = new ChoiceBox();
        for (String[] unidades : datos) {
            seleccion.getItems().add(unidades[0]);
        }

        Separator separator = new Separator();
        Label ingresa = new Label("Ingresa la cantidad que deseas convertir:");
        TextField input = new TextField();
        Button convertir = new Button("Convertir");
        Alert vacio = new Alert(Alert.AlertType.ERROR, "Ingresa un valor");
        Alert seleccionVacia = new Alert(Alert.AlertType.ERROR, "Por favor selecciona las unidades que deseas convertir");
        Alert noValido = new Alert(Alert.AlertType.ERROR, "El valor ingresado no es valido");
        Alert mostrarResultado = new Alert(Alert.AlertType.NONE, "", ButtonType.OK);
        mostrarResultado.setTitle("Resultado");
        Alert deseaContinuar = new Alert(Alert.AlertType.CONFIRMATION, "Desea Continuar?", ButtonType.OK, ButtonType.FINISH, ButtonType.CANCEL);

        conversor.add(elige, 1, 1);
        conversor.add(seleccion, 1, 2);
        conversor.add(separator, 1, 3);
        conversor.add(ingresa, 1, 4);
        conversor.add(input, 1, 5);
        conversor.add(convertir, 1, 6);

        conversor.setHgap(10);
        conversor.setVgap(10);
        conversor.setPadding(new Insets(10, 10, 10, 10));

        seleccion.getSelectionModel().selectedIndexProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {

            if (-1 != (int) new_val) {
                unidadResultado.set(datos.get((int) new_val)[1]);
                tasaConversion.set(Double.valueOf(datos.get((int) new_val)[2]));
            }
        });
        //Cuando hagamos click en el boton manda a llamar la funcion que realiza la operacion
        //Y muestra el resultado
        //Recibe como parametros la moneda a la que vamos a convertir y la tasa de convercion
        convertir.setOnAction((event) -> {
            if ((double) tasaConversion.getValue() != -1) {
                if ((input.getText() != null && !input.getText().isEmpty())) {
                    if (isNumeric(input.getText())) {
                        double resultado = Double.valueOf(input.getText()) * (double) tasaConversion.getValue();
                        mostrarResultado.setContentText("Tienes " + resultado + " " + unidadResultado.getValue());

                        Optional<ButtonType> boton = mostrarResultado.showAndWait();
                        if (boton.get() == ButtonType.OK) {
                            Optional<ButtonType> continuar = deseaContinuar.showAndWait();
                            if (continuar.get() == ButtonType.OK) {
                                convertir.getScene().setRoot(menuInicio.getLayout());
                            } else if (continuar.get() == ButtonType.FINISH) {
                                Stage stage = (Stage) convertir.getScene().getWindow();
                                stage.close();
                            }
                        }
                    } else {
                        noValido.show();
                    }

                } else {
                    System.out.println("El input esta vacio");
                    vacio.show();
                }
            } else {
                seleccionVacia.show();
            }

        });

        return conversor;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
