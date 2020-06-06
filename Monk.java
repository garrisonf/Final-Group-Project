package DungeonsAndDragons;

import java.util.Random;

class Monk extends Character {
    private Random rand;
    public Monk() {super();}

    public Monk(String name, String characterClass, String description, String race) {
        super(name, characterClass, description, race);
    }
    
    @Override
    public void initalize() {
        armorClass = 16;
        hitPointMax = rand.nextInt(8) + 8;
        ArmorProf.add("None");
        WeaponProf.add("Simple weapons");
        WeaponProf.add("Shortswords");
        ToolsProf.add("Artizans's tool or Musical Instrument");
        SavingThrowsProf.add("Strength");
        SavingThrowsProf.add("Dexterity");
        SkillsProf1.add("Acrobatics");
        SkillsProf1.add("Athletics");
        SkillsProf1.add("History");
        SkillsProf1.add("Insight");
        SkillsProf1.add("Religion");
        SkillsProf1.add("Stealth");
        Equipment = "a shortsword or any simple weapon, "
                + "a dungeoneer's pack or an explorer's pack, "
                + "10 darts";
    }
    
    
}