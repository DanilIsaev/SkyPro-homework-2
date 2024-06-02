public class Gryffindor extends Hogwarts {
    private int nobilityGryffindor;
    private int honorGryffindor;
    private int braveryGryffindor;

    public Gryffindor(String name, String surname, int powerWitchcraft, int transgressionDistance, int nobilityGryffindor, int honorGryffindor, int braveryGryffindor) {
        super(name, surname, powerWitchcraft, transgressionDistance);
        this.nobilityGryffindor = nobilityGryffindor;
        this.honorGryffindor = honorGryffindor;
        this.braveryGryffindor = braveryGryffindor;
    }

    public int getNobilityGryffindor() {
        return nobilityGryffindor;
    }

    public void setNobilityGryffindor(int nobilityGryffindor) {
        this.nobilityGryffindor = nobilityGryffindor;
    }

    public int getHonorGryffindor() {
        return honorGryffindor;
    }

    public void setHonorGryffindor(int honorGryffindor) {
        this.honorGryffindor = honorGryffindor;
    }

    public int getBraveryGryffindor() {
        return braveryGryffindor;
    }

    public void setBraveryGryffindor(int braveryGryffindor) {
        this.braveryGryffindor = braveryGryffindor;
    }

    @Override
    public String toString() {
        return " Гриффиндор:" +
                " имя = " + getNameStudent() +
                " фамилия = " + getSurnameStudent() +
                " мощность колдовства = " + getPowerWitchcraft() +
                " растояние трансгресии = " + getTransgressionDistance() +
                " благородство = " + nobilityGryffindor +
                " честь = " + honorGryffindor +
                " храбрость = " + braveryGryffindor +
                '}';
    }
    public void tournamentStudent(Gryffindor studentRival) {
        int studentGlassesThis = this.getBraveryGryffindor() + this.getHonorGryffindor() + this.getNobilityGryffindor();
        int studentGlassesOther = studentRival.getBraveryGryffindor() + studentRival.getHonorGryffindor() + studentRival.getNobilityGryffindor();
        if (studentGlassesThis > studentGlassesOther) {
            System.out.println(this.getNameStudent() + " " + this.getSurnameStudent() + " лучший Гриффендорец, чем " + studentRival.getNameStudent() + " " + studentRival.getSurnameStudent());
        } else {
            System.out.println(studentRival.getNameStudent() + " " + studentRival.getSurnameStudent() + " лучший Гриффендорец, чем " + this.getNameStudent() + " " + this.getSurnameStudent());
        }

    }
}
