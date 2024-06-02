public class Kogtevran extends Hogwarts {
    private int mindStudent;
    private int witStudent;
    private int creationStudent;

    public Kogtevran(String name, String surname, int powerWitchcraft, int transgressionDistance, int mindStudent, int witStudent, int creationStudent) {
        super(name, surname, powerWitchcraft, transgressionDistance);
        this.mindStudent = mindStudent;
        this.witStudent = witStudent;
        this.creationStudent = creationStudent;
    }

    public int getMindStudent() {
        return mindStudent;
    }

    public void setMindStudent(int mindStudent) {
        this.mindStudent = mindStudent;
    }

    public int getWitStudent() {
        return witStudent;
    }

    public void setWitStudent(int witStudent) {
        this.witStudent = witStudent;
    }

    public int getCreationStudent() {
        return creationStudent;
    }

    public void setCreationStudent(int creationStudent) {
        this.creationStudent = creationStudent;
    }

    @Override
    public String toString() {
        return " Когтевран:" +
                " имя = " + getNameStudent() +
                " фамилия = " + getSurnameStudent() +
                " мощность колдовства = " + getPowerWitchcraft() +
                " растояние трансгресии = " + getTransgressionDistance() +
                " ум = " + mindStudent +
                " остроумие = " + witStudent +
                " творчество = " + creationStudent +
                '}';
    }
}
