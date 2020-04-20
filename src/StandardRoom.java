public class StandardRoom implements Room {
    public int getNumOutlets(){

    }
    public int sqFootage(){

    }
    public boolean electricityOk(){
        int sqFoot = sqFootage();
        int outlets = getNumOutlets();
        if(50>= sqFoot/outlets)
            return true;
        else
            return false;
    }
}
