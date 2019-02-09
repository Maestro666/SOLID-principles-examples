package ua.com.fok.solid.ocp.hospital_ocp_violation;

public class HospitalManagement {
    //Nurses
    private void drawBlood(){
        System.out.println("Drawing blood");
    }

    private void cleanRoom(){
        System.out.println("Cleaning room");
    }

    private void bringPatientCard(){
        System.out.println("Bringing patient card");
    }

    //Doctors
    private void diagnosePatience(){
        System.out.println("Diagnosing patience");
    }

    private void prescribeMedicine(){
        System.out.println("Prescribing Medicine");
    }

    public void callUpon(Employee employee){
        if (employee instanceof Nurse) {
            drawBlood();
            cleanRoom();
            bringPatientCard();
        } else if (employee instanceof Doctor){
            diagnosePatience();
            prescribeMedicine();
        }
    }
}
