public class StudentTest {
    public static void main(String[] args){
        Student shane = new Student("Shane");
        shane.addQuiz(101);
        shane.addQuiz(6);
        shane.addQuiz(70);
        shane.addQuiz(50);
        shane.addQuiz(99);
        System.out.println("Student Name: " + shane.getName());
        System.out.println("Student Total Score: " + shane.getTotalScore());
        System.out.println("Student Average Score: " + shane.getAverageScore());
    }
}
