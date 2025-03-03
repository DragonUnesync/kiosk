package n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.C1131a;
import v0.C1511I;

public class m implements Menu {

    /* renamed from: s0  reason: collision with root package name */
    public static final int[] f13477s0 = {1, 4, 5, 3, 2, 0};

    /* renamed from: U  reason: collision with root package name */
    public final Context f13478U;

    /* renamed from: V  reason: collision with root package name */
    public final Resources f13479V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f13480W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f13481X;

    /* renamed from: Y  reason: collision with root package name */
    public k f13482Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f13483Z;

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList f13484a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f13485b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ArrayList f13486c0;

    /* renamed from: d0  reason: collision with root package name */
    public final ArrayList f13487d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f13488e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f13489f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public CharSequence f13490g0;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f13491h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f13492i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f13493j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f13494k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f13495l0 = false;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f13496m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public final ArrayList f13497n0 = new ArrayList();

    /* renamed from: o0  reason: collision with root package name */
    public final CopyOnWriteArrayList f13498o0 = new CopyOnWriteArrayList();
    public o p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f13499q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f13500r0;

    public m(Context context) {
        boolean z;
        boolean z6 = false;
        this.f13478U = context;
        Resources resources = context.getResources();
        this.f13479V = resources;
        this.f13483Z = new ArrayList();
        this.f13484a0 = new ArrayList();
        this.f13485b0 = true;
        this.f13486c0 = new ArrayList();
        this.f13487d0 = new ArrayList();
        this.f13488e0 = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = C1511I.f15880a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = C1131a.n(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier == 0 || !resources2.getBoolean(identifier)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                z6 = true;
            }
        }
        this.f13481X = z6;
    }

    public final o a(int i, int i8, int i9, CharSequence charSequence) {
        int i10;
        int i11 = (-65536 & i9) >> 16;
        if (i11 < 0 || i11 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i12 = (f13477s0[i11] << 16) | (65535 & i9);
        o oVar = new o(this, i, i8, i9, i12, charSequence, this.f13489f0);
        ArrayList arrayList = this.f13483Z;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (((o) arrayList.get(size)).f13507X <= i12) {
                i10 = size + 1;
                break;
            } else {
                size--;
            }
        }
        arrayList.add(i10, oVar);
        p(true);
        return oVar;
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f13478U
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            n.o r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.f13510a0 = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f13498o0.add(new WeakReference(yVar));
        yVar.g(context, this);
        this.f13488e0 = true;
    }

    public final void c(boolean z) {
        if (!this.f13496m0) {
            this.f13496m0 = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f13498o0;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    yVar.a(this, z);
                }
            }
            this.f13496m0 = false;
        }
    }

    public final void clear() {
        o oVar = this.p0;
        if (oVar != null) {
            d(oVar);
        }
        this.f13483Z.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f13491h0 = null;
        this.f13490g0 = null;
        this.f13492i0 = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13498o0;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.p0 == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = yVar.k(oVar);
                    if (z) {
                        break;
                    }
                }
            }
            v();
            if (z) {
                this.p0 = null;
            }
        }
        return z;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f13482Y;
        if (kVar == null || !kVar.q(mVar, menuItem)) {
            return false;
        }
        return true;
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13498o0;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = yVar.f(oVar);
                if (z) {
                    break;
                }
            }
        }
        v();
        if (z) {
            this.p0 = oVar;
        }
        return z;
    }

    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f13483Z;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = (o) arrayList.get(i8);
            if (oVar.f13504U == i) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f13518i0.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final o g(int i, KeyEvent keyEvent) {
        char c8;
        ArrayList arrayList = this.f13497n0;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean n4 = n();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = (o) arrayList.get(i8);
            if (n4) {
                c8 = oVar.f13513d0;
            } else {
                c8 = oVar.f13511b0;
            }
            char[] cArr = keyData.meta;
            if ((c8 == cArr[0] && (metaState & 2) == 0) || ((c8 == cArr[2] && (metaState & 2) != 0) || (n4 && c8 == 8 && i == 67))) {
                return oVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i) {
        return (MenuItem) this.f13483Z.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c8;
        int i8;
        ArrayList arrayList2 = arrayList;
        int i9 = i;
        KeyEvent keyEvent2 = keyEvent;
        boolean n4 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent2.getKeyData(keyData) || i9 == 67) {
            ArrayList arrayList3 = this.f13483Z;
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList3.get(i10);
                if (oVar.hasSubMenu()) {
                    oVar.f13518i0.h(arrayList2, i9, keyEvent2);
                }
                if (n4) {
                    c8 = oVar.f13513d0;
                } else {
                    c8 = oVar.f13511b0;
                }
                if (n4) {
                    i8 = oVar.f13514e0;
                } else {
                    i8 = oVar.f13512c0;
                }
                if ((modifiers & 69647) == (i8 & 69647) && c8 != 0) {
                    char[] cArr = keyData.meta;
                    if (c8 != cArr[0] && c8 != cArr[2]) {
                        if (n4 && c8 == 8) {
                            if (i9 != 67) {
                            }
                        }
                    }
                    if (oVar.isEnabled()) {
                        arrayList2.add(oVar);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f13500r0) {
            return true;
        }
        ArrayList arrayList = this.f13483Z;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l8 = l();
        if (this.f13488e0) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f13498o0;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= yVar.i();
                }
            }
            ArrayList arrayList = this.f13486c0;
            ArrayList arrayList2 = this.f13487d0;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = l8.size();
                for (int i = 0; i < size; i++) {
                    o oVar = (o) l8.get(i);
                    if (oVar.f()) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f13488e0 = false;
        }
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (g(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z = this.f13485b0;
        ArrayList arrayList = this.f13484a0;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f13483Z;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList2.get(i);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.f13485b0 = false;
        this.f13488e0 = true;
        return arrayList;
    }

    public boolean m() {
        return this.f13499q0;
    }

    public boolean n() {
        return this.f13480W;
    }

    public boolean o() {
        return this.f13481X;
    }

    public final void p(boolean z) {
        if (!this.f13493j0) {
            if (z) {
                this.f13485b0 = true;
                this.f13488e0 = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f13498o0;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    y yVar = (y) weakReference.get();
                    if (yVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        yVar.d();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f13494k0 = true;
        if (z) {
            this.f13495l0 = true;
        }
    }

    public final boolean performIdentifierAction(int i, int i8) {
        return q(findItem(i), (y) null, i8);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i8) {
        boolean z;
        o g8 = g(i, keyEvent);
        if (g8 != null) {
            z = q(g8, (y) null, i8);
        } else {
            z = false;
        }
        if ((i8 & 2) != 0) {
            c(true);
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MenuItem r7, n.y r8, int r9) {
        /*
            r6 = this;
            n.o r7 = (n.o) r7
            r0 = 0
            if (r7 == 0) goto L_0x00d7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00d7
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f13519j0
            r2 = 1
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r1 = 1
            goto L_0x0043
        L_0x001a:
            n.m r1 = r7.f13517h0
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L_0x0023
            goto L_0x0018
        L_0x0023:
            android.content.Intent r3 = r7.f13510a0
            if (r3 == 0) goto L_0x0035
            android.content.Context r1 = r1.f13478U     // Catch:{ ActivityNotFoundException -> 0x002d }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x002d }
            goto L_0x0018
        L_0x002d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0035:
            n.p r1 = r7.f13529u0
            if (r1 == 0) goto L_0x0042
            android.view.ActionProvider r1 = r1.f13533b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L_0x0042
            goto L_0x0018
        L_0x0042:
            r1 = 0
        L_0x0043:
            n.p r3 = r7.f13529u0
            if (r3 == 0) goto L_0x0051
            android.view.ActionProvider r4 = r3.f13533b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x0064
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00d6
            r6.c(r2)
            goto L_0x00d6
        L_0x0064:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0075
            if (r4 == 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00d6
            r6.c(r2)
            goto L_0x00d6
        L_0x0075:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x007c
            r6.c(r0)
        L_0x007c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0090
            n.E r9 = new n.E
            android.content.Context r5 = r6.f13478U
            r9.<init>(r5, r6, r7)
            r7.f13518i0 = r9
            java.lang.CharSequence r5 = r7.f13508Y
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0090:
            n.E r7 = r7.f13518i0
            if (r4 == 0) goto L_0x009e
            n.t r9 = r3.f13534c
            r9.getClass()
            android.view.ActionProvider r9 = r3.f13533b
            r9.onPrepareSubMenu(r7)
        L_0x009e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f13498o0
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x00a7
            goto L_0x00d0
        L_0x00a7:
            if (r8 == 0) goto L_0x00ad
            boolean r0 = r8.h(r7)
        L_0x00ad:
            java.util.Iterator r8 = r9.iterator()
        L_0x00b1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00d0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            n.y r4 = (n.y) r4
            if (r4 != 0) goto L_0x00c9
            r9.remove(r3)
            goto L_0x00b1
        L_0x00c9:
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r4.h(r7)
            goto L_0x00b1
        L_0x00d0:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00d6
            r6.c(r2)
        L_0x00d6:
            return r1
        L_0x00d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m.q(android.view.MenuItem, n.y, int):boolean");
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13498o0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void removeGroup(int i) {
        ArrayList arrayList = this.f13483Z;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((o) arrayList.get(i9)).f13505V == i) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i8 + 1;
                if (i8 >= size2 || ((o) arrayList.get(i9)).f13505V != i) {
                    p(true);
                } else {
                    if (i9 >= 0) {
                        ArrayList arrayList2 = this.f13483Z;
                        if (i9 < arrayList2.size()) {
                            arrayList2.remove(i9);
                        }
                    }
                    i8 = i10;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i) {
        ArrayList arrayList = this.f13483Z;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (((o) arrayList.get(i8)).f13504U == i) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            ArrayList arrayList2 = this.f13483Z;
            if (i8 < arrayList2.size()) {
                arrayList2.remove(i8);
                p(true);
            }
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f13483Z.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C1224E) item.getSubMenu()).s(bundle);
                }
            }
            int i8 = bundle.getInt("android:menu:expandedactionview");
            if (i8 > 0 && (findItem = findItem(i8)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i, boolean z, boolean z6) {
        int i8;
        ArrayList arrayList = this.f13483Z;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) arrayList.get(i9);
            if (oVar.f13505V == i) {
                int i10 = oVar.f13526r0 & -5;
                if (z6) {
                    i8 = 4;
                } else {
                    i8 = 0;
                }
                oVar.f13526r0 = i10 | i8;
                oVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f13499q0 = z;
    }

    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f13483Z;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = (o) arrayList.get(i8);
            if (oVar.f13505V == i) {
                oVar.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i, boolean z) {
        int i8;
        ArrayList arrayList = this.f13483Z;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) arrayList.get(i9);
            if (oVar.f13505V == i) {
                int i10 = oVar.f13526r0;
                int i11 = i10 & -9;
                if (z) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                int i12 = i11 | i8;
                oVar.f13526r0 = i12;
                if (i10 != i12) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f13480W = z;
        p(false);
    }

    public final int size() {
        return this.f13483Z.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f13483Z.size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C1224E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i8, Drawable drawable, View view) {
        if (view != null) {
            this.f13492i0 = view;
            this.f13490g0 = null;
            this.f13491h0 = null;
        } else {
            if (i > 0) {
                this.f13490g0 = this.f13479V.getText(i);
            } else if (charSequence != null) {
                this.f13490g0 = charSequence;
            }
            if (i8 > 0) {
                this.f13491h0 = this.f13478U.getDrawable(i8);
            } else if (drawable != null) {
                this.f13491h0 = drawable;
            }
            this.f13492i0 = null;
        }
        p(false);
    }

    public final void v() {
        this.f13493j0 = false;
        if (this.f13494k0) {
            this.f13494k0 = false;
            p(this.f13495l0);
        }
    }

    public final void w() {
        if (!this.f13493j0) {
            this.f13493j0 = true;
            this.f13494k0 = false;
            this.f13495l0 = false;
        }
    }

    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f13479V.getString(i));
    }

    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f13479V.getString(i));
    }

    public final MenuItem add(int i, int i8, int i9, CharSequence charSequence) {
        return a(i, i8, i9, charSequence);
    }

    public final SubMenu addSubMenu(int i, int i8, int i9, CharSequence charSequence) {
        o a8 = a(i, i8, i9, charSequence);
        C1224E e = new C1224E(this.f13478U, this, a8);
        a8.f13518i0 = e;
        e.setHeaderTitle(a8.f13508Y);
        return e;
    }

    public final MenuItem add(int i, int i8, int i9, int i10) {
        return a(i, i8, i9, this.f13479V.getString(i10));
    }

    public final SubMenu addSubMenu(int i, int i8, int i9, int i10) {
        return addSubMenu(i, i8, i9, (CharSequence) this.f13479V.getString(i10));
    }
}
