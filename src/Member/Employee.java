package Member;

public class Employee extends Person {

    private double salary;
    private String position;

    public Employee(String name, int age, String place, String room, String gender, double salary, String position) {
        super(name, age, place, gender, room);
        this.salary = salary;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return " Name = " + getName() + " Gneder = " + getGender() + " Age= " + getAge() + " Place = " + getPlace() + " Room = " + getRoom() + " Position = " + getPosition() + " Salary = " + getSalary();
    }

    public static void chucnang() {
        System.out.println("----------------------------------------------------------");
        System.out.println("+ \tBạn  là Employee, bạn có thể:                     +");
        System.out.println("+ \t1.Xem số lượng sinh viên tại kí túc xá            +");
        System.out.println("+ \t2.Thông tin sinh viên tại kí túc xá               +");
        System.out.println("+ \t3. Thoát chương trình                             +");
        System.out.println("----------------------------------------------------------");
    }

}
