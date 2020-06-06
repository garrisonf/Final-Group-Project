//Name: Jun Hyeok Bae
package DungeonsAndDragons;

import java.util.Random;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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

    ComboBox skill1Box, skill2Box, skill3Box, spell1Box, spell2Box, spell3Box;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Character Sheet");
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

        /*
        ObservableList<String> backList
                = FXCollections.observableArrayList(
                        "Background 1",
                        "Background 2",
                        "Background 3"
                );
        final ComboBox backBox = new ComboBox(backList);
        backBox.setPromptText("Background");
         */
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
        /*
        ObservableList<String> creatureList
                = FXCollections.observableArrayList(
                        "ALMIRAJ",
                        "CAT",
                        "BAT",
                        "FLYING MONKEY",
                        "FROG",
                        "HAWK",
                        "CRAB",
                        "LIZARD",
                        "OCTOPUS",
                        "OWL",
                        "POISONOUS SNAKE",
                        "Adult White Dragon",
                        "FISH (QUIPPER)",
                        "RAVEN",
                        "RAT",
                        "SEAHORSE",
                        "SPIDER",
                        "TRESSYM",
                        "WEASEL",
                        "IMP",
                        "PSEUDODRAGON",
                        "QUASIT",
                        "SPRITE",
                        "CRANIUM RAT",
                        "GAZER",
                        "CRAWLING CLAW",
                );
        final ComboBox creatureBox = new ComboBox(creatureList);
        creatureBox.setPromptText("Creature");
         */
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
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf2());
                            break;
                        case "Bard":
                            observableList = FXCollections.observableList(new Bard().getSkillsProf2());
                            break;
                        case "Cleric":
                            observableList = FXCollections.observableList(new Cleric().getSkillsProf2());
                            break;
                        case "Druid":
                            observableList = FXCollections.observableList(new Druid().getSkillsProf2());
                            break;
                        case "Fighter":
                            observableList = FXCollections.observableList(new Fighter().getSkillsProf2());
                            break;
                        case "Monk":
                            observableList = FXCollections.observableList(new Monk().getSkillsProf2());
                            break;
                        case "Paladin":
                            observableList = FXCollections.observableList(new Paladin().getSkillsProf2());
                            break;
                        case "Ranger":
                            observableList = FXCollections.observableList(new Ranger().getSkillsProf2());
                            break;
                        case "Rogue":
                            observableList = FXCollections.observableList(new Rogue().getSkillsProf2());
                            break;
                        case "Sorcerer":
                            observableList = FXCollections.observableList(new Sorcerer().getSkillsProf2());
                            break;
                        case "Warlock":
                            observableList = FXCollections.observableList(new Warlock().getSkillsProf2());
                            break;
                        case "Wizard":
                            observableList = FXCollections.observableList(new Wizard().getSkillsProf2());
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
        /*
        skill3Box = new ComboBox(FXCollections.observableArrayList());
        clasBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> ov,
                    final String oldvalue, final String newvalue) {
                ObservableList<String> observableList = FXCollections.observableArrayList("Set Class");
                try {
                    switch ((String) clasBox.getValue()) {
                        case "Barbarian":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf3());
                            break;
                        case "Bard":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf3());
                            break;
                        case "Cleric":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf3());
                            break;
                        case "Druid":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf3());
                            break;
                        case "Fighter":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf3());
                            break;
                        case "Monk":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf3());
                            break;
                        case "Paladin":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf3());
                            break;
                        case "Ranger":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf3());
                            break;
                        case "Rogue":
                            observableList = FXCollections.observableList(new Rogue().getSkillsProf3());
                            break;
                        case "Sorcerer":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf3());
                            break;
                        case "Warlock":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf3());
                            break;
                        case "Wizard":
                            observableList = FXCollections.observableList(new Barbarian().getSkillsProf3());
                            break;
                    }
                } catch (NullPointerException e) {
                    observableList
                            = FXCollections.observableArrayList(
                                    "Set Class"
                            );
                }
                grid.getChildren().remove(skill3Box);
                skill3Box = new ComboBox(observableList);
                skill3Box.setPromptText("Skill 3");
                grid.add(skill3Box, 4, 9, 2, 1);
            }
        });
         */
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
                            observableList = FXCollections.observableList(new Barbarian().getSpell2());
                            break;
                        case "Bard":
                            observableList = FXCollections.observableList(new Bard().getSpell2());
                            break;
                        case "Cleric":
                            observableList = FXCollections.observableList(new Cleric().getSpell2());
                            break;
                        case "Druid":
                            observableList = FXCollections.observableList(new Druid().getSpell2());
                            break;
                        case "Fighter":
                            observableList = FXCollections.observableList(new Fighter().getSpell2());
                            break;
                        case "Monk":
                            observableList = FXCollections.observableList(new Monk().getSpell2());
                            break;
                        case "Paladin":
                            observableList = FXCollections.observableList(new Paladin().getSpell2());
                            break;
                        case "Ranger":
                            observableList = FXCollections.observableList(new Ranger().getSpell2());
                            break;
                        case "Rogue":
                            observableList = FXCollections.observableList(new Rogue().getSpell2());
                            break;
                        case "Sorcerer":
                            observableList = FXCollections.observableList(new Sorcerer().getSpell2());
                            break;
                        case "Warlock":
                            observableList = FXCollections.observableList(new Warlock().getSpell2());
                            break;
                        case "Wizard":
                            observableList = FXCollections.observableList(new Wizard().getSpell2());
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
                            observableList = FXCollections.observableList(new Barbarian().getSpell3());
                            break;
                        case "Bard":
                            observableList = FXCollections.observableList(new Bard().getSpell3());
                            break;
                        case "Cleric":
                            observableList = FXCollections.observableList(new Cleric().getSpell3());
                            break;
                        case "Druid":
                            observableList = FXCollections.observableList(new Druid().getSpell3());
                            break;
                        case "Fighter":
                            observableList = FXCollections.observableList(new Fighter().getSpell3());
                            break;
                        case "Monk":
                            observableList = FXCollections.observableList(new Monk().getSpell3());
                            break;
                        case "Paladin":
                            observableList = FXCollections.observableList(new Paladin().getSpell3());
                            break;
                        case "Ranger":
                            observableList = FXCollections.observableList(new Ranger().getSpell3());
                            break;
                        case "Rogue":
                            observableList = FXCollections.observableList(new Rogue().getSpell3());
                            break;
                        case "Sorcerer":
                            observableList = FXCollections.observableList(new Sorcerer().getSpell3());
                            break;
                        case "Warlock":
                            observableList = FXCollections.observableList(new Warlock().getSpell3());
                            break;
                        case "Wizard":
                            observableList = FXCollections.observableList(new Wizard().getSpell3());
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

        Scene scene = new Scene(new Group(), 900, 500);
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

        Group root = (Group) scene.getRoot();
        root.getChildren().add(grid);
        stage.setScene(scene);
        stage.show();
    }

    public static int rollD6() {
        return 1 + new Random().nextInt(6);
    }
}
