package DungeonsAndDragons;

import java.util.Random;

class Ranger extends Character {
    private Random rand;
    public Ranger() {super();}

    public Ranger(String name, String characterClass, String description, String race) {
        super(name, characterClass, description, race);
    }
    
    @Override
    public void initalize() {
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
        SkillsProf1.add("Animal Handling");
        SkillsProf1.add("Athletics");
        SkillsProf1.add("Insight");
        SkillsProf1.add("Investigation");
        SkillsProf1.add("Nature");
        SkillsProf1.add("Perception");
        SkillsProf1.add("Stealth");
        SkillsProf1.add("Survival");
        Equipment = "scale mail or leather armor, "
                + "two shortswords or two simple melee weapons, "
                + "a dungeoneer's pack or an explorer's pack, "
                + "A longbow and a quiver of 20 arrows";
    }
    
    
}