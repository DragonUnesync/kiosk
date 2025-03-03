package m0;

import D7.b;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import r0.C1374h;

/* renamed from: m0.k  reason: case insensitive filesystem */
public final class C1205k extends b {
    public static Font R(FontFamily fontFamily, int i) {
        int i8;
        int i9;
        if ((i & 1) != 0) {
            i8 = 700;
        } else {
            i8 = 400;
        }
        if ((i & 2) != 0) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        FontStyle fontStyle = new FontStyle(i8, i9);
        Font font = fontFamily.getFont(0);
        int T8 = T(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int T9 = T(fontStyle, font2.getStyle());
            if (T9 < T8) {
                font = font2;
                T8 = T9;
            }
        }
        return font;
    }

    public static FontFamily S(C1374h[] hVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (C1374h hVar : hVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(hVar.f14809a, "r", (CancellationSignal) null);
                if (openFileDescriptor != null) {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(hVar.f14811c).setSlant(hVar.f14812d ? 1 : 0).setTtcIndex(hVar.f14810b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
        throw th;
    }

    public static int T(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: l0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: l0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: l0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: l0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: l0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: l0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: l0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: l0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: l0.f[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041 A[SYNTHETIC, Splitter:B:16:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0008 A[Catch:{ Exception -> 0x0036 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface f(android.content.Context r7, l0.e r8, android.content.res.Resources r9, int r10) {
        /*
            r6 = this;
            r7 = 0
            l0.f[] r8 = r8.f13068a     // Catch:{ Exception -> 0x0036 }
            int r0 = r8.length     // Catch:{ Exception -> 0x0036 }
            r1 = 0
            r2 = r7
        L_0x0006:
            if (r1 >= r0) goto L_0x003e
            r3 = r8[r1]     // Catch:{ Exception -> 0x0036 }
            android.graphics.fonts.Font$Builder r4 = new android.graphics.fonts.Font$Builder     // Catch:{ IOException -> 0x003b }
            int r5 = r3.f13073f     // Catch:{ IOException -> 0x003b }
            r4.<init>(r9, r5)     // Catch:{ IOException -> 0x003b }
            int r5 = r3.f13070b     // Catch:{ IOException -> 0x003b }
            android.graphics.fonts.Font$Builder r4 = r4.setWeight(r5)     // Catch:{ IOException -> 0x003b }
            boolean r5 = r3.f13071c     // Catch:{ IOException -> 0x003b }
            android.graphics.fonts.Font$Builder r4 = r4.setSlant(r5)     // Catch:{ IOException -> 0x003b }
            int r5 = r3.e     // Catch:{ IOException -> 0x003b }
            android.graphics.fonts.Font$Builder r4 = r4.setTtcIndex(r5)     // Catch:{ IOException -> 0x003b }
            java.lang.String r3 = r3.f13072d     // Catch:{ IOException -> 0x003b }
            android.graphics.fonts.Font$Builder r3 = r4.setFontVariationSettings(r3)     // Catch:{ IOException -> 0x003b }
            android.graphics.fonts.Font r3 = r3.build()     // Catch:{ IOException -> 0x003b }
            if (r2 != 0) goto L_0x0038
            android.graphics.fonts.FontFamily$Builder r4 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ IOException -> 0x003b }
            r4.<init>(r3)     // Catch:{ IOException -> 0x003b }
            r2 = r4
            goto L_0x003b
        L_0x0036:
            r8 = move-exception
            goto L_0x005b
        L_0x0038:
            r2.addFont(r3)     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            int r1 = r1 + 1
            goto L_0x0006
        L_0x003e:
            if (r2 != 0) goto L_0x0041
            return r7
        L_0x0041:
            android.graphics.fonts.FontFamily r8 = r2.build()     // Catch:{ Exception -> 0x0036 }
            android.graphics.Typeface$CustomFallbackBuilder r9 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x0036 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x0036 }
            android.graphics.fonts.Font r8 = R(r8, r10)     // Catch:{ Exception -> 0x0036 }
            android.graphics.fonts.FontStyle r8 = r8.getStyle()     // Catch:{ Exception -> 0x0036 }
            android.graphics.Typeface$CustomFallbackBuilder r8 = r9.setStyle(r8)     // Catch:{ Exception -> 0x0036 }
            android.graphics.Typeface r7 = r8.build()     // Catch:{ Exception -> 0x0036 }
            return r7
        L_0x005b:
            java.lang.String r9 = "TypefaceCompatApi29Impl"
            java.lang.String r10 = "Font load failed"
            android.util.Log.w(r9, r10, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C1205k.f(android.content.Context, l0.e, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public final Typeface g(Context context, C1374h[] hVarArr, int i) {
        try {
            FontFamily S8 = S(hVarArr, context.getContentResolver());
            if (S8 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(S8).setStyle(R(S8, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final Typeface h(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily S8 = S((C1374h[]) list.get(0), contentResolver);
            if (S8 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(S8);
            for (int i8 = 1; i8 < list.size(); i8++) {
                FontFamily S9 = S((C1374h[]) list.get(i8), contentResolver);
                if (S9 != null) {
                    customFallbackBuilder.addCustomFallback(S9);
                }
            }
            return customFallbackBuilder.setStyle(R(S8, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final Typeface i(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface j(Context context, Resources resources, int i, String str, int i8) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final C1374h m(C1374h[] hVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
