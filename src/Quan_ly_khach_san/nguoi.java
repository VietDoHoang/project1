package Quan_ly_khach_san;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
public class nguoi {
	private String name;
    private int age;
    private String passport;
    private String room;
    private int numberRent;
    private String type;

    public nguoi(String name, int age, String passport, String room,String type, int numberRent) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.numberRent = numberRent;
        this.room = room;
        this.type=type;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String toString() {
        return "Nguoi{" +
                "ten='" + name + '\'' +
                ", tuoi=" + age +
                ", CMND='" + passport + '\''  +
                "Phong: "+"'"+room+"'"+", So ngay thue: "+numberRent+
                '}';
    }

}
