package DungeonsAndDragons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rogue extends Character{
	private Random rand = new Random();
	
        
        //I need default constructor to call methods
        public Rogue(){super();}
        
        public Rogue(String name,String description,String gender,String race){
            super(name , "Rogue", description, gender, race);
        }
	
	public void initialize(){
		
	}
	
	public int getArmorClass(){
		armorClass = 13; 
		return armorClass;
	}
	
	public int getHitPointMax(){
		hitPointMax = rand.nextInt(8) + 8;
		return hitPointMax;
	}	

	public ArrayList<String> getArmorProf(){
		ArmorProf.add("Light");
		return ArmorProf;
	}	
	
    public ArrayList<String> getWeaponProf(){
		WeaponProf.add("Simple");
		WeaponProf.add("hand crossbows");
	    	WeaponProf.add("longswords");
	    	WeaponProf.add("rapiers");
	    	WeaponProf.add("shortswords");
		return WeaponProf;
	}
	
	public ArrayList<String> getToolsProf(){
		ToolsProf.add("Thieve's Tool");
		return ToolsProf;
	}
	
	public ArrayList<String> getSavingThrowsProf(){
		SavingThrowsProf.add("Dexterity");
		SavingThrowsProf.add("Intelligence");
		return SavingThrowsProf;
	}
	
	public String getEquipment(){
		Equipment = "Leather armor, two daggers, thieves' tools";;
		return Equipment;
	}
	
	public List<String> getSkillsProf1(){
		SkillsProf1.add("Acrobatics");
		SkillsProf1.add("Athletics");
		SkillsProf1.add("Deception");
		SkillsProf1.add("Insight");
		SkillsProf1.add("Intimidation");
		SkillsProf1.add("Investigation");
		SkillsProf1.add("Perception");
		SkillsProf1.add("Performance");
		SkillsProf1.add("Persuasion");
		SkillsProf1.add("Sleight of Hand");
		SkillsProf1.add("Stealth");
		return SkillsProf1;
	}
	
	public List<String> getSkillsProf2(){
		SkillsProf2.add("Acrobatics");
		SkillsProf2.add("Athletics");
		SkillsProf2.add("Deception");
		SkillsProf2.add("Insight");
		SkillsProf2.add("Intimidation");
		SkillsProf2.add("Investigation");
		SkillsProf2.add("Perception");
		SkillsProf2.add("Performance");
		SkillsProf2.add("Persuasion");
		SkillsProf2.add("Sleight of Hand");
		SkillsProf2.add("Stealth");
		return SkillsProf2;
	}
	
	
	public List<String> getSpell1(){
		Spell1.add("None");
		return Spell1;
	}
	
	public List<String> getSpell2(){
		Spell2.add("None");
		return Spell2;
	}
	
	public List<String> getSpell3(){
		Spell3.add("None");
		return Spell3;
	}
}
