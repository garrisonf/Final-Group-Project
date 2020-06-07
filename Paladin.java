package DungeonsAndDragons;

import java.util.Random;

class Paladin extends Character {
    private Random rand;
    public Paladin() {super();this.rand = new Random();this.initialize();}

    public Paladin(String name, String characterClass, String description, String race) {
        super(name, "Paladin", description, race);this.initialize();
    }
    
    @Override
    public void initialize() {
        armorClass = 18;
        hitPointMax = rand.nextInt(8) + 10;
        ArmorProf.add("All armor");
        ArmorProf.add("Shields");
        WeaponProf.add("Simple weapons");
        WeaponProf.add("Martial weapons");
        ToolsProf.add("None");
        SavingThrowsProf.add("Wisdom");
        SavingThrowsProf.add("Charisma");
        SkillsProf.add("Athletics");
        SkillsProf.add("Insight");
        SkillsProf.add("Intimidation");
        SkillsProf.add("Medicine");
        SkillsProf.add("Persuasion");
        SkillsProf.add("Religion");
        Spells.add("none");
        Equipment = "a martial weapon and a shield or two martial weapons, "
                + "five javelins or any simple melee weapon, "
                + "a priest's pack or an explorer's pack, "
                + " Chain mail and a holy symbol";
    }
    
    
}