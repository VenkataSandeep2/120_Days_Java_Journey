package scom.encapsulation;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.setRollNo(101);
        s.setName("Sandeep");
        s.setMarks(92);

        
        s.setRollNo(102);
        s.setName("Sandeep");
        s.setMarks(94);

        // User enters a roll number to search
        int searchRollNo = 102;
        // int searchRollNo = 402;		ERROR
        System.out.println();
       // int searchRollNo = 102;
        
        if (s.getRollNo() == searchRollNo) {
            System.out.println("Student Found");
            System.out.println("Roll No :- " + s.getRollNo());
            System.out.println("Name :- " + s.getName());
            System.out.println("Marks :- " + s.getMarks());
        } else {
            System.out.println("Student Not Found");
        }
    }
}