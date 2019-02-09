package ua.com.fok.solid.ocp.hospital_ocp_violation;

public class Hospital {
    public static void main(String[] args) {
        HospitalManagement hm = new HospitalManagement();

        Employee em1 = new Nurse(1, "Elizabeth", "surgery", true);
        hm.callUpon(em1);

        System.out.println("---------------------------------------------");

        Employee em2 = new Doctor(2, "Harry", "surgery", true);
        hm.callUpon(em2);
    }

}
