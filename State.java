package exam_state;

public interface State {
    State handle(MessageHandler mh, String msg);
}
