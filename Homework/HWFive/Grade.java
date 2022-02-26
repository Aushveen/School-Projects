public class Grade {
    static double GPA = (Math.random() * 4);

    public static void main(String[] args){
        String grade = Grade.getNumericGrade(GPA);
        System.out.println("The numeric grade of a " + GPA + " is " + grade);
    }

    public static String getNumericGrade(double GPA){
        if (GPA >= 3.85)
            return "A";
        else if (GPA >= 3.5)
            return "A-";
        else if (GPA >= 3.15)
            return "B+";
        else if(GPA >= 2.85)
            return "B";
        else if(GPA >= 2.5)
            return "B-";
        else if(GPA >= 2.15)
            return "C+";
        else if(GPA >= 1.85)
            return "C";
        else if(GPA >= 1.5)
            return "C-";
        else if(GPA >= 1.15)
            return "D+";
        else if(GPA >= 0.85)
            return "D";
        else if(GPA >= 0.5)
            return "D-";
        else
            return "F";
    }
}
