package sample;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
/*
Author(Tommy V Ha)
Date(June 3, 2014)

 */



public class Maze extends Application {

    Group root = new Group();
    Group rootTwo = new Group();
    Group rootThree = new Group();
    StackPane sp = new StackPane();


    @Override
    public void start(final Stage primaryStage) throws Exception {
        //first level
        final Scene scene1 = new Scene(root, 500, 500, Color.BLACK);
        //third level
        final Scene scene2 = new Scene(rootTwo, 500, 500, Color.BLACK);
        //second level
        final Scene scene3 = new Scene(rootThree, 500, 500, Color.BLACK);
        //forth level
        final Scene scene4 = new Scene(sp);
        //cursor for level 1
        Circle();
        //" level 2
        CircleTwo();
        //" level 3
        CircleThree();


        primaryStage.setTitle("Mazegame");
        primaryStage.setScene(scene1);
        primaryStage.show();
//level 4 image
        Image img = new Image("http://img4.wikia.nocookie.net/__cb20110723143002/sporum/images/e/ea/Screamer.png");
        ImageView imgView = new ImageView(img);
        sp.getChildren().add(imgView);

//special rectangles to switch between levels
        final Rectangle rect = new Rectangle(50, 20, 50, 50);
        root.getChildren().add(rect);
        rect.setFill(Color.RED);

        rect.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                primaryStage.setScene(scene3);

            }

        });
        final Rectangle rect2 = new Rectangle(430, 230, 30, 30);
        rootThree.getChildren().add(rect2);
        rect2.setFill(Color.RED);
        rect2.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                primaryStage.setScene(scene2);


            }


        });

        final Rectangle rect3 = new Rectangle(200, 179, 10, 10);
        rootTwo.getChildren().add(rect3);
        rect3.setFill(Color.BLUE);
        rect3.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String sound = "file:///Users/tommyha/Crazymaze/Music/Scream.mp3";
                Media media = new Media(sound);
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
                primaryStage.setScene(scene4);


            }
        });


    }


    public static void main(String[] args) {
        launch(args);


    }
    // Walls coordinates
    public Maze() {
        Rectangle[] rectangles = {
                new Rectangle(50, 340, 400, 150),
                new Rectangle(50, 200, 50, 150),
                new Rectangle(50, 200, 370, 50),
                new Rectangle(370, 150, 50, 100),
                new Rectangle(50, 100, 370, 50),
                new Rectangle(50, 20, 50, 100),


        };


        for (Rectangle r : rectangles) {
            r.setFill(Color.BLUE);
            root.getChildren().add(r);

        }
        javafx.scene.shape.Rectangle[] rectanglesTwo = {
                new javafx.scene.shape.Rectangle(10, 10, 50, 450),
                new javafx.scene.shape.Rectangle(60, 410, 100, 50),
                new javafx.scene.shape.Rectangle(110, 10, 50, 400),
                new javafx.scene.shape.Rectangle(160, 10, 100, 50),
                new javafx.scene.shape.Rectangle(210, 60, 50, 400),
                new javafx.scene.shape.Rectangle(260, 410, 100, 50),
                new javafx.scene.shape.Rectangle(310, 10, 50, 400),
                new javafx.scene.shape.Rectangle(360, 10, 100, 50),
                new javafx.scene.shape.Rectangle(430, 30, 30, 200),
        };
        for (Rectangle r : rectanglesTwo) {
            r.setFill(Color.BLUE);
            rootThree.getChildren().add(r);


        }
        javafx.scene.shape.Rectangle[] rectanglesThree = {
                new javafx.scene.shape.Rectangle(450, 50, 30, 250),
                new javafx.scene.shape.Rectangle(380, 20, 100, 30),
                new javafx.scene.shape.Rectangle(350, 20, 30, 275),
                new javafx.scene.shape.Rectangle(230, 270, 150, 30),
                new javafx.scene.shape.Rectangle(200, 200, 30, 100),
                new javafx.scene.shape.Rectangle(200, 160, 10, 40),
                new javafx.scene.shape.Rectangle(200, 150, 30, 10),



        };
        for (Rectangle r : rectanglesThree) {
            r.setFill(Color.BLUE);
            rootTwo.getChildren().add(r);

        }
        Rectangle rectangleFour = new Rectangle(200, 150, 30, 30);
        rectangleFour.setFill(Color.RED);
        rootTwo.getChildren().add(rectangleFour);

    }


//level one cursor/boundaries

    public void Circle() {
        final Circle circle = new Circle(5, Color.RED);
        circle.setLayoutX(440);
        circle.setLayoutY(400);
        circle.setCursor(Cursor.NONE);
        root.getChildren().add(circle);


        root.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {


                double numX = mouseEvent.getX();
                double numY = mouseEvent.getY();


                if (numX >= 50 && numX <= 450 && numY >= 340 && numY <= 490) {
                    circle.setLayoutX(mouseEvent.getX());
                    circle.setLayoutY(mouseEvent.getY());


                }
                if (numX >= 50 && numX <= 100 && numY >= 200 && numY <= 340) {
                    circle.setLayoutX(mouseEvent.getX());
                    circle.setLayoutY(mouseEvent.getY());


                }

                if (numX >= 100 && numX <= 370 && numY >= 200 && numY <= 250) {
                    circle.setLayoutX(mouseEvent.getX());
                    circle.setLayoutY(mouseEvent.getY());


                }

                if (numX >= 370 && numX <= 420 && numY >= 100 && numY <= 250) {
                    circle.setLayoutX(mouseEvent.getX());
                    circle.setLayoutY(mouseEvent.getY());


                }
                if (numX >= 50 && numX <= 370 && numY >= 100 && numY <= 150) {
                    circle.setLayoutX(mouseEvent.getX());
                    circle.setLayoutY(mouseEvent.getY());


                }
                if (numX >= 50 && numX <= 100 && numY >= 80 && numY <= 100) {
                    circle.setLayoutX(mouseEvent.getX());
                    circle.setLayoutY(mouseEvent.getY());


                }

            }


        });
    }
    //level two cursor/boundaries
    public void CircleTwo() {
        final Circle circleTwo = new Circle(5, Color.RED);
        circleTwo.setLayoutX(50);
        circleTwo.setLayoutY(50);
        circleTwo.setCursor(Cursor.NONE);
        rootThree.getChildren().add(circleTwo);
        rootThree.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                double numX = mouseEvent.getX();
                double numY = mouseEvent.getY();

                if (numX >= 15 && numX <= 55 && numY >= 15 && numY <= 455) {
                    circleTwo.setLayoutX(mouseEvent.getX());
                    circleTwo.setLayoutY(mouseEvent.getY());

                }

                if (numX >= 55 && numX <= 160 && numY >= 415 && numY <= 455) {
                    circleTwo.setLayoutX(mouseEvent.getX());
                    circleTwo.setLayoutY(mouseEvent.getY());
                }


                if (numX >= 115 && numX <= 155 && numY >= 15 && numY <= 455) {
                    circleTwo.setLayoutX(mouseEvent.getX());
                    circleTwo.setLayoutY(mouseEvent.getY());

                }

                if (numX >= 160 && numX <= 255 && numY >= 15 && numY <= 55) {

                    circleTwo.setLayoutX(mouseEvent.getX());
                    circleTwo.setLayoutY(mouseEvent.getY());
                }
                if (numX >= 210 && numX <= 260 && numY >= 55 && numY <= 455) {

                    circleTwo.setLayoutX(mouseEvent.getX());
                    circleTwo.setLayoutY(mouseEvent.getY());
                }

                if (numX >= 260 && numX <= 310 && numY >= 410 && numY <= 455) {

                    circleTwo.setLayoutX(mouseEvent.getX());
                    circleTwo.setLayoutY(mouseEvent.getY());
                }

                if (numX >= 315 && numX <= 355 && numY >= 15 && numY <= 455) {

                    circleTwo.setLayoutX(mouseEvent.getX());
                    circleTwo.setLayoutY(mouseEvent.getY());
                }
                if (numX >= 355 && numX <= 460 && numY >= 15 && numY <= 55) {

                    circleTwo.setLayoutX(mouseEvent.getX());
                    circleTwo.setLayoutY(mouseEvent.getY());
                }

                if (numX >= 435 && numX <= 455 && numY >= 55 && numY <= 255) {

                    circleTwo.setLayoutX(mouseEvent.getX());
                    circleTwo.setLayoutY(mouseEvent.getY());
                }


            }
        });
    }
    //level three cursor/boundaries
    public void CircleThree() {
        final Circle circleThree = new Circle(5, Color.RED);
        circleThree.setLayoutX(465);
        circleThree.setLayoutY(280);
        circleThree.setCursor(Cursor.NONE);
        rootTwo.getChildren().add(circleThree);
        rootTwo.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                double numX = mouseEvent.getX();
                double numY = mouseEvent.getY();

                if (numX >= 455 && numX <= 475 && numY >= 50 && numY <= 295) {

                    circleThree.setLayoutX(mouseEvent.getX());
                    circleThree.setLayoutY(mouseEvent.getY());
                }

                if (numX >= 375 && numX <= 475 && numY >= 25 && numY <= 45) {

                    circleThree.setLayoutX(mouseEvent.getX());
                    circleThree.setLayoutY(mouseEvent.getY());
                }

                if (numX >= 355 && numX <= 375 && numY >= 25 && numY <= 275) {

                    circleThree.setLayoutX(mouseEvent.getX());
                    circleThree.setLayoutY(mouseEvent.getY());
                }

                if (numX >= 205 && numX <= 375 && numY >= 270 && numY <= 295) {

                    circleThree.setLayoutX(mouseEvent.getX());
                    circleThree.setLayoutY(mouseEvent.getY());
                }

                if (numX >= 205 && numX <= 230 && numY >= 205 && numY <= 275) {

                    circleThree.setLayoutX(mouseEvent.getX());
                    circleThree.setLayoutY(mouseEvent.getY());
                }

                if (numX >= 205 && numX <= 215 && numY >= 165 && numY <= 205) {

                    circleThree.setLayoutX(mouseEvent.getX());
                    circleThree.setLayoutY(mouseEvent.getY());
                }
            }


        });


    }
}











































