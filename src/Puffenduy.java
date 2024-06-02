public class Puffenduy extends Hogwarts {
    private int hardworkingStudent;
    private int loyaltyStudent;
    private int honestyStudent;

    public Puffenduy(String name, String surname, int powerWitchcraft, int transgressionDistance, int hardworking, int hoyalty, int honesty) {
        super(name, surname, powerWitchcraft, transgressionDistance);
        this.hardworkingStudent = hardworking;
        this.loyaltyStudent = hoyalty;
        this.honestyStudent = honesty;
    }

    public int getHardworkingStudent() {
        return hardworkingStudent;
    }

    public void setHardworkingStudent(int hardworkingStudent) {
        this.hardworkingStudent = hardworkingStudent;
    }

    public int getLoyaltyStudent() {
        return loyaltyStudent;
    }

    public void setLoyaltyStudent(int loyaltyStudent) {
        this.loyaltyStudent = loyaltyStudent;
    }

    public int getHonestyStudent() {
        return honestyStudent;
    }

    public void setHonestyStudent(int honestyStudent) {
        this.honestyStudent = honestyStudent;
    }

    @Override
    public String toString() {
        return " Пуффендуй:" +
                " имя = " + getNameStudent() +
                " фамилия = " + getSurnameStudent() +
                " мощность колдовства = " + getPowerWitchcraft() +
                " растояние трансгресии = " + getTransgressionDistance() +
                " трудолюбие = " + hardworkingStudent +
                " верность = " + loyaltyStudent +
                " честность = " + honestyStudent +
                '}';
    }

    public void tournamentStudent(Puffenduy studentRival) {
        int studentGlassesThis = this.getHardworkingStudent() + this.getHonestyStudent() + this.getLoyaltyStudent();
        int studentGlassesOther = studentRival.getHardworkingStudent() + studentRival.getHonestyStudent() + studentRival.getLoyaltyStudent();
        if (studentGlassesThis > studentGlassesOther) {
            System.out.println(this.getNameStudent() + " " + this.getSurnameStudent() + " лучший Пуффиндуец, чем " + studentRival.getNameStudent() + " " + studentRival.getSurnameStudent());
        } else {
            System.out.println(studentRival.getNameStudent() + " " + studentRival.getSurnameStudent() + " лучший Пуффиндуец, чем " + this.getNameStudent() + " " + this.getSurnameStudent());
        }
    }
}
