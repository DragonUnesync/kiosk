package g6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public final class d0 extends ArrayList {
    private static final C0965A RECYCLER = C0965A.newPool(new c0());
    private final C0989w handle;
    private boolean insertSinceRecycled;

    public /* synthetic */ d0(C0989w wVar, c0 c0Var) {
        this(wVar);
    }

    private static void checkNullElements(Collection<?> collection) {
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            for (Object obj : collection) {
                if (obj == null) {
                    throw new IllegalArgumentException("c contains null values");
                }
            }
            return;
        }
        List list = (List) collection;
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (list.get(i) != null) {
                i++;
            } else {
                throw new IllegalArgumentException("c contains null values");
            }
        }
    }

    public static d0 newInstance(int i) {
        d0 d0Var = (d0) RECYCLER.get();
        d0Var.ensureCapacity(i);
        return d0Var;
    }

    public boolean add(Object obj) {
        if (!super.add(B.checkNotNull(obj, "element"))) {
            return false;
        }
        this.insertSinceRecycled = true;
        return true;
    }

    public boolean addAll(Collection<?> collection) {
        checkNullElements(collection);
        if (!super.addAll(collection)) {
            return false;
        }
        this.insertSinceRecycled = true;
        return true;
    }

    public boolean recycle() {
        clear();
        this.insertSinceRecycled = false;
        this.handle.recycle(this);
        return true;
    }

    public Object set(int i, Object obj) {
        Object obj2 = super.set(i, B.checkNotNull(obj, "element"));
        this.insertSinceRecycled = true;
        return obj2;
    }

    private d0(C0989w wVar) {
        this(wVar, 8);
    }

    private d0(C0989w wVar, int i) {
        super(i);
        this.handle = wVar;
    }

    public void add(int i, Object obj) {
        super.add(i, B.checkNotNull(obj, "element"));
        this.insertSinceRecycled = true;
    }

    public boolean addAll(int i, Collection<?> collection) {
        checkNullElements(collection);
        if (!super.addAll(i, collection)) {
            return false;
        }
        this.insertSinceRecycled = true;
        return true;
    }
}
