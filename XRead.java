package exam_state;

public class XRead implements State {

    private final int x;

    public XRead(MessageHandler mh, int x) {
        this.x = x;
    }

    @Override
    public State handle(MessageHandler mh, String msg) {
        return new YRead(mh, x, Integer.parseInt(msg));
    }
}
