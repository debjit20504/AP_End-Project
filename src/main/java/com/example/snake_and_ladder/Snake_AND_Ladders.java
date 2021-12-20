package com.example.snake_and_ladder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Snake_AND_Ladders extends Application {

    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Game_Controller.fxml")));


        Game_Grid_Controller grid=new Game_Grid_Controller();
        Scene scene = new Scene(grid.createGrid(),801.0,970.0);
        stage.setMaxWidth(815.0);
        stage.setMaxHeight(980.0);
        Image gameIcon =new Image("file:Images/gme_icon_4.jpeg");     // SOURCE : Google Images

        ImageView GAME_BOARD_IMAGE =new ImageView(new Image("file:Images/Game_Board_2.png"));

        GAME_BOARD_IMAGE.setFitHeight(836.0);
        GAME_BOARD_IMAGE.setFitWidth(801.0);
        grid.createGrid().getChildren().add(GAME_BOARD_IMAGE);

        stage.getIcons().add(gameIcon);
        stage.setTitle(" Snakes And Ladders ");
       // stage.getStyle();

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}