public class Employee {
    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;

    }
    void showInfo() {
        System.out.println("Имя: "+name+
                "\nДолжность: "+position+
                "\nПочта: "+email+
                "\nНомер телефона: "+phone_number+
                "\nЗарплата: "+salary+
                "\nВозраст: "+age+"\n");
    }
}
