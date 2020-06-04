//Name: Jun Hyeok Bae
package DungeonsAndDragons;

import java.util.Random;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CharacterSheet extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Character Sheet");
        Image image = new Image("https://media.wizards.com/2018/dnd/images/XL2018_DnD.png", 100, 100, false, true);
        Text prof, clas, race, back, str, dex, con, intel, cha;
        TextField strI, profI,  dexI, conI, intelI, chaI;
        Button btnStr, btnDex, btnCon, btnIntel, btnCha, btnMenu, btnNextSel;

        prof = new Text("Profile");
        clas = new Text("Class");
        race = new Text("Race");
        back = new Text("Background");
        str = new Text("Strength");
        dex = new Text("Dexterity");
        con = new Text("Constitution");
        intel = new Text("Intelligence");
        cha = new Text("Charisma");

        btnStr = new Button("ROLL");
        btnDex = new Button("ROLL");
        btnCon = new Button("ROLL");
        btnIntel = new Button("ROLL");
        btnCha = new Button("ROLL");
        btnMenu = new Button("MAIN MENU");
        btnNextSel = new Button("NEXT SELECTION");
        
        strI = new TextField();
        profI = new TextField("Character Name");
        dexI = new TextField();
        conI = new TextField();
        intelI = new TextField();
        chaI = new TextField();
        
        btnStr.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                String temp = ""+(rollD6()+rollD6()+rollD6()+rollD6());
                strI.setText(temp);
            }
            
        });
        btnDex.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                String temp = ""+(rollD6()+rollD6()+rollD6()+rollD6());
                dexI.setText(temp);
            }
            
        });
        btnCon.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                String temp = ""+(rollD6()+rollD6()+rollD6()+rollD6());
                conI.setText(temp);
            }
            
        });
        btnIntel.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                String temp = ""+(rollD6()+rollD6()+rollD6()+rollD6());
                intelI.setText(temp);
            }
            
        });
        btnCha.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                String temp = ""+(rollD6()+rollD6()+rollD6()+rollD6());
                chaI.setText(temp);
            }
            
        });
        
        ObservableList<String> clasList
                = FXCollections.observableArrayList(
                        "Class 1",
                        "Class 2",
                        "Class 3"
                );
        final ComboBox clasBox = new ComboBox(clasList);
        clasBox.setPromptText("Class");

        ObservableList<String> raceList
                = FXCollections.observableArrayList(
                        "Race 1",
                        "Race 2",
                        "Race 3"
                );
        final ComboBox raceBox = new ComboBox(raceList);
        raceBox.setPromptText("Race");

        ObservableList<String> backList
                = FXCollections.observableArrayList(
                        "Background 1",
                        "Background 2",
                        "Background 3"
                );
        final ComboBox backBox = new ComboBox(backList);
        backBox.setPromptText("Background");

        ObservableList<String> featList
                = FXCollections.observableArrayList(
                        "Feat 1",
                        "Feat 2",
                        "Feat 3"
                );
        final ComboBox featBox = new ComboBox(featList);
        featBox.setPromptText("Feat");

        ObservableList<String> creatureList
                = FXCollections.observableArrayList(
                        "Creature 1",
                        "Creature 2",
                        "Creature 3"
                );
        final ComboBox creatureBox = new ComboBox(creatureList);
        creatureBox.setPromptText("Creature");

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        Scene scene = new Scene(new Group(), 900, 500);
        grid.add(new ImageView(image), 0, 0, 2, 4);
        grid.add(prof, 2, 0, 2, 1);
        grid.add(profI, 2, 1, 2, 1);
        grid.add(back, 2, 2, 2, 1);
        grid.add(backBox, 2, 3, 2, 1);
        grid.add(clas, 5, 0, 2, 1);
        grid.add(clasBox, 5, 1, 2, 1);
        grid.add(race, 8, 0, 2, 1);
        grid.add(raceBox, 8, 1, 2, 1);
        grid.add(str, 0, 4, 2, 1);
        grid.add(strI, 0, 5, 2, 1);
        grid.add(btnStr, 2, 5);
        grid.add(dex, 3, 4);
        grid.add(dexI, 3, 5, 2, 1);
        grid.add(btnDex, 5, 5);
        grid.add(con, 6, 4, 2, 1);
        grid.add(conI, 6, 5, 2, 1);
        grid.add(btnCon, 8, 5);
        grid.add(intel, 9, 4, 2, 1);
        grid.add(intelI, 9, 5, 2, 1);
        grid.add(btnIntel, 11, 5);
        grid.add(cha, 0, 6,2 ,1);
        grid.add(chaI, 0, 7, 2, 1);
        grid.add(btnCha, 2,7);
        grid.add(featBox, 0, 9,2,1);
        grid.add(creatureBox,3, 9,2,1);
        grid.add(btnMenu,8,12,2,1);
        grid.add(btnNextSel, 10, 12, 2, 1);

        Group root = (Group) scene.getRoot();
        root.getChildren().add(grid);
        stage.setScene(scene);
        stage.show();
    }
    
    public static int rollD6() {
        return 1 + new Random().nextInt(6);
    }
}