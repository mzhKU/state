package exam_state;

public class XRead implements State {

    private MessageHandler mh;
    public int x;

    public XRead(MessageHandler mh, int x) {
        this.mh = mh;
        this.x = x;
    }

    @Override
    public State handle(MessageHandler mh, String msg) {
        return new YRead(mh, Integer.parseInt(msg));
    }
}
