package DungeonsAndDragons;
import java.util.Random;

public class Cleric extends Character{
    private Random rand;

    //Default Constructor
    public Cleric(){super(); this.rand = new Random();this.initialize();}

    public Cleric(String name , String characterClass, String description, String race){
        super(name, "Cleric", description, race);this.initialize();
    }	

    public void initialize(){
        armorClass = 10;
        hitPointMax = rand.nextInt(8) + 8;
        ArmorProf.add("Light");
        ArmorProf.add("Medium");
        ArmorProf.add("Shields");
        WeaponProf.add("Simple");
        ToolsProf.add("None");
        SavingThrowsProf.add("Wisdom");
        SavingThrowsProf.add("Charisma");
        Equipment = "Mace, Warhammer, Scale Mail, Leather Armor, " +
                    "Chain Mail, Light Crossbow, 20 bolts, Priest's Pack, " +
                    "Explorer's Pack, Shield, Holy Symbol";
        SkillsProf.add("History");
        SkillsProf.add("Insight");
        SkillsProf.add("Medicine");
        SkillsProf.add("Persuasion");
        SkillsProf.add("Religion");
        Spells.add("Bane");
        Spells.add("Bless");
        Spells.add("Burning Hands");
        Spells.add("Charm Person");
        Spells.add("Command");
        Spells.add("Create or Destroy Water");
        Spells.add("Cure Wounds");
        Spells.add("Detect Evil and Good");
        Spells.add("Detect Magic");
        Spells.add("Detect Poison and Disease");
        Spells.add("Disguise Self");
        Spells.add("Divine Favor");
        Spells.add("Faerie Fire");
        Spells.add("Fog Cloud");
        Spells.add("Guiding Bolt");
        Spells.add("Healing Word");
        Spells.add("Identify");
        Spells.add("Inflict Wounds");
        Spells.add("Protection from Evil and Good");
        Spells.add("Purify Food and Drink");
        Spells.add("Sanctuary");
        Spells.add("Shield of Faith");
        Spells.add("Speak with Animals");
        Spells.add("Thunderwave");
    }
}
	