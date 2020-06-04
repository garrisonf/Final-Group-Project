package DungeonsAndDragons;

import javafx.animation.KeyFrame; 
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.util.Duration;

public class LoadingScreen extends Pane {

    private Timeline timeline = new Timeline();
    private Button btnPlay;

    public javafx.geometry.Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
    public LoadingScreen(int width, int height, Runnable action) {
        ImageView bg = new ImageView(new Image(
                getClass().getResource("res/LoadingScreen.gif").toExternalForm()
        ));
        
        bg.setFitWidth(primaryScreenBounds.getWidth());
        bg.setFitHeight(primaryScreenBounds.getHeight());
        
        timeline.setOnFinished(e -> action.run());

        Node symbol = makeSymbol();
        
        symbol.setLayoutX(primaryScreenBounds.getWidth() / 1.1);
        symbol.setLayoutY(primaryScreenBounds.getHeight() * .15);

        //Play Button with its properties
        btnPlay = new Button("LOADING");
        btnPlay.setStyle("-fx-border-color: WHITE; -fx-background-color: WHITE;");
        btnPlay.setTextFill(Color.BLACK);
        btnPlay.setFont(Font.font("Lucida Calligraphy", 50));
        btnPlay.setLayoutX(primaryScreenBounds.getWidth() / 1.1);
        btnPlay.setLayoutY(primaryScreenBounds.getHeight() * .002);
        
        getChildren().addAll(bg, symbol, btnPlay);

}

    private Node makeSymbol() {
        Pane symbol = new Pane();
        

        GaussianBlur blur = new GaussianBlur(2.5);
        symbol.setEffect(blur);

        Rectangle top = new Rectangle(70, 5, Color.RED);
        top.setArcWidth(100);
        top.setArcHeight(100);

        Rectangle mid = new Rectangle(100, 5, Color.RED);
        mid.setArcWidth(25);
        mid.setArcHeight(25);

        Rectangle bot = new Rectangle(70, 5, Color.RED);
        bot.setArcWidth(25);
        bot.setArcHeight(25);

        top.setTranslateX(15);
        bot.setTranslateX(15);

        top.setTranslateY(10);
        mid.setTranslateY(10 + 10 + 5);
        bot.setTranslateY(10 + 10 + 5 + 10 + 5);

        Circle circle = new Circle(25, 25, 25, Color.BLACK);
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(2);
        circle.setTranslateX(25);

        Circle circle2 = new Circle(25, 25, 25, Color.BLACK);
        circle2.setStroke(Color.RED);
        circle2.setStrokeWidth(1);
        circle2.setTranslateX(25);
        circle2.setRadius(2);

        Circle point = new Circle(25, 25, 25, Color.RED);
        point.setStroke(Color.RED);
        point.setStrokeWidth(1);
        point.setTranslateX(25);
        point.setRadius(1);
        
        Circle circlePath = new Circle(50);
        
        PathTransition transition = new PathTransition();
        transition.setNode(symbol);
        transition.setDuration(Duration.seconds(3));
        transition.setPath(circlePath);
        transition.setCycleCount(PathTransition.INDEFINITE);
  
 
        KeyFrame frame = new KeyFrame(Duration.seconds(1),
                new KeyValue(circle2.radiusProperty(), 20));

        timeline.getKeyFrames().add(frame);
        timeline.setCycleCount(5);
        timeline.play();
        transition.play();

        symbol.getChildren().addAll(top, mid, bot, circle, circle2, point);
        return symbol;
    }
}
