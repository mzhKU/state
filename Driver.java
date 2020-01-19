package exam_state;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Int parse: " + Integer.parseInt("0"));
        System.out.println("Int parse: " + Integer.parseInt("1"));
        System.out.println("Int parse: " + Integer.parseInt("7"));

        MessageHandler mh = new MessageHandler(new Publisher() {
            @Override
            public void newData(int x, int y, int z) {
                System.out.println("Publisher -- x: " + x + ", y: " + y + ", z: " + z);
            }
        });
        mh.handleMessage("START");
        mh.handleMessage("1");
        mh.handleMessage("2");
        mh.handleMessage("3");
    }
}
