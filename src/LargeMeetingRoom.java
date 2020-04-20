import java.util.List;

public class LargeMeetingRoom implements Room {
    private List<Room> rooms;

    public int getNumOutlets(){

    }
    public int sqFootage(){

    }
    public boolean electricityOk(){
        boolean good = true;
        int sqFoot = 0;
        for(Room i : rooms) {
            sqFoot+= i.sqFootage();
            if(!i.electricityOk())
                good = false;
        }
        if(sqFoot>10000)
            good =false;
        return good;
    }
}