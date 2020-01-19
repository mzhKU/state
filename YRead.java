package exam_state;

public class YRead implements State {

    private final int x;
    private final int y;
    private final MessageHandler mh;

    public YRead(MessageHandler mh, int x, int y) {
        this.mh = mh;
        this.x = x;
        this.y = y;
    }

    @Override
    public State handle(MessageHandler mh, String msg) {
        this.mh.getPublisher().newData(x, y, Integer.parseInt(msg));
        return new Init();
    }
}
