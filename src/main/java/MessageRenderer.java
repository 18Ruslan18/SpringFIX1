public class MessageRenderer {
    private Message meesage;

    public MessageRenderer(Message meesage) {
        this.meesage = meesage;
    }

    public void printMessage(){
        System.out.println(meesage.getText());
    }
}
