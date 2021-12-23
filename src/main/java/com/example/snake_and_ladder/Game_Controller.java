package com.example.snake_and_ladder;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.example.snake_and_ladder.InstructionMediaController.mediaPlayer;

public class Game_Controller implements Initializable {

    /////////////////////////////////////////////////////
    @FXML
    public Button vsComputer;
    @FXML
    public Button player1VsPlayer2;
    @FXML
    public Button onlineMultiplayer;
    @FXML
    public Button playWithFriend;
    @FXML
    public Button coinSlot;
    @FXML
    public Button medal;
    @FXML
    public Button playLudo;
    @FXML
    public Button people;
    @FXML
    public Button freeCoins;
    @FXML
    public Button lucky7;
    @FXML
    public Button trim;
    @FXML
    public Button stuff;
    @FXML
    public Button exit;



    static  public  Scene scene;
    static String css;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        css = new File("src/NotAvailable.css").toURI().toString();


        EventHandler<ActionEvent> ButtonTrim = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToTrim();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };
        EventHandler<ActionEvent> ButtonPlayWithFriend = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToPlayWithFriend();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };

        EventHandler<ActionEvent> ButtonOnlineMultiplayer = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToOnlineMultiplayer();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };

        EventHandler<ActionEvent> ButtonPlayer1VsPlayer2 = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToLocalMultiplayer();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };
        EventHandler<ActionEvent> ButtonPeople = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToPeople();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };
        EventHandler<ActionEvent> ButtonCoinSlot = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToCoinSlot();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };
        EventHandler<ActionEvent> ButtonExit= new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                goToGameExit();
            }

        };
        EventHandler<ActionEvent> ButtonLucky7 = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToLucky7();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };
        EventHandler<ActionEvent> ButtonPlayLudo = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToPlayLudo();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };
        EventHandler<ActionEvent> ButtonFreeCoins = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToFreeCoins();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };
        EventHandler<ActionEvent> ButtonVsComputer = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToVsComputer();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };
        EventHandler<ActionEvent> ButtonMedal = new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToMedal();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };
        EventHandler<ActionEvent> ButtonStuff= new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                try {
                    goToStuff();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        };

        stuff.setOnAction(ButtonStuff);
        trim.setOnAction(ButtonTrim);
        onlineMultiplayer.setOnAction(ButtonOnlineMultiplayer);
        player1VsPlayer2.setOnAction(ButtonPlayer1VsPlayer2);
        exit.setOnAction(ButtonExit);
        lucky7.setOnAction(ButtonLucky7);
        freeCoins.setOnAction(ButtonFreeCoins);
        people.setOnAction(ButtonPeople);
        playLudo.setOnAction(ButtonPlayLudo);
        medal.setOnAction(ButtonMedal);
        coinSlot.setOnAction(ButtonCoinSlot);
        vsComputer.setOnAction(ButtonVsComputer);
        playWithFriend.setOnAction(ButtonPlayWithFriend);

    }


    public static void menuScreen () throws IOException , NullPointerException{

        mediaPlayer.stop();
       // setButtonsEffect();
        Pane root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("menuScreen.fxml")));
        Scene scene = new Scene(root,768.0, 890.0);
        //790.0, 890.0
       // stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      //  Image coinSlotImg= new Image("file:ImagesAndVideos/coinSlots.png");
        //coinSlot=new Button();
      //  coinSlot.setGraphic(new ImageView(coinSlotImg));
       // coinSlot.autosize();
        //coinSlot.set
      //  root.getChildren().addAll(coinSlot);
        Snake_AND_Ladders.stage.setMaxWidth(800.0);
        Snake_AND_Ladders.stage.setMaxHeight(910.0);
        Snake_AND_Ladders.stage.setX(600);
        Snake_AND_Ladders.stage.setY(20);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();

    }


   public  static void goBackToMenu () throws IOException {
         menuScreen ();
   }

    public  void goToTrim() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("trim.fxml")));
        Scene scene = new Scene(root);
      //  Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders. stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToVsComputer() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("vsComputer.fxml")));
        Scene scene = new Scene(root);
       // stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public static void goToStuff() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("stuff.fxml")));
        Scene scene = new Scene(root);
      //  Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();

    }

    public  void goToLocalMultiplayer() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("player1VsPlayer2.fxml")));
        Game_Grid grid = new Game_Grid();
        Scene scene = new Scene(grid.createGrid(), 801.0, 970.0);


        ImageView GAME_BOARD_IMAGE = new ImageView(new Image("file:ImagesAndVideos/Game_Board_2.png"));
        GAME_BOARD_IMAGE.setFitHeight(836.0);
        GAME_BOARD_IMAGE.setFitWidth(801.0);
        grid.createGrid().getChildren().add(GAME_BOARD_IMAGE);

      //  Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setMaxWidth(815.0);
        Snake_AND_Ladders.stage.setMaxHeight(980.0);
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(20);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToOnlineMultiplayer() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("onlineMultiplayer.fxml")));
        Scene scene = new Scene(root);
       // Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToPlayWithFriend() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("playWithFriend.fxml")));
        Scene scene = new Scene(root);
     //   Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToLucky7() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("lucky7.fxml")));
        Scene scene = new Scene(root);
      //  Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToCoinSlot() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("coinSlot.fxml")));
        Scene scene = new Scene(root);
       // Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToMedal() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("medal.fxml")));
        Scene scene = new Scene(root);
      //  Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToPlayLudo() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("playLudo.fxml")));
        Scene scene = new Scene(root);
       // Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();

    }

    public  void goToPeople() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("people.fxml")));
        Scene scene = new Scene(root);
       //Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public  void goToFreeCoins() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(Game_Controller.class.getResource("freeCoins.fxml")));
        Scene scene = new Scene(root);
      //  Snake_AND_Ladders.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Snake_AND_Ladders.stage.setX(450);
        Snake_AND_Ladders.stage.setY(200);
        scene.getStylesheets().add(css);
        Snake_AND_Ladders.stage.setScene(scene);
        Snake_AND_Ladders.stage.show();
    }

    public void goToGameExit()  {
        System.exit(0);
    }

}
