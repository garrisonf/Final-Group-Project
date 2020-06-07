package DungeonsAndDragons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wizard extends Character{
	private Random rand = new Random();
	
        
        //I need default constructor to call methods
        public Wizard(){super();this.initialize();}
        
        public Wizard(String name,String description,String gender,String race){
            super(name , "Wizard", description, race);this.initialize();
        }
	
	@Override
	public void initialize(){
		armorClass = 11; 
		hitPointMax = rand.nextInt(6) + 6;
		ArmorProf.add("none");
		WeaponProf.add("Daggers");
		WeaponProf.add("darts");
		WeaponProf.add("quarterstaffs");
		WeaponProf.add("light crossbows");
		SavingThrowsProf.add("Intelligence");
		SavingThrowsProf.add("Wisdom");
		Equipment = "Quarterstaff, Dagger, Spellbook";
		SkillsProf.add("Arcana");
		SkillsProf.add("History");
		SkillsProf.add("Insight");
		SkillsProf.add("Investigation");
		SkillsProf.add("Medicine");
		SkillsProf.add("Religion");
		Spells.add("Alarm");
		Spells.add("Burning Hands");
		Spells.add("Charm Person");
		Spells.add("Color Spray");
		Spells.add("Comprehend Languages");
		Spells.add("Detect Magic");
		Spells.add("Disguise Self");
		Spells.add("Expeditious Retreat");
		Spells.add("False Life");
		Spells.add("Feather Fall");
		Spells.add("Find Familiar");
		Spells.add("Floating Disk");
		Spells.add("Fog Cloud");
		Spells.add("Grease");
		Spells.add("Hideous Laughter");
		Spells.add("Identify");
		Spells.add("Illusory Script");
		Spells.add("Jump");
		Spells.add("Longstrider");
		Spells.add("Mage Armor");
		Spells.add("Magic Missile");
		Spells.add("Protection from Evil and Good");
		Spells.add("Ray of Sickness");
		Spells.add("Shield");
		Spells.add("Silent Image");
		Spells.add("Sleep");
		Spells.add("Thunderwave");
		Spells.add("Unseen Servant");
		
	}
	
}
