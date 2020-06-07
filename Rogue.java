package DungeonsAndDragons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rogue extends Character{
	private Random rand = new Random();
	
        
        //I need default constructor to call methods
        public Rogue(){super();this.initialize();}
        
        public Rogue(String name,String description,String gender,String race){
            super(name , "Rogue", description, race);this.initialize();
        }
	
	@Override
	public void initialize(){
		armorClass = 13; 
		hitPointMax = rand.nextInt(8) + 8;
		ArmorProf.add("Light");
		WeaponProf.add("Simple");
		WeaponProf.add("hand crossbows");
	    	WeaponProf.add("longswords");
	    	WeaponProf.add("rapiers");
	    	WeaponProf.add("shortswords");
		ToolsProf.add("Thieve's Tool");
		SavingThrowsProf.add("Dexterity");
		SavingThrowsProf.add("Intelligence");
		Equipment = "Leather armor, two daggers, thieves' tools";
		SkillsProf.add("Acrobatics");
		SkillsProf.add("Athletics");
		SkillsProf.add("Deception");
		SkillsProf.add("Insight");
		SkillsProf.add("Intimidation");
		SkillsProf.add("Investigation");
		SkillsProf.add("Perception");
		SkillsProf.add("Performance");
		SkillsProf.add("Persuasion");
		SkillsProf.add("Sleight of Hand");
		SkillsProf.add("Stealth");
		Spells.add("None");
	}
	
}
