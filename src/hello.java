/**
 * Created by Administrator on 2017/4/20.
 */
public class hello {
    private static hello ourInstance = new hello();
    public static hello getInstance() {
        return ourInstance;
    }

    private hello() {
    }
}
