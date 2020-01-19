package exam_state;

public class YRead implements State {

    public int x;
    public int y;
    public MessageHandler mh;

    public YRead(MessageHandler mh, int y) {
        this.mh = mh;
        this.y = y;
    }

    @Override
    public State handle(MessageHandler mh, String msg) {
        this.mh.getPublisher().newData(x, y, Integer.parseInt(msg));
        return new Init();
    }
}
