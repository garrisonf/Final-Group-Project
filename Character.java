public class Character {
    private String gender;
    private String race;
    private String characterClass;
    private String characterLevel;
    
    private Defense defenseStats;
    private AbilityScore stats;
    private AbilityMod statMods;
    private TrainedSkills trainedSkills;
    private PersonalSkills personalSkills;

 

    public Character(String gender, String race, String characterClass, String characterLevel) {
        this.gender = gender;
        this.race = race;
        this.characterClass = characterClass;
        this.characterLevel = characterLevel;
    }
    
    
      public PersonalSkills getPersonalSkills() {
        return personalSkills;
    }

    public TrainedSkills getTrainedSkills() {
        return trainedSkills;
    }

    public AbilityMod getStatMods() {
        return statMods;
    }

    public AbilityScore getStats() {
        return stats;
    }
    
    public Defense getDefenseStats() {
        return defenseStats;
    }

    public void setDefenseStats(Defense defenseStats) {
        this.defenseStats = defenseStats;
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
