public class Main {
    public static void main(String[] args) {
        Gryffindor[] studentGriffindor = {new Gryffindor("Гарри", "Поттер", 79, 50, 89, 68, 54),
                new Gryffindor("Гермиона", "Грейнджер ", 99, 89, 69, 78, 70),
                new Gryffindor("Рон", "Уизли", 56, 35, 56, 34, 67)
        };
        Puffenduy[] studentPuffenduy = {new Puffenduy("Захария","Смит",48,78, 45,23,78),
                new Puffenduy("Седрик","Диггори",67,34, 99,31,52),
                new Puffenduy("Джастин","Финч-Флетчли",85,49, 58,35,77),

        };
        for (int i = 0; i < studentGriffindor.length; i++) {
            System.out.println(studentGriffindor[i].toString());
        }
        for (int i = 0; i < studentPuffenduy.length; i++) {
            System.out.println(studentPuffenduy[i].toString());
        }

    }
}