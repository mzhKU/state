package exam_state;

public class Init implements State {

    public Init() { }

    public State handle(MessageHandler mh, String msg) {
        return new XRead(mh, Integer.parseInt(msg));
        // XXX genau, wenn im Init-State eine Zahl gelesen wurde dann muss man
        //     a) den Zustand wechseln zu XRead und
        //     b) irgendwo muss der gelesene Wert gespeichert werden.
    }
}
