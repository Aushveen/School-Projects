public class Student {
    private String name;
    private int quizScore;
    private int quizNumber;

    public Student(String name){
        this.name = name;
        this.quizScore = 0;
        this.quizNumber = 0;
    }

    public String getName(){
        return this.name;
    }
    public void addQuiz(int score){
        this.quizScore = this.quizScore + score;
        this.quizNumber++;
    }
    public int getTotalScore(){
        return this.quizScore;
    }
    public int getAverageScore(){
        return this.quizScore / this.quizNumber;
    }
}
