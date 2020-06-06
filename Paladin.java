package DungeonsAndDragons;

import java.util.Random;

class Paladin extends Character {
    private Random rand;
    public Paladin() {super();}

    public Paladin(String name, String characterClass, String description, String race) {
        super(name, characterClass, description, race);
    }
    
    @Override
    public void initalize() {
        armorClass = 18;
        hitPointMax = rand.nextInt(8) + 10;
        ArmorProf.add("All armor");
        ArmorProf.add("Shields");
        WeaponProf.add("Simple weapons");
        WeaponProf.add("Martial weapons");
        ToolsProf.add("None");
        SavingThrowsProf.add("Wisdom");
        SavingThrowsProf.add("Charisma");
        SkillsProf1.add("Athletics");
        SkillsProf1.add("Insight");
        SkillsProf1.add("Intimidation");
        SkillsProf1.add("Medicine");
        SkillsProf1.add("Persuasion");
        SkillsProf1.add("Religion");
        Equipment = "a martial weapon and a shield or two martial weapons, "
                + "five javelins or any simple melee weapon, "
                + "a priest's pack or an explorer's pack, "
                + " Chain mail and a holy symbol";
    }
    
    
}