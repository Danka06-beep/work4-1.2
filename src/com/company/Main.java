package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        while (true) {
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел");
            String surname = sc.next();
            String name = sc.next();
            int age = sc.nextInt();
            String floor = sc.next();
            String education = sc.next();
            String position = sc.next();
            String department = sc.next();

            Employee emp = new Employee(surname,name,age,floor,education,position,department);
            list.add(emp);

            System.out.println("Если хотите закончить ввод данных, введите end");
            String input = sc.nextLine();
            if ("end".equals(input)) {
                break;

            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(emp);
            }
            }
        }
    }


