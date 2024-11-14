public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача1.
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О сотрудника -  " + fullName);

        //Задача2.
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);


        //Задача3.
        System.out.println("Задача3");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1=fullName1.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1);

    }
}