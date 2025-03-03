package org.acra.attachment;

import D6.b;
import D6.i;
import N.e;
import P6.f;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import g7.C0996d;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.file.Directory;

public final class AcraContentProvider extends ContentProvider {

    /* renamed from: V  reason: collision with root package name */
    public static final String[] f14285V = {"_display_name", "_size"};

    /* renamed from: U  reason: collision with root package name */
    public String f14286U;

    public final File a(Uri uri) {
        if (!"content".equals(uri.getScheme()) || !f.a(this.f14286U, uri.getAuthority())) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        f.d(pathSegments, "getPathSegments(...)");
        ArrayList V8 = i.V(pathSegments);
        if (V8.size() < 2) {
            return null;
        }
        Object remove = V8.remove(0);
        f.d(remove, "removeAt(...)");
        String upperCase = ((String) remove).toUpperCase(Locale.ROOT);
        f.d(upperCase, "toUpperCase(...)");
        try {
            Directory valueOf = Directory.valueOf(upperCase);
            Context context = getContext();
            f.b(context);
            String join = TextUtils.join(File.separator, V8);
            f.d(join, "join(...)");
            return valueOf.getFile(context, join);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        f.e(uri, "uri");
        throw new UnsupportedOperationException("No delete supported");
    }

    public final String getType(Uri uri) {
        f.e(uri, "uri");
        return C0996d.i(uri);
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        f.e(uri, "uri");
        throw new UnsupportedOperationException("No insert supported");
    }

    public final boolean onCreate() {
        Context context = getContext();
        f.b(context);
        this.f14286U = e.x(context.getPackageName(), ".acra");
        ErrorReporter errorReporter = C1247a.f13789a;
        return true;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        f.e(uri, "uri");
        f.e(str, "mode");
        File a8 = a(uri);
        if (a8 != null) {
            if (!a8.exists()) {
                a8 = null;
            }
            if (a8 != null) {
                ErrorReporter errorReporter = C1247a.f13789a;
                ParcelFileDescriptor open = ParcelFileDescriptor.open(a8, 268435456);
                f.d(open, "open(...)");
                return open;
            }
        }
        throw new FileNotFoundException("File represented by uri " + uri + " could not be found");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        f.e(uri, "uri");
        ErrorReporter errorReporter = C1247a.f13789a;
        File a8 = a(uri);
        if (a8 == null) {
            return null;
        }
        if (strArr == null) {
            strArr = f14285V;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b g8 = f.g(strArr);
        while (g8.hasNext()) {
            String str3 = (String) g8.next();
            if (f.a(str3, "_display_name")) {
                linkedHashMap.put("_display_name", a8.getName());
            } else if (f.a(str3, "_size")) {
                linkedHashMap.put("_size", Long.valueOf(a8.length()));
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor((String[]) linkedHashMap.keySet().toArray(new String[0]), 1);
        matrixCursor.addRow(linkedHashMap.values());
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        f.e(uri, "uri");
        throw new UnsupportedOperationException("No update supported");
    }
}
