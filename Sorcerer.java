package DungeonsAndDragons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorcerer extends Character{
	private Random rand = new Random();
	
        
        //I need default constructor to call methods
        public Sorcerer(){super();this.initialize();}
        
        public Sorcerer(String name,String description,String gender,String race){
            super(name , "Sorcerer", description, race);this.initialize();
        }
	
	@Override
	public void initialize(){
		armorClass = 10; 
		hitPointMax = rand.nextInt(6) + 6;
		ArmorProf.add("none");
		WeaponProf.add("Daggers");
		WeaponProf.add("darts");
		WeaponProf.add("slings");
		WeaponProf.add("quarterstaffs");
		WeaponProf.add("light crossbows");
		ToolsProf.add("None");
		SavingThrowsProf.add("Charisma");
		SavingThrowsProf.add("Constitution");
		Equipment = "dungeoneer's pack, explorer's pack, Two daggers";
		SkillsProf.add("Arcana");
		SkillsProf.add("Deception");
		SkillsProf.add("Insight");
		SkillsProf.add("Intimidation");
		SkillsProf.add("Persuasion");
		SkillsProf.add("Religion");
		Spells.add("Burning Hands");
		Spells.add("Charm Person");
		Spells.add("Color Spray");
		Spells.add("Comprehend Languages");
		Spells.add("Detect Magic");
		Spells.add("Disguise Self");
		Spells.add("Expeditious Retreat");
		Spells.add("False Life");
		Spells.add("Feather Fall");
		Spells.add("Fog Cloud");
		Spells.add("Jump");
		Spells.add("Mage Armor");
		Spells.add("Magic Missile");
		Spells.add("Ray of Sickness");
		Spells.add("Shield");
		Spells.add("Silent Image");
		Spells.add("Sleep");
		Spells.add("Thunderwave");
		
	}
}
