package DungeonsAndDragons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wizard extends Character{
	private Random rand = new Random();
	
        
        //I need default constructor to call methods
        public Wizard(){super();}
        
        public Wizard(String name,String description,String gender,String race){
            super(name , "Wizard", description, gender, race);
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
		SkillsProf1.add("Arcana");
		SkillsProf1.add("History");
		SkillsProf1.add("Insight");
		SkillsProf1.add("Investigation");
		SkillsProf1.add("Medicine");
		SkillsProf1.add("Religion");
		SkillsProf2.add("Arcana");
		SkillsProf2.add("History");
		SkillsProf2.add("Insight");
		SkillsProf2.add("Investigation");
		SkillsProf2.add("Medicine");
		SkillsProf2.add("Religion");
		Spell1.add("Alarm");
		Spell1.add("Burning Hands");
		Spell1.add("Charm Person");
		Spell1.add("Color Spray");
		Spell1.add("Comprehend Languages");
		Spell1.add("Detect Magic");
		Spell1.add("Disguise Self");
		Spell1.add("Expeditious Retreat");
		Spell1.add("False Life");
		Spell1.add("Feather Fall");
		Spell1.add("Find Familiar");
		Spell1.add("Floating Disk");
		Spell1.add("Fog Cloud");
		Spell1.add("Grease");
		Spell1.add("Hideous Laughter");
		Spell1.add("Identify");
		Spell1.add("Illusory Script");
		Spell1.add("Jump");
		Spell1.add("Longstrider");
		Spell1.add("Mage Armor");
		Spell1.add("Magic Missile");
		Spell1.add("Protection from Evil and Good");
		Spell1.add("Ray of Sickness");
		Spell1.add("Shield");
		Spell1.add("Silent Image");
		Spell1.add("Sleep");
		Spell1.add("Thunderwave");
		Spell1.add("Unseen Servant");
		Spell2.add("Alarm");
		Spell2.add("Burning Hands");
		Spell2.add("Charm Person");
		Spell2.add("Color Spray");
		Spell2.add("Comprehend Languages");
		Spell2.add("Detect Magic");
		Spell2.add("Disguise Self");
		Spell2.add("Expeditious Retreat");
		Spell2.add("False Life");
		Spell2.add("Feather Fall");
		Spell2.add("Find Familiar");
		Spell2.add("Floating Disk");
		Spell2.add("Fog Cloud");
		Spell2.add("Grease");
		Spell2.add("Hideous Laughter");
		Spell2.add("Identify");
		Spell2.add("Illusory Script");
		Spell2.add("Jump");
		Spell2.add("Longstrider");
		Spell2.add("Mage Armor");
		Spell2.add("Magic Missile");
		Spell2.add("Protection from Evil and Good");
		Spell2.add("Ray of Sickness");
		Spell2.add("Shield");
		Spell2.add("Silent Image");
		Spell2.add("Sleep");
		Spell2.add("Thunderwave");
		Spell2.add("Unseen Servant");
		Spell3.add("Alarm");
		Spell3.add("Burning Hands");
		Spell3.add("Charm Person");
		Spell3.add("Color Spray");
		Spell3.add("Comprehend Languages");
		Spell3.add("Detect Magic");
		Spell3.add("Disguise Self");
		Spell3.add("Expeditious Retreat");
		Spell3.add("False Life");
		Spell3.add("Feather Fall");
		Spell3.add("Find Familiar");
		Spell3.add("Floating Disk");
		Spell3.add("Fog Cloud");
		Spell3.add("Grease");
		Spell3.add("Hideous Laughter");
		Spell3.add("Identify");
		Spell3.add("Illusory Script");
		Spell3.add("Jump");
		Spell3.add("Longstrider");
		Spell3.add("Mage Armor");
		Spell3.add("Mage Armor");
		Spell3.add("Magic Missile");
		Spell3.add("Protection from Evil and Good");
		Spell3.add("Ray of Sickness");
		Spell3.add("Shield");
		Spell3.add("Silent Image");
		Spell3.add("Sleep");
		Spell3.add("Thunderwave");
		Spell3.add("Unseen Servant");
		
	}
	
}
