public class lesson5 {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Вартан", "Закупщик", "vartan@mail.ru", "+7-123-456-78-90", 70000, 43);
        employeesArray[1] = new Employee("Иван", "Менеджер", "ivan@mail.ru", "+7-123-456-78-90", 50000, 35);
        employeesArray[2] = new Employee("Семен", "Бухгалтер", "semen@mail.ru", "+7-123-456-78-90", 80000, 45);
        employeesArray[3] = new Employee("Зинаида", "Кадровик", "zina@mail.ru", "+7-123-456-78-90", 50000, 39);
        employeesArray[4] = new Employee("Сигизмунд", "Дизайнер", "sigi@mail.ru", "+7-123-456-78-90", 650000, 22);

        for (int i = 0; i<employeesArray.length; i++){
            if (employeesArray[i].age>40) {
                employeesArray[i].showInfo();
            }
        }
    }
}
