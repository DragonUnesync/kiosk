package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.samsung.android.knox.accounts.Account;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import k0.c;
import org.xmlpull.v1.XmlPullParserException;
import u.C1477r;

public class FileProvider extends ContentProvider {

    /* renamed from: X  reason: collision with root package name */
    public static final String[] f7733X = {"_display_name", "_size"};

    /* renamed from: Y  reason: collision with root package name */
    public static final File f7734Y = new File("/");

    /* renamed from: Z  reason: collision with root package name */
    public static final HashMap f7735Z = new HashMap();

    /* renamed from: U  reason: collision with root package name */
    public final Object f7736U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public String f7737V;

    /* renamed from: W  reason: collision with root package name */
    public c f7738W;

    public static String a(String str) {
        if (str.length() <= 0 || str.charAt(str.length() - 1) != '/') {
            return str;
        }
        return str.substring(0, str.length() - 1);
    }

    public static c c(Context context, String str) {
        c cVar;
        HashMap hashMap = f7735Z;
        synchronized (hashMap) {
            try {
                cVar = (c) hashMap.get(str);
                if (cVar == null) {
                    cVar = e(context, str);
                    hashMap.put(str, cVar);
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
            } catch (XmlPullParserException e8) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e8);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static Uri d(Context context, File file) {
        String str;
        c c8 = c(context, "com.fullykiosk.singleapp.fileprovider");
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c8.f12903b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (c.a(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    str = canonicalPath.substring(path2.length());
                } else {
                    str = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(c8.f12902a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(str, "/")).build();
            }
            throw new IllegalArgumentException(C1477r.d("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public static c e(Context context, String str) {
        c cVar = new c(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        return cVar;
                    }
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue((String) null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue((String) null, "path");
                        if ("root-path".equals(name)) {
                            file = f7734Y;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = context.getExternalFilesDirs((String) null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = context.getExternalCacheDirs();
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            }
                        }
                        if (file == null) {
                            continue;
                        } else {
                            String str2 = new String[]{attributeValue2}[0];
                            if (str2 != null) {
                                file = new File(file, str2);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    cVar.f12903b.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
        } else {
            throw new IllegalArgumentException(C1477r.d("Couldn't find meta-data for provider with authority ", str));
        }
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            synchronized (this.f7736U) {
                this.f7737V = str;
            }
            HashMap hashMap = f7735Z;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public final c b() {
        c cVar;
        synchronized (this.f7736U) {
            try {
                if (this.f7737V != null) {
                    if (this.f7738W == null) {
                        this.f7738W = c(getContext(), this.f7737V);
                    }
                    cVar = this.f7738W;
                } else {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    public final String getType(Uri uri) {
        String mimeTypeFromExtension;
        File b8 = b().b(uri);
        int lastIndexOf = b8.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b8.getName().substring(lastIndexOf + 1))) == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public final boolean onCreate() {
        return true;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File b8 = b().b(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            throw new IllegalArgumentException(C1477r.d("Invalid mode: ", str));
        }
        return ParcelFileDescriptor.open(b8, i);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        String str3;
        File b8 = b().b(uri);
        String queryParameter = uri.getQueryParameter(Account.DISPLAY_NAME);
        if (strArr == null) {
            strArr = f7733X;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i8 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i8] = "_display_name";
                i = i8 + 1;
                if (queryParameter == null) {
                    str3 = b8.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i8] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i8] = "_size";
                i = i8 + 1;
                objArr[i8] = Long.valueOf(b8.length());
            }
            i8 = i;
        }
        String[] strArr4 = new String[i8];
        System.arraycopy(strArr3, 0, strArr4, 0, i8);
        Object[] objArr2 = new Object[i8];
        System.arraycopy(objArr, 0, objArr2, 0, i8);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
