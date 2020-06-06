package DungeonsAndDragons;


import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Character implements Serializable {
    // Personal Choices
    protected String name; 
    protected String characterClass;    
    protected String description;     
    protected String race; 
    
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
    protected AbilityScore str;
    protected AbilityScore dex;
    protected AbilityScore con;
    protected AbilityScore intel;
    protected AbilityScore wis;
    protected AbilityScore cha;
    
    // Game Mechanics (Getters)
    protected List<String> SkillsProf1 = new ArrayList<>();
    protected List<String> SkillsProf2 = new ArrayList<>();
    protected List<String> SkillsProf3 = new ArrayList<>(); 
    protected List<String> Spell1 = new ArrayList<>();
    protected List<String> Spell2 = new ArrayList<>();
    protected List<String> Spell3 = new ArrayList<>();

 public Character(){};

    public Character(String name , String characterClass, String description, String race) {
        this.name = name;
        this.characterClass = characterClass;
        this.description = description;
        //this.gender = gender;
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
    
    protected void initalize() {
        System.err.println("Must Be Overridden In Subclass");
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
    
    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }
    
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

        
    public String getName() {
	return name;
    }

    public void setName(String name) {
            this.name = name;
    } 

    public String getDescription() {
            return description;
    }

    public void setDescription(String description) {
            this.description = description;
    }

    /////////////////////////////////////////////////////////////////////////
    
    public int getArmorClass() {
        return armorClass;
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
    
    public ArrayList<String> getArmorProf(){
        return ArmorProf;
    }
    
    public void setArmorProf(String armorProf){
        this.ArmorProf.add(armorProf);
    }
    
    public String getWeaponProf(int index){
        return WeaponProf.get(index);
    }
    
    public ArrayList<String> getWeaponProf(){
        return WeaponProf;
    }
    
    public void setWeaponProf(String weaponProf){
        this.WeaponProf.add(weaponProf);
    }
    
    public String getToolsProf(int index){
        return ToolsProf.get(index);
    }
    
    public ArrayList<String> getToolsProf(){
        return ToolsProf;
    }
    
    public void setToolsProf(String toolsProf){
        this.ToolsProf.add(toolsProf);
    }
    
    public String getSavingThrowsProf(int index){
        return SavingThrowsProf.get(index);
    }
    
    public ArrayList<String> getSavingThrowsProf(){
        return SavingThrowsProf;
    }
    
    public void setSavingThrowsProf(String savingThrows){
        this.SavingThrowsProf.add(savingThrows);
    }  
    
    public String getEquipment(){
        return Equipment;
    }
   

    

    public AbilityScore getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str.setValue(str);
    }

    public AbilityScore getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex.setValue(dex);
    }

    public AbilityScore getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con.setValue(con);
    }

    public AbilityScore getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel.setValue(intel);
    }

    public AbilityScore getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis.setValue(wis);
    }

    public AbilityScore getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha.setValue(cha);
    }

}
