package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PadawanEquipment {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double money = Double.parseDouble(reader.readLine());

        int studentsCount = Integer.parseInt(reader.readLine());

        double lightSaberPrice = Double.parseDouble(reader.readLine());
        double robePrice = Double.parseDouble(reader.readLine());
        double beltPrice = Double.parseDouble(reader.readLine());

        double lightsaberTotal = Math.ceil(studentsCount * 1.1) * lightSaberPrice;
        double robeTotal = studentsCount * robePrice;
        double beltTotal = (studentsCount - (studentsCount / 6)) * beltPrice;

        double total = lightsaberTotal + robeTotal + beltTotal;

        if (total > money) {
            System.out.printf("George Lucas will need %.2flv more.", total - money);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        }
    }
}
