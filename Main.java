package Football_League;
import java.io.IOException;
import java.io.NotSerializableException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException , NotSerializableException {
        League league = new League();
        Menu menu = new Menu(league);
        menu.start();
    }
}