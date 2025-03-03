package c3;

import b3.C0528a;
import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

/* renamed from: c3.a  reason: case insensitive filesystem */
public final class C0614a implements FileFilter {

    /* renamed from: U  reason: collision with root package name */
    public final String[] f8880U;

    /* renamed from: V  reason: collision with root package name */
    public final C0528a f8881V;

    public C0614a(C0528a aVar) {
        String[] strArr = (String[]) aVar.f8658g;
        if (strArr != null) {
            this.f8880U = strArr;
        } else {
            this.f8880U = new String[]{""};
        }
        this.f8881V = aVar;
    }

    public final boolean accept(File file) {
        if (file.isDirectory() && file.canRead()) {
            return true;
        }
        if (this.f8881V.f8655c == 1) {
            return false;
        }
        String lowerCase = file.getName().toLowerCase(Locale.getDefault());
        for (String endsWith : this.f8880U) {
            if (lowerCase.endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }
}
