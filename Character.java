package DungeonsAndDragons;


import java.io.Serializable;

public class Character implements Serializable {
    private String name;
    private String gender;
    private String race;
    private String characterClass;
    private String characterLevel;
    private int armorClass;
    private int hitPointMax;
    
    private AbilityScore str;
    private AbilityScore dex;
    private AbilityScore con;
    private AbilityScore intel;
    private AbilityScore wis;
    private AbilityScore cha;
    //private TrainedSkills trainedSkills;
    //private PersonalSkills personalSkills;

 

    public Character(String name ,String gender, String race, String characterClass, String characterLevel) {
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.characterClass = characterClass;
        this.characterLevel = characterLevel;
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
        return name + ", " + characterClass + " " + race 
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

    public String getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(String characterLevel) {
        this.characterLevel = characterLevel;
    }
}
