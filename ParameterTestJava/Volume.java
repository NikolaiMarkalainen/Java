
public class Volume implements ClampingParameter {
    public Volume (int volume){
        this.volume = volume;
    }
    @Override
    public boolean isClamping(){
        return isClamping();
    }
    @Override
    public void setClamping(boolean c){

    }
    @Override
    public int getValue(){
        return volume;
    }
    @Override
    public void setValue(int volume){
        this.volume = volume;
    }

    @Override
    public String getName() {
        return null;
    }
    @Override
    public int getMinimumValue(){
        return 0;
    }
    @Override
    public int getMaximumValue(){
        return 1000;
    }
    @Override
    public int getDefaultValue(){
        return 500;
    }
    private int volume;
}
