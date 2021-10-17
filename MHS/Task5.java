///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//import java.util.ArrayList;
//import java.util.Queue;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Scanner;
//
///**
// *
// * @author Ehsaan
// */
//public class Task5 {
//
//    static Queue<PatientRecords> PatientsQueue = new LinkedList<>();
//
//    public static void addPaitient(PatientRecords paitient) {
//        PatientsQueue.add(paitient);
//    }
//
//    public static String nextPaitent() {
//        for (int i = 0; i < PatientsQueue.size(); i++) {
//            
//            return PatientsQueue.remove().getName();
//        }
//        return "Not Found";
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        int visit = 0;
//        String select = "";
//        Scanner input = new Scanner(System.in);
//        while (!select.equals("0")) {
//            System.out.print("1.  Add Paitient\n2.  Next Paitient\n3.  Check Paitient\n0.  Exit\n\nSelect: ");
//            select = input.next();
//            switch (select) {
//                case "1":
//                    input = new Scanner(System.in);
//                    System.out.print("Enter Name: ");
//                    String name = input.nextLine();
//                    visit++;
//                    PatientRecords record = new PatientRecords();
//                    record.setName(name);
//                    record.setVisits(visit);
//                    addPaitient(record);
//                    System.out.println("Paiteint is added Successfully");
//                    break;
//                case "2":
//                       System.out.print(nextPaitent());
//                    break;
//                case "3":
//                    break;
//            }
//        }
//
//    }
//
//}
//
//class PastVisits {
//
//    private String DateVisited;
//    private String MedicinePrescribed;
//    private String Symptoms;
//}
//
//class PatientRecords {
//
//    private String Name;
//    private int Visits;
//    private ArrayList<PastVisits> PastVisitsInfo = new ArrayList<>();
//    private Iterator<PastVisits> iterator = PastVisitsInfo.iterator();
//
//    public String getName() {
//        return this.Name;
//    }
//
//    public void setName(String name) {
//        this.Name = name;
//    }
//
//    public int getVisits() {
//        return this.Visits;
//    }
//
//    public void setVisits(int visit) {
//        this.Visits = visit;
//    }
//}
