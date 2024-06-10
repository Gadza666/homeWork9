public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(" Task 1");

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = (middleName + " " + firstName + " " + lastName);
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println(" Task 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println(" Task 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Ф. И. О. сотрудника — " + fullName);

    }
}