package exam_state;

public interface State {
    State handle(MessageHandler mh, String msg);
    // XXX genau, als Variante h�tte man auch bereits im Kontext den Text msg in eine Zahl konvertieren k�nnen.
    //     Und anstelle des MessageHandlers h�tte es gen�gt, den Publisher zu �bergeben, denn da Sie den State
    //     als Resultat zur�ckgeben brauchen Sie vom MessageHandler NUR den Publisher.
}
