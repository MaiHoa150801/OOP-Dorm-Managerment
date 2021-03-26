package Member;

public class Room {

    private double Tiendien;
    private double Tiennuoc;
    private double Tienphong;
    private String nameRoom;

    public Room(String nameRoom, double Tiendien, double Tienphong, double Tiennuoc) {
        this.Tiendien = Tiendien;
        this.Tiennuoc = Tiennuoc;
        this.Tienphong = Tienphong;
        this.nameRoom = nameRoom;

    }

    public double getTienDien() {
        return Tiendien;
    }

    public double getTienNuoc() {
        return Tiennuoc;
    }

    public double getTienPhong() {
        return Tienphong;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setTienDien(double Tiendien) {
        this.Tiendien = Tiendien;
    }

    public void setTienNuoc(double Tiennuoc) {
        this.Tiennuoc = Tiennuoc;
    }

    public void setTienPhong(double Tienphong) {
        this.Tienphong = Tienphong;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    @Override
    public String toString() {
        double sum = +getTienDien() + getTienNuoc() + getTienPhong();
        return " Phòng " + getNameRoom() + " có hóa đơn la: " + sum + ". \n Tiền điện là: " + getTienDien() + ".\n Tiền phòng là: " + getTienPhong() + ". \n Tiền nước là: " + getTienNuoc();
    }

}
