package com.codegym.case_study.controller;

import java.util.Scanner;

public class FurumaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                this.choice1();
                break;
            case 2:
                this.choice2();
                break;
            case 3:
                this.choice3();
                break;
            case 4:
                this.choice4();
                break;
            case 5:
                this.choice5();
                break;
            case 6:
                break;
        }

    }

    public void choice1() {
        int choice = 0;
        do {
            System.out.println("1 Display list employees\n" +
                    "2 Add new employee\n" +
                    "3 Edit employee\n" +
                    "4 Return main menu");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("display list");
                    break;
                case 2:
                    System.out.println("Add new employee");
                    break;
                case 3:
                    System.out.println("Edit employee");break;
                case 4:
                    displayMainMenu();
            }
        } while (choice != 4);

    }

    public void choice2() {
        int choice = 0;
        do {
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("display list");
                    break;
                case 2:
                    System.out.println("Add new employee");
                    break;
                case 3:
                    System.out.println("Edit employee");break;
                case 4:
                    displayMainMenu();
            }
        } while (choice != 4);

    }

    public void choice3() {
        int choice = 0;
        do {
            System.out.println("1 Display list facility\n" +
                    "2 Add new facility\n" +
                    "3 Display list facility maintenance\n" +
                    "4 Return main menu");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("display list");
                    break;
                case 2:
                    System.out.println("Add new employee");
                    break;
                case 3:
                    System.out.println("Edit employee");break;
                case 4:
                    displayMainMenu();
            }
        } while (choice != 4);
    }

    public void choice4() {
        int choice = 0;
        do {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("display list");
                    break;
                case 2:
                    System.out.println("Add new employee");
                    break;
                case 3:
                    System.out.println("Edit employee");break;
                case 4:
                    displayMainMenu();
            }
        } while (choice != 4);
    }

    public void choice5() {
        int choice = 0;
        do {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("display list");
                    break;
                case 2:
                    System.out.println("Add new employee");
                    break;
                case 3:
                    System.out.println("Edit employee");break;
                case 4:
                    displayMainMenu();
            }
        } while (choice != 4);
    }


    public static void main(String[] args) {
        FurumaController controller = new FurumaController();
        controller.displayMainMenu();

    }
}
