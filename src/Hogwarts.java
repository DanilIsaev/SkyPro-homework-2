public class Hogwarts {
    private String nameStudent;
    private String surnameStudent;
    private int powerWitchcraft;
    private int transgressionDistance;

    protected Hogwarts(String name, String surname, int powerWitchcraft, int transgressionDistance) {
        this.nameStudent = name;
        this.surnameStudent = surname;
        this.powerWitchcraft = powerWitchcraft;
        this.transgressionDistance = transgressionDistance;
    }

    public String getNameStudent() {
        return this.nameStudent;
    }

    public String getSurnameStudent() {
        return this.surnameStudent;
    }

    public int getPowerWitchcraft() {
        return this.powerWitchcraft;
    }

    public int getTransgressionDistance() {
        return this.transgressionDistance;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setSurnameStudent(String surnameStudent) {
        this.surnameStudent = surnameStudent;
    }

    public void setPowerWitchcraft(int powerWitchcraft) {
        this.powerWitchcraft = powerWitchcraft;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}
