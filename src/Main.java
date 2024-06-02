public class Main {
    public static void main(String[] args) {
        Gryffindor[] studentGriffindor = {
                new Gryffindor("Гарри", "Поттер", 79, 50, 89, 68, 54),
                new Gryffindor("Гермиона", "Грейнджер ", 99, 89, 69, 78, 70),
                new Gryffindor("Рон", "Уизли", 56, 35, 56, 34, 67)
        };
        Puffenduy[] studentPuffenduy = {
                new Puffenduy("Захария", "Смит", 48, 78, 45, 23, 78),
                new Puffenduy("Седрик", "Диггори", 67, 34, 99, 31, 52),
                new Puffenduy("Джастин", "Финч-Флетчли", 85, 49, 58, 35, 77),

        };
        Slytherin[] studentSlytherin = {
                new Slytherin("Драко", "Малфой", 89, 89, 78, 89, 89),
                new Slytherin("Грэхэм", "Монтегю", 57, 67, 56, 44, 78),
                new Slytherin("Грегори", "Гойл", 68, 56, 88, 77, 56)
        };
        Kogtevran[] studentKogtevran = {
                new Kogtevran("Чжоу", "Чанг", 67, 56, 89,78,98),
                new Kogtevran("Падма", "Патил", 78, 45, 56,90,50),
                new Kogtevran("Маркус", "Белби", 90, 78, 87,45,60)

        };
        for (int i = 0; i < studentGriffindor.length; i++) {
            System.out.println(studentGriffindor[i].toString());
        }
        for (int i = 0; i < studentPuffenduy.length; i++) {
            System.out.println(studentPuffenduy[i].toString());
        }
        for (int i = 0; i < studentSlytherin.length; i++) {
            System.out.println(studentSlytherin[i].toString());
        }
        for (int i = 0; i < studentKogtevran.length; i++) {
            System.out.println(studentKogtevran[i].toString());
        }

        studentPuffenduy[1].tournamentStudent(studentGriffindor[1]);
        studentGriffindor[0].tournamentStudent(studentGriffindor[1]);
    }
}