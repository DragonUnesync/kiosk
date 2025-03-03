package v0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: v0.l  reason: case insensitive filesystem */
public final class C1539l {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f15954a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f15955b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f15956c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15957d;
    public int[] e;

    public C1539l(ViewGroup viewGroup) {
        this.f15956c = viewGroup;
    }

    public final boolean a(float f8, float f9, boolean z) {
        ViewParent e8;
        if (!this.f15957d || (e8 = e(0)) == null) {
            return false;
        }
        try {
            return e8.onNestedFling(this.f15956c, f8, f9, z);
        } catch (AbstractMethodError e9) {
            Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedFling", e9);
            return false;
        }
    }

    public final boolean b(float f8, float f9) {
        ViewParent e8;
        if (!this.f15957d || (e8 = e(0)) == null) {
            return false;
        }
        try {
            return e8.onNestedPreFling(this.f15956c, f8, f9);
        } catch (AbstractMethodError e9) {
            Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedPreFling", e9);
            return false;
        }
    }

    public final boolean c(int i, int i8, int[] iArr, int[] iArr2, int i9) {
        ViewParent e8;
        int i10;
        int i11;
        int[] iArr3;
        int i12 = i;
        int i13 = i8;
        int[] iArr4 = iArr2;
        int i14 = i9;
        if (!this.f15957d || (e8 = e(i14)) == null) {
            return false;
        }
        if (i12 != 0 || i13 != 0) {
            ViewGroup viewGroup = this.f15956c;
            if (iArr4 != null) {
                viewGroup.getLocationInWindow(iArr4);
                i11 = iArr4[0];
                i10 = iArr4[1];
            } else {
                i11 = 0;
                i10 = 0;
            }
            if (iArr == null) {
                if (this.e == null) {
                    this.e = new int[2];
                }
                iArr3 = this.e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            if (e8 instanceof C1540m) {
                ((C1540m) e8).c(viewGroup, i, i8, iArr3, i9);
            } else if (i14 == 0) {
                try {
                    e8.onNestedPreScroll(viewGroup, i12, i13, iArr3);
                } catch (AbstractMethodError e9) {
                    AbstractMethodError abstractMethodError = e9;
                    Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedPreScroll", abstractMethodError);
                }
            }
            if (iArr4 != null) {
                viewGroup.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i11;
                iArr4[1] = iArr4[1] - i10;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final boolean d(int i, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent e8;
        int i12;
        int i13;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i14 = i11;
        if (!this.f15957d || (e8 = e(i14)) == null) {
            return false;
        }
        if (i == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f15956c;
        if (iArr4 != null) {
            viewGroup.getLocationInWindow(iArr4);
            i13 = iArr4[0];
            i12 = iArr4[1];
        } else {
            i13 = 0;
            i12 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr5 = this.e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        if (e8 instanceof C1541n) {
            ((C1541n) e8).d(viewGroup, i, i8, i9, i10, i11, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i9;
            iArr3[1] = iArr3[1] + i10;
            if (e8 instanceof C1540m) {
                ((C1540m) e8).e(viewGroup, i, i8, i9, i10, i11);
            } else if (i14 == 0) {
                try {
                    e8.onNestedScroll(viewGroup, i, i8, i9, i10);
                } catch (AbstractMethodError e9) {
                    AbstractMethodError abstractMethodError = e9;
                    Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onNestedScroll", abstractMethodError);
                }
            }
        }
        if (iArr4 != null) {
            viewGroup.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i13;
            iArr4[1] = iArr4[1] - i12;
        }
        return true;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f15954a;
        }
        if (i != 1) {
            return null;
        }
        return this.f15955b;
    }

    public final boolean f(int i) {
        if (e(i) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i, int i8) {
        boolean z;
        if (f(i8)) {
            return true;
        }
        if (this.f15957d) {
            View view = this.f15956c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z6 = parent instanceof C1540m;
                if (z6) {
                    z = ((C1540m) parent).f(view2, view, i, i8);
                } else {
                    if (i8 == 0) {
                        try {
                            z = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e8) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e8);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i8 == 0) {
                        this.f15954a = parent;
                    } else if (i8 == 1) {
                        this.f15955b = parent;
                    }
                    if (z6) {
                        ((C1540m) parent).a(view2, view, i, i8);
                    } else if (i8 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i);
                        } catch (AbstractMethodError e9) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e9);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i) {
        ViewParent e8 = e(i);
        if (e8 != null) {
            boolean z = e8 instanceof C1540m;
            ViewGroup viewGroup = this.f15956c;
            if (z) {
                ((C1540m) e8).b(viewGroup, i);
            } else if (i == 0) {
                try {
                    e8.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e9) {
                    Log.e("ViewParentCompat", "ViewParent " + e8 + " does not implement interface method onStopNestedScroll", e9);
                }
            }
            if (i == 0) {
                this.f15954a = null;
            } else if (i == 1) {
                this.f15955b = null;
            }
        }
    }
}
