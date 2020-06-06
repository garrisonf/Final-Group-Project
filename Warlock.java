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
	
	public void initialize(){
	
	}
	
	public int getArmorClass(){
		armorClass = 17; 
		return armorClass;
	}
	
	public int getHitPointMax(){
		hitPointMax = rand.nextInt(8) + 12;
		return hitPointMax;
	}	

	public ArrayList<String> getArmorProf(){
		ArmorProf.add("Light");
		ArmorProf.add("Medium");
		ArmorProf.add("Shields");
		return ArmorProf;
	}	
	
    public ArrayList<String> getWeaponProf(){
		WeaponProf.add("Simple");
		WeaponProf.add("Martial");
		return WeaponProf;
	}
	
	public ArrayList<String> getToolsProf(){
		ToolsProf.add("None");
		return ToolsProf;
	}
	
	public ArrayList<String> getSavingThrowsProf(){
		SavingThrowsProf.add("Strength");
		SavingThrowsProf.add("Constitution");
		return SavingThrowsProf;
	}
	
	public String getEquipment(){
		Equipment = "Greataxe, two Handaxes, Exlplorer's pack, four Javelins";;
		return Equipment;
	}
	
	public List<String> getSkillsProf1(){
		SkillsProf1.add("Animal Handling");
		SkillsProf1.add("Athletics");
		SkillsProf1.add("Intimidation");
		SkillsProf1.add("Nature");
		SkillsProf1.add("Perception");
		SkillsProf1.add("Survival");
		return SkillsProf1;
	}
	
	public List<String> getSkillsProf2(){
		SkillsProf2.add("Animal Handling");
		SkillsProf2.add("Athletics");
		SkillsProf2.add("Intimidation");
		SkillsProf2.add("Nature");
		SkillsProf2.add("Perception");
		SkillsProf2.add("Survival");
		return SkillsProf2;
	}
	
	public List<String> getSkillsProf3(){
		SkillsProf3.add("None");
		return SkillsProf3;
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