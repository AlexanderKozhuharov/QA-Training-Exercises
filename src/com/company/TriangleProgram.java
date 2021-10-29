package com.company;

import java.util.Scanner;

public class TriangleProgram {
    public static void main(String[] args) {
        Scanner angleInput = new Scanner(System.in);
        System.out.println("Enter the first angle");
        double firstAngle = angleInput.nextDouble();

        System.out.println("Enter the second angle");
        double secondAngle = angleInput.nextDouble();

        System.out.println("Enter the third angle");
        double thirdAngle = angleInput.nextDouble();

        if (firstAngle + secondAngle + thirdAngle == 180) {
            if (firstAngle <= 0 || secondAngle <= 0 || thirdAngle <= 0) {
                System.out.println("The angles cannot be negative or 0");
            } else {

                if ((firstAngle == 90) || (secondAngle == 90) || (thirdAngle == 90)) {
                    System.out.println("Yes. The triangle is right-angled.");

                } else if ((firstAngle == 60) && (secondAngle == 60) && (thirdAngle == 60)) {
                    System.out.println("Yes. The triangle is equilateral.");

                } else if ((firstAngle == secondAngle) || (firstAngle == thirdAngle) || (secondAngle == thirdAngle)) {
                    System.out.println("Yes. The triangle is isosceles.");

                } else if ((firstAngle != secondAngle) && (firstAngle != thirdAngle) && (secondAngle != thirdAngle)) {

                    if ((firstAngle > 90) || (secondAngle > 90) || (thirdAngle > 90)) {
                        System.out.println("Yes. The triangle is obtuse.");

                    } else if ((firstAngle < 90) && (secondAngle < 90) && (thirdAngle < 90)) {
                        System.out.println("Yes. The triangle is acute.");

                    } else
                        System.out.println("Yes. The triangle is multifaceted.");
                }
            }
        } else System.out.println("No. The sum of the angles does not equal 180.");
    }
}
