package com.Sainz;


/*Create an application to accept the name of ONE institution.

        Extend the application to accept user input as follows:
        Course Name
        Course Number
        Room Number
        for as many courses as a user wants to enter.
        The user should be asked after entering these details if he/she wants to enter more courses.
        When the user says no, display the name of the institution, as well as the list of courses that are available to that institution.
        */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean done = false;
        //Fi wrote String answer = "n"; -- have to ask her why

        Scanner scan = new Scanner(System.in);
        Institution newInstitution;
        Course newCourse;
        String answer;

        ArrayList<Institution> school = new ArrayList();
        // changed "class" to book
        ArrayList<Course> book = new ArrayList();

        for (int x = 1; x <= 1; x++) {

            newInstitution = new Institution();
            System.out.println("Enter the name of your institution:");
            newInstitution.setInstitutionName(scan.nextLine());

            school.add(newInstitution);

        }

        do {

            newCourse = new Course();
            System.out.println("Enter your course name");
            // newCourse. at the beginning. Also forgot (scan.nextLine()); had written(scan.nextLine);
            newCourse.setCourseName(scan.nextLine());
            System.out.println("Enter your course number");
            newCourse.setCourseNumber(scan.nextLine());
            System.out.println("Enter your room number");
            newCourse.setRoomNumber(scan.nextLine());

            //changed class to book
            book.add(newCourse);
            System.out.println("Do you want to enter information for another course (Y/N)?");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("y")) {
                done = true;
            } else {
                done = false;
            }
            //what is the purpose of while below?
        } while (done);

        {
            System.out.println("================");
            for (Institution eachInstitution : school) {
            System.out.println("Institution: " + eachInstitution.toString());
            System.out.println('\n' + "Courses available: ");
        }
            for (Course eachCourse : book) {
                System.out.println('\n' + eachCourse.toString());
            }
        }
    }
}
