package DungeonsAndDragons;
import java.util.Random;

public class Druid extends Character{
    private Random rand;

    //Default Constructor
    public Druid(){super();this.rand = new Random();this.initialize();}

    public Druid(String name , String characterClass, String description, String race){
        super(name, "Druid", description, race);this.initialize();
    }	

    public void initialize(){
        armorClass = 13;
        hitPointMax = rand.nextInt(8) + 8;
        ArmorProf.add("Light (Not made of metal)");
        ArmorProf.add("Medium (Not made of metal)");
        ArmorProf.add("Shields (Not made of metal)");
        WeaponProf.add("Clubs");
        WeaponProf.add("Daggers");
        WeaponProf.add("Darts");
        WeaponProf.add("Javelins");
        WeaponProf.add("Maces");
        WeaponProf.add("Quarterstaffs");
        WeaponProf.add("Scimitars");
        WeaponProf.add("Sickles");
        WeaponProf.add("Slings");
        WeaponProf.add("Spears");
        ToolsProf.add("Herbalism kit");
        SavingThrowsProf.add("Intelligence");
        SavingThrowsProf.add("Wisdom");        
        Equipment = "Wooden Shield, Scimitar, Leather Armor, Explorer's Pack, Druidic Focus";
        SkillsProf.add("Arcana");
        SkillsProf.add("Animal Handling");
        SkillsProf.add("Insight");
        SkillsProf.add("Medicine");
        SkillsProf.add("Nature");
        SkillsProf.add("Perception");
        SkillsProf.add("Religion");
        SkillsProf.add("Survival");
        Spells.add("Animal Friendship");
        Spells.add("Charm Person");
        Spells.add("Create or Destroy Water");
        Spells.add("Cure Wounds");
        Spells.add("Detect Magic");
        Spells.add("Detect Poison and Disease");
        Spells.add("Entangle");
        Spells.add("Faerie Fire");
        Spells.add("Fog Cloud");
        Spells.add("Goodberry");
        Spells.add("Healing Word");
        Spells.add("Jump");
        Spells.add("Longstrider");
        Spells.add("Purify Food and Drink");
        Spells.add("Speak with Animals");
        Spells.add("Thunderwave");
    }
}
	