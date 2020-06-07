package DungeonsAndDragons;

import java.util.Random;

class Fighter extends Character {
    private Random rand;
    public Fighter() {super();this.rand = new Random();this.initialize();}

    public Fighter(String name, String characterClass, String description, String race) {
        super(name, "Fighter", description, race);this.initialize();
    }
    
    @Override
    public void initialize() {
        armorClass = 16;
        hitPointMax = rand.nextInt(8) + 10;
        ArmorProf.add("All armor");
        ArmorProf.add("Shields");
        WeaponProf.add("Simple weapons");
        ToolsProf.add("None");
        SavingThrowsProf.add("Strength");
        SavingThrowsProf.add("Constitution");
        SkillsProf.add("Acrobatics");
        SkillsProf.add("Animal Handling");
        SkillsProf.add("Athletics");
        SkillsProf.add("History");
        SkillsProf.add("Insight");
        SkillsProf.add("Intimidation");
        SkillsProf.add("Perception");
        SkillsProf.add("Survival");
        Spells.add("none");
        Equipment = "chain mail or (*b*) leather armor,"
                + " longbow, and 20 arrows,"
                + " a martial weapon and a shield or two martial weapons, "
                + " a light crossbow and 20 bolts or (*b*) two handaxes"
                + ", a dungeoneer's pack or an explorer's pack";
    }
    
    
}
