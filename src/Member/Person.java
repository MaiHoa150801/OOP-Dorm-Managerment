package Member;

public abstract class Person {

    private String name;
    private int age;
    private String place;
    private String room;
    private String gender;

    public Person(String name, int age, String place, String gender, String room) {
        this.name = name;
        if (age < 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
        this.place = place;
        this.room = room;

        this.gender = gender;

    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setPlace(String place) {
        this.place = place;

    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Gneder = " + getGender() + " Age= " + getAge() + " Place = " + getPlace() + " Room = " + getRoom();

    }

}
