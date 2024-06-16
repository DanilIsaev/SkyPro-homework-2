public class Slytherin extends Hogwarts {
    private int cunningStudent;
    private int determinationStudent;
    private int authorityStudent;

    public Slytherin(String name, String surname, int powerWitchcraft, int transgressionDistance, int cunningStudent, int determinationStudent, int authorityStudent) {
        super(name, surname, powerWitchcraft, transgressionDistance);
        this.cunningStudent = cunningStudent;
        this.determinationStudent = determinationStudent;
        this.authorityStudent = authorityStudent;
    }

    public int getCunningStudent() {
        return cunningStudent;
    }

    public void setCunningStudent(int cunningStudent) {
        this.cunningStudent = cunningStudent;
    }

    public int getDeterminationStudent() {
        return determinationStudent;
    }

    public void setDeterminationStudent(int determinationStudent) {
        this.determinationStudent = determinationStudent;
    }

    public int getAuthorityStudent() {
        return authorityStudent;
    }

    public void setAuthorityStudent(int authorityStudent) {
        this.authorityStudent = authorityStudent;
    }

    @Override
    public String toString() {
        return " Слизерин:" +
                " имя = " + getNameStudent() +
                " фамилия = " + getSurnameStudent() +
                " мощность колдовства = " + getPowerWitchcraft() +
                " растояние трансгресии = " + getTransgressionDistance() +
                " хитрость = " + cunningStudent +
                " решимость = " + determinationStudent +
                " власть = " + authorityStudent +
                '}';
    }

    public void tournamentStudent(Slytherin studentRival) {
        int studentGlassesThis = this.getAuthorityStudent() + this.getCunningStudent() + this.getDeterminationStudent();
        int studentGlassesOther = studentRival.getAuthorityStudent() + studentRival.getCunningStudent() + studentRival.getDeterminationStudent();
        if (studentGlassesThis > studentGlassesOther) {
            System.out.println(this.getNameStudent() + " " + this.getSurnameStudent() + " лучший Слизеринец, чем " + studentRival.getNameStudent() + " " + studentRival.getSurnameStudent());
        } else {
            System.out.println(studentRival.getNameStudent() + " " + studentRival.getSurnameStudent() + " лучший Слизеринец, чем " + this.getNameStudent() + " " + this.getSurnameStudent());
        }
    }
}
