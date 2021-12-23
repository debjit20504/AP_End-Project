package com.example.snake_and_ladder;

//import game.logic.Position;
//import static Snake_AND_Ladders.forClosing;
//import static Snake_AND_Ladders.menu;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Player implements Initializable
{
    @FXML
    private ImageView blue, red, whatNo, gif;
    @FXML
    private TextField bluePos, redPos;
    @FXML
    private Button exit, restart, bluePawnButton, redPawnButton;
    @FXML
    private Hyperlink gotomenu;

    private SecureRandom rand;
    private int dice;
    private int bluecurrentPos = 1;
    private int redcurrentPos = 1;
    private int blueprev;
    private int redprev;

//    @FXML
//    private void handleMenuButton(ActionEvent event) throws Exception
//    {
//        forClosing.close();
//        menu.start(new Stage());
//    }

    private void msg(final String str)
    {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            Stage box = (Stage) alert.getDialogPane().getScene().getWindow();
            box.getIcons().add(new Image("file:ImagesAndVideos/gme_icon_4.jpeg"));
            ImageView icon = new ImageView(new Image("file:ImagesAndVideos/gme_icon_4.jpeg"));
            icon.setFitWidth(200);
            icon.setFitHeight(100);
            alert.setGraphic(icon);
            alert.setHeaderText("CONGRADULATIONS");
            alert.setContentText(str);
            alert.showAndWait();
        });
    }

    private void changeBluePos()
    {
        Platform.runLater(() ->{
            bluePos.setText(String.valueOf(bluecurrentPos));
        });
    }

    private void changeRedPos()
    {
        Platform.runLater(() ->{
            redPos.setText(String.valueOf(redcurrentPos));
        });
    }

    @FXML
    private void handleBluePawnButton()
    {
        new Thread()
        {
            public void run()
            {
                bluePawnButton.setDisable(true);
                restart.setDisable(true);
                dice = 1 + rand.nextInt(6);
                gif.setVisible(true);
                try{
                    Thread.sleep(500);
                }
                catch (InterruptedException ex){

                }
                gif.setVisible(false);
                whatNo.setImage(new Image("file:ImagesAndVideos/gme_icon_4.jpeg" + dice + ".png"));

                if (blue.isVisible())
                {
                    blueprev = bluecurrentPos;
                    bluecurrentPos += dice;

                    if (bluecurrentPos > 100){
                        bluecurrentPos = blueprev;
                        redPawnButton.setDisable(false);
                        return;
                    }
                    switch (bluecurrentPos)
                    {
                        case 4:
                            for(int i = blueprev; i <= bluecurrentPos; i++)
                            {
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[25].getX());
                            blue.setLayoutY(loc[25].getY());
                            bluecurrentPos = 25;
                            changeBluePos();
                            break;

                        case 8:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[31].getX());
                            blue.setLayoutY(loc[31].getY());
                            bluecurrentPos = 31;
                            changeBluePos();
                            break;

                        case 21:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[60].getX());
                            blue.setLayoutY(loc[60].getY());
                            bluecurrentPos = 60;
                            changeBluePos();
                            break;

                        case 28:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[46].getX());
                            blue.setLayoutY(loc[46].getY());
                            bluecurrentPos = 46;
                            changeBluePos();
                            break;

                        case 32:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[48].getX());
                            blue.setLayoutY(loc[48].getY());
                            bluecurrentPos = 48;
                            changeBluePos();
                            break;

                        case 42:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[80].getX());
                            blue.setLayoutY(loc[80].getY());
                            bluecurrentPos = 80;
                            changeBluePos();
                            break;

                        case 52:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[68].getX());
                            blue.setLayoutY(loc[68].getY());
                            bluecurrentPos = 68;
                            changeBluePos();
                            break;

                        case 69:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[93].getX());
                            blue.setLayoutY(loc[93].getY());
                            bluecurrentPos = 93;
                            changeBluePos();
                            break;

                        case 84:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[98].getX());
                            blue.setLayoutY(loc[98].getY());
                            bluecurrentPos = 98;
                            changeBluePos();
                            break;

                        case 11:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[9].getX());
                            blue.setLayoutY(loc[9].getY());
                            bluecurrentPos = 9;
                            changeBluePos();
                            break;

                        case 36:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[14].getX());
                            blue.setLayoutY(loc[14].getY());
                            bluecurrentPos = 14;
                            changeBluePos();
                            break;

                        case 43:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[22].getX());
                            blue.setLayoutY(loc[22].getY());
                            bluecurrentPos = 22;
                            changeBluePos();
                            break;

                        case 56:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[18].getX());
                            blue.setLayoutY(loc[18].getY());
                            bluecurrentPos = 18;
                            changeBluePos();
                            break;

                        case 75:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[54].getX());
                            blue.setLayoutY(loc[54].getY());
                            bluecurrentPos = 54;
                            changeBluePos();
                            break;

                        case 81:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[63].getX());
                            blue.setLayoutY(loc[63].getY());
                            bluecurrentPos = 63;
                            changeBluePos();
                            break;

                        case 90:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[50].getX());
                            blue.setLayoutY(loc[50].getY());
                            bluecurrentPos = 50;
                            changeBluePos();
                            break;

                        case 94:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[53].getX());
                            blue.setLayoutY(loc[53].getY());
                            bluecurrentPos = 53;
                            changeBluePos();
                            break;

                        case 96:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[65].getX());
                            blue.setLayoutY(loc[65].getY());
                            bluecurrentPos = 65;
                            changeBluePos();
                            break;

                        case 99:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            blue.setLayoutX(loc[78].getX());
                            blue.setLayoutY(loc[78].getY());
                            bluecurrentPos = 78;
                            changeBluePos();
                            break;
                        default:
                            for(int i = blueprev; i <= bluecurrentPos; i++){
                                blue.setLayoutX(loc[i].getX());
                                blue.setLayoutY(loc[i].getY());
                                changeBluePos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            break;
                    }
                    if(bluecurrentPos == 100){
                        msg("PLAYER 1 WON THE GAME");
                        return;
                    }
                }
                if(blue.isVisible() == false && dice == 6){
                    blue.setLayoutX(loc[i].getX());
                    blue.setLayoutY(loc[i].getY());
                    changeBluePos();
                    blue.setVisible(true);
                }
                redPawnButton.setDisable(false);
                restart.setDisable(false);
                bluePawnButton.requestFocus();
            }
        }.start();
    }

    @FXML
    private void handleRedPawnButton(){
        new Thread(){
            public void run(){
                redPawnButton.setDisable(true);
                restart.setDisable(true);
                dice = 1 + rand.nextInt(6);
                gif.setVisible(true);
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException ex){

                }
                gif.setVisible(false);
                whatNo.setImage(new Image("file:ImagesAndVideos/gme_icon_4.jpeg" + dice + ".png"));

                if(red.isVisible()){
                    redprev = redcurrentPos;
                    redcurrentPos += dice;

                    if(redcurrentPos > 100){
                        redcurrentPos = redprev;
                        bluePawnButton.setDisable(false);
                        return;
                    }
                    switch(redcurrentPos){
                        case 4:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[25].getX());
                            red.setLayoutY(loc[25].getY());
                            redcurrentPos = 25;
                            changeRedPos();
                            break;
                        case 8:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[31].getX());
                            red.setLayoutY(loc[31].getY());
                            redcurrentPos = 31;
                            changeRedPos();
                            break;
                        case 21:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[60].getX());
                            red.setLayoutY(loc[60].getY());
                            redcurrentPos = 60;
                            changeRedPos();
                            break;
                        case 28:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[46].getX());
                            red.setLayoutY(loc[46].getY());
                            redcurrentPos = 46;
                            changeRedPos();
                            break;
                        case 32:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[48].getX());
                            red.setLayoutY(loc[48].getY());
                            redcurrentPos = 48;
                            changeRedPos();
                            break;
                        case 42:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[80].getX());
                            red.setLayoutY(loc[80].getY());
                            redcurrentPos = 80;
                            changeRedPos();
                            break;
                        case 52:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[68].getX());
                            red.setLayoutY(loc[68].getY());
                            redcurrentPos = 68;
                            changeRedPos();
                            break;
                        case 69:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[93].getX());
                            red.setLayoutY(loc[93].getY());
                            redcurrentPos = 93;
                            changeRedPos();
                            break;
                        case 84:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[98].getX());
                            red.setLayoutY(loc[98].getY());
                            redcurrentPos = 98;
                            changeRedPos();
                            break;
                        case 11:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[9].getX());
                            red.setLayoutY(loc[9].getY());
                            redcurrentPos = 9;
                            changeRedPos();
                            break;
                        case 36:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[14].getX());
                            red.setLayoutY(loc[14].getY());
                            redcurrentPos = 14;
                            changeRedPos();
                            break;
                        case 43:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[22].getX());
                            red.setLayoutY(loc[22].getY());
                            redcurrentPos = 22;
                            changeRedPos();
                            break;
                        case 56:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[18].getX());
                            red.setLayoutY(loc[18].getY());
                            redcurrentPos = 18;
                            changeRedPos();
                            break;
                        case 75:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[54].getX());
                            red.setLayoutY(loc[54].getY());
                            redcurrentPos = 54;
                            changeRedPos();
                            break;
                        case 81:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[63].getX());
                            red.setLayoutY(loc[63].getY());
                            redcurrentPos = 63;
                            changeRedPos();
                            break;
                        case 90:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[50].getX());
                            red.setLayoutY(loc[50].getY());
                            redcurrentPos = 50;
                            changeRedPos();
                            break;
                        case 94:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[53].getX());
                            red.setLayoutY(loc[53].getY());
                            redcurrentPos = 53;
                            changeRedPos();
                            break;
                        case 96:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[65].getX());
                            red.setLayoutY(loc[65].getY());
                            redcurrentPos = 65;
                            changeRedPos();
                            break;
                        case 99:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            red.setLayoutX(loc[78].getX());
                            red.setLayoutY(loc[78].getY());
                            redcurrentPos = 78;
                            changeRedPos();
                            break;
                        default:
                            for(int i = redprev; i <= redcurrentPos; i++){
                                red.setLayoutX(loc[i].getX());
                                red.setLayoutY(loc[i].getY());
                                changeRedPos();
                                try{
                                    Thread.sleep(200);
                                }
                                catch(InterruptedException ex){

                                }
                            }
                            break;
                    }
                    if(redcurrentPos == 100){
                        msg("PLAYER 2 WON THE GAME");
                        return;
                    }
                }
                if(red.isVisible() == false && dice == 6){
                    red.setLayoutX(loc[i].getX());
                    red.setLayoutY(loc[i].getY());
                    changeRedPos();
                    red.setVisible(true);
                }

                bluePawnButton.setDisable(false);
                restart.setDisable(false);
            }
        }.start();
    }

    @FXML
    private void handleKeyButton(KeyEvent evt){
        if(evt.getCode() == KeyCode.Z && !bluePawnButton.isDisable()){
            handleBluePawnButton();
        }
        else if(evt.getCode() == KeyCode.N && !redPawnButton.isDisable()){
            handleRedPawnButton();
        }
    }

    private Position[] loc = new Position[101];

    @Override
    public void initialize(URL url, ResourceBundle rb){
        double x = 25, y = 500;
        for(int i = 1; i < loc.length;i++){
            loc[i] = new Position();
            loc[i] = setX(x);
            loc[i] = setY(y);
            x += 53;
            if(i % 10 == 0){
                x = 20;
                y -= 53;
            }
        }
        rand = new SecureRandom();
        blue.setVisible(false);
        red.setVisible(false);
        gif.setVisible(false);
        redPawnButton.setDisable(true);
        bluePos.setTooltip(new Tooltip("Player 1 Position"));
        redPos.setTooltip(new Tooltip("Player 2 Position"));
        restart.setTooltip(new Tooltip("Restart the Game from Begin"));
        bluePawnButton.setTooltip(new Tooltip("Blue Pawn Player 1 can also use Z key"));
        redPawnButton.setTooltip(new Tooltip("Red Pawn Player 2 can also use N key"));
        gotomenu.setTooltip(new Tooltip("Go to Game Types"));
        exit.setTooltip(new Tooltip("Exit from Game"));
    }
}

