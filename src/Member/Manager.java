package Member;

public class Manager extends Person {

    private double salary;

    public Manager(String name, int age, String place, String room, String gender, double salary) {
        super(name, age, place, gender, room);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Gneder = " + getGender() + " Age= " + getAge() + " Place = " + getPlace() + " Room = " + getRoom() + " Salary = " + getSalary();
    }

    public static void chucnang() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("+\tBạn là Manager, bạn có thể:                                     +");
        System.out.println("+\t1.Nhập hóa đơn                                                  +");
        System.out.println("+\t2.Nhập thông tin sinh viên tại kí túc xá                        +");
        System.out.println("+\t3.Xem số lượng sinh viên tại kí túc xá                          +");
        System.out.println("+\t4.Nhập thông tin Manager tại kí túc xá                          +");
        System.out.println("+\t5.Xem thông tin Manager tại kí túc xá                           +");
        System.out.println("+\t6.Nhập thông tin Employee tại kí túc xá                         +");
        System.out.println("+\t7.Xem thông tin Employee tại kí túc xá                          +");
        System.out.println("+\t8.Xem thông tin sinh viên từng phòng                            +");
        System.out.println("+\t9.Xem thông tin sinh viên tại kí túc xá                         +");
        System.out.println("+\t10.Xem hóa đơn tiền điện nước và tiền phòng của từng phòng      +");
        System.out.println("+\t11. Thoát chương trình                                          +");
        System.out.println("---------------------------------------------------------------------");
    }
}
