public class Bug {
    private int initialPosition;
    private String direction;

    public Bug(int initialPosition){
        this.initialPosition = initialPosition;
        this.direction = "R";
    }
    public void turn(){
        if (this.direction.equals("R"))
            this.direction = "L";
        else
            this.direction = "R";
    }
    public void move(){
        if (this.direction.equals("R"))
            this.initialPosition++;
        else
            this.initialPosition--;
    }
    public int getPosition(){
        return this.initialPosition;
    }
}
