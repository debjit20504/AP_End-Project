package com.example.snake_and_ladder;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Game_Grid_Controller {

    public Pane grid = new Pane();
    static class Tile extends Rectangle {

        public static final double tileSize = 80;
        public static final double gridWidth = 10;
        public static final double gridHeight = 10;

        public Tile(int x, int y) {
            setWidth(tileSize);
            setHeight(tileSize);
            setFill(Color.LAVENDER);
            setStroke(Color.BLACK);
        }
    }

    public Pane createGrid() {

//       grid.setPrefHeight(Tile.gridHeight);
//       grid.setPrefWidth(Tile.gridWidth);
//       grid.setPrefSize(Tile.tileSize*10,Tile.tileSize*10);

        for (int i = 0; i < Tile.gridHeight; i++) {
            for (int j = 0; j < Tile.gridWidth; j++) {
                Tile tile = new Tile((int) (Tile.tileSize), (int) (Tile.tileSize));
                tile.setTranslateX(j * Tile.tileSize);
                tile.setTranslateY(i * Tile.tileSize);
                grid.getChildren().add(tile);
            }
        }

        return grid;
    }

}
