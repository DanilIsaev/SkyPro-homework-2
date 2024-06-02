public class Main {
    public static void main(String[] args) {
        Gryffindor[] studentGriffindor = {new Gryffindor("Гарри", "Поттер", 79, 50, 89, 68, 54),
                new Gryffindor("Гермиона", "Грейнджер ", 99, 89, 69, 78, 70),
                new Gryffindor("Рон", "Уизли", 56, 35, 56, 34, 67)
        };
        for (int i = 0; i < studentGriffindor.length; i++) {
            System.out.println(studentGriffindor[i].toString());
        }

    }
}