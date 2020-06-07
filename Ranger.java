package DungeonsAndDragons;

import java.util.Random;

class Ranger extends Character {
    private Random rand;
    public Ranger() {super();this.rand = new Random();this.initialize();}

    public Ranger(String name, String characterClass, String description, String race) {
        super(name, "Ranger", description, race);this.initialize();
    }
    
    @Override
    public void initialize() {
        armorClass = 13;
        hitPointMax = rand.nextInt(8) + 10;
        ArmorProf.add("Light armor");
        ArmorProf.add("Medium armor");
        ArmorProf.add("Shields");
        WeaponProf.add("Simple weapons");
        WeaponProf.add("Martial weapons");
        ToolsProf.add("None");
        SavingThrowsProf.add("Strength");
        SavingThrowsProf.add("Dexterity");
        SkillsProf.add("Animal Handling");
        SkillsProf.add("Athletics");
        SkillsProf.add("Insight");
        SkillsProf.add("Investigation");
        SkillsProf.add("Nature");
        SkillsProf.add("Perception");
        SkillsProf.add("Stealth");
        SkillsProf.add("Survival");
        Equipment = "scale mail or leather armor, "
                + "two shortswords or two simple melee weapons, "
                + "a dungeoneer's pack or an explorer's pack, "
                + "A longbow and a quiver of 20 arrows";
    }
    
    
}