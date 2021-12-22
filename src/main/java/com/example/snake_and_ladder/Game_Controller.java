package com.example.snake_and_ladder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Game_Controller implements Initializable {

    /////////////////////////////////////////////////////
    @FXML
    private Button vsComputer;
    @FXML
    private Button player1VsPlayer2;
    @FXML
    private Button onlineMultiplayer;
    @FXML
    private Button playWithFriend;
    @FXML
    private Button coinSlot;
    @FXML
    private Button medal;
    @FXML
    private Button playLudo;
    @FXML
    private Button people;
    @FXML
    private Button freeCoins;
    @FXML
    private Button lucky7;
    @FXML
    private Button trim;
    @FXML
    private Button stuff;
    @FXML
    private Button exit;

    @FXML
    public Button goBackToMenuFromCoinSlot;
    @FXML
    public Button goBackToMenuFromFreeCoins;
    @FXML
    public Button goBackToMenuFromLocalMultiplayer;
    @FXML
    public Button goBackToMenuFromLucky7;
    @FXML
    public Button goBackToMenuFromMedal;
    @FXML
    public Button goBackToMenuFromOnlineMultiplayer;
    @FXML
    public Button goBackToMenuFromPeople;
    @FXML
    public Button goBackToMenuFromPlayLudo;
    @FXML
    public Button goBackToMenuFromPlayWithFriend;
    @FXML
    public Button goBackToMenuFromStuff;
    @FXML
    public Button goBackToMenuFromTrim;
    @FXML
    public Button goBackToMenuFromVsComputer;

    ////////////////////////////////////////////////////
    @FXML
    static MediaView mediaView;
    ////////////////////////////////////////////////////

    static  MediaPlayer mediaPlayer;
    static  Stage stage;
    public  Scene scene;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//            FXMLLoader fxmlLoader= new  FXMLLoader((Game_Controller.class.getResource("menuScreen.fxml")));
//        try {
//            fxmlLoader.load();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

   public void instructionsPlay() {
       File file= new File("src/yt1s.com - Snakes and Ladders Board Game Rules  Instructions" +
               "  Learn How To Play Snake and Ladder Game_1080p.mp4");
       //setting media path that is providing media source name
       Media media=new Media(file.toURI().toString());
       // providing media player media that is to be played
       mediaPlayer=new MediaPlayer(media);
       // providing mediaView to media player that we want to view otherwise we only hear audio
       mediaView=new MediaView();
       mediaView.setMediaPlayer(mediaPlayer);
     //  mediaPlayer.setVolume(0);
       mediaPlayer.play();
    }

    public void setButtonsEffect(){

        Image coinSlotImg= new Image("file:ImagesAndVideos/coinSlots.png");
      //  Button button5 = new Button();
      //  button5.setGraphic(new ImageView(imageDecline));
        coinSlot=new Button();
        coinSlot.setGraphic(new ImageView(coinSlotImg));
    }
    public  void menuScreen (ActionEvent event) throws IOException , NullPointerException{

        mediaPlayer.stop();
        setButtonsEffect();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("menuScreen.fxml")));
        Scene scene = new Scene(root, 790.0, 890.0);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setMaxWidth(800.0);
        stage.setMaxHeight(910.0);
        stage.setX(600);
        stage.setY(20);
        stage.setScene(scene);
        stage.show();
    }

    public  void goBackToMenu (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("menuScreen.fxml")));
        Scene scene = new Scene(root,790,890);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setMaxWidth(800.0);
        stage.setMaxHeight(910.0);
        stage.setX(600);
        stage.setY(20);

        stage.setScene(scene);
        stage.show();
    }

    public  void goToTrim(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("trim.fxml")));

        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(450);
        stage.setY(200);
        stage.setScene(scene);
        stage.show();
    }

    public  void goToVsComputer(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("vsComputer.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(450);
        stage.setY(200);
        stage.setScene(scene);
        stage.show();
    }

    public  void goToStuff (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("stuff.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(450);
        stage.setY(200);
        stage.setScene(scene);
        stage.show();
    }

    public  void goToLocalMultiplayer (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Game_Controller.fxml")));
        Game_Grid grid = new Game_Grid();
        Scene scene = new Scene(grid.createGrid(), 801.0, 970.0);


        ImageView GAME_BOARD_IMAGE = new ImageView(new Image("file:ImagesAndVideos/Game_Board_2.png"));
        GAME_BOARD_IMAGE.setFitHeight(836.0);
        GAME_BOARD_IMAGE.setFitWidth(801.0);
        grid.createGrid().getChildren().add(GAME_BOARD_IMAGE);

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setMaxWidth(815.0);
        stage.setMaxHeight(980.0);
        stage.setX(450);
        stage.setY(20);
        stage.setScene(scene);
        stage.show();
    }

    public  void goToOnlineMultiplayer(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("onlineMultiplayer.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(450);
        stage.setY(200);
        stage.setScene(scene);
        stage.show();
    }

    public  void goToPlayWithFriend(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("playWithFriend.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(450);
        stage.setY(200);
        stage.setScene(scene);
        stage.show();
    }

    public  void goToLucky7 (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("lucky7.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(450);
        stage.setY(200);
        stage.setScene(scene);
        stage.show();
    }

    public  void goToCoinSlot (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("coinSlot.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(450);
        stage.setY(200);
        stage.setScene(scene);
        stage.show();
    }

    public  void goToMedal (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("medal.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(450);
        stage.setY(200);
        stage.setScene(scene);
        stage.show();
    }

    public  void goToPlayLudo(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("playLudo.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(450);
        stage.setY(200);
        stage.setScene(scene);
        stage.show();

    }

    public  void goToPeople(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("people.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(450);
        stage.setY(200);
        stage.setScene(scene);
        stage.show();
    }

    public  void goToFreeCoins (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("freeCoins.fxml")));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(450);
        stage.setY(200);
        stage.setScene(scene);
        stage.show();
    }

    public void goToGameExit(ActionEvent event) throws IOException {
        System.exit(0);
    }

}
