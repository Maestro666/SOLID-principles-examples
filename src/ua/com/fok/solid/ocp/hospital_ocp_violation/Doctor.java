package ua.com.fok.solid.ocp.hospital_ocp_violation;

public class Doctor extends Employee {

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor class instantiation");
    }
}
