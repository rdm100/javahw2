import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Salmon> belly; //UPDATED belly is an empty array which holds salmon type objects

    public Bear(String name){
        this.belly = new ArrayList<Salmon>(); //UPDATED
        this.name = name;
    }

    public int foodCount(){
        return belly.size();
    }

    public void eatFishFromRiver(River river){
        Salmon salmon = river.removeFish();//left side tells you the thing removed on right
        belly.add(salmon);
    }

    public void sleep(){
        belly.clear();
    }
}
