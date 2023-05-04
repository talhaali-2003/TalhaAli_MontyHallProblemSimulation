package com.example.talhaali_montyhallproblem;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class MainStage extends Application implements Images {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridpane = new GridPane();
        gridpane.setHgap(5);
        gridpane.setVgap(5);
        CheckBox door1 = new CheckBox("Door 1");
        door1.setSelected(false);
        CheckBox door2 = new CheckBox("Door 2");
        door2.setSelected(false);
        CheckBox door3 = new CheckBox("Door 3");
        door3.setSelected(false);

        gridpane.add(doorNum1, 20,10);
        gridpane.add(doorNum2,30,10);
        gridpane.add(doorNum3,40,10);
        gridpane.add(door1, 20, 11);
        gridpane.add(door2,30,11);
        gridpane.add(door3,40,11);

        door1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Random randomNumber = new Random();
                int numRandom = randomNumber.nextInt(1,3);
                if (numRandom == 1) {
                    gridpane.add(new Label("stick with door 2 or switch to 3"), 20, 8);
                    if ((door1.isSelected()) && (!door2.isSelected()) && (!door3.isSelected())) {
                        ImageView goat1 = new ImageView(goat);
                        doorNum1.setImage(null);
                        gridpane.add(goat1, 20, 10);

                        door2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door2.isSelected()) && (!door3.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum2.setImage(null);
                                    gridpane.add(goat2, 30, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum3.setImage(null);
                                    gridpane.add(redCar, 40, 10);
                                } else if ((door3.isSelected()) && (!door2.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum2.setImage(null);
                                    gridpane.add(goat2, 30, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum3.setImage(null);
                                    gridpane.add(redCar, 40, 10);
                                }
                            }
                        });
                        door3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door2.isSelected()) && (!door3.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum2.setImage(null);
                                    gridpane.add(goat2, 30, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum3.setImage(null);
                                    gridpane.add(redCar, 40, 10);
                                } else if ((door3.isSelected()) && (!door2.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum2.setImage(null);
                                    gridpane.add(goat2, 30, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum3.setImage(null);
                                    gridpane.add(redCar, 40, 10);
                                }
                            }
                        });
                    }
                }
                if (numRandom == 2) {
                    gridpane.add(new Label("stick with door 3 or switch to 2"), 20, 8);
                    if ((door1.isSelected()) && (!door2.isSelected()) && (!door3.isSelected())) {
                        ImageView goat1 = new ImageView(goat);
                        doorNum1.setImage(null);
                        gridpane.add(goat1, 20, 10);

                        door2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door2.isSelected()) && (!door3.isSelected())) {
                                    ImageView redCar = new ImageView(car);
                                    doorNum2.setImage(null);
                                    gridpane.add(redCar, 30, 10);

                                    ImageView goat2 = new ImageView(goat);
                                    doorNum3.setImage(null);
                                    gridpane.add(goat2, 40, 10);
                                } else if ((door3.isSelected()) && (!door2.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum3.setImage(null);
                                    gridpane.add(goat2, 40, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum2.setImage(null);
                                    gridpane.add(redCar, 30, 10);
                                }
                            }
                        });
                        door3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door2.isSelected()) && (!door3.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum3.setImage(null);
                                    gridpane.add(goat2, 40, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum2.setImage(null);
                                    gridpane.add(redCar, 30, 10);
                                } else if ((door3.isSelected()) && (!door2.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum3.setImage(null);
                                    gridpane.add(goat2, 40, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum2.setImage(null);
                                    gridpane.add(redCar, 30, 10);
                                }
                            }
                        });
                    }
                }
            }
        });
        door2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Random randomNumber = new Random();
                int numRandom = randomNumber.nextInt(1, 3);
                if (numRandom == 1) {
                    gridpane.add(new Label("stick with door 1 or switch to 3"), 30, 8);
                    if ((door2.isSelected()) && (!door1.isSelected()) && (!door3.isSelected())) {
                        ImageView goat1 = new ImageView(goat);
                        doorNum2.setImage(null);
                        gridpane.add(goat1, 30, 10);

                        door1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door1.isSelected()) && (!door3.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum1.setImage(null);
                                    gridpane.add(goat2, 20, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum3.setImage(null);
                                    gridpane.add(redCar, 40, 10);
                                } else if ((door3.isSelected()) && (!door1.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum1.setImage(null);
                                    gridpane.add(goat2, 20, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum3.setImage(null);
                                    gridpane.add(redCar, 40, 10);
                                }
                            }
                        });
                        door3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door1.isSelected()) && (!door3.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum1.setImage(null);
                                    gridpane.add(goat2, 20, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum3.setImage(null);
                                    gridpane.add(redCar, 40, 10);
                                } else if ((door3.isSelected()) && (!door1.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum1.setImage(null);
                                    gridpane.add(goat2, 20, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum3.setImage(null);
                                    gridpane.add(redCar, 40, 10);
                                }
                            }
                        });
                    }
                }
                if (numRandom == 2) {
                    gridpane.add(new Label("stick with door 3 or switch to 1"), 30, 8);
                    if ((door2.isSelected()) && (!door1.isSelected()) && (!door3.isSelected())) {
                        ImageView goat1 = new ImageView(goat);
                        doorNum2.setImage(null);
                        gridpane.add(goat1, 30, 10);

                        door1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door1.isSelected()) && (!door3.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum3.setImage(null);
                                    gridpane.add(goat2, 40, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum1.setImage(null);
                                    gridpane.add(redCar, 20, 10);
                                } else if ((door3.isSelected()) && (!door1.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum3.setImage(null);
                                    gridpane.add(goat2, 40, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum1.setImage(null);
                                    gridpane.add(redCar, 20, 10);
                                }
                            }
                        });
                        door3.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door1.isSelected()) && (!door3.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum3.setImage(null);
                                    gridpane.add(goat2, 40, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum1.setImage(null);
                                    gridpane.add(redCar, 20, 10);
                                } else if ((door3.isSelected()) && (!door1.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum3.setImage(null);
                                    gridpane.add(goat2, 40, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum1.setImage(null);
                                    gridpane.add(redCar, 20, 10);
                                }
                            }
                        });
                    }
                }
            }
        });
        door3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Random randomNumber = new Random();
                int numRandom = randomNumber.nextInt(1, 3);
                if (numRandom == 1) {
                    gridpane.add(new Label("stick with door 2 or switch to 1"), 40, 8);
                    if ((door3.isSelected()) && (!door1.isSelected()) && (!door2.isSelected())) {
                        ImageView goat1 = new ImageView(goat);
                        doorNum3.setImage(null);
                        gridpane.add(goat1, 40, 10);

                        door1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door1.isSelected()) && (!door2.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum2.setImage(null);
                                    gridpane.add(goat2, 30, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum1.setImage(null);
                                    gridpane.add(redCar, 20, 10);
                                } else if ((door2.isSelected()) && (!door1.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum2.setImage(null);
                                    gridpane.add(goat2, 30, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum1.setImage(null);
                                    gridpane.add(redCar, 20, 10);
                                }
                            }
                        });
                        door2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door1.isSelected()) && (!door3.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum2.setImage(null);
                                    gridpane.add(goat2, 30, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum1.setImage(null);
                                    gridpane.add(redCar, 20, 10);
                                } else if ((door2.isSelected()) && (!door1.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum2.setImage(null);
                                    gridpane.add(goat2, 30, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum1.setImage(null);
                                    gridpane.add(redCar, 20, 10);
                                }
                            }
                        });
                    }
                }
                if (numRandom == 2) {
                    gridpane.add(new Label("stick with door 1 or switch to 2"), 40, 8);
                    if ((door3.isSelected()) && (!door1.isSelected()) && (!door2.isSelected())) {
                        ImageView goat1 = new ImageView(goat);
                        doorNum3.setImage(null);
                        gridpane.add(goat1, 40, 10);

                        door1.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door1.isSelected()) && (!door2.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum1.setImage(null);
                                    gridpane.add(goat2, 20, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum2.setImage(null);
                                    gridpane.add(redCar, 30, 10);
                                } else if ((door2.isSelected()) && (!door1.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum1.setImage(null);
                                    gridpane.add(goat2, 20, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum2.setImage(null);
                                    gridpane.add(redCar, 30, 10);
                                }
                            }
                        });
                        door2.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                if ((door1.isSelected()) && (!door3.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum1.setImage(null);
                                    gridpane.add(goat2, 20, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum2.setImage(null);
                                    gridpane.add(redCar, 30, 10);
                                } else if ((door2.isSelected()) && (!door1.isSelected())) {
                                    ImageView goat2 = new ImageView(goat);
                                    doorNum1.setImage(null);
                                    gridpane.add(goat2, 20, 10);

                                    ImageView redCar = new ImageView(car);
                                    doorNum2.setImage(null);
                                    gridpane.add(redCar, 30, 10);
                                }
                            }
                        });
                    }
                }
            }
        });

        Scene scene = new Scene(gridpane,600, 200);
        stage.setTitle("MontyHall Problem");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
