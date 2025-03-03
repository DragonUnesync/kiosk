package B2;

import java.io.IOException;

public class c extends IOException {
    public c(int i, String str) {
        super("HTTP error fetching URL. Status=" + i + ", URL=[" + str + "]");
    }

    public c(int i, IOException iOException, String str) {
        super(str + ", status code: " + i, iOException);
    }

    public c(String str) {
        super(str);
    }
}
