package application;
	

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
           
            MenuBar menuBar = new MenuBar();
            Menu menuArchivo = new Menu("Archivo");
            Menu menuEditar = new Menu("Editar");
            Menu menuAyuda = new Menu("Ayuda");

            // Elementos del menú Archivo
            MenuItem nuevoArchivo = new MenuItem("Nuevo");
            MenuItem abrirArchivo = new MenuItem("Abrir");
            MenuItem guardarArchivo = new MenuItem("Guardar");
            MenuItem salir = new MenuItem("Salir");

            // Añadir separador y elementos al menú Archivo
            menuArchivo.getItems().addAll(nuevoArchivo, abrirArchivo, guardarArchivo, new SeparatorMenuItem(), salir);

            //Menú Editar
            MenuItem cortar = new MenuItem("Cortar");
            MenuItem copiar = new MenuItem("Copiar");
            MenuItem pegar = new MenuItem("Pegar");

            menuEditar.getItems().addAll(cortar, copiar, pegar);

            // Menú Ayuda
            MenuItem acercaDe = new MenuItem("Acerca de");

            // Elemento al menú Ayuda
            menuAyuda.getItems().add(acercaDe);

            // Principales a la barra de menú
            menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

            //Acciones
            nuevoArchivo.setOnAction(e -> System.out.println("Nuevo archivo seleccionado. <<EXITOSO>>"));
            abrirArchivo.setOnAction(e -> System.out.println("Abrir archivo seleccionado <<EXITOSO>>"));
            guardarArchivo.setOnAction(e -> System.out.println("Guardar archivo seleccionado <<EXITOSO>>"));
            salir.setOnAction(e -> {
                System.out.println("Salir seleccionado");
                primaryStage.close();
            });
            cortar.setOnAction(e -> System.out.println("Cortar seleccionado <<EXITOSO>>"));
            copiar.setOnAction(e -> System.out.println("Copiar seleccionado <<EXITOSO>>"));
            pegar.setOnAction(e -> System.out.println("Pegar seleccionado <<EXITOSO>>"));
            acercaDe.setOnAction(e -> System.out.println("Acerca de .........."));

            // Crear el layout principal
            BorderPane root = new BorderPane();
            root.setTop(menuBar);

            // Crear la escena
            Scene scene = new Scene(root, 1200, 800);

            // Configurar y mostrar la escena principal
            primaryStage.setTitle("Menú");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
