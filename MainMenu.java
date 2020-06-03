package DungeonsAndDragons;

import javafx.fxml.FXMLLoader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class MainMenu extends Application {

	private javafx.geometry.Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
    private Parent createContent(){
        Pane root = new Pane();
       
        ImageView imageView = new ImageView(new Image(getClass()
                .getResource("res/Testr.gif").toExternalForm()));
        imageView.setFitWidth(primaryScreenBounds.getWidth());
        imageView.setFitHeight(primaryScreenBounds.getHeight());
        root.getChildren().add(imageView);

        Title title = new Title("D u n g e o n s  &  D r a g o n s");
        title.setTranslateX(75);
        title.setTranslateY(200);

        MenuItem itemExit = new MenuItem("EXIT TO DESKTOP");
        itemExit.setOnMouseClicked(event -> System.exit(0));

        // Loading Screen still under construction
       /*MenuItem characterSheet = new MenuItem("CHARACTER SHEET");
        characterSheet.setOnMouseClicked(event -> {
            FadeTransition ft = new FadeTransition(Duration.seconds(1.5));
            ft.setToValue(1);

            ft.setOnFinished(e -> {
                root.getChildren().setAll(new LoadingScreen(1280, 720, () -> {
                    root.getChildren().setAll(imageView, title);
                }));
            });

            ft.play();
        }); */
        
        
        MenuBox menu = new MenuBox(
                new MenuItem("STORY MODE (TBR)"),
                new MenuItem("CHARACTER SHEET"),
                //characterSheet,
                new MenuItem("GAME OPTIONS"),
                new MenuItem("CREDITS"),
                new MenuItem("JOIN CO-OP"),
                itemExit);
        menu.setTranslateX(100);
        menu.setTranslateY(350);

        root.getChildren().addAll(title, menu);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("Dungeons&Dragons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static class Title extends StackPane {
        public Title(String name) {
            Rectangle bg = new Rectangle(1500, 100);
            bg.setStroke(Color.YELLOW);
            bg.setStrokeWidth(2);
            bg.setFill(null);

            Text text = new Text(name);
            text.setFill(Color.RED);
            text.setFont(Font.font("Impact", FontWeight.SEMI_BOLD, 95));

            setAlignment(Pos.CENTER);
            getChildren().addAll(bg, text);
        }
    }

    private static class MenuBox extends VBox {
        public MenuBox(MenuItem... items) {
            getChildren().add(createSeparator());

            for (MenuItem item : items) {
                getChildren().addAll(item, createSeparator());
            }
        }

        private Line createSeparator() {
            Line sep = new Line();
            sep.setEndX(400);
            sep.setStroke(Color.DARKGREY);
            return sep;
        }
    }

    private static class MenuItem extends StackPane {
        public MenuItem(String name) {
            LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, new Stop[] {
                    new Stop(0, Color.RED),
                    new Stop(0.1, Color.BLACK),
                    new Stop(0.9, Color.BLACK),
                    new Stop(1, Color.RED)
            });

            Rectangle bg = new Rectangle(400, 60);
            bg.setOpacity(0.4);

            Text text = new Text(name);
            text.setFill(Color.DARKGREY);
            text.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 22));

            setAlignment(Pos.CENTER);
            getChildren().addAll(bg, text);

            setOnMouseEntered(event -> {
                bg.setFill(gradient);
                text.setFill(Color.YELLOW);
            });


            setOnMouseExited(event -> {
                bg.setFill(Color.BLACK);
                text.setFill(Color.DARKGREY);
            });

            setOnMousePressed(event -> {
                bg.setFill(Color.RED);
            });

            setOnMouseReleased(event -> {
                bg.setFill(gradient);
            });
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
