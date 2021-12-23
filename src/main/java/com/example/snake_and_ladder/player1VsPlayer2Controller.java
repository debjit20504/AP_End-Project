//package com.example.snake_and_ladder;
//
//import javafx.application.Platform;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.*;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.input.KeyCode;
//import javafx.scene.input.KeyEvent;
//import javafx.stage.Stage;
//
//import java.net.URL;
//import java.security.SecureRandom;
//import java.util.ResourceBundle;
//
//public class player1VsPlayer2Controller implements Initializable {
//
//    @FXML
//    public ImageView blue;
//    @FXML
//    public ImageView red;
//    @FXML
//    public ImageView whatNo;
//    @FXML
//    public ImageView gif;
//
//    @FXML
//    public TextField bluePos;
//    @FXML
//    public TextField redPos;
//    @FXML
//    public Button exitFromGame;
//    @FXML
//    public Button restart;
//    @FXML
//    public Button bluePawnButton;
//    @FXML
//    public Button redPawnButton;
//
//  //  @FXML
// //   private Hyperlink gotomenu;
//
//    public SecureRandom rand;
//    public int dice;
//    public int blueCurrentPos = 1;
//    public int redCurrentPos = 1;
//    public int bluePrev;
//    public int redPrev;
//
////    @FXML
////    private void handleMenuButton(ActionEvent event) throws Exception
////    {
////        forClosing.close();
////        menu.start(new Stage());
////    }
//
//    private void msg(final String str)
//    {
//        Platform.runLater(() -> {
//            Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            Stage box = (Stage) alert.getDialogPane().getScene().getWindow();
//            box.getIcons().add(new Image("file:ImagesAndVideos/gme_icon_4.jpeg"));
//            ImageView icon = new ImageView(new Image("file:ImagesAndVideos/gme_icon_4.jpeg"));
//            icon.setFitWidth(200);
//            icon.setFitHeight(100);
//            alert.setGraphic(icon);
//            alert.setHeaderText("CONGRATULATIONS");
//            alert.setContentText(str);
//            alert.showAndWait();
//        });
//    }
//
//    private void changeBluePos()
//    {
//        Platform.runLater(() ->{
//            bluePos.setText(String.valueOf(blueCurrentPos));
//        });
//    }
//
//    private void changeRedPos()
//    {
//        Platform.runLater(() ->{
//            redPos.setText(String.valueOf(redCurrentPos));
//        });
//    }
//
//    @FXML
//    private void handleBluePawnButton()
//    {
//        new Thread(() -> {
//            bluePawnButton.setDisable(true);
//            restart.setDisable(true);
//            dice = 1 + rand.nextInt(6);
//            gif.setVisible(true);
//            try{
//                Thread.sleep(500);
//            }
//            catch (InterruptedException ex){
//
//            }
//            gif.setVisible(false);
//            whatNo.setImage(new Image("file:ImagesAndVideos/gme_icon_4.jpeg" + dice + ".png"));
//
//            if (blue.isVisible())
//            {
//                bluePrev = blueCurrentPos;
//                blueCurrentPos += dice;
//
//                if (blueCurrentPos > 100){
//                    blueCurrentPos = bluePrev;
//                    redPawnButton.setDisable(false);
//                    return;
//                }
//                switch (blueCurrentPos)
//                {
//                    case 4:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++)
//                        {
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[25].getX());
//                        blue.setLayoutY(loc[25].getY());
//                        blueCurrentPos = 25;
//                        changeBluePos();
//                        break;
//
//                    case 8:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[31].getX());
//                        blue.setLayoutY(loc[31].getY());
//                        blueCurrentPos = 31;
//                        changeBluePos();
//                        break;
//
//                    case 21:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[60].getX());
//                        blue.setLayoutY(loc[60].getY());
//                        blueCurrentPos = 60;
//                        changeBluePos();
//                        break;
//
//                    case 28:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[46].getX());
//                        blue.setLayoutY(loc[46].getY());
//                        blueCurrentPos = 46;
//                        changeBluePos();
//                        break;
//
//                    case 32:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[48].getX());
//                        blue.setLayoutY(loc[48].getY());
//                        blueCurrentPos = 48;
//                        changeBluePos();
//                        break;
//
//                    case 42:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[80].getX());
//                        blue.setLayoutY(loc[80].getY());
//                        blueCurrentPos = 80;
//                        changeBluePos();
//                        break;
//
//                    case 52:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[68].getX());
//                        blue.setLayoutY(loc[68].getY());
//                        blueCurrentPos = 68;
//                        changeBluePos();
//                        break;
//
//                    case 69:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[93].getX());
//                        blue.setLayoutY(loc[93].getY());
//                        blueCurrentPos = 93;
//                        changeBluePos();
//                        break;
//
//                    case 84:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[98].getX());
//                        blue.setLayoutY(loc[98].getY());
//                        blueCurrentPos = 98;
//                        changeBluePos();
//                        break;
//
//                    case 11:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[9].getX());
//                        blue.setLayoutY(loc[9].getY());
//                        blueCurrentPos = 9;
//                        changeBluePos();
//                        break;
//
//                    case 36:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[14].getX());
//                        blue.setLayoutY(loc[14].getY());
//                        blueCurrentPos = 14;
//                        changeBluePos();
//                        break;
//
//                    case 43:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[22].getX());
//                        blue.setLayoutY(loc[22].getY());
//                        blueCurrentPos = 22;
//                        changeBluePos();
//                        break;
//
//                    case 56:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[18].getX());
//                        blue.setLayoutY(loc[18].getY());
//                        blueCurrentPos = 18;
//                        changeBluePos();
//                        break;
//
//                    case 75:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[54].getX());
//                        blue.setLayoutY(loc[54].getY());
//                        blueCurrentPos = 54;
//                        changeBluePos();
//                        break;
//
//                    case 81:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[63].getX());
//                        blue.setLayoutY(loc[63].getY());
//                        blueCurrentPos = 63;
//                        changeBluePos();
//                        break;
//
//                    case 90:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[50].getX());
//                        blue.setLayoutY(loc[50].getY());
//                        blueCurrentPos = 50;
//                        changeBluePos();
//                        break;
//
//                    case 94:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[53].getX());
//                        blue.setLayoutY(loc[53].getY());
//                        blueCurrentPos = 53;
//                        changeBluePos();
//                        break;
//
//                    case 96:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[65].getX());
//                        blue.setLayoutY(loc[65].getY());
//                        blueCurrentPos = 65;
//                        changeBluePos();
//                        break;
//
//                    case 99:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        blue.setLayoutX(loc[78].getX());
//                        blue.setLayoutY(loc[78].getY());
//                        blueCurrentPos = 78;
//                        changeBluePos();
//                        break;
//                    default:
//                        for(int i = bluePrev; i <= blueCurrentPos; i++){
//                            blue.setLayoutX(loc[i].getX());
//                            blue.setLayoutY(loc[i].getY());
//                            changeBluePos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        break;
//                }
//                if(blueCurrentPos == 100){
//                    msg("PLAYER 1 WON THE GAME");
//                    return;
//                }
//            }
//            if(blue.isVisible() == false && dice == 6){
//                blue.setLayoutX(loc[i].getX());
//                blue.setLayoutY(loc[i].getY());
//                changeBluePos();
//                blue.setVisible(true);
//            }
//            redPawnButton.setDisable(false);
//            restart.setDisable(false);
//            bluePawnButton.requestFocus();
//        }).start();
//    }
//
//    @FXML
//    private void handleRedPawnButton(){
//        new Thread(() -> {
//            redPawnButton.setDisable(true);
//            restart.setDisable(true);
//            dice = 1 + rand.nextInt(6);
//            gif.setVisible(true);
//            try{
//                Thread.sleep(500);
//            }
//            catch(InterruptedException ex){
//
//            }
//            gif.setVisible(false);
//            whatNo.setImage(new Image("file:ImagesAndVideos/gme_icon_4.jpeg" + dice + ".png"));
//
//            if(red.isVisible()){
//                redPrev = redCurrentPos;
//                redCurrentPos += dice;
//
//                if(redCurrentPos > 100){
//                    redCurrentPos = redPrev;
//                    bluePawnButton.setDisable(false);
//                    return;
//                }
//                switch(redCurrentPos){
//                    case 4:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[25].getX());
//                        red.setLayoutY(loc[25].getY());
//                        redCurrentPos = 25;
//                        changeRedPos();
//                        break;
//                    case 8:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[31].getX());
//                        red.setLayoutY(loc[31].getY());
//                        redCurrentPos = 31;
//                        changeRedPos();
//                        break;
//                    case 21:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[60].getX());
//                        red.setLayoutY(loc[60].getY());
//                        redCurrentPos = 60;
//                        changeRedPos();
//                        break;
//                    case 28:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[46].getX());
//                        red.setLayoutY(loc[46].getY());
//                        redCurrentPos = 46;
//                        changeRedPos();
//                        break;
//                    case 32:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[48].getX());
//                        red.setLayoutY(loc[48].getY());
//                        redCurrentPos = 48;
//                        changeRedPos();
//                        break;
//                    case 42:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[80].getX());
//                        red.setLayoutY(loc[80].getY());
//                        redCurrentPos = 80;
//                        changeRedPos();
//                        break;
//                    case 52:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[68].getX());
//                        red.setLayoutY(loc[68].getY());
//                        redCurrentPos = 68;
//                        changeRedPos();
//                        break;
//                    case 69:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[93].getX());
//                        red.setLayoutY(loc[93].getY());
//                        redCurrentPos = 93;
//                        changeRedPos();
//                        break;
//                    case 84:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[98].getX());
//                        red.setLayoutY(loc[98].getY());
//                        redCurrentPos = 98;
//                        changeRedPos();
//                        break;
//                    case 11:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[9].getX());
//                        red.setLayoutY(loc[9].getY());
//                        redCurrentPos = 9;
//                        changeRedPos();
//                        break;
//                    case 36:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[14].getX());
//                        red.setLayoutY(loc[14].getY());
//                        redCurrentPos = 14;
//                        changeRedPos();
//                        break;
//                    case 43:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[22].getX());
//                        red.setLayoutY(loc[22].getY());
//                        redCurrentPos = 22;
//                        changeRedPos();
//                        break;
//                    case 56:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[18].getX());
//                        red.setLayoutY(loc[18].getY());
//                        redCurrentPos = 18;
//                        changeRedPos();
//                        break;
//                    case 75:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[54].getX());
//                        red.setLayoutY(loc[54].getY());
//                        redCurrentPos = 54;
//                        changeRedPos();
//                        break;
//                    case 81:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[63].getX());
//                        red.setLayoutY(loc[63].getY());
//                        redCurrentPos = 63;
//                        changeRedPos();
//                        break;
//                    case 90:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[50].getX());
//                        red.setLayoutY(loc[50].getY());
//                        redCurrentPos = 50;
//                        changeRedPos();
//                        break;
//                    case 94:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[53].getX());
//                        red.setLayoutY(loc[53].getY());
//                        redCurrentPos = 53;
//                        changeRedPos();
//                        break;
//                    case 96:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[65].getX());
//                        red.setLayoutY(loc[65].getY());
//                        redCurrentPos = 65;
//                        changeRedPos();
//                        break;
//                    case 99:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        red.setLayoutX(loc[78].getX());
//                        red.setLayoutY(loc[78].getY());
//                        redCurrentPos = 78;
//                        changeRedPos();
//                        break;
//                    default:
//                        for(int i = redPrev; i <= redCurrentPos; i++){
//                            red.setLayoutX(loc[i].getX());
//                            red.setLayoutY(loc[i].getY());
//                            changeRedPos();
//                            try{
//                                Thread.sleep(200);
//                            }
//                            catch(InterruptedException ex){
//
//                            }
//                        }
//                        break;
//                }
//                if(redCurrentPos == 100){
//                    msg("PLAYER 2 WON THE GAME");
//                    return;
//                }
//            }
//            if(red.isVisible() == false && dice == 6){
//                red.setLayoutX(loc[i].getX());
//                red.setLayoutY(loc[i].getY());
//                changeRedPos();
//                red.setVisible(true);
//            }
//
//            bluePawnButton.setDisable(false);
//            restart.setDisable(false);
//        }).start();
//    }
//
//    @FXML
//    private void handleKeyButton(KeyEvent evt){
//        if(evt.getCode() == KeyCode.Z && !bluePawnButton.isDisable()){
//            handleBluePawnButton();
//        }
//        else if(evt.getCode() == KeyCode.N && !redPawnButton.isDisable()){
//            handleRedPawnButton();
//        }
//    }
//
//    public Position[] loc = new Position[101];
//
//    @Override
//    public void initialize(URL url, ResourceBundle rb){
//        double x = 25, y = 500;
//        for(int i = 1; i < loc.length;i++){
//            loc[i] = new Position();
//            loc[i] = setX(x);
//            loc[i] = setY(y);
//            x += 53;
//            if(i % 10 == 0){
//                x = 20;
//                y -= 53;
//            }
//        }
//        rand = new SecureRandom();
//        blue.setVisible(false);
//        red.setVisible(false);
//        gif.setVisible(false);
//        redPawnButton.setDisable(true);
//        bluePos.setTooltip(new Tooltip("Player 1 Position"));
//        redPos.setTooltip(new Tooltip("Player 2 Position"));
//        restart.setTooltip(new Tooltip("Restart the Game from Begin"));
//        bluePawnButton.setTooltip(new Tooltip("Blue Pawn Player 1 can also use Z key"));
//        redPawnButton.setTooltip(new Tooltip("Red Pawn Player 2 can also use N key"));
//       // .setTooltip(new Tooltip("Go to Game Types"));
//        exitFromGame.setTooltip(new Tooltip("Exit from Game"));
//    }
//}
//
//
//
