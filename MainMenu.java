package DungeonsAndDragons;

import javafx.fxml.FXMLLoader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class MainMenu extends Application {

	private javafx.geometry.Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        ComboBox skill1Box, skill2Box, skill3Box, spell1Box, spell2Box, spell3Box;

	Stage window;
Scene scene, scene2;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
         scene = new Scene(createContent());
         scene2 = new Scene(CharacterSheet(), 900, 500);
        primaryStage.setTitle("Dungeons&Dragons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
	private Parent createContent(){
        Pane root = new Pane();
       
        ImageView imageView = new ImageView(new Image(getClass()
                .getResource("res/Testr.gif").toExternalForm()));
        imageView.setFitWidth(primaryScreenBounds.getWidth());
        imageView.setFitHeight(primaryScreenBounds.getHeight());
        root.getChildren().add(imageView);

        Title title = new Title("D u n g e o n s  &  D r a g o n s");
        title.setLayoutX(primaryScreenBounds.getWidth() / 20);
        title.setLayoutY(primaryScreenBounds.getHeight() * .15);
        
        
        MenuItem itemExit = new MenuItem("EXIT TO DESKTOP");
        itemExit.setOnMouseClicked(event -> System.exit(0));
        
        MenuItem characterSheet = new MenuItem("CHARACTER SHEET");
        characterSheet.setOnMouseClicked(eh->window.setScene(scene2));
        
        
        
        MenuBox menu = new MenuBox(
                new MenuItem("STORY MODE (TBR)"),
                characterSheet,
                new MenuItem("GAME OPTIONS"),
                new MenuItem("CREDITS"),
                new MenuItem("JOIN CO-OP"),
                itemExit);
        
        menu.setLayoutX(primaryScreenBounds.getWidth() / 20);
        menu.setLayoutY(primaryScreenBounds.getHeight() * .25);
        

        // When the Character sheet is clicked
        // It goes onto a loading screen but since i cant connect to the 
        //character screen yet it just loops (without and actual loop) back to the main menu
        root.getChildren().addAll(title, menu);
        /*characterSheet.setOnMouseClicked(event -> {
            FadeTransition ft = new FadeTransition(Duration.seconds(1.5));
            ft.setToValue(1);

            ft.setOnFinished(e -> {
                root.getChildren().setAll(new LoadingScreen(1280, 720, () -> {
         //loops back to main menu 
                	root.getChildren().setAll(imageView, title, menu);
                }));
            });

            ft.play();
        });*/
        return root;
        
        
    }
        
    private Parent CharacterSheet(){
        Image image = new Image("https://media.wizards.com/2018/dnd/images/XL2018_DnD.png", 100, 100, false, true);
        Text prof, clas, race, back, str, dex, con, intel, cha, wis, armor, hit, skill1, skill2, spell1, spell2, spell3, equip, feat;
        TextField strI, profI, dexI, conI, intelI, chaI, wisI, backI, armorI, hitI, equipI;
        Button btnStr, btnDex, btnCon, btnIntel, btnCha, btnWis, btnMenu, btnNextSel, btnArmor, btnHit;

        armor = new Text("Armor Class");
        hit = new Text("Hit Point Max");
        prof = new Text("Profile");
        clas = new Text("Class");
        race = new Text("Race");
        back = new Text("Description");
        str = new Text("Strength");
        dex = new Text("Dexterity");
        con = new Text("Constitution");
        intel = new Text("Intelligence");
        cha = new Text("Charisma");
        wis = new Text("Wisdom");
        skill1 = new Text("Skill 1");
        skill2 = new Text("Skill 2");
        //skill3 = new Text("Skill 3");
        spell1 = new Text("Spell 1");
        spell2 = new Text("Spell 2");
        spell3 = new Text("Spell 3");
        equip = new Text("Equipment");
        feat = new Text("Feat");

        btnStr = new Button("ROLL");
        btnDex = new Button("ROLL");
        btnCon = new Button("ROLL");
        btnIntel = new Button("ROLL");
        btnCha = new Button("ROLL");
        btnWis = new Button("ROLL");
        btnMenu = new Button("MAIN MENU");
        btnMenu.setOnAction(e->window.setScene(scene));
        btnNextSel = new Button("EXIT");
        btnArmor = new Button("SET");
        btnHit = new Button("ROLL");

        backI = new TextField();
        backI.setPrefSize(400, 100);
        strI = new TextField();
        profI = new TextField("Character Name");
        dexI = new TextField();
        conI = new TextField();
        intelI = new TextField();
        chaI = new TextField();
        wisI = new TextField();
        armorI = new TextField();
        hitI = new TextField();
        equipI = new TextField();
        equipI.setPrefSize(400, 100);

        btnStr.setOnAction((ActionEvent t) -> {
            String temp = "" + (rollD6() + rollD6() + rollD6() + rollD6());
            strI.setText(temp);
        });
        btnWis.setOnAction((ActionEvent t) -> {
            String temp = "" + (rollD6() + rollD6() + rollD6() + rollD6());
            wisI.setText(temp);
        });
        btnDex.setOnAction((ActionEvent t) -> {
            String temp = "" + (rollD6() + rollD6() + rollD6() + rollD6());
            dexI.setText(temp);
        });
        btnCon.setOnAction((ActionEvent t) -> {
            String temp = "" + (rollD6() + rollD6() + rollD6() + rollD6());
            conI.setText(temp);
        });
        btnIntel.setOnAction((ActionEvent t) -> {
            String temp = "" + (rollD6() + rollD6() + rollD6() + rollD6());
            intelI.setText(temp);
        });
        btnCha.setOnAction((ActionEvent t) -> {
            String temp = "" + (rollD6() + rollD6() + rollD6() + rollD6());
            chaI.setText(temp);
        });
        btnNextSel.setOnAction((ActionEvent t) -> {
            System.exit(0);
        });

        ObservableList<String> clasList
                = FXCollections.observableArrayList(
                        "Barbarian",
                        "Bard",
                        "Cleric",
                        "Druid",
                        "Fighter",
                        "Monk",
                        "Paladin",
                        "Ranger",
                        "Rogue",
                        "Sorcerer",
                        "Warlock",
                        "Wizard"
                );
        final ComboBox clasBox = new ComboBox(clasList);
        clasBox.setPromptText("Class");

        ObservableList<String> raceList
                = FXCollections.observableArrayList(
                        "Dragonborn",
                        "Dwarf",
                        "Elf",
                        "Gnome",
                        "Half-Elf",
                        "Half-Orc",
                        "Halfling",
                        "Human",
                        "Tiefling"
                );
        final ComboBox raceBox = new ComboBox(raceList);
        raceBox.setPromptText("Race");

        ObservableList<String> featList
                = FXCollections.observableArrayList(
                        "Aberrant Dragonmark",
                        "Actor",
                        "Alert",
                        "Athlete",
                        "Bountiful Luck",
                        "Charger",
                        "Crossbow Expert",
                        "Defensive Duelist",
                        "Dragon Fear",
                        "Dragon Hide",
                        "Drow High Magic",
                        "Dual Wielder",
                        "Dungeon Delver",
                        "Durable",
                        "Dwarf Fortitude",
                        "Elemental Adept",
                        "Elven Accuracy",
                        "Fade Away",
                        "Fey Teleportation",
                        "Flames of Phlegethos",
                        "Grappler",
                        "Great Weapon Master",
                        "Healer",
                        "Heavily Armored",
                        "Infernal Constitution",
                        "Inspiring Leader",
                        "Keen Mind",
                        "Lightly Armored",
                        "Linguist",
                        "Lucky",
                        "Mage Slayer",
                        "Magic Initiate",
                        "Martial Adept",
                        "Medium Armor Master",
                        "Mobile",
                        "Moderately Armored",
                        "Mounted Combatant",
                        "Observant",
                        "Orcish Fury",
                        "Poelarm Master",
                        "Prodigy",
                        "Resilient",
                        "Revenant Blade",
                        "Ritual Caster",
                        "Savage Attacker",
                        "Second Chance",
                        "Sentinel",
                        "Sharpshooter",
                        "Shield Master",
                        "Skilled",
                        "Skulker",
                        "Spell Sniper",
                        "Squat Nimbleness",
                        "Tavern Brawler",
                        "Tough",
                        "War Caster",
                        "Weapon Master",
                        "Wood Elf Magic"
                );
        final ComboBox featBox = new ComboBox(featList);
        featBox.setPromptText("Feat");
        btnArmor.setOnAction((ActionEvent t) -> {
            try {
                switch ((String) clasBox.getValue()) {
                    case "Barbarian":
                        armorI.setText(String.valueOf(new Barbarian().getArmorClass()));
                        break;
                    case "Bard":
                        armorI.setText(String.valueOf(new Bard().getArmorClass()));
                        break;
                    case "Cleric":
                        armorI.setText(String.valueOf(new Cleric().getArmorClass()));
                        break;
                    case "Druid":
                        armorI.setText(String.valueOf(new Druid().getArmorClass()));
                        break;
                    case "Fighter":
                        armorI.setText(String.valueOf(new Fighter().getArmorClass()));
                        break;
                    case "Monk":
                        armorI.setText(String.valueOf(new Monk().getArmorClass()));
                        break;
                    case "Paladin":
                        armorI.setText(String.valueOf(new Paladin().getArmorClass()));
                        break;
                    case "Ranger":
                        armorI.setText(String.valueOf(new Ranger().getArmorClass()));
                        break;
                    case "Rogue":
                        armorI.setText(String.valueOf(new Rogue().getArmorClass()));
                        break;
                    case "Sorcerer":
                        armorI.setText(String.valueOf(new Sorcerer().getArmorClass()));
                        break;
                    case "Warlock":
                        armorI.setText(String.valueOf(new Warlock().getArmorClass()));
                        break;
                    case "Wizard":
                        armorI.setText(String.valueOf(new Wizard().getArmorClass()));
                        break;
                }
            } catch (NullPointerException e) {
                armorI.setText("Set Class First");
            }

        });
        btnHit.setOnAction((ActionEvent t) -> {
            try {
                switch ((String) clasBox.getValue()) {
                    case "Barbarian":
                        hitI.setText(String.valueOf(new Barbarian().getHitPointMax()));
                        break;
                    case "Bard":
                        hitI.setText(String.valueOf(new Bard().getHitPointMax()));
                        break;
                    case "Cleric":
                        hitI.setText(String.valueOf(new Cleric().getHitPointMax()));
                        break;
                    case "Druid":
                        hitI.setText(String.valueOf(new Druid().getHitPointMax()));
                        break;
                    case "Fighter":
                        hitI.setText(String.valueOf(new Fighter().getHitPointMax()));
                        break;
                    case "Monk":
                        hitI.setText(String.valueOf(new Monk().getHitPointMax()));
                        break;
                    case "Paladin":
                        hitI.setText(String.valueOf(new Paladin().getHitPointMax()));
                        break;
                    case "Ranger":
                        hitI.setText(String.valueOf(new Ranger().getHitPointMax()));
                        break;
                    case "Rogue":
                        hitI.setText(String.valueOf(new Rogue().getHitPointMax()));
                        break;
                    case "Sorcerer":
                        hitI.setText(String.valueOf(new Sorcerer().getHitPointMax()));
                        break;
                    case "Warlock":
                        hitI.setText(String.valueOf(new Warlock().getHitPointMax()));
                        break;
                    case "Wizard":
                        hitI.setText(String.valueOf(new Wizard().getHitPointMax()));
                        break;
                }
            } catch (NullPointerException e) {
                hitI.setText("Set Class First");
            }
        });

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        skill1Box = new ComboBox(FXCollections.observableArrayList());
        clasBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov,
                    final String oldvalue, final String newvalue) {
                ObservableList<String> observableList = FXCollections.observableArrayList("Set Class");
                try {
                    switch ((String) clasBox.getValue()) {
                        case "Barbarian":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf1());
                            break;
                        case "Bard":
                            observableList = FXCollections.observableList(new Bard().getSkillsProf1());
                            break;
                        case "Cleric":
                            observableList = FXCollections.observableList(new Cleric().getSkillsProf1());
                            break;
                        case "Druid":
                            observableList = FXCollections.observableList(new Druid().getSkillsProf1());
                            break;
                        case "Fighter":
                            observableList = FXCollections.observableList(new Fighter().getSkillsProf1());
                            break;
                        case "Monk":
                            observableList = FXCollections.observableList(new Monk().getSkillsProf1());
                            break;
                        case "Paladin":
                            observableList = FXCollections.observableList(new Paladin().getSkillsProf1());
                            break;
                        case "Ranger":
                            observableList = FXCollections.observableList(new Ranger().getSkillsProf1());
                            break;
                        case "Rogue":
                            observableList = FXCollections.observableList(new Rogue().getSkillsProf1());
                            break;
                        case "Sorcerer":
                            observableList = FXCollections.observableList(new Sorcerer().getSkillsProf1());
                            break;
                        case "Warlock":
                            observableList = FXCollections.observableList(new Warlock().getSkillsProf1());
                            break;
                        case "Wizard":
                            observableList = FXCollections.observableList(new Wizard().getSkillsProf1());
                            break;
                    }
                } catch (NullPointerException e) {
                    observableList
                            = FXCollections.observableArrayList(
                                    "Set Class"
                            );
                }
                grid.getChildren().remove(skill1Box);
                skill1Box = new ComboBox(observableList);
                skill1Box.setPromptText("Skill 1");
                grid.add(skill1Box, 0, 9, 2, 1);
            }
        });

        skill2Box = new ComboBox(FXCollections.observableArrayList());
        clasBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov,
                    final String oldvalue, final String newvalue) {
                ObservableList<String> observableList = FXCollections.observableArrayList("Set Class");
                try {
                    switch ((String) clasBox.getValue()) {
                        case "Barbarian":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf1());
                            break;
                        case "Bard":
                            observableList = FXCollections.observableList(new Bard().getSkillsProf1());
                            break;
                        case "Cleric":
                            observableList = FXCollections.observableList(new Cleric().getSkillsProf1());
                            break;
                        case "Druid":
                            observableList = FXCollections.observableList(new Druid().getSkillsProf1());
                            break;
                        case "Fighter":
                            observableList = FXCollections.observableList(new Fighter().getSkillsProf1());
                            break;
                        case "Monk":
                            observableList = FXCollections.observableList(new Monk().getSkillsProf1());
                            break;
                        case "Paladin":
                            observableList = FXCollections.observableList(new Paladin().getSkillsProf1());
                            break;
                        case "Ranger":
                            observableList = FXCollections.observableList(new Ranger().getSkillsProf1());
                            break;
                        case "Rogue":
                            observableList = FXCollections.observableList(new Rogue().getSkillsProf1());
                            break;
                        case "Sorcerer":
                            observableList = FXCollections.observableList(new Sorcerer().getSkillsProf1());
                            break;
                        case "Warlock":
                            observableList = FXCollections.observableList(new Warlock().getSkillsProf1());
                            break;
                        case "Wizard":
                            observableList = FXCollections.observableList(new Wizard().getSkillsProf1());
                            break;
                    }
                } catch (NullPointerException e) {
                    observableList
                            = FXCollections.observableArrayList(
                                    "Set Class"
                            );
                }
                grid.getChildren().remove(skill2Box);
                skill2Box = new ComboBox(observableList);
                skill2Box.setPromptText("Skill 2");
                grid.add(skill2Box, 2, 9, 2, 1);
            }
        });
        spell1Box = new ComboBox(FXCollections.observableArrayList());
        clasBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov,
                    final String oldvalue, final String newvalue) {
                ObservableList<String> observableList = FXCollections.observableArrayList("Set Class");
                try {
                    switch ((String) clasBox.getValue()) {
                        case "Barbarian":
                            observableList = FXCollections.observableList(new Barbarian().getSpell1());
                            break;
                        case "Bard":
                            observableList = FXCollections.observableList(new Bard().getSpell1());
                            break;
                        case "Cleric":
                            observableList = FXCollections.observableList(new Cleric().getSpell1());
                            break;
                        case "Druid":
                            observableList = FXCollections.observableList(new Druid().getSpell1());
                            break;
                        case "Fighter":
                            observableList = FXCollections.observableList(new Fighter().getSpell1());
                            break;
                        case "Monk":
                            observableList = FXCollections.observableList(new Monk().getSpell1());
                            break;
                        case "Paladin":
                            observableList = FXCollections.observableList(new Paladin().getSpell1());
                            break;
                        case "Ranger":
                            observableList = FXCollections.observableList(new Ranger().getSpell1());
                            break;
                        case "Rogue":
                            observableList = FXCollections.observableList(new Rogue().getSpell1());
                            break;
                        case "Sorcerer":
                            observableList = FXCollections.observableList(new Sorcerer().getSpell1());
                            break;
                        case "Warlock":
                            observableList = FXCollections.observableList(new Barbarian().getSpell1());
                            break;
                        case "Wizard":
                            observableList = FXCollections.observableList(new Wizard().getSpell1());
                            break;
                    }
                } catch (NullPointerException e) {
                    observableList
                            = FXCollections.observableArrayList(
                                    "Set Class"
                            );
                }
                grid.getChildren().remove(spell1Box);
                spell1Box = new ComboBox(observableList);
                spell1Box.setPromptText("Spell 1");
                grid.add(spell1Box, 0, 11, 2, 1);
            }
        });

        spell2Box = new ComboBox(FXCollections.observableArrayList());
        clasBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov,
                    final String oldvalue, final String newvalue) {
                ObservableList<String> observableList = FXCollections.observableArrayList("Set Class");
                try {
                    switch ((String) clasBox.getValue()) {
                        case "Barbarian":
                            observableList = FXCollections.observableList(new Barbarian().getSpell1());
                            break;
                        case "Bard":
                            observableList = FXCollections.observableList(new Bard().getSpell1());
                            break;
                        case "Cleric":
                            observableList = FXCollections.observableList(new Cleric().getSpell1());
                            break;
                        case "Druid":
                            observableList = FXCollections.observableList(new Druid().getSpell1());
                            break;
                        case "Fighter":
                            observableList = FXCollections.observableList(new Fighter().getSpell1());
                            break;
                        case "Monk":
                            observableList = FXCollections.observableList(new Monk().getSpell1());
                            break;
                        case "Paladin":
                            observableList = FXCollections.observableList(new Paladin().getSpell1());
                            break;
                        case "Ranger":
                            observableList = FXCollections.observableList(new Ranger().getSpell1());
                            break;
                        case "Rogue":
                            observableList = FXCollections.observableList(new Rogue().getSpell1());
                            break;
                        case "Sorcerer":
                            observableList = FXCollections.observableList(new Sorcerer().getSpell1());
                            break;
                        case "Warlock":
                            observableList = FXCollections.observableList(new Warlock().getSpell1());
                            break;
                        case "Wizard":
                            observableList = FXCollections.observableList(new Wizard().getSpell1());
                            break;
                    }
                } catch (NullPointerException e) {
                    observableList
                            = FXCollections.observableArrayList(
                                    "Set Class"
                            );
                }
                grid.getChildren().remove(spell2Box);
                spell2Box = new ComboBox(observableList);
                spell2Box.setPromptText("Spell 2");
                grid.add(spell2Box, 2, 11, 2, 1);
            }
        });

        spell3Box = new ComboBox(FXCollections.observableArrayList());
        clasBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov,
                    final String oldvalue, final String newvalue) {
                ObservableList<String> observableList = FXCollections.observableArrayList("Set Class");
                try {
                    switch ((String) clasBox.getValue()) {
                        case "Barbarian":
                            observableList = FXCollections.observableList(new Barbarian().getSpell1());
                            break;
                        case "Bard":
                            observableList = FXCollections.observableList(new Bard().getSpell1());
                            break;
                        case "Cleric":
                            observableList = FXCollections.observableList(new Cleric().getSpell1());
                            break;
                        case "Druid":
                            observableList = FXCollections.observableList(new Druid().getSpell1());
                            break;
                        case "Fighter":
                            observableList = FXCollections.observableList(new Fighter().getSpell1());
                            break;
                        case "Monk":
                            observableList = FXCollections.observableList(new Monk().getSpell1());
                            break;
                        case "Paladin":
                            observableList = FXCollections.observableList(new Paladin().getSpell1());
                            break;
                        case "Ranger":
                            observableList = FXCollections.observableList(new Ranger().getSpell1());
                            break;
                        case "Rogue":
                            observableList = FXCollections.observableList(new Rogue().getSpell1());
                            break;
                        case "Sorcerer":
                            observableList = FXCollections.observableList(new Sorcerer().getSpell1());
                            break;
                        case "Warlock":
                            observableList = FXCollections.observableList(new Warlock().getSpell1());
                            break;
                        case "Wizard":
                            observableList = FXCollections.observableList(new Wizard().getSpell1());
                            break;
                    }
                } catch (NullPointerException e) {
                    observableList
                            = FXCollections.observableArrayList(
                                    "Set Class"
                            );
                }
                grid.getChildren().remove(spell3Box);
                spell3Box = new ComboBox(observableList);
                spell3Box.setPromptText("Spell 3");
                grid.add(spell3Box, 4, 11, 2, 1);
            }
        });

        clasBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov,
                    final String oldvalue, final String newvalue) {

                try {
                    switch ((String) clasBox.getValue()) {
                        case "Barbarian":
                            equipI.setText(new Barbarian().getEquipment());
                            break;
                        case "Bard":
                            equipI.setText(new Bard().getEquipment());
                            break;
                        case "Cleric":
                            equipI.setText(new Cleric().getEquipment());
                            break;
                        case "Druid":
                            equipI.setText(new Druid().getEquipment());
                            break;
                        case "Fighter":
                            equipI.setText(new Fighter().getEquipment());
                            break;
                        case "Monk":
                            equipI.setText(new Monk().getEquipment());
                            break;
                        case "Paladin":
                            equipI.setText(new Paladin().getEquipment());
                            break;
                        case "Ranger":
                            equipI.setText(new Ranger().getEquipment());
                            break;
                        case "Rogue":
                            equipI.setText(new Rogue().getEquipment());
                            break;
                        case "Sorcerer":
                            equipI.setText(new Sorcerer().getEquipment());
                            break;
                        case "Warlock":
                            equipI.setText(new Warlock().getEquipment());
                            break;
                        case "Wizard":
                            equipI.setText(new Wizard().getEquipment());
                            break;
                    }
                } catch (NullPointerException e) {
                    equipI.setText("Choose class");
                }
            }
        });
Group root = new Group();
        
        grid.add(new ImageView(image), 0, 0, 2, 4);
        grid.add(prof, 2, 0, 2, 1);
        grid.add(profI, 2, 1, 2, 1);
        grid.add(back, 2, 2, 2, 1);
        grid.add(backI, 2, 3, 6, 1);
        grid.add(clas, 5, 0, 2, 1);
        grid.add(clasBox, 5, 1, 2, 1);
        grid.add(race, 8, 0, 2, 1);
        grid.add(raceBox, 8, 1, 2, 1);
        grid.add(str, 0, 4, 2, 1);
        grid.add(strI, 0, 5, 2, 1);
        grid.add(wis, 3, 6);
        grid.add(wisI, 3, 7, 2, 1);
        grid.add(btnWis, 5, 7);
        grid.add(btnStr, 2, 5);
        grid.add(dex, 3, 4);
        grid.add(dexI, 3, 5, 2, 1);
        grid.add(btnDex, 5, 5);
        grid.add(con, 6, 4);
        grid.add(conI, 6, 5, 2, 1);
        grid.add(btnCon, 8, 5);
        grid.add(intel, 9, 4, 2, 1);
        grid.add(intelI, 9, 5, 2, 1);
        grid.add(btnIntel, 11, 5);
        grid.add(cha, 0, 6, 2, 1);
        grid.add(chaI, 0, 7, 2, 1);
        grid.add(btnCha, 2, 7);
        grid.add(featBox, 4, 9, 3, 1);
        // grid.add(creatureBox,3, 9,2,1);
        grid.add(btnMenu, 8, 12, 2, 1);
        grid.add(btnNextSel, 10, 12, 2, 1);
        grid.add(armor, 6, 6);
        grid.add(armorI, 6, 7, 2, 1);
        grid.add(btnArmor, 8, 7);
        grid.add(hit, 9, 6);
        grid.add(hitI, 9, 7, 2, 1);
        grid.add(btnHit, 11, 7, 2, 1);
        grid.add(skill1, 0, 8);
        grid.add(skill2, 2, 8);
        //grid.add(skill3, 4, 8);
        grid.add(skill1Box, 0, 9, 2, 1);
        grid.add(skill2Box, 2, 9, 2, 1);
        //grid.add(skill3Box, 4, 9, 2, 1);
        grid.add(spell1, 0, 10);
        grid.add(spell2, 2, 10);
        grid.add(spell3, 4, 10);
        grid.add(spell1Box, 0, 11, 2, 1);
        grid.add(spell2Box, 2, 11, 2, 1);
        grid.add(spell3Box, 4, 11, 2, 1);
        grid.add(equip, 7, 8);
        grid.add(equipI, 7, 9, 6, 3);

        
        root.getChildren().add(grid);
        
        return root;
    }
    
    public static int rollD6() {
        return 1 + new Random().nextInt(6);
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