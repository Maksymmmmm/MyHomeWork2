/**
* Java Basic. Home work #2
*
* @author Maksim
* @version 6.3.2023
*
*/

class MyHomeWork2 {
    public static void main(String[] args) {
        
        
        //Задание а//
        checkWeather(12);
        //Задание b//
        canWalk(false, true);
        //Задание c//
        System.out.println(add(3, 7));
        System.out.println(subtraction(31, 70));
        System.out.println(multiplication(9, 34));
        System.out.println(division(4, 9));
        //Задание d//
        TheDayOfTheWeek(2);
        
        
	}
    static int checkWeather(int t) {
        if (t < 0) {
            System.out.println("It is frost");
        } else if (t >= 0 & t <= 18) {
            System.out.println("It is cold");
        } else if (t >= 19 &  t <= 28) {
            System.out.println("It is warm");
        } else if (t >= 29) {
            System.out.println("It is hot");
        }
        return t;
    }
    static boolean canWalk(boolean isWeekend, boolean isRain) {
        if (isRain & isWeekend) {
            System.out.println("i can walk");
        } else {
            System.out.println("i can not walk");
        }
        
        return isWeekend & isRain;
    }
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }
    static int subtraction(int a, int b) {
        int c = a - b;
        return c;
    }
    static int multiplication(int a, int b) {
        int c = a * b;
        return c;
    }
    static float division(float a, float b) {
        float c = a / b;
        return c;
    }
        static int TheDayOfTheWeek(int w) {
        switch (w) {
            case 1:
            System.out.println("today is Monday");
            break;
            
            case 2:
            System.out.println("today is Tuesday");
            break;
            
            case 3:
            System.out.println("today is Wednesday");
            break;
            
            case 4:
            System.out.println("today is Thursday");
            break;
            
            case 5:
            System.out.println("today is Friday");
            break;
            
            case 6:
            System.out.println("today is Saturday");
            break;
            
            case 7:
            System.out.println("today is Sunday");
            break;
        }
        return w;
    }
}