//Name: Jun Hyeok Bae
package DungeonsAndDragons;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Credit extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Credits");
        String text = "CS56(1770) Group Project: Group 3\n"
                + "Project: Dungeons & Dragons Companion Application\n\n"
                + "Project Team Members:\n\n"
                + "Team Leader: Garrison Finley\n"
                + "\n"
                + "Back End:\n"
                + "Brad Villacis\n"
                + "Ethan Egilsson\n"
                + "Brian Richey\n"
                + "\n"
                + "Front End:\n"
                + "Andrei Bato\n"
                + "Jun Hyeok Bae\n"
                + "Andrew Nam\n";
        Text txt = new Text(text);
        txt.setFont(Font.font("Lucida Calligraphy", 20));//"Old English Text MT" is nice but is illegible
        txt.setX(50);
        txt.setY(50);

        StackPane root = new StackPane(txt);

        BackgroundImage myBI = new BackgroundImage(new Image("https://lh3.googleusercontent.com/proxy/x7oEHUahhclOp4h_c5YDotfthwr-OYn4MR029Fo1ShROkL3onsROe_vgug7h11wnp_pBhxkwAqUy89RxwzWQYXViJDpxgTDEu8HZnOD2",600,800,false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        root.setBackground(new Background(myBI));
        Scene scene = new Scene(root, 600, 800);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
