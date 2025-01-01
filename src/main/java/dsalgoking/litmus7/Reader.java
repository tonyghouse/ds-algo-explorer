package dsalgoking.litmus7;

public class Reader {

    private final String x;
    private final Integer y;

    public Reader(String x){
        this.x = x;
        this.y = null;
    }

    public Reader(Integer y){
        this.x = null;
        this.y = y;
    }
}
