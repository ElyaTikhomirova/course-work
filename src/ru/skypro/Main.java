package ru.skypro;

import ru.skypro.coursework.Employee;

public abstract class Main {

    public static void getSalary(Employee[] employee) {
        float allSalary = 0f;
        for (int i = 0; i < employee.length; i++) {
            allSalary += employee[i].getSalary();
            System.out.println("Сумма затрат на зарплаты за месяц: " + allSalary);
        }
    }


    public static void minMaxSalary(Employee[] employee) {
        int minSalary = employee[0].getSalary();
        int maxSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (maxSalary < employee[i].getSalary()) {
                maxSalary = employee[i].getSalary();
            }
            if (minSalary > employee[i].getSalary()) {
                minSalary = employee[i].getSalary();
                System.out.println("Минимальная зарпалата: " + minSalary + "; Максимальная зарплата: " + maxSalary);
            }
        }
    }

    public static void averageMoney(Employee[] employee) {
        float allSalary = 0f;
        for (int i = 0; i < employee.length; i++) {
            allSalary += employee[i].getSalary();
            double averageSalary = allSalary / employee.length;
            System.out.println("Среднее значение зарплат: " + averageSalary);
        }
    }

    public static void allNames(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (i == employee.length - 1) {
                System.out.println("ФИО сотрудников: " + employee[i].getName());
            }
        }
    }



            public static void main (String[]args){


                Employee name1 = new Employee("Иванов Иван Иванович", 1, 80_000);
                Employee name2 = new Employee("Петров Игорь Николаевич", 2, 95_000);
                Employee name3 = new Employee("Сидорова Анна Николаевна", 1, 90_000);
                Employee name4 = new Employee("Матвеенко Ольга Александровна", 4, 100_000);
                Employee name5 = new Employee("Ковров Антон Александрович", 5, 102_000);
                Employee name6 = new Employee("Воронов Евгений Олегович", 5, 98_000);
                Employee name7 = new Employee("Лукичев Валентин Сергеевич", 3, 85_000);
                Employee name8 = new Employee("Суханова Юлия Сергеевна", 3, 97_000);
                Employee name9 = new Employee("Трунов Дмитрий Дмитриевич", 3, 77_000);
                Employee name10 = new Employee("Мурзина Алина Вячеславовна", 2, 107_000);

                System.out.println(Employee.getId());

                System.out.println(name1);
                System.out.println(name2);
                System.out.println(name3);
                System.out.println(name4);
                System.out.println(name5);
                System.out.println(name6);
                System.out.println(name7);
                System.out.println(name8);
                System.out.println(name9);
                System.out.println(name10);

                Employee[] employee = new Employee[10];
                employee[0] = new Employee("Иванов Иван Иванович", 1, 80_000);
                employee[1] = new Employee("Петров Игорь Николаевич", 2, 95_000);
                employee[2] = new Employee("Сидорова Анна Николаевна", 1, 90_000);
                employee[3] = new Employee("Матвеенко Ольга Александровна", 4, 100_000);
                employee[4] = new Employee("Ковров Антон Александрович", 5, 102_000);
                employee[5] = new Employee("Воронов Евгений Олегович", 5, 98_000);
                employee[6] = new Employee("Лукичев Валентин Сергеевич", 3, 85_000);
                employee[7] = new Employee("Суханова Юлия Сергеевна", 3, 97_000);
                employee[8] = new Employee("Трунов Дмитрий Дмитриевич", 3, 77_000);
                employee[9] = new Employee("Мурзина Алина Вячеславовна", 2, 107_000);


            }
        }




