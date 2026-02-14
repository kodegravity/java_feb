package feb14;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score ");
        int score = scanner.nextInt();

        if(score >= 90) {
            System.out.println("Grade A + ");
        }
        else if(score >=80 && score <90){
            System.out.println("Grade A ");
        }
        else if(score >=70 && score <80){
            System.out.println("Grade B+ ");
        }
        else {
            System.out.println("Fail...");
        }
    }
}


/*
90 - 100            - A+
80 - 90            - A
70 - 80            - B+
60 - 70            - B
60 - 70            - C
50 - 60            - D


14%	on the portion of taxable income that is $58,523 or less, plus
20.5%	on the portion of taxable income over $58,523 up to $117,045, plus
26%	on the portion of taxable income over $117,045 up to $181,440, plus
29%	on the portion of taxable income over $181,440 up to $258,482, plus
33%	on the portion of taxable income over $258,482




 */