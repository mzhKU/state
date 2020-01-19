package exam_state;

public interface State {
    State handle(MessageHandler mh, String msg);
    // XXX genau, als Variante hätte man auch bereits im Kontext den Text msg in eine Zahl konvertieren können.
    //     Und anstelle des MessageHandlers hätte es genügt, den Publisher zu übergeben, denn da Sie den State
    //     als Resultat zurückgeben brauchen Sie vom MessageHandler NUR den Publisher.
}
