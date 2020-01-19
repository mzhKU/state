package exam_state;

public class XRead implements State {

    private MessageHandler mh;	// XXX dieses Feld wird im XRead gar nicht verwendet, d.h. man könnte dieses Feld auch weglassen.
    public int x;	// XXX ich würde beide Felder, mh und x als final deklarieren.

    public XRead(MessageHandler mh, int x) {
        this.mh = mh;
        this.x = x;
    }

    @Override
    public State handle(MessageHandler mh, String msg) {
        return new YRead(mh, Integer.parseInt(msg));
        // XXX da fehlt mir jetzt aber das x, denn dieses geht verloren, oder? Das sollte ebenfalls dem YRead übergeben werden.
    }
}
