package DungeonsAndDragons;


import java.io.Serializable;
import java.util.ArrayList;

public class Character implements Serializable {
    // Personal Choices
    private String name; 
    private String characterClass; 
    private int characterLevel;    
    private String description;     
    private String gender; 
    private String race; 
    
    //Game Mechanics (locked)
    // So don't need setters, only getters
    private int armorClass; //
    // Calculated using hit dice. In the function, print out what the characters hit dice is
    private int hitPointMax; 
    //private String hitDice; 
    private ArrayList<String> ArmorProf;
    private ArrayList<String> WeaponProf;
    private ArrayList<String> ToolsProf;
    private ArrayList<String> SavingThrowsProf;
    private ArrayList<String> Equipment;
    private AbilityScore str;
    private AbilityScore dex;
    private AbilityScore con;
    private AbilityScore intel;
    private AbilityScore wis;
    private AbilityScore cha;
    
    // Game Mechanics (Player choose from...drop down menu?)
    private String SkillsProf1;
    private String SkillsProf2;
    private String SkillsProf3; 
    private String Spell1;
    private String Spell2;
    private String Spell3;
    
    
    //private TrainedSkills trainedSkills;
    //private PersonalSkills personalSkills;

 

    public Character(String name , String characterClass, int characterLevel, String description, String gender, String race) {
        this.name = name;
        this.characterClass = characterClass;
        this.characterLevel = characterLevel;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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

    public int getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }
    
    /////////////////////////////////////////////////////////////////////////
    
    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPointMax() {
        return hitPointMax;
    }

    public void setHitPointMax(int hitPointMax) {
        this.hitPointMax = hitPointMax;
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
    
    public String getEquipment(int index){
        return Equipment.get(index);
    }
    
    public void setEquipment(String equip){
        this.Equipment.add(equip);
    }

}
