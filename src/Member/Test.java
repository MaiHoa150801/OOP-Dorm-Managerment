package Member;

import java.util.*;

public class Test {

    public static ArrayList<Employee> ListEmp() {
        ArrayList<Employee> e = new ArrayList<>();

        e.add(new Employee(" Trần Thị Loan", 24, "Binh Dinh", "Nhân viên", "Nữ", 4000000, "Lao công"));
        e.add(new Employee(" Lê Thị Bảo Thư", 23, "Quảng  Bình", "Nhân viên", "Nữ", 4000000, "Lao công"));
        e.add(new Employee(" Nguyễn Tiến Đạt", 26, "Đà Nẵng", "Bảo vệ", "Nam", 6000000, "Bảo vệ"));

        return e;
    }

    public static ArrayList<Student> ListStu() {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student(" Lê Thị Mai Hoa", 19, "Binh Dinh", "309", "Nữ"));
        s.add(new Student(" Hồ Thị Diệu", 19, "Binh Dinh", "309", "Nữ"));
        return s;
    }

    public static ArrayList<Manager> ListMana() {
        ArrayList<Manager> m = new ArrayList<>();
        m.add(new Manager(" Vũ Như An", 23, "Thanh Hóa", "Quản lí kí túc xá", "Nữ", 4000000));
        return m;
    }

    public static ArrayList<Room> ListRoom() {
        ArrayList<Room> r = new ArrayList<>();
        r.add(new Room("309", 213.000, 120.000, 45.000));
        return r;
    }

    public static void chinh() {
        System.out.println("\t\t=================================================");
        System.out.println("                                       ");
        System.out.println("\t\t\tCHƯƠNG TRÌNH QUẢN LÍ KÍ TÚC XÁ");
        System.out.println("                                       ");
        System.out.println("\t\t=================================================");
        System.out.println("\n\n");
        
        System.out.println("\t\tBạn là Manager ,Employee hay là Student");
        System.out.println("\t\t1.Manager ");
        System.out.println("\t\t2.Employee");
        System.out.println("\t\t3.Student");
        System.out.println("\t\t4.Thoát chương trình");

        System.out.println(" Lưu ý: Nếu bạn là student hoặc Employee thì hãy thận trọng vì Manager chưa cập nhật thông tin nhé!!" + "\n chỉ Manager mới có thể nhập thông tin cho tất cả thành viên tại kí túc xá");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int so;
        int number;
        int a;
        char chon;
        int i;
        ArrayList<Employee> e = ListEmp();
        ArrayList<Manager> m = ListMana();
        ArrayList<Student> s = ListStu();
        ArrayList<Room> r = ListRoom();
        System.out.println("\n\n");
        System.out.println("\t\tTRƯỜNG CAO ĐẲNG LƯƠNG THỰC THỰC PHẨM");
        System.out.println("\t\tĐịa chỉ: 101B Lê Hữu Trác, Phước Mỹ, Sơn Trà, Đà Nẵng");
        System.out.println("\t\t___________________________________________________");
        System.out.println("\n\n");
        do {
            chinh();
            do {
                System.out.print("Bấm số để chọn (từ 1 đến 4):");
                n = input.nextInt();
            } while (n < 0 || n > 4);
            switch (n) {
                // Các chuc nang cua Manager
                case 1:
                    do {
                        Manager.chucnang();
                        System.out.print("Vui lòng chọn số: ");
                        so = input.nextInt();
                        switch (so) {
                            // Nhap hoa don cho moi phong
                            case 1:
                                System.out.println("Hãy nhập hóa đơn");
                                
                                do {
                                    
                                    input.nextLine();
                                    System.out.print("Hãy nhập tên phòng: " );
                                    String name = input.nextLine();
                                    System.out.print("Hãy nhập tiền nước: ");
                                    double nuoc = input.nextDouble();
                                    System.out.print("Hãy nhập tiền điện: ");
                                    double dien = input.nextDouble();
                                    System.out.print("Hãy nhập tiền phòng: ");
                                    double phong = input.nextDouble();
                                   
                                    Room room = new Room(name, nuoc, dien, phong);
                                    r.add(room);
                                    input.nextLine();
                                    System.out.print("Bạn có muốn nhập nữa không? ");
                                    chon = input.next().charAt(0);
                                    
                                } while (chon == 'y' || chon == 'Y');
                                System.out.println("\n\n");
                                break;
                            // Nhap thong tin sinh vien tai ktx
                            case 2:
                                System.out.println("Hãy nhập thông tin sinh viên");
                                do {
                                    input.nextLine();
                                    System.out.println("Nhập tên sinh viên");
                                    String name = input.nextLine();
                                    System.out.println("Nhập tuổi sinh viên");
                                    int age = input.nextInt();
                                    System.out.println("Nhập quê quán sinh viên");
                                    input.next();
                                    String place = input.nextLine();
                                    System.out.println("Nhập phòng sinh viên");
                                    String room = input.next();
                                    System.out.println("Nhập giới tính sinh viên");
                                    String gender = input.next();
                                    Student student = new Student(name, age, place, room, gender);
                                    s.add(student);
                                    input.nextLine();
                                    System.out.println("Bạn có muốn nhập nữa không? ");
                                    chon = input.next().charAt(0);
                                } while (chon == 'y' || chon == 'Y');
                                System.out.println("\n\n");
                                break;
                            // Xem số lượng sinh vien tai ktx
                            case 3:
                                System.out.println("Số lượng sinh viên tại kí túc xá là: " + s.size());
                                System.out.println("\n\n");
                                
                                break;
                            //Nhap thong tin Manager tai ktx
                            case 4: {
                                System.out.println("Hãy nhập thông tin Manager");
                                do {
                                    input.nextLine();
                                    System.out.println("Nhập tên Manager");
                                    String name = input.nextLine();
                                    System.out.println("Nhập tuổi Manager");
                                    int age = input.nextInt();
                                    System.out.println("Nhập quê quán Manager");
                                    input.next();
                                    String place = input.nextLine();
                                    System.out.println("Nhập phòng Manager");
                                    String room = input.next();
                                    System.out.println("Nhập giới tính Manager");

                                    String gender = input.next();
                                    System.out.println("Nhập lương Manager");
                                    double salary = input.nextDouble();

                                    Manager manager = new Manager(name, age, place, room, gender, salary);
                                    m.add(manager);

                                    input.nextLine();
                                    System.out.println("Bạn có muốn nhập nữa không? ");
                                    chon = input.next().charAt(0);

                                } while (chon == 'y' || chon == 'Y');
                                System.out.println("\n\n");
                            }
                            break;
                            
                            // Xem thong tin manager tai ktx
                            case 5: {

                                System.out.println("Thông tin Manager tại kí túc xá ");
                                for (i = 0; i < m.size(); i++) {
                                    System.out.println(m.get(i).toString());
                                }
                                System.out.println("\n\n");
                                break;
                            }
                            
                            // Nhap thong tin Employee tại ktx
                            
                            case 6: {
                                System.out.println("Hãy nhập thông tin Employee");
                                do {
                                    input.nextLine();
                                    System.out.println("Nhập tên Employee");
                                    String name = input.nextLine();
                                    System.out.println("Nhập tuổi  Employee");
                                    int age = input.nextInt();
                                    System.out.println("Nhập quê quán  Employee");
                                    input.next();
                                    String place = input.nextLine();
                                    System.out.println("Nhập phòng  Employee");
                                    String room = input.next();
                                    System.out.println("Nhập giới tính  Employee");
                                    String gender = input.next();
                                    System.out.println("Nhập lương  Employee");
                                    double salary = input.nextDouble();

                                    System.out.println("Nhập vị trí  Employee");
                                    String position = input.nextLine();

                                    Employee employee = new Employee(name, age, place, room, gender, salary, position);
                                    e.add(employee);

                                    input.nextLine();
                                    System.out.println("Bạn có muốn nhập nữa không? ");
                                    chon = input.next().charAt(0);

                                } while (chon == 'y' || chon == 'Y');
                                System.out.println("\n\n");
                            }
                            //Xem so luong employee tai ktx
                            case 7:
                                System.out.println("Thông tin Employee tại kí túc xá ");
                                for (i = 0; i < e.size(); i++) {
                                    System.out.println(e.get(i).toString());
                                }
                                System.out.println("\n\n");
                                break;
                                // Xem so luong sinh vien tung phong
                            case 8:
                                input.nextLine();
                                System.out.println("Nhập số phòng mà bạn muốn tìm kiếm thông tin: ");
                                String phong = input.nextLine();
                                System.out.println("Thông tin sinh viên cùng phòng : " + phong);
                                for (i = 0; i < s.size(); i++) {
                                    if (s.get(i).getRoom().equals(phong)) { 
                                        System.out.println(s.get(i).toString());
                                    } else {
                                        System.out.println("Tên phòng bạn nhập sai rồi!! Vui lòng nhập lại tên phòng nhé!");
                                    }
                                }
                                System.out.println("\n\n");
                                break;
                                // Xem thông tin sinh viên tại ktx
                            case 9:
                                System.out.println("Thông tin sinh viên tại kí túc xá ");
                                for (i = 0; i < s.size(); i++) {
                                    System.out.println(s.get(i).toString());
                                }
                                System.out.println("\n\n");
                                break;
                                // Xem hoa dơn cua tung phong
                            case 10: {             
                                System.out.println("Hóa đơn của các phòng là: ");
                                for (i = 0; i < r.size(); i++) {
                                    System.out.println("\n " + r.get(i).toString());
                                }
                                System.out.println("\n\n");
                                break;
                            }

                        }
                    } while (so > 0 && so < 11);
                    break;
                // chuc nang cua Employee
                case 2: {
                    Employee.chucnang();

                    do {
                        System.out.println("Vui lòng chọn số: ");
                        number = input.nextInt();

                        switch (number) {
                            case 1: {
                                System.out.println("Số lượng sinh viên tại kí túc xá là: " + s.size());
                                System.out.println("\n\n");
                                break;
                            }

                            case 2: {
                                System.out.println("Thông tin sinh viên tại kí túc xá ");
                                for (i = 0; i < s.size(); i++) {
                                    System.out.println(s.get(i).toString());
                                }
                                System.out.println("\n\n");
                                break;
                            }
                            case 3:
                                break;
                        }
                    } while (number > 0 && number < 2);
                    break;
                }
                // chuc nang cua Student
                case 3: { //Student
                    Student.chucnang();
                    do {
                        System.out.println("Vui lòng chọn số: ");
                        a = input.nextInt();
                        switch (a) {
                            case 1: {
                                System.out.println("Số lượng sinh viên tại kí túc xá là: " + s.size());
                                System.out.println("\n\n");
                                break;
                            }

                            case 2: {
                                
                                System.out.println("Nhập tên phòng mà bạn muốn tìm kiếm thông tin: ");
                                String phong = input.nextLine();
                                 System.out.println("Thông tin sinh viên cùng phòng : " + phong);
                                for (i = 0; i < s.size(); i++) {
                                    if (s.get(i).getRoom() == phong) {
                                       
                                        System.out.println(s.get(i).toString());
                                    } else {
                                        System.out.println("Tên phòng bạn nhập sai rồi!! Vui lòng nhập lại tên phòng nhé!");
                                    }
                                }
                                System.out.println("\n\n");
                                break;
                            }

                            case 3: {
                                
                                System.out.println("Hóa đơn của các phòng là: ");
                                for (i = 0; i < r.size(); i++) {
                                    System.out.println("\n " + r.get(i).toString());
                                }
                                System.out.println("\n\n");
                                break;
                            }
                            case 4:
                                break;
                        }

                    } while (a > 0 && a < 3);
                }
            }
        } while (n > 0 && n < 4);
    }
}
