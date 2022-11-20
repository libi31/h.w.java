public class Word {
    String hebrew;
    String english;

    public Word(String hebrew, String english) {
        this.hebrew = hebrew;
        this.english = english;
    }

    public String getHebrew() {
        return this.hebrew;
    }

    public String getEnglish() {
        return this.english;
    }

    public void setHebrew(String hebrew) {
        this.hebrew = hebrew;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String toString() {
        return this.english + " : " + this.hebrew;
    }
}
