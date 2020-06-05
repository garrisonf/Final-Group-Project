package DungeonsAndDragons;


import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Character implements Serializable {
    // Personal Choices
    private String name; 
    private String characterClass;    
    private String description;     
    private String race; 
    
    //Game Mechanics (Character Specific)
    // Only getters
    protected int armorClass; //
    // Calculated using hit dice. In the function, print out what the characters hit dice is
    protected int hitPointMax;  
    protected ArrayList<String> ArmorProf = new ArrayList<>();
    protected ArrayList<String> WeaponProf = new ArrayList<>();
    protected ArrayList<String> ToolsProf = new ArrayList<>();
    protected ArrayList<String> SavingThrowsProf = new ArrayList<>();
    protected String Equipment;
	
	//Not character specific 
    private AbilityScore str;
    private AbilityScore dex;
    private AbilityScore con;
    private AbilityScore intel;
    private AbilityScore wis;
    private AbilityScore cha;
    
    // Game Mechanics (Getters)
    protected List<String> SkillsProf1 = new ArrayList<>();
    protected List<String> SkillsProf2 = new ArrayList<>();
    protected List<String> SkillsProf3 = new ArrayList<>(); 
    protected List<String> Spell1 = new ArrayList<>();
    protected List<String> Spell2 = new ArrayList<>();
    protected List<String> Spell3 = new ArrayList<>();

 

    public Character(String name , String characterClass, String description, String gender, String race) {
        this.name = name;
        this.characterClass = characterClass;
        this.description = description;
        this.gender = gender;
        this.race = race;
        
    }

    public Character(String name, int str, int dex, int con, int intel, int wis, int cha) {
        this.name = name;
        this.str = new AbilityScore(str);
        this.dex = new AbilityScore(dex);
        this.con = new AbilityScore(con);
        this.intel = new AbilityScore(intel);
        this.wis = new AbilityScore(wis);
        this.cha = new AbilityScore(cha);
    }
    
    @Override
    public String toString() {
        return name + ", " + characterClass + " " + description + race 
                + "\nstr:" + str
                + "\ndex:" + dex
                + "\ncon:" + con
                + "\nint:" + intel
                + "\nwis:" + wis
                + "\ncha:" + cha;
    }
    
    
//    public PersonalSkills getPersonalSkills() {
//        return personalSkills;
//    }
//
//    public TrainedSkills getTrainedSkills() {
//        return trainedSkills;
//    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    /////////////////////////////////////////////////////////////////////////
    
    public int getArmorClass() {
        return armorClass;
    }

    public int getHitPointMax() {
        return hitPointMax;
    }
    
    public String getArmorProf(int index){
        return ArmorProf.get(index);
    }
    
    public void setArmorProf(String armorProf){
        this.ArmorProf.add(armorProf);
    }
    
    public String getWeaponProf(int index){
        return WeaponProf.get(index);
    }
    
    public void setWeaponProf(String weaponProf){
        this.WeaponProf.add(weaponProf);
    }
    
    public String getToolsProf(int index){
        return ToolsProf.get(index);
    }
    
    public void setToolsProf(String toolsProf){
        this.ToolsProf.add(toolsProf);
    }
    
    public String getSavingThrowsProf(int index){
        return SavingThrowsProf.get(index);
    }
    
    public void setSavingThrowsProf(String savingThrows){
        this.SavingThrowsProf.add(savingThrows);
    }  
    
    public String getEquipment(){
        return Equipment;
    }
    
    public void setEquipment(String equip){
        this.Equipment.add(equip);
    }
	
	public void setSkillsProf1(){
		this.SkillsProf1 = new ArrayList<String>();
	}
}
