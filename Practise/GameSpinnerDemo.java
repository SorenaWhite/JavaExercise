package Practise;
import java.util.ArrayList;

class GameSpinners {
    int sectors;
    ArrayList<Integer> store = new ArrayList<Integer>();
    int result;

    GameSpinners(int sector) {
        this.sectors = sector;
    }

    public void spin() {
        result = (int) (Math.random()*sectors+1);
        System.out.println(result);
        store.add(result);
    } 

    public void currentRun() {
        int position = store.indexOf(result);
        int count=0;
        if (position == -1) count=0;
        else if (position == 0) count=1;
        else{
            while (position >= 1) {
                count=1;
                if (store.get(position) == store.get(position-1)) {
                    count++;
                    position--;
                }
            }
        }
        System.out.println(count);
    }

}

public class GameSpinnerDemo {
    public static void main (String [] args) {
        GameSpinners g = new GameSpinners(4);
        g.currentRun();
        g.spin();
        g.currentRun();
        g.spin();
        g.currentRun();
        g.spin();
        g.currentRun();
        g.spin();
        g.currentRun();
        g.spin();
        g.spin();
        g.spin();
        g.currentRun();
    }
}