package H2;

import B.q0;
import B2.f;
import B2.i;
import F2.e;
import M2.c;
import V2.b;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: H2.b  reason: case insensitive filesystem */
public final class C0081b implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1943a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1944b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1945c;

    public /* synthetic */ C0081b(Object obj, int i, Object obj2) {
        this.f1943a = i;
        this.f1945c = obj;
        this.f1944b = obj2;
    }

    public final p a(Object obj, int i, int i8, i iVar) {
        j jVar;
        Resources resources;
        p a8;
        Uri uri;
        switch (this.f1943a) {
            case 0:
                Uri uri2 = (Uri) obj;
                String substring = uri2.toString().substring(22);
                b bVar = new b(uri2);
                Object obj2 = this.f1944b;
                AssetManager assetManager = (AssetManager) this.f1945c;
                switch (((C0080a) obj2).f1941U) {
                    case 0:
                        jVar = new j(assetManager, substring, 0);
                        break;
                    default:
                        jVar = new j(assetManager, substring, 1);
                        break;
                }
                return new p(bVar, jVar);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) iVar.c(c.f3104b);
                if (theme != null) {
                    resources = theme.getResources();
                } else {
                    resources = ((Context) this.f1945c).getResources();
                }
                return new p(new b(num), new e(theme, resources, (e) this.f1944b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f1945c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                f fVar = null;
                for (int i9 = 0; i9 < size; i9++) {
                    q qVar = (q) arrayList.get(i9);
                    if (qVar.b(obj) && (a8 = qVar.a(obj, i, i8, iVar)) != null) {
                        arrayList2.add(a8.f1976c);
                        fVar = a8.f1974a;
                    }
                }
                if (arrayList2.isEmpty() || fVar == null) {
                    return null;
                }
                return new p(fVar, new u(arrayList2, (q0) this.f1944b));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources2 = (Resources) this.f1944b;
                try {
                    uri = Uri.parse("android.resource://" + resources2.getResourcePackageName(num2.intValue()) + '/' + resources2.getResourceTypeName(num2.intValue()) + '/' + resources2.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((q) this.f1945c).a(uri, i, i8, iVar);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                q qVar2 = (q) this.f1944b;
                if (size2 == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt != 0) {
                            return qVar2.a(Integer.valueOf(parseInt), i, i8, iVar);
                        }
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return null;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        return null;
                    } catch (NumberFormatException e8) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return null;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e8);
                        return null;
                    }
                } else if (pathSegments.size() == 2) {
                    List<String> pathSegments2 = uri3.getPathSegments();
                    String str = pathSegments2.get(1);
                    Context context = (Context) this.f1945c;
                    int identifier = context.getResources().getIdentifier(str, pathSegments2.get(0), context.getPackageName());
                    if (identifier != 0) {
                        return qVar2.a(Integer.valueOf(identifier), i, i8, iVar);
                    }
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                    return null;
                } else if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                } else {
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
        }
    }

    public final boolean b(Object obj) {
        switch (this.f1943a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
                    return false;
                }
                return true;
            case 1:
                Integer num = (Integer) obj;
                return true;
            case 2:
                Iterator it = ((ArrayList) this.f1945c).iterator();
                while (it.hasNext()) {
                    if (((q) it.next()).b(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                Integer num2 = (Integer) obj;
                return true;
            default:
                Uri uri2 = (Uri) obj;
                if (!"android.resource".equals(uri2.getScheme()) || !((Context) this.f1945c).getPackageName().equals(uri2.getAuthority())) {
                    return false;
                }
                return true;
        }
    }

    public String toString() {
        switch (this.f1943a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f1945c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0081b(Resources resources, q qVar) {
        this.f1943a = 3;
        this.f1944b = resources;
        this.f1945c = qVar;
    }

    public C0081b(Context context, e eVar) {
        this.f1943a = 1;
        this.f1945c = context.getApplicationContext();
        this.f1944b = eVar;
    }

    public C0081b(Context context, q qVar) {
        this.f1943a = 4;
        this.f1945c = context.getApplicationContext();
        this.f1944b = qVar;
    }
}
