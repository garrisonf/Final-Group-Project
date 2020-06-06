package DungeonsAndDragons;

import java.util.Random;

class Fighter extends Character {
    private Random rand;
    public Fighter() {super();}

    public Fighter(String name, String characterClass, String description, String race) {
        super(name, characterClass, description, race);
    }
    
    @Override
    public void initalize() {
        armorClass = 16;
        hitPointMax = rand.nextInt(8) + 10;
        ArmorProf.add("All armor");
        ArmorProf.add("Shields");
        WeaponProf.add("Simple weapons");
        ToolsProf.add("None");
        SavingThrowsProf.add("Strength");
        SavingThrowsProf.add("Constitution");
        SkillsProf1.add("Acrobatics");
        SkillsProf1.add("Animal Handling");
        SkillsProf1.add("Athletics");
        SkillsProf1.add("History");
        SkillsProf1.add("Insight");
        SkillsProf1.add("Intimidation");
        SkillsProf1.add("Perception");
        SkillsProf1.add("Survival");
        Equipment = "chain mail or (*b*) leather armor,"
                + " longbow, and 20 arrows,"
                + " a martial weapon and a shield or two martial weapons, "
                + " a light crossbow and 20 bolts or (*b*) two handaxes"
                + ", a dungeoneer's pack or an explorer's pack";
    }
    
    
}