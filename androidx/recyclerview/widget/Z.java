package androidx.recyclerview.widget;

import B.C0003d;
import Q0.g;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import v0.C1510H;
import v0.C1529b;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8355a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f8356b = null;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f8357c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List f8358d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f8359f;

    /* renamed from: g  reason: collision with root package name */
    public Y f8360g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f8361h;

    public Z(RecyclerView recyclerView) {
        this.f8361h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f8355a = arrayList;
        this.f8358d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
        this.f8359f = 2;
    }

    public static void d(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    public final void a(j0 j0Var, boolean z) {
        C1529b bVar;
        RecyclerView.clearNestedRecyclerViewIfNotNested(j0Var);
        View view = j0Var.itemView;
        RecyclerView recyclerView = this.f8361h;
        l0 l0Var = recyclerView.mAccessibilityDelegate;
        if (l0Var != null) {
            k0 k0Var = l0Var.e;
            if (k0Var instanceof k0) {
                bVar = (C1529b) k0Var.e.remove(view);
            } else {
                bVar = null;
            }
            C1510H.p(view, bVar);
        }
        if (z) {
            if (recyclerView.mRecyclerListeners.size() <= 0) {
                F f8 = recyclerView.mAdapter;
                if (f8 != null) {
                    f8.onViewRecycled(j0Var);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(j0Var);
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + j0Var);
                }
            } else {
                recyclerView.mRecyclerListeners.get(0).getClass();
                throw new ClassCastException();
            }
        }
        j0Var.mBindingAdapter = null;
        j0Var.mOwnerRecyclerView = null;
        Y c8 = c();
        c8.getClass();
        int itemViewType = j0Var.getItemViewType();
        ArrayList arrayList = c8.a(itemViewType).f8348a;
        if (((X) c8.f8352a.get(itemViewType)).f8349b <= arrayList.size()) {
            C0003d.d(j0Var.itemView);
        } else if (!RecyclerView.sDebugAssertionsEnabled || !arrayList.contains(j0Var)) {
            j0Var.resetInternal();
            arrayList.add(j0Var);
        } else {
            throw new IllegalArgumentException("this scrap item already exists");
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.f8361h;
        if (i < 0 || i >= recyclerView.mState.b()) {
            StringBuilder p3 = g.p(i, "invalid position ", ". State item count is ");
            p3.append(recyclerView.mState.b());
            p3.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(p3.toString());
        } else if (!recyclerView.mState.f8400g) {
            return i;
        } else {
            return recyclerView.mAdapterHelper.f(i, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.recyclerview.widget.Y, java.lang.Object] */
    public final Y c() {
        if (this.f8360g == null) {
            ? obj = new Object();
            obj.f8352a = new SparseArray();
            obj.f8353b = 0;
            obj.f8354c = Collections.newSetFromMap(new IdentityHashMap());
            this.f8360g = obj;
            e();
        }
        return this.f8360g;
    }

    public final void e() {
        if (this.f8360g != null) {
            RecyclerView recyclerView = this.f8361h;
            if (recyclerView.mAdapter != null && recyclerView.isAttachedToWindow()) {
                Y y8 = this.f8360g;
                y8.f8354c.add(recyclerView.mAdapter);
            }
        }
    }

    public final void f(F f8, boolean z) {
        Y y8 = this.f8360g;
        if (y8 != null) {
            Set set = y8.f8354c;
            set.remove(f8);
            if (set.size() == 0 && !z) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = y8.f8352a;
                    if (i < sparseArray.size()) {
                        ArrayList arrayList = ((X) sparseArray.get(sparseArray.keyAt(i))).f8348a;
                        for (int i8 = 0; i8 < arrayList.size(); i8++) {
                            C0003d.d(((j0) arrayList.get(i8)).itemView);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f8357c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            C0506q qVar = this.f8361h.mPrefetchRegistry;
            int[] iArr = qVar.f8493c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            qVar.f8494d = 0;
        }
    }

    public final void h(int i) {
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f8357c;
        j0 j0Var = (j0) arrayList.get(i);
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + j0Var);
        }
        a(j0Var, true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        j0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean isTmpDetached = childViewHolderInt.isTmpDetached();
        RecyclerView recyclerView = this.f8361h;
        if (isTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        j(childViewHolderInt);
        if (recyclerView.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
            recyclerView.mItemAnimator.d(childViewHolderInt);
        }
    }

    public final void j(j0 j0Var) {
        boolean z;
        boolean z6;
        boolean isScrap = j0Var.isScrap();
        boolean z8 = false;
        boolean z9 = true;
        RecyclerView recyclerView = this.f8361h;
        if (isScrap || j0Var.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(j0Var.isScrap());
            sb.append(" isAttached:");
            if (j0Var.itemView.getParent() != null) {
                z8 = true;
            }
            sb.append(z8);
            sb.append(recyclerView.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        } else if (j0Var.isTmpDetached()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(j0Var);
            throw new IllegalArgumentException(g.n(recyclerView, sb2));
        } else if (!j0Var.shouldIgnore()) {
            boolean doesTransientStatePreventRecycling = j0Var.doesTransientStatePreventRecycling();
            F f8 = recyclerView.mAdapter;
            if (f8 == null || !doesTransientStatePreventRecycling || !f8.onFailedToRecycleView(j0Var)) {
                z = false;
            } else {
                z = true;
            }
            boolean z10 = RecyclerView.sDebugAssertionsEnabled;
            ArrayList arrayList = this.f8357c;
            if (!z10 || !arrayList.contains(j0Var)) {
                if (z || j0Var.isRecyclable()) {
                    if (this.f8359f <= 0 || j0Var.hasAnyOfTheFlags(526)) {
                        z6 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.f8359f && size > 0) {
                            h(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                            C0506q qVar = recyclerView.mPrefetchRegistry;
                            int i = j0Var.mPosition;
                            if (qVar.f8493c != null) {
                                int i8 = qVar.f8494d * 2;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= i8) {
                                        break;
                                    } else if (qVar.f8493c[i9] == i) {
                                        break;
                                    } else {
                                        i9 += 2;
                                    }
                                }
                            }
                            int i10 = size - 1;
                            loop1:
                            while (i10 >= 0) {
                                int i11 = ((j0) arrayList.get(i10)).mPosition;
                                C0506q qVar2 = recyclerView.mPrefetchRegistry;
                                if (qVar2.f8493c == null) {
                                    break;
                                }
                                int i12 = qVar2.f8494d * 2;
                                int i13 = 0;
                                while (i13 < i12) {
                                    if (qVar2.f8493c[i13] == i11) {
                                        i10--;
                                    } else {
                                        i13 += 2;
                                    }
                                }
                                break loop1;
                            }
                            size = i10 + 1;
                        }
                        arrayList.add(size, j0Var);
                        z6 = true;
                    }
                    if (!z6) {
                        a(j0Var, true);
                        z8 = z6;
                        recyclerView.mViewInfoStore.d(j0Var);
                        if (!z8 && !z9 && doesTransientStatePreventRecycling) {
                            C0003d.d(j0Var.itemView);
                            j0Var.mBindingAdapter = null;
                            j0Var.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    z8 = z6;
                } else if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.exceptionLabel());
                }
                z9 = false;
                recyclerView.mViewInfoStore.d(j0Var);
                if (!z8) {
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(j0Var);
            throw new IllegalArgumentException(g.n(recyclerView, sb3));
        } else {
            throw new IllegalArgumentException(g.n(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
    }

    public final void k(View view) {
        j0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f8361h;
        if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.f8356b == null) {
                this.f8356b = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.f8356b.add(childViewHolderInt);
        } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || recyclerView.mAdapter.hasStableIds()) {
            childViewHolderInt.setScrapContainer(this, false);
            this.f8355a.add(childViewHolderInt);
        } else {
            throw new IllegalArgumentException(g.n(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
    }

    /* JADX WARNING: type inference failed for: r2v35, types: [androidx.recyclerview.widget.L, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0495, code lost:
        if ((r8 + r11) >= r30) goto L_0x044d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.recyclerview.widget.j0 l(int r29, long r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = -1
            r3 = 1
            androidx.recyclerview.widget.RecyclerView r4 = r0.f8361h
            if (r1 < 0) goto L_0x055a
            androidx.recyclerview.widget.f0 r5 = r4.mState
            int r5 = r5.b()
            if (r1 >= r5) goto L_0x055a
            androidx.recyclerview.widget.f0 r5 = r4.mState
            boolean r5 = r5.f8400g
            r6 = 0
            r8 = 32
            if (r5 == 0) goto L_0x0088
            java.util.ArrayList r5 = r0.f8356b
            if (r5 == 0) goto L_0x0081
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0026
            goto L_0x0081
        L_0x0026:
            r9 = 0
        L_0x0027:
            if (r9 >= r5) goto L_0x0043
            java.util.ArrayList r10 = r0.f8356b
            java.lang.Object r10 = r10.get(r9)
            androidx.recyclerview.widget.j0 r10 = (androidx.recyclerview.widget.j0) r10
            boolean r11 = r10.wasReturnedFromScrap()
            if (r11 != 0) goto L_0x0041
            int r11 = r10.getLayoutPosition()
            if (r11 != r1) goto L_0x0041
            r10.addFlags(r8)
            goto L_0x0082
        L_0x0041:
            int r9 = r9 + r3
            goto L_0x0027
        L_0x0043:
            androidx.recyclerview.widget.F r9 = r4.mAdapter
            boolean r9 = r9.hasStableIds()
            if (r9 == 0) goto L_0x0081
            androidx.recyclerview.widget.b r9 = r4.mAdapterHelper
            int r9 = r9.f(r1, r6)
            if (r9 <= 0) goto L_0x0081
            androidx.recyclerview.widget.F r10 = r4.mAdapter
            int r10 = r10.getItemCount()
            if (r9 >= r10) goto L_0x0081
            androidx.recyclerview.widget.F r10 = r4.mAdapter
            long r9 = r10.getItemId(r9)
            r11 = 0
        L_0x0062:
            if (r11 >= r5) goto L_0x0081
            java.util.ArrayList r12 = r0.f8356b
            java.lang.Object r12 = r12.get(r11)
            androidx.recyclerview.widget.j0 r12 = (androidx.recyclerview.widget.j0) r12
            boolean r13 = r12.wasReturnedFromScrap()
            if (r13 != 0) goto L_0x007f
            long r13 = r12.getItemId()
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x007f
            r12.addFlags(r8)
            r10 = r12
            goto L_0x0082
        L_0x007f:
            int r11 = r11 + r3
            goto L_0x0062
        L_0x0081:
            r10 = 0
        L_0x0082:
            if (r10 == 0) goto L_0x0086
            r5 = 1
            goto L_0x008a
        L_0x0086:
            r5 = 0
            goto L_0x008a
        L_0x0088:
            r5 = 0
            r10 = 0
        L_0x008a:
            java.util.ArrayList r9 = r0.f8357c
            java.util.ArrayList r11 = r0.f8355a
            java.lang.String r12 = "RecyclerView"
            if (r10 != 0) goto L_0x025b
            int r10 = r11.size()
            r13 = 0
        L_0x0097:
            if (r13 >= r10) goto L_0x00c5
            java.lang.Object r14 = r11.get(r13)
            androidx.recyclerview.widget.j0 r14 = (androidx.recyclerview.widget.j0) r14
            boolean r15 = r14.wasReturnedFromScrap()
            if (r15 != 0) goto L_0x00c3
            int r15 = r14.getLayoutPosition()
            if (r15 != r1) goto L_0x00c3
            boolean r15 = r14.isInvalid()
            if (r15 != 0) goto L_0x00c3
            androidx.recyclerview.widget.f0 r15 = r4.mState
            boolean r15 = r15.f8400g
            if (r15 != 0) goto L_0x00bd
            boolean r15 = r14.isRemoved()
            if (r15 != 0) goto L_0x00c3
        L_0x00bd:
            r14.addFlags(r8)
            r10 = r14
            goto L_0x01be
        L_0x00c3:
            int r13 = r13 + r3
            goto L_0x0097
        L_0x00c5:
            androidx.recyclerview.widget.c r10 = r4.mChildHelper
            java.util.ArrayList r10 = r10.f8374c
            int r13 = r10.size()
            r14 = 0
        L_0x00ce:
            if (r14 >= r13) goto L_0x00ef
            java.lang.Object r15 = r10.get(r14)
            android.view.View r15 = (android.view.View) r15
            androidx.recyclerview.widget.j0 r16 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r15)
            int r7 = r16.getLayoutPosition()
            if (r7 != r1) goto L_0x00ed
            boolean r7 = r16.isInvalid()
            if (r7 != 0) goto L_0x00ed
            boolean r7 = r16.isRemoved()
            if (r7 != 0) goto L_0x00ed
            goto L_0x00f0
        L_0x00ed:
            int r14 = r14 + r3
            goto L_0x00ce
        L_0x00ef:
            r15 = 0
        L_0x00f0:
            if (r15 == 0) goto L_0x017a
            androidx.recyclerview.widget.j0 r7 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r15)
            androidx.recyclerview.widget.c r10 = r4.mChildHelper
            androidx.recyclerview.widget.D r13 = r10.f8372a
            androidx.recyclerview.widget.RecyclerView r13 = r13.f8270a
            int r13 = r13.indexOfChild(r15)
            if (r13 < 0) goto L_0x0166
            P5.E r14 = r10.f8373b
            boolean r16 = r14.D(r13)
            if (r16 == 0) goto L_0x0152
            r14.z(r13)
            r10.k(r15)
            androidx.recyclerview.widget.c r10 = r4.mChildHelper
            androidx.recyclerview.widget.D r13 = r10.f8372a
            androidx.recyclerview.widget.RecyclerView r13 = r13.f8270a
            int r13 = r13.indexOfChild(r15)
            if (r13 != r2) goto L_0x011e
        L_0x011c:
            r13 = -1
            goto L_0x012c
        L_0x011e:
            P5.E r10 = r10.f8373b
            boolean r14 = r10.D(r13)
            if (r14 == 0) goto L_0x0127
            goto L_0x011c
        L_0x0127:
            int r10 = r10.A(r13)
            int r13 = r13 - r10
        L_0x012c:
            if (r13 == r2) goto L_0x013e
            androidx.recyclerview.widget.c r10 = r4.mChildHelper
            r10.c(r13)
            r0.k(r15)
            r10 = 8224(0x2020, float:1.1524E-41)
            r7.addFlags(r10)
            r10 = r7
            goto L_0x01be
        L_0x013e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r2 = Q0.g.n(r4, r2)
            r1.<init>(r2)
            throw r1
        L_0x0152:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0166:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "view is not a child, cannot hide "
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x017a:
            int r7 = r9.size()
            r10 = 0
        L_0x017f:
            if (r10 >= r7) goto L_0x01bd
            java.lang.Object r13 = r9.get(r10)
            androidx.recyclerview.widget.j0 r13 = (androidx.recyclerview.widget.j0) r13
            boolean r14 = r13.isInvalid()
            if (r14 != 0) goto L_0x01bb
            int r14 = r13.getLayoutPosition()
            if (r14 != r1) goto L_0x01bb
            boolean r14 = r13.isAttachedToTransitionOverlay()
            if (r14 != 0) goto L_0x01bb
            r9.remove(r10)
            boolean r7 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled
            if (r7 == 0) goto L_0x01b9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "getScrapOrHiddenOrCachedHolderForPosition("
            r7.<init>(r10)
            r7.append(r1)
            java.lang.String r10 = ") found match in cache: "
            r7.append(r10)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r12, r7)
        L_0x01b9:
            r10 = r13
            goto L_0x01be
        L_0x01bb:
            int r10 = r10 + r3
            goto L_0x017f
        L_0x01bd:
            r10 = 0
        L_0x01be:
            if (r10 == 0) goto L_0x025b
            boolean r7 = r10.isRemoved()
            if (r7 == 0) goto L_0x01e7
            boolean r7 = androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled
            if (r7 == 0) goto L_0x01e2
            androidx.recyclerview.widget.f0 r7 = r4.mState
            boolean r7 = r7.f8400g
            if (r7 == 0) goto L_0x01d1
            goto L_0x01e2
        L_0x01d1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "should not receive a removed view unless it is pre layout"
            r2.<init>(r3)
            java.lang.String r2 = Q0.g.n(r4, r2)
            r1.<init>(r2)
            throw r1
        L_0x01e2:
            androidx.recyclerview.widget.f0 r7 = r4.mState
            boolean r7 = r7.f8400g
            goto L_0x0222
        L_0x01e7:
            int r7 = r10.mPosition
            if (r7 < 0) goto L_0x0247
            androidx.recyclerview.widget.F r13 = r4.mAdapter
            int r13 = r13.getItemCount()
            if (r7 >= r13) goto L_0x0247
            androidx.recyclerview.widget.f0 r7 = r4.mState
            boolean r7 = r7.f8400g
            if (r7 != 0) goto L_0x0209
            androidx.recyclerview.widget.F r7 = r4.mAdapter
            int r13 = r10.mPosition
            int r7 = r7.getItemViewType(r13)
            int r13 = r10.getItemViewType()
            if (r7 == r13) goto L_0x0209
        L_0x0207:
            r7 = 0
            goto L_0x0222
        L_0x0209:
            androidx.recyclerview.widget.F r7 = r4.mAdapter
            boolean r7 = r7.hasStableIds()
            if (r7 == 0) goto L_0x0221
            long r13 = r10.getItemId()
            androidx.recyclerview.widget.F r7 = r4.mAdapter
            int r15 = r10.mPosition
            long r15 = r7.getItemId(r15)
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 != 0) goto L_0x0207
        L_0x0221:
            r7 = 1
        L_0x0222:
            if (r7 != 0) goto L_0x0245
            r7 = 4
            r10.addFlags(r7)
            boolean r7 = r10.isScrap()
            if (r7 == 0) goto L_0x0237
            android.view.View r7 = r10.itemView
            r4.removeDetachedView(r7, r6)
            r10.unScrap()
            goto L_0x0240
        L_0x0237:
            boolean r7 = r10.wasReturnedFromScrap()
            if (r7 == 0) goto L_0x0240
            r10.clearReturnedFromScrapFlag()
        L_0x0240:
            r0.j(r10)
            r10 = 0
            goto L_0x025b
        L_0x0245:
            r5 = 1
            goto L_0x025b
        L_0x0247:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = Q0.g.n(r4, r2)
            r1.<init>(r2)
            throw r1
        L_0x025b:
            r17 = 0
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r10 != 0) goto L_0x03fc
            androidx.recyclerview.widget.b r7 = r4.mAdapterHelper
            int r7 = r7.f(r1, r6)
            if (r7 < 0) goto L_0x03d8
            androidx.recyclerview.widget.F r13 = r4.mAdapter
            int r13 = r13.getItemCount()
            if (r7 >= r13) goto L_0x03d8
            androidx.recyclerview.widget.F r13 = r4.mAdapter
            int r13 = r13.getItemViewType(r7)
            androidx.recyclerview.widget.F r14 = r4.mAdapter
            boolean r14 = r14.hasStableIds()
            if (r14 == 0) goto L_0x030f
            androidx.recyclerview.widget.F r10 = r4.mAdapter
            long r23 = r10.getItemId(r7)
            int r10 = r11.size()
            int r10 = r10 - r3
        L_0x028d:
            if (r10 < 0) goto L_0x02da
            java.lang.Object r14 = r11.get(r10)
            androidx.recyclerview.widget.j0 r14 = (androidx.recyclerview.widget.j0) r14
            long r25 = r14.getItemId()
            int r27 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r27 != 0) goto L_0x02d8
            boolean r25 = r14.wasReturnedFromScrap()
            if (r25 != 0) goto L_0x02d8
            int r15 = r14.getItemViewType()
            if (r13 != r15) goto L_0x02bf
            r14.addFlags(r8)
            boolean r8 = r14.isRemoved()
            if (r8 == 0) goto L_0x0307
            androidx.recyclerview.widget.f0 r8 = r4.mState
            boolean r8 = r8.f8400g
            if (r8 != 0) goto L_0x0307
            r8 = 2
            r9 = 14
            r14.setFlags(r8, r9)
            goto L_0x0307
        L_0x02bf:
            r11.remove(r10)
            android.view.View r15 = r14.itemView
            r4.removeDetachedView(r15, r6)
            android.view.View r14 = r14.itemView
            androidx.recyclerview.widget.j0 r14 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r14)
            r15 = 0
            r14.mScrapContainer = r15
            r14.mInChangeScrap = r6
            r14.clearReturnedFromScrapFlag()
            r0.j(r14)
        L_0x02d8:
            int r10 = r10 + r2
            goto L_0x028d
        L_0x02da:
            int r8 = r9.size()
            int r8 = r8 - r3
        L_0x02df:
            if (r8 < 0) goto L_0x0303
            java.lang.Object r10 = r9.get(r8)
            androidx.recyclerview.widget.j0 r10 = (androidx.recyclerview.widget.j0) r10
            long r14 = r10.getItemId()
            int r11 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r11 != 0) goto L_0x0305
            boolean r11 = r10.isAttachedToTransitionOverlay()
            if (r11 != 0) goto L_0x0305
            int r11 = r10.getItemViewType()
            if (r13 != r11) goto L_0x0300
            r9.remove(r8)
            r14 = r10
            goto L_0x0307
        L_0x0300:
            r0.h(r8)
        L_0x0303:
            r14 = 0
            goto L_0x0307
        L_0x0305:
            int r8 = r8 + r2
            goto L_0x02df
        L_0x0307:
            if (r14 == 0) goto L_0x030e
            r14.mPosition = r7
            r10 = r14
            r5 = 1
            goto L_0x030f
        L_0x030e:
            r10 = r14
        L_0x030f:
            if (r10 != 0) goto L_0x0373
            boolean r7 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled
            if (r7 == 0) goto L_0x032b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "tryGetViewHolderForPositionByDeadline("
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r8 = ") fetching from shared pool"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r12, r7)
        L_0x032b:
            androidx.recyclerview.widget.Y r7 = r28.c()
            android.util.SparseArray r7 = r7.f8352a
            java.lang.Object r7 = r7.get(r13)
            androidx.recyclerview.widget.X r7 = (androidx.recyclerview.widget.X) r7
            if (r7 == 0) goto L_0x035d
            java.util.ArrayList r7 = r7.f8348a
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x035d
            int r8 = r7.size()
            int r8 = r8 - r3
        L_0x0346:
            if (r8 < 0) goto L_0x035d
            java.lang.Object r9 = r7.get(r8)
            androidx.recyclerview.widget.j0 r9 = (androidx.recyclerview.widget.j0) r9
            boolean r9 = r9.isAttachedToTransitionOverlay()
            if (r9 != 0) goto L_0x035b
            java.lang.Object r2 = r7.remove(r8)
            androidx.recyclerview.widget.j0 r2 = (androidx.recyclerview.widget.j0) r2
            goto L_0x035e
        L_0x035b:
            int r8 = r8 + r2
            goto L_0x0346
        L_0x035d:
            r2 = 0
        L_0x035e:
            if (r2 == 0) goto L_0x0372
            r2.resetInternal()
            boolean r7 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
            if (r7 == 0) goto L_0x0372
            android.view.View r7 = r2.itemView
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x0372
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            d(r7, r6)
        L_0x0372:
            r10 = r2
        L_0x0373:
            if (r10 != 0) goto L_0x03fc
            long r7 = r4.getNanoTime()
            int r2 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r2 == 0) goto L_0x0396
            androidx.recyclerview.widget.Y r2 = r0.f8360g
            androidx.recyclerview.widget.X r2 = r2.a(r13)
            long r9 = r2.f8350c
            int r2 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0391
            long r9 = r9 + r7
            int r2 = (r9 > r30 ? 1 : (r9 == r30 ? 0 : -1))
            if (r2 >= 0) goto L_0x038f
            goto L_0x0391
        L_0x038f:
            r2 = 0
            goto L_0x0392
        L_0x0391:
            r2 = 1
        L_0x0392:
            if (r2 != 0) goto L_0x0396
            r2 = 0
            return r2
        L_0x0396:
            androidx.recyclerview.widget.F r2 = r4.mAdapter
            androidx.recyclerview.widget.j0 r10 = r2.createViewHolder(r4, r13)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r2 == 0) goto L_0x03af
            android.view.View r2 = r10.itemView
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r2)
            if (r2 == 0) goto L_0x03af
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r10.mNestedRecyclerView = r9
        L_0x03af:
            long r14 = r4.getNanoTime()
            androidx.recyclerview.widget.Y r2 = r0.f8360g
            long r14 = r14 - r7
            androidx.recyclerview.widget.X r2 = r2.a(r13)
            long r7 = r2.f8350c
            int r9 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r9 != 0) goto L_0x03c1
            goto L_0x03cc
        L_0x03c1:
            r23 = 4
            long r7 = r7 / r23
            r21 = 3
            long r7 = r7 * r21
            long r14 = r14 / r23
            long r14 = r14 + r7
        L_0x03cc:
            r2.f8350c = r14
            boolean r2 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled
            if (r2 == 0) goto L_0x03fc
            java.lang.String r2 = "tryGetViewHolderForPositionByDeadline created new ViewHolder"
            android.util.Log.d(r12, r2)
            goto L_0x03fc
        L_0x03d8:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "Inconsistency detected. Invalid item position "
            java.lang.String r5 = "(offset:"
            java.lang.String r6 = ").state:"
            java.lang.StringBuilder r1 = u.C1477r.e(r3, r1, r5, r7, r6)
            androidx.recyclerview.widget.f0 r3 = r4.mState
            int r3 = r3.b()
            r1.append(r3)
            java.lang.String r3 = r4.exceptionLabel()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x03fc:
            if (r5 == 0) goto L_0x042b
            androidx.recyclerview.widget.f0 r2 = r4.mState
            boolean r2 = r2.f8400g
            if (r2 != 0) goto L_0x042b
            r2 = 8192(0x2000, float:1.14794E-41)
            boolean r7 = r10.hasAnyOfTheFlags(r2)
            if (r7 == 0) goto L_0x042b
            r10.setFlags(r6, r2)
            androidx.recyclerview.widget.f0 r2 = r4.mState
            boolean r2 = r2.f8402j
            if (r2 == 0) goto L_0x042b
            androidx.recyclerview.widget.M.b(r10)
            androidx.recyclerview.widget.M r2 = r4.mItemAnimator
            r10.getUnmodifiedPayloads()
            r2.getClass()
            androidx.recyclerview.widget.L r2 = new androidx.recyclerview.widget.L
            r2.<init>()
            r2.a(r10)
            r4.recordAnimationInfoIfBouncedHiddenView(r10, r2)
        L_0x042b:
            androidx.recyclerview.widget.f0 r2 = r4.mState
            boolean r2 = r2.f8400g
            if (r2 == 0) goto L_0x043a
            boolean r2 = r10.isBound()
            if (r2 == 0) goto L_0x043a
            r10.mPreLayoutPosition = r1
            goto L_0x044d
        L_0x043a:
            boolean r2 = r10.isBound()
            if (r2 == 0) goto L_0x0450
            boolean r2 = r10.needsUpdate()
            if (r2 != 0) goto L_0x0450
            boolean r2 = r10.isInvalid()
            if (r2 == 0) goto L_0x044d
            goto L_0x0450
        L_0x044d:
            r1 = 0
            goto L_0x0527
        L_0x0450:
            boolean r2 = androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled
            if (r2 == 0) goto L_0x046f
            boolean r2 = r10.isRemoved()
            if (r2 != 0) goto L_0x045b
            goto L_0x046f
        L_0x045b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = Q0.g.n(r4, r2)
            r1.<init>(r2)
            throw r1
        L_0x046f:
            androidx.recyclerview.widget.b r2 = r4.mAdapterHelper
            int r2 = r2.f(r1, r6)
            r7 = 0
            r10.mBindingAdapter = r7
            r10.mOwnerRecyclerView = r4
            int r8 = r10.getItemViewType()
            long r11 = r4.getNanoTime()
            int r9 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r9 == 0) goto L_0x0497
            androidx.recyclerview.widget.Y r9 = r0.f8360g
            androidx.recyclerview.widget.X r8 = r9.a(r8)
            long r8 = r8.f8351d
            int r13 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r13 == 0) goto L_0x0497
            long r8 = r8 + r11
            int r13 = (r8 > r30 ? 1 : (r8 == r30 ? 0 : -1))
            if (r13 >= 0) goto L_0x044d
        L_0x0497:
            boolean r8 = r10.isTmpDetached()
            if (r8 == 0) goto L_0x04ae
            android.view.View r8 = r10.itemView
            int r9 = r4.getChildCount()
            android.view.View r13 = r10.itemView
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            r4.attachViewToParent(r8, r9, r13)
            r8 = 1
            goto L_0x04af
        L_0x04ae:
            r8 = 0
        L_0x04af:
            androidx.recyclerview.widget.F r9 = r4.mAdapter
            r9.bindViewHolder(r10, r2)
            if (r8 == 0) goto L_0x04bb
            android.view.View r2 = r10.itemView
            r4.detachViewFromParent(r2)
        L_0x04bb:
            long r8 = r4.getNanoTime()
            androidx.recyclerview.widget.Y r2 = r0.f8360g
            int r13 = r10.getItemViewType()
            long r8 = r8 - r11
            androidx.recyclerview.widget.X r2 = r2.a(r13)
            long r11 = r2.f8351d
            int r13 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r13 != 0) goto L_0x04d1
            goto L_0x04da
        L_0x04d1:
            r13 = 4
            long r11 = r11 / r13
            r15 = 3
            long r11 = r11 * r15
            long r8 = r8 / r13
            long r8 = r8 + r11
        L_0x04da:
            r2.f8351d = r8
            boolean r2 = r4.isAccessibilityEnabled()
            if (r2 == 0) goto L_0x051e
            android.view.View r2 = r10.itemView
            java.util.WeakHashMap r8 = v0.C1510H.f15874a
            int r8 = r2.getImportantForAccessibility()
            if (r8 != 0) goto L_0x04ef
            r2.setImportantForAccessibility(r3)
        L_0x04ef:
            androidx.recyclerview.widget.l0 r8 = r4.mAccessibilityDelegate
            if (r8 != 0) goto L_0x04f4
            goto L_0x051e
        L_0x04f4:
            androidx.recyclerview.widget.k0 r8 = r8.e
            boolean r9 = r8 instanceof androidx.recyclerview.widget.k0
            if (r9 == 0) goto L_0x051b
            r8.getClass()
            android.view.View$AccessibilityDelegate r9 = v0.C1510H.c(r2)
            if (r9 != 0) goto L_0x0504
            goto L_0x0512
        L_0x0504:
            boolean r7 = r9 instanceof v0.C1528a
            if (r7 == 0) goto L_0x050d
            v0.a r9 = (v0.C1528a) r9
            v0.b r7 = r9.f15915a
            goto L_0x0512
        L_0x050d:
            v0.b r7 = new v0.b
            r7.<init>(r9)
        L_0x0512:
            if (r7 == 0) goto L_0x051b
            if (r7 == r8) goto L_0x051b
            java.util.WeakHashMap r9 = r8.e
            r9.put(r2, r7)
        L_0x051b:
            v0.C1510H.p(r2, r8)
        L_0x051e:
            androidx.recyclerview.widget.f0 r2 = r4.mState
            boolean r2 = r2.f8400g
            if (r2 == 0) goto L_0x0526
            r10.mPreLayoutPosition = r1
        L_0x0526:
            r1 = 1
        L_0x0527:
            android.view.View r2 = r10.itemView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 != 0) goto L_0x053b
            android.view.ViewGroup$LayoutParams r2 = r4.generateDefaultLayoutParams()
            androidx.recyclerview.widget.S r2 = (androidx.recyclerview.widget.S) r2
            android.view.View r4 = r10.itemView
            r4.setLayoutParams(r2)
            goto L_0x054f
        L_0x053b:
            boolean r7 = r4.checkLayoutParams(r2)
            if (r7 != 0) goto L_0x054d
            android.view.ViewGroup$LayoutParams r2 = r4.generateLayoutParams((android.view.ViewGroup.LayoutParams) r2)
            androidx.recyclerview.widget.S r2 = (androidx.recyclerview.widget.S) r2
            android.view.View r4 = r10.itemView
            r4.setLayoutParams(r2)
            goto L_0x054f
        L_0x054d:
            androidx.recyclerview.widget.S r2 = (androidx.recyclerview.widget.S) r2
        L_0x054f:
            r2.f8323U = r10
            if (r5 == 0) goto L_0x0556
            if (r1 == 0) goto L_0x0556
            goto L_0x0557
        L_0x0556:
            r3 = 0
        L_0x0557:
            r2.f8326X = r3
            return r10
        L_0x055a:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "Invalid item position "
            java.lang.String r5 = "("
            java.lang.String r6 = "). Item count:"
            java.lang.StringBuilder r1 = u.C1477r.e(r3, r1, r5, r1, r6)
            androidx.recyclerview.widget.f0 r3 = r4.mState
            int r3 = r3.b()
            r1.append(r3)
            java.lang.String r3 = r4.exceptionLabel()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.Z.l(int, long):androidx.recyclerview.widget.j0");
    }

    public final void m(j0 j0Var) {
        if (j0Var.mInChangeScrap) {
            this.f8356b.remove(j0Var);
        } else {
            this.f8355a.remove(j0Var);
        }
        j0Var.mScrapContainer = null;
        j0Var.mInChangeScrap = false;
        j0Var.clearReturnedFromScrapFlag();
    }

    public final void n() {
        int i;
        Q q7 = this.f8361h.mLayout;
        if (q7 != null) {
            i = q7.f8317d0;
        } else {
            i = 0;
        }
        this.f8359f = this.e + i;
        ArrayList arrayList = this.f8357c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f8359f; size--) {
            h(size);
        }
    }
}
