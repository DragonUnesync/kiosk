package n;

import I2.b;
import Y.i;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import o0.C1308a;

/* renamed from: n.B  reason: case insensitive filesystem */
public class C1221B extends b implements Menu {

    /* renamed from: W  reason: collision with root package name */
    public final m f13390W;

    public C1221B(Context context, m mVar) {
        super(context);
        if (mVar != null) {
            this.f13390W = mVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return f(this.f13390W.a(0, 0, 0, charSequence));
    }

    public final int addIntentOptions(int i, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f13390W.addIntentOptions(i, i8, i9, componentName, intentArr, intent, i10, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                menuItemArr3[i11] = f(menuItemArr2[i11]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f13390W.addSubMenu(0, 0, 0, charSequence);
    }

    public final void clear() {
        i iVar = (i) this.f2258V;
        if (iVar != null) {
            iVar.clear();
        }
        this.f13390W.clear();
    }

    public final void close() {
        this.f13390W.close();
    }

    public final MenuItem findItem(int i) {
        return f(this.f13390W.findItem(i));
    }

    public final MenuItem getItem(int i) {
        return f(this.f13390W.getItem(i));
    }

    public final boolean hasVisibleItems() {
        return this.f13390W.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f13390W.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i8) {
        return this.f13390W.performIdentifierAction(i, i8);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i8) {
        return this.f13390W.performShortcut(i, keyEvent, i8);
    }

    public final void removeGroup(int i) {
        if (((i) this.f2258V) != null) {
            int i8 = 0;
            while (true) {
                i iVar = (i) this.f2258V;
                if (i8 >= iVar.f6308W) {
                    break;
                }
                if (((C1308a) iVar.f(i8)).getGroupId() == i) {
                    ((i) this.f2258V).h(i8);
                    i8--;
                }
                i8++;
            }
        }
        this.f13390W.removeGroup(i);
    }

    public final void removeItem(int i) {
        if (((i) this.f2258V) != null) {
            int i8 = 0;
            while (true) {
                i iVar = (i) this.f2258V;
                if (i8 >= iVar.f6308W) {
                    break;
                } else if (((C1308a) iVar.f(i8)).getItemId() == i) {
                    ((i) this.f2258V).h(i8);
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f13390W.removeItem(i);
    }

    public final void setGroupCheckable(int i, boolean z, boolean z6) {
        this.f13390W.setGroupCheckable(i, z, z6);
    }

    public final void setGroupEnabled(int i, boolean z) {
        this.f13390W.setGroupEnabled(i, z);
    }

    public final void setGroupVisible(int i, boolean z) {
        this.f13390W.setGroupVisible(i, z);
    }

    public final void setQwertyMode(boolean z) {
        this.f13390W.setQwertyMode(z);
    }

    public final int size() {
        return this.f13390W.size();
    }

    public final SubMenu addSubMenu(int i) {
        return this.f13390W.addSubMenu(i);
    }

    public final MenuItem add(int i) {
        return f(this.f13390W.add(i));
    }

    public final SubMenu addSubMenu(int i, int i8, int i9, CharSequence charSequence) {
        return this.f13390W.addSubMenu(i, i8, i9, charSequence);
    }

    public final MenuItem add(int i, int i8, int i9, CharSequence charSequence) {
        return f(this.f13390W.a(i, i8, i9, charSequence));
    }

    public final SubMenu addSubMenu(int i, int i8, int i9, int i10) {
        return this.f13390W.addSubMenu(i, i8, i9, i10);
    }

    public final MenuItem add(int i, int i8, int i9, int i10) {
        return f(this.f13390W.add(i, i8, i9, i10));
    }
}
