package exam_state;

public class MessageHandler {
    private final Publisher p;
    public MessageHandler(Publisher p) { this.p = p; }

    private State state = new Init();

    public void setState(State state) { this.state = state; }
    public Publisher getPublisher() { return this.p; }

    public void handleMessage(String msg) {
        if (msg.equals("START")) {
            state = new Init();
        } else {
            // Task b
            state = state.handle(this, msg);
        }
    }
}
