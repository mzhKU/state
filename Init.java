package exam_state;

public class Init implements State {

    public Init() { }

    public State handle(MessageHandler mh, String msg) {
        return new XRead(mh, Integer.parseInt(msg));
    }
}
