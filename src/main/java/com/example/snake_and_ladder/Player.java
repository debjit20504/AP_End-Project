package com.example.snake_and_ladder;

import game.logic.Position;
import static game.test.SnakesAndLadders.forClosing;
import static game.test.SnakesAndLadders.menu;
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

puclic class Player implements Initializable
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

    @FXML
    private void handleMenuButton(ActionEvent event) throws Exception
    {
        forClosing.close();
        menu.start(new Stage());
    }

    @FXML
    private void handleRestartButton(ActionEvent event)
    {
        reset();
    }

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

    private void reset()
    {
        whatNo.setImage(new Image(file:ImagesAndVideos/gme_icon_4.jpeg)))
        bluecurrentPos = 1;
        redcurrentPos = 1;
        Platform.runLater(() ->{
            bluePos.setText("00");
            resPos.setText("00");
        });
        bluePawnButton.setDisable(false);
        redPawnButton.setDisable(true);
        restart.setDisable(false);
        blue.setVisible(false);
        red.setVisible(false);
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
                		blue.setLayoutX(loc.[25].getX());
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
                	}
                }
            }
        }
    }






}
