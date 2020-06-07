package DungeonsAndDragons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Warlock extends Character{
	private Random rand = new Random();
	
        
        //I need default constructor to call methods
        public Warlock(){super();this.initialize();}
        
        public Warlock(String name,String description,String gender,String race){
            super(name , "Warlock", gender, race);this.initialize();
        }
	
	@Override
	public void initialize(){
		armorClass = 17; 
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
