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
        // XXX genau, aber das x wird nicht initialisiert. Wenn Sie die Felder x, y und mh final deklariert h�tten, dann 
        //     w�re dieser Fehler "aufgeflogen". Sie m�ssen also im YRead-Konstruktor noch das Feld x vorsehen, und
        //     in der KLasse XRead wird dann das gespeicherte x dem Konstruktor von YRead �bergeben.
        return new Init();
    }
}
