package P5;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import n2.a;

public final /* synthetic */ class u implements FileFilter {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3926U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ List f3927V;

    public /* synthetic */ u(int i, List list) {
        this.f3926U = i;
        this.f3927V = list;
    }

    public final boolean accept(File file) {
        switch (this.f3926U) {
            case 0:
                return this.f3927V.contains(a.K(file.getName()));
            default:
                if (((ArrayList) this.f3927V).contains(a.K(file.getName())) || file.isDirectory()) {
                    return true;
                }
                return false;
        }
    }
}
