package DungeonsAndDragons;

import java.util.Random;

public class Monk extends Character {
    private Random rand;
    public Monk() {super();this.rand = new Random();this.initialize();}

    public Monk(String name, String characterClass, String description, String race) {
        super(name, "Monk", description, race);this.initialize();
    }
    
    @Override
    public void initialize() {
        armorClass = 16;
        hitPointMax = rand.nextInt(8) + 8;
        ArmorProf.add("None");
        WeaponProf.add("Simple weapons");
        WeaponProf.add("Shortswords");
        ToolsProf.add("Artizans's tool or Musical Instrument");
        SavingThrowsProf.add("Strength");
        SavingThrowsProf.add("Dexterity");
        SkillsProf.add("Acrobatics");
        SkillsProf.add("Athletics");
        SkillsProf.add("History");
        SkillsProf.add("Insight");
        SkillsProf.add("Religion");
        SkillsProf.add("Stealth");
        Spells.add("none");
        Equipment = "a shortsword or any simple weapon, "
                + "a dungeoneer's pack or an explorer's pack, "
                + "10 darts";
    }
    
    
}