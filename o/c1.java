package o;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import z0.C1642d;

public final class c1 extends C1642d implements View.OnClickListener {

    /* renamed from: s0  reason: collision with root package name */
    public static final /* synthetic */ int f13932s0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public final SearchView f13933f0;

    /* renamed from: g0  reason: collision with root package name */
    public final SearchableInfo f13934g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Context f13935h0;

    /* renamed from: i0  reason: collision with root package name */
    public final WeakHashMap f13936i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f13937j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f13938k0 = 1;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f13939l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f13940m0 = -1;

    /* renamed from: n0  reason: collision with root package name */
    public int f13941n0 = -1;

    /* renamed from: o0  reason: collision with root package name */
    public int f13942o0 = -1;
    public int p0 = -1;

    /* renamed from: q0  reason: collision with root package name */
    public int f13943q0 = -1;

    /* renamed from: r0  reason: collision with root package name */
    public int f13944r0 = -1;

    public c1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        e(context, 1);
        this.f16414d0 = suggestionRowLayout;
        this.f16413c0 = suggestionRowLayout;
        this.f16415e0 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f13933f0 = searchView;
        this.f13934g0 = searchableInfo;
        this.f13937j0 = searchView.getSuggestionCommitIconResId();
        this.f13935h0 = context;
        this.f13936i0 = weakHashMap;
    }

    public static String k(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public final void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f13940m0 = cursor.getColumnIndex("suggest_text_1");
                this.f13941n0 = cursor.getColumnIndex("suggest_text_2");
                this.f13942o0 = cursor.getColumnIndex("suggest_text_2_url");
                this.p0 = cursor.getColumnIndex("suggest_icon_1");
                this.f13943q0 = cursor.getColumnIndex("suggest_icon_2");
                this.f13944r0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public final String b(Cursor cursor) {
        String k8;
        String k9;
        if (cursor == null) {
            return null;
        }
        String k10 = k(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (k10 != null) {
            return k10;
        }
        SearchableInfo searchableInfo = this.f13934g0;
        if (searchableInfo.shouldRewriteQueryFromData() && (k9 = k(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return k9;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (k8 = k(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return k8;
    }

    public final Cursor c(CharSequence charSequence) {
        String str;
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        SearchView searchView = this.f13933f0;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                Cursor j7 = j(this.f13934g0, str);
                if (j7 != null) {
                    j7.getCount();
                    return j7;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.view.View r22, android.database.Cursor r23) {
        /*
            r21 = this;
            r1 = r21
            r2 = r23
            java.lang.Object r0 = r22.getTag()
            r3 = r0
            o.b1 r3 = (o.b1) r3
            int r0 = r1.f13944r0
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            android.widget.TextView r7 = r3.f13926a
            r8 = 8
            if (r7 == 0) goto L_0x0034
            int r0 = r1.f13940m0
            java.lang.String r0 = k(r2, r0)
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0031
            r7.setVisibility(r8)
            goto L_0x0034
        L_0x0031:
            r7.setVisibility(r4)
        L_0x0034:
            r9 = 1
            r10 = 2
            android.content.Context r11 = r1.f13935h0
            android.widget.TextView r0 = r3.f13927b
            if (r0 == 0) goto L_0x00ba
            int r12 = r1.f13942o0
            java.lang.String r12 = k(r2, r12)
            if (r12 == 0) goto L_0x008d
            android.content.res.ColorStateList r13 = r1.f13939l0
            if (r13 != 0) goto L_0x0063
            android.util.TypedValue r13 = new android.util.TypedValue
            r13.<init>()
            android.content.res.Resources$Theme r14 = r11.getTheme()
            r15 = 2130969730(0x7f040482, float:1.754815E38)
            r14.resolveAttribute(r15, r13, r9)
            android.content.res.Resources r14 = r11.getResources()
            int r13 = r13.resourceId
            android.content.res.ColorStateList r13 = r14.getColorStateList(r13)
            r1.f13939l0 = r13
        L_0x0063:
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r12)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            android.content.res.ColorStateList r14 = r1.f13939l0
            r16 = 0
            r19 = 0
            r17 = 0
            r18 = 0
            r20 = r14
            r14 = r15
            r5 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            r14.<init>(r15, r16, r17, r18, r19)
            int r12 = r12.length()
            r14 = 33
            r13.setSpan(r5, r4, r12, r14)
            goto L_0x0093
        L_0x008d:
            int r5 = r1.f13941n0
            java.lang.String r13 = k(r2, r5)
        L_0x0093:
            boolean r5 = android.text.TextUtils.isEmpty(r13)
            if (r5 == 0) goto L_0x00a2
            if (r7 == 0) goto L_0x00aa
            r7.setSingleLine(r4)
            r7.setMaxLines(r10)
            goto L_0x00aa
        L_0x00a2:
            if (r7 == 0) goto L_0x00aa
            r7.setSingleLine(r9)
            r7.setMaxLines(r9)
        L_0x00aa:
            r0.setText(r13)
            boolean r5 = android.text.TextUtils.isEmpty(r13)
            if (r5 == 0) goto L_0x00b7
            r0.setVisibility(r8)
            goto L_0x00ba
        L_0x00b7:
            r0.setVisibility(r4)
        L_0x00ba:
            android.widget.ImageView r12 = r3.f13928c
            if (r12 == 0) goto L_0x0164
            int r0 = r1.p0
            r13 = -1
            if (r0 != r13) goto L_0x00c6
            r0 = 0
            goto L_0x0150
        L_0x00c6:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.i(r0)
            if (r0 == 0) goto L_0x00d2
            goto L_0x0150
        L_0x00d2:
            android.app.SearchableInfo r0 = r1.f13934g0
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r13 = r0.flattenToShortString()
            java.util.WeakHashMap r14 = r1.f13936i0
            boolean r15 = r14.containsKey(r13)
            if (r15 == 0) goto L_0x00f7
            java.lang.Object r0 = r14.get(r13)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00ee
            r0 = 0
            goto L_0x0145
        L_0x00ee:
            android.content.res.Resources r13 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r13)
            goto L_0x0145
        L_0x00f7:
            java.lang.String r15 = "SuggestionsAdapter"
            android.content.pm.PackageManager r5 = r11.getPackageManager()
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r10 = r5.getActivityInfo(r0, r10)     // Catch:{ NameNotFoundException -> 0x0130 }
            int r8 = r10.getIconResource()
            if (r8 != 0) goto L_0x010b
        L_0x0109:
            r0 = 0
            goto L_0x013a
        L_0x010b:
            java.lang.String r9 = r0.getPackageName()
            android.content.pm.ApplicationInfo r10 = r10.applicationInfo
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r9, r8, r10)
            if (r5 != 0) goto L_0x012e
            java.lang.String r5 = "Invalid icon resource "
            java.lang.String r9 = " for "
            java.lang.StringBuilder r5 = Q0.g.p(r8, r5, r9)
            java.lang.String r0 = r0.flattenToShortString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r15, r0)
            goto L_0x0109
        L_0x012e:
            r0 = r5
            goto L_0x013a
        L_0x0130:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r15, r0)
            goto L_0x0109
        L_0x013a:
            if (r0 != 0) goto L_0x013e
            r5 = 0
            goto L_0x0142
        L_0x013e:
            android.graphics.drawable.Drawable$ConstantState r5 = r0.getConstantState()
        L_0x0142:
            r14.put(r13, r5)
        L_0x0145:
            if (r0 == 0) goto L_0x0148
            goto L_0x0150
        L_0x0148:
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0150:
            r12.setImageDrawable(r0)
            if (r0 != 0) goto L_0x015a
            r0 = 4
            r12.setVisibility(r0)
            goto L_0x0164
        L_0x015a:
            r12.setVisibility(r4)
            r0.setVisible(r4, r4)
            r5 = 1
            r0.setVisible(r5, r4)
        L_0x0164:
            android.widget.ImageView r0 = r3.f13929d
            if (r0 == 0) goto L_0x018d
            int r5 = r1.f13943q0
            r8 = -1
            if (r5 != r8) goto L_0x016f
            r5 = 0
            goto L_0x0177
        L_0x016f:
            java.lang.String r2 = r2.getString(r5)
            android.graphics.drawable.Drawable r5 = r1.i(r2)
        L_0x0177:
            r0.setImageDrawable(r5)
            if (r5 != 0) goto L_0x0182
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x018d
        L_0x0182:
            r0.setVisibility(r4)
            r5.setVisible(r4, r4)
            r2 = 1
            r5.setVisible(r2, r4)
            goto L_0x018e
        L_0x018d:
            r2 = 1
        L_0x018e:
            int r0 = r1.f13938k0
            android.widget.ImageView r3 = r3.e
            r5 = 2
            if (r0 == r5) goto L_0x01a2
            if (r0 != r2) goto L_0x019c
            r0 = r6 & 1
            if (r0 == 0) goto L_0x019c
            goto L_0x01a2
        L_0x019c:
            r2 = 8
            r3.setVisibility(r2)
            goto L_0x01af
        L_0x01a2:
            r3.setVisibility(r4)
            java.lang.CharSequence r0 = r7.getText()
            r3.setTag(r0)
            r3.setOnClickListener(r1)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c1.d(android.view.View, android.database.Cursor):void");
    }

    public final View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        View f8 = super.f(context, cursor, viewGroup);
        f8.setTag(new b1(f8));
        ((ImageView) f8.findViewById(2131362009)).setImageResource(this.f13937j0);
        return f8;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.f16415e0.inflate(this.f16414d0, viewGroup, false);
            if (inflate != null) {
                ((b1) inflate.getTag()).f13926a.setText(e.toString());
            }
            return inflate;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View f8 = f(this.f13935h0, this.f16406W, viewGroup);
            ((b1) f8.getTag()).f13926a.setText(e.toString());
            return f8;
        }
    }

    public final Drawable h(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f13935h0.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0091 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable i(java.lang.String r11) {
        /*
            r10 = this;
            java.util.WeakHashMap r0 = r10.f13936i0
            java.lang.String r1 = "SuggestionsAdapter"
            android.content.Context r2 = r10.f13935h0
            java.lang.String r3 = "android.resource://"
            r4 = 0
            if (r11 == 0) goto L_0x0115
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L_0x0115
            java.lang.String r5 = "0"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x001b
            goto L_0x0115
        L_0x001b:
            int r5 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            r6.<init>(r3)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            java.lang.String r3 = r2.getPackageName()     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            r6.append(r3)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            java.lang.String r3 = "/"
            r6.append(r3)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            r6.append(r5)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            java.lang.String r3 = r6.toString()     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            android.graphics.drawable.Drawable$ConstantState r6 = (android.graphics.drawable.Drawable.ConstantState) r6     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            if (r6 != 0) goto L_0x0041
            r6 = r4
            goto L_0x0045
        L_0x0041:
            android.graphics.drawable.Drawable r6 = r6.newDrawable()     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
        L_0x0045:
            if (r6 == 0) goto L_0x0048
            return r6
        L_0x0048:
            android.graphics.drawable.Drawable r5 = r2.getDrawable(r5)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            if (r5 == 0) goto L_0x0055
            android.graphics.drawable.Drawable$ConstantState r6 = r5.getConstantState()     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
            r0.put(r3, r6)     // Catch:{ NumberFormatException -> 0x0056, NotFoundException -> 0x0058 }
        L_0x0055:
            return r5
        L_0x0056:
            goto L_0x0062
        L_0x0058:
            java.lang.String r0 = "Icon resource not found: "
            java.lang.String r11 = r0.concat(r11)
            android.util.Log.w(r1, r11)
            return r4
        L_0x0062:
            java.lang.Object r3 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
            if (r3 != 0) goto L_0x006c
            r3 = r4
            goto L_0x0070
        L_0x006c:
            android.graphics.drawable.Drawable r3 = r3.newDrawable()
        L_0x0070:
            if (r3 == 0) goto L_0x0073
            return r3
        L_0x0073:
            android.net.Uri r3 = android.net.Uri.parse(r11)
            java.lang.String r5 = "Error closing icon stream for "
            java.lang.String r6 = "Failed to open "
            java.lang.String r7 = "Resource does not exist: "
            java.lang.String r8 = r3.getScheme()     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.String r9 = "android.resource"
            boolean r8 = r9.equals(r8)     // Catch:{ FileNotFoundException -> 0x008f }
            if (r8 == 0) goto L_0x00a3
            android.graphics.drawable.Drawable r4 = r10.h(r3)     // Catch:{ NotFoundException -> 0x0091 }
            goto L_0x010c
        L_0x008f:
            r2 = move-exception
            goto L_0x00ef
        L_0x0091:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008f }
            r5.<init>(r7)     // Catch:{ FileNotFoundException -> 0x008f }
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x008f }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008f }
            throw r2     // Catch:{ FileNotFoundException -> 0x008f }
        L_0x00a3:
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x008f }
            java.io.InputStream r2 = r2.openInputStream(r3)     // Catch:{ FileNotFoundException -> 0x008f }
            if (r2 == 0) goto L_0x00dd
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromStream(r2, r4)     // Catch:{ all -> 0x00c7 }
            r2.close()     // Catch:{ IOException -> 0x00b5 }
            goto L_0x00c5
        L_0x00b5:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008f }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008f }
            r7.append(r3)     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.String r5 = r7.toString()     // Catch:{ FileNotFoundException -> 0x008f }
            android.util.Log.e(r1, r5, r2)     // Catch:{ FileNotFoundException -> 0x008f }
        L_0x00c5:
            r4 = r6
            goto L_0x010c
        L_0x00c7:
            r6 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00cc }
            goto L_0x00dc
        L_0x00cc:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008f }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008f }
            r7.append(r3)     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.String r5 = r7.toString()     // Catch:{ FileNotFoundException -> 0x008f }
            android.util.Log.e(r1, r5, r2)     // Catch:{ FileNotFoundException -> 0x008f }
        L_0x00dc:
            throw r6     // Catch:{ FileNotFoundException -> 0x008f }
        L_0x00dd:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008f }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x008f }
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x008f }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x008f }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008f }
            throw r2     // Catch:{ FileNotFoundException -> 0x008f }
        L_0x00ef:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Icon not found: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ", "
            r5.append(r3)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.w(r1, r2)
        L_0x010c:
            if (r4 == 0) goto L_0x0115
            android.graphics.drawable.Drawable$ConstantState r1 = r4.getConstantState()
            r0.put(r11, r1)
        L_0x0115:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c1.i(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor j(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f13935h0.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f16406W;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f16406W;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f13933f0.r((CharSequence) tag);
        }
    }
}
