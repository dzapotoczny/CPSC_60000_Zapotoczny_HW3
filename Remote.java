public class Remote {
    Command c;

    public Remote(Command c){
        this.c = c;
    }

    public void click(){
        c.execute();
    }
}
