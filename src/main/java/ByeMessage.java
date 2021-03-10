public class ByeMessage implements Message {
    private String text;

    public ByeMessage(String text){
        this.text="Hello "+ text;
    }
    public String getText(){
        return text;
    }
}
