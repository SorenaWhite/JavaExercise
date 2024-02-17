package L6Class;


public class Student2 {
    int [] score; //a student has scores for three subjects
    String name;

    public Student2 (String name, int sc1, int sc2, int sc3) //constructor
    {
        this.name=name;
        score = new int [3];
        score[0] = sc1;
        score[1] = sc2;
        score[2] = sc3;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName() 
    {
        return name;
    }
    
    public int getTotal() //do not need sc1, sc2, sc3 => no need to add parameters
    {
        int total = 0;
        for (int i=0; i < score.length; i++)
        {
            total = total + score[i];
        }
        return total;
    }

    int getBestScore()
    {
        int bestScore = score[0];
        for (int i=0; i < score.length; i++)
        {
            if (score[i] > score[0])
            {
                bestScore = score[i];
            }
        }
        return bestScore;
    }

    double getAverage()
    {
        return getTotal()/score.length;
    }

    public String toString()
    {
        String str = "Student: " + name;
        for (int i=0; i < score.length; i++)
        {
            str += score[i] + " " + "\n";
        }
        return str;
    }

    /*String name;
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
    }*/
}
