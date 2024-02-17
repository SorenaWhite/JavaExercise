package L6Class;


public class Student {
    String name;
    //private int which;
    private int score1;
    private int score2;
    private int score3;

    public void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }

    public Student (String name, int score1, int score2, int score3) { //constructor: name is same as class name + no return
        this.name=name;
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
    }

    void setScore(int which, int score){
        if (which==1){
            this.score1=score;
        }
        else if (which==2){
            this.score2=score;
        }
        else {
            this.score3=score;
        }
    }
    int getScore(int which){
        if (which==1){
            return score1;
        }
        else if (which==2){
            return score2;
        }
        else {
            return score3;
        }
    }

    int getAverage(){
        return (score1+score2+score3)/3;
    }

    int getHighScore(){
        if (score1 >= score2 && score1 >= score3){
            return score1;
        }
        else if (score2 >= score3 && score2 >= score1){
            return score2;
        }
        else{
            return score3;
        }
    }

    public int getTotal() {
        return score1+score2+score3;
    }

    public String toString()
    {
        return "Name: " + name + "score1: " + score1 + "score2: " + score2 + "score3: " + score3;
    }
}
