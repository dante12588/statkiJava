public class Field {
    public State state;
    private int posX;
    private int posY;

    public Field(int x, int y, State state){
        this.state = state;
        posX = x;
        posY = y;
    }

    public char stateToChar(){
        char value;
        switch (state){
            case STATEK:
                value = '$';
                break;
            case TRAFIONNY:
                value = '@';
                break;
            case ZATOPIONY:
                value = '#';
                break;
            default:
                value = ' ';
        }
        return value;
    }
}
