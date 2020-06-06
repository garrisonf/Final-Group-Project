package DungeonsAndDragons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Warlock extends Character{
	private Random rand = new Random();
	
        
        //I need default constructor to call methods
        public Warlock(){super();}
        
        public Warlock(String name,String description,String gender,String race){
            super(name , "Warlock", description, gender, race);
        }
	
	@Override
	public void initialize(){
		armorClass = 17; 
		return armorClass;
		hitPointMax = rand.nextInt(8) + 12;
		return hitPointMax;
		ArmorProf.add("Light");
		ArmorProf.add("Medium");
		ArmorProf.add("Shields");
		WeaponProf.add("Simple");
		WeaponProf.add("Martial");
		ToolsProf.add("None");
		SavingThrowsProf.add("Strength");
		SavingThrowsProf.add("Constitution");
		Equipment = "Greataxe, two Handaxes, Exlplorer's pack, four Javelins";
		SkillsProf1.add("Animal Handling");
		SkillsProf1.add("Athletics");
		SkillsProf1.add("Intimidation");
		SkillsProf1.add("Nature");
		SkillsProf1.add("Perception");
		SkillsProf1.add("Survival");
		SkillsProf3.add("None");
		Spell1.add("None");
		Spell2.add("None");
		Spell3.add("None");
	}

}
