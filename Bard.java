package DungeonsAndDragons;
import java.util.Random;

public class Bard extends Character{
    private Random rand;

    //Default Constructor
    public Bard(){super();}

    public Bard(String name , String characterClass, String description, String race){
        super(name, "Bard", description, race);
        this.rand = new Random();
    }	

    public void initialize(){
        armorClass = 13;
        hitPointMax = rand.nextInt(8) + 8;
        ArmorProf.add("Light");
        WeaponProf.add("Simple");
        WeaponProf.add("Hand Crossbows");
        WeaponProf.add("Longswords");
        WeaponProf.add("Rapiers");
        WeaponProf.add("Shortswords");
        ToolsProf.add("Drum");
        ToolsProf.add("Flute");
        ToolsProf.add("Lute");
        SavingThrowsProf.add("Dexterity");
        SavingThrowsProf.add("Charisma");
        Equipment = "Rapier, Longsword, Diplomat's pack, Entertainer's pack, " +
                    "Lute, Leather armor and a dagger";
        SkillsProf.add("Persuasion");
        SkillsProf.add("Deception");
        SkillsProf.add("Intimidation");
        SkillsProf.add("Insight");
        SkillsProf.add("Medicine");
        SkillsProf.add("Perception");
        SkillsProf.add("Arcana");
        SkillsProf.add("Religion");
        SkillsProf.add("Nature");
        SkillsProf.add("Investigation");
        SkillsProf.add("Stealth");
        Spells.add("Animal Friendship");
        Spells.add("Bane");
        Spells.add("Charm Person");
        Spells.add("Comprehend Languages");
        Spells.add("Cure Wounds");
        Spells.add("Detect Magic");
        Spells.add("Disguise Self");
        Spells.add("Faerie Fire");
        Spells.add("Feather Fall");
        Spells.add("Healing Word");
        Spells.add("Heroism");
        Spells.add("Hideous Laughter");
        Spells.add("Identify");
        Spells.add("Illusory Script");
        Spells.add("Longstrider");
        Spells.add("Silent Image");
        Spells.add("Sleep");
        Spells.add("Speak with Animals");
        Spells.add("Thunderwave");
        Spells.add("Unseen Servant");
    }
}
	