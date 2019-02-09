package ua.com.fok.solid.ocp.hospital_ocp_violation;

public class Nurse extends Employee {

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse class instantiation");
    }



}
