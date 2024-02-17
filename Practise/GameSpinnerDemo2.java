package Practise;
// Deleted ArrayList

class GameSpinner {
    int sectors;
    int result;
    int lastResult;
    int lastResultNum;

    GameSpinner(int sector) {
        this.sectors = sector;
        lastResult = 0;
        lastResultNum=0;
    }

    public int spin() {
        result = (int) (Math.random()*sectors+1);
        if (result == lastResult) lastResultNum++;
        else{
            lastResultNum=1;
            lastResult = result;
        }  
        return result;
    } 

    public int currentRun() {
        return lastResultNum;
    }

}

public class GameSpinnerDemo2 {
    public static void main (String [] args) {
        GameSpinner g = new GameSpinner(4);
        System.out.println(g.currentRun());
        System.out.println(g.spin());
        System.out.println(g.currentRun());
        System.out.println(g.spin());
        System.out.println(g.currentRun());
        System.out.println(g.spin());
        System.out.println(g.currentRun());
        System.out.println(g.spin());
        System.out.println(g.currentRun());
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println(g.currentRun());
    }
}
