package r0;

import D.C0051j0;
import F.h;
import N5.c;
import V1.C0347f;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import l0.C1169b;

/* renamed from: r0.c  reason: case insensitive filesystem */
public abstract class C1369c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f14792a = new c(2);

    /* renamed from: b  reason: collision with root package name */
    public static final C0051j0 f14793b = new C0051j0(26);

    /* JADX WARNING: type inference failed for: r5v2, types: [V1.f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v3, types: [V1.f, java.lang.Object] */
    public static C0347f a(Context context, List list) {
        Trace.beginSection(h.H("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C1370d dVar = (C1370d) list.get(i);
                ProviderInfo b8 = b(context.getPackageManager(), dVar, context.getResources());
                if (b8 == null) {
                    ? obj = new Object();
                    obj.f5768b = 1;
                    obj.f5767a = Collections.singletonList((Object) null);
                    Trace.endSection();
                    return obj;
                }
                arrayList.add(c(context, dVar, b8.authority));
            }
            ? obj2 = new Object();
            obj2.f5768b = 0;
            obj2.f5767a = arrayList;
            Trace.endSection();
            return obj2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [r0.b, java.lang.Object] */
    public static ProviderInfo b(PackageManager packageManager, C1370d dVar, Resources resources) {
        Trace.beginSection(h.H("FontProvider.getProvider"));
        try {
            List list = dVar.f14797d;
            String str = dVar.f14794a;
            String str2 = dVar.f14795b;
            if (list == null) {
                list = C1169b.k(resources, 0);
            }
            ? obj = new Object();
            obj.f14789a = str;
            obj.f14790b = str2;
            obj.f14791c = list;
            c cVar = f14792a;
            ProviderInfo providerInfo = (ProviderInfo) cVar.h(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            } else if (resolveContentProvider.packageName.equals(str2)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                C0051j0 j0Var = f14793b;
                Collections.sort(arrayList, j0Var);
                for (int i = 0; i < list.size(); i++) {
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                    Collections.sort(arrayList2, j0Var);
                    if (arrayList.size() == arrayList2.size()) {
                        int i8 = 0;
                        while (i8 < arrayList.size()) {
                            if (Arrays.equals((byte[]) arrayList.get(i8), (byte[]) arrayList2.get(i8))) {
                                i8++;
                            }
                        }
                        cVar.l(obj, resolveContentProvider);
                        Trace.endSection();
                        return resolveContentProvider;
                    }
                }
                Trace.endSection();
                return null;
            } else {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
        } finally {
            Trace.endSection();
        }
    }

    public static C1374h[] c(Context context, C1370d dVar, String str) {
        C1367a aVar;
        Cursor cursor;
        Cursor cursor2;
        int i;
        int i8;
        Uri withAppendedId;
        int i9;
        boolean z;
        Context context2 = context;
        String str2 = str;
        Trace.beginSection(h.H("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                aVar = new C1367a(context2, build, 0);
            } else {
                aVar = new C1367a(context2, build, 1);
            }
            cursor = null;
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            Trace.beginSection(h.H("ContentQueryWrapper.query"));
            try {
                String[] strArr2 = {dVar.f14796c};
                switch (aVar.f14787a) {
                    case 0:
                        cursor2 = null;
                        ContentProviderClient contentProviderClient = aVar.f14788b;
                        if (contentProviderClient != null) {
                            try {
                                cursor2 = contentProviderClient.query(build, strArr, "query = ?", strArr2, (String) null, (CancellationSignal) null);
                                break;
                            } catch (RemoteException e) {
                                Log.w("FontsProvider", "Unable to query the content provider", e);
                                break;
                            }
                        }
                        break;
                    default:
                        cursor2 = null;
                        ContentProviderClient contentProviderClient2 = aVar.f14788b;
                        if (contentProviderClient2 != null) {
                            cursor2 = contentProviderClient2.query(build, strArr, "query = ?", strArr2, (String) null, (CancellationSignal) null);
                            break;
                        }
                        break;
                }
            } catch (RemoteException e8) {
                Log.w("FontsProvider", "Unable to query the content provider", e8);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
            cursor = cursor2;
            Trace.endSection();
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i = cursor.getInt(columnIndex);
                    } else {
                        i = 0;
                    }
                    if (columnIndex4 != -1) {
                        i8 = cursor.getInt(columnIndex4);
                    } else {
                        i8 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i9 = cursor.getInt(columnIndex5);
                    } else {
                        i9 = 400;
                    }
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    arrayList2.add(new C1374h(uri, i8, i9, z, i));
                }
                arrayList = arrayList2;
            }
            if (cursor != null) {
                cursor.close();
            }
            aVar.a();
            C1374h[] hVarArr = (C1374h[]) arrayList.toArray(new C1374h[0]);
            Trace.endSection();
            return hVarArr;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
