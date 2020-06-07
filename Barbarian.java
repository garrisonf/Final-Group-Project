package DungeonsAndDragons;
import java.util.Random;

public class Barbarian extends Character{
	private Random rand;
	
        //Default Constructor
        public Barbarian(){super(); this.rand = new Random();this.initialize();}
        
        public Barbarian(String name , String characterClass, String description, String race){
            super(name, "Barbarian", description, race);this.initialize();
        }	
        
        @Override
	public void initialize(){
            armorClass = 18;
            hitPointMax = rand.nextInt(8) + 12;
            ArmorProf.add("Light");
            ArmorProf.add("Medium");
            ArmorProf.add("Shields");
            WeaponProf.add("Simple");
            WeaponProf.add("Martial");
            ToolsProf.add("None");
            SavingThrowsProf.add("Strength");
            SavingThrowsProf.add("Constitution");
            Equipment = "Greataxe, two Handaxes, Exlplorer's pack, four Javelins";
            SkillsProf.add("Animal Handling");
            SkillsProf.add("Athletics");
            SkillsProf.add("Intimidation");
            SkillsProf.add("Nature");
            SkillsProf.add("Perception");
            SkillsProf.add("Survival");
            Spells.add("None");
	}
}
	