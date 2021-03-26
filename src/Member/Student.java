
package Member;

public class Student extends Person {
    public Student(String name,int age,String place,String room,String gender){
    super(name,age,place,gender,room);
}

@Override
    public String toString(){
        return "Name = "+getName()+" Gneder = "+getGender()+" Age= "+getAge()+" Place = "+getPlace()+" Room = "+getRoom();
    }


    public static void chucnang(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("+\tBạn là Student, bạn có thể:                                +");
        System.out.println("+\t1.Xem số lượng sinh viên tại kí túc xá                     +");
        System.out.println("+\t2.Xem thông tin sinh viên từng phòng                       +");
        System.out.println("+\t3.Xem hóa đơn tiền điện nước và tiền phòng của từng phòng  +");
        System.out.println("+\t4.Thoát chương trình                                       +");
        System.out.println("-------------------------------------------------------------------");
    }
}