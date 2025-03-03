package P5;

import java.io.File;
import java.io.FileOutputStream;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final File f3811a;

    /* renamed from: b  reason: collision with root package name */
    public final FileOutputStream f3812b;

    public F(File file) {
        File createTempFile = File.createTempFile("NanoHTTPD-", "", file);
        this.f3811a = createTempFile;
        this.f3812b = new FileOutputStream(createTempFile);
    }
}
