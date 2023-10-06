public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if (grade >= 90){
            return 'A';
        }
        if ((grade<90)&& (grade>=80)){
            return 'B';
        }
        if ((grade < 80) && (grade >=70)){
            return 'C' ;
        }
        if ((grade<70) && (grade>=60)){
            return 'D';
        }
        if ((grade <60) && (grade>=50)){
            return 'E';
        }
        return 'F';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int input){
        if ((input%3 == 0) && (input%5 == 0)){
            return "fizzbuzz";
        }
        if (input%3 ==0){
            return "fizz";
        }
        if (input %5 ==0){
            return "buzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String word){
        if (word.length()<2){
            return word;
        }
        String letters = word.substring(0,2);
        return letters + word + letters;

    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if (a+b != c){
            return false;
        }
        else{
            return true;
        }
    }

    // Question 5 - endUp
    public static String endUp(String str){
        if (str.length()<3){
            return str.toUpperCase();
        }
        String first = str.substring(0, str.length()-3);
        String last = str.substring(str.length()-3, str.length() );
        String lastUpper = last.toUpperCase();
        return first + lastUpper;
    }

}
