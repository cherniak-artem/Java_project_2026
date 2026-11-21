package lab_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task_Main {

    //Завдання 1
    //Типізований цикл for-each (варіант c)
    //Підрахунок загальної кількості студентів інституту

    public static int countAllStudents(Institute institute) {

        int count = 0;

        for (Faculty faculty : institute.getFaculties()) {
            for (Student student : faculty.getStudents()) {
                count++;
            }
        }

        return count;
    }

    //Завдання 2
    //Нетипізований ітератор (варіант a)
    //Пошук факультету з найбільшою кількістю студентів

    public static Faculty findLargestFaculty(Institute institute) {

        Faculty largestFaculty = null;
        int maxStudents = -1;

        Iterator facultyIterator =
                institute.getFaculties().iterator();

        while (facultyIterator.hasNext()) {

            Faculty faculty = (Faculty) facultyIterator.next();

            Iterator studentIterator =
                    faculty.getStudents().iterator();

            int studentCount = 0;

            while (studentIterator.hasNext()) {
                studentIterator.next();
                studentCount++;
            }

            if (studentCount > maxStudents) {
                maxStudents = studentCount;
                largestFaculty = faculty;
            }
        }

        return largestFaculty;
    }


    //Завдання 3
    //Типізований ітератор Iterator<Student> (варіант b)
    //Пошук студентів із середнім балом від 95 до 100

    public static List<Student> findExcellentStudents(
            Institute institute) {

        List<Student> excellentStudents = new ArrayList<>();

        for (Faculty faculty : institute.getFaculties()) {

            Iterator<Student> studentIterator =
                    faculty.getStudents().iterator();

            while (studentIterator.hasNext()) {

                Student student = studentIterator.next();

                if (student.getAverageGrade() >= 95
                        && student.getAverageGrade() <= 100) {

                    excellentStudents.add(student);
                }
            }
        }

        return excellentStudents;
    }


    //Головний метод програми
    //Створення об'єктів та перевірка роботи завдань

    public static void main(String[] args) {

        //Створення інституту
        Institute institute =
                new Institute("Інститут телекомунікаційних систем");

        //Створення факультетів.
        Faculty faculty1 = new Faculty("Телекомунікаційні системи");
        Faculty faculty2 = new Faculty("Інформаційні технології");
        Faculty faculty3 = new Faculty("Радіотехнічні системи");

        //Додавання факультетів до інституту
        institute.addFaculty(faculty1);
        institute.addFaculty(faculty2);
        institute.addFaculty(faculty3);

        //Додавання студентів першого факультету
        faculty1.addStudent(
                new Student("Андрій", "Петренко", 101, 96.5));
        faculty1.addStudent(
                new Student("Олександр", "Іваненко", 102, 89.0));
        faculty1.addStudent(
                new Student("Максим", "Коваленко", 103, 98.0));
        faculty1.addStudent(
                new Student("Дмитро", "Шевченко", 104, 94.5));

        //Додавання студентів другого факультету
        faculty2.addStudent(
                new Student("Іван", "Мельник", 201, 97.0));
        faculty2.addStudent(
                new Student("Богдан", "Ткаченко", 202, 92.0));
        faculty2.addStudent(
                new Student("Артем", "Бондаренко", 203, 99.0));

        //Додавання студентів третього факультету
        faculty3.addStudent(
                new Student("Сергій", "Кравченко", 301, 95.5));
        faculty3.addStudent(
                new Student("Владислав", "Мороз", 302, 88.0));

        //Виконання завдання 1
        int totalStudents = countAllStudents(institute);

        System.out.println("ІНСТИТУТ: " + institute.getName());

        System.out.println("\nЗавдання 1.");
        System.out.println(
                "Загальна кількість студентів: " + totalStudents);


        //Виконання завдання 2
        Faculty largestFaculty = findLargestFaculty(institute);

        System.out.println("\nЗавдання 2.");

        if (largestFaculty != null) {
            System.out.println(
                    "Факультет із найбільшою кількістю студентів: "
                            + largestFaculty.getName());

            System.out.println(
                    "Кількість студентів: "
                            + largestFaculty.getStudents().size());
        } else {
            System.out.println("Факультети відсутні.");
        }


        //Виконання завдання 3
        List<Student> excellentStudents =
                findExcellentStudents(institute);

        System.out.println("\nЗавдання 3.");
        System.out.println(
                "Студенти із середнім балом від 95 до 100:");

        if (excellentStudents.isEmpty()) {
            System.out.println("Таких студентів немає.");
        } else {
            for (Student student : excellentStudents) {
                System.out.println(student);
            }
        }
    }
}