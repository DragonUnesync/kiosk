package f6;

import g6.C0980m;
import g6.Y;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: f6.y  reason: case insensitive filesystem */
public class C0934y {
    private final int index = C0980m.nextVariableIndex();

    private static void addToVariablesToRemove(C0980m mVar, C0934y yVar) {
        Set set;
        int i = C0980m.VARIABLES_TO_REMOVE_INDEX;
        Object indexedVariable = mVar.indexedVariable(i);
        if (indexedVariable == C0980m.UNSET || indexedVariable == null) {
            set = Collections.newSetFromMap(new IdentityHashMap());
            mVar.setIndexedVariable(i, set);
        } else {
            set = (Set) indexedVariable;
        }
        set.add(yVar);
    }

    private Object initialize(C0980m mVar) {
        Object obj;
        try {
            obj = initialValue();
            try {
                if (obj != C0980m.UNSET) {
                    mVar.setIndexedVariable(this.index, obj);
                    addToVariablesToRemove(mVar, this);
                    return obj;
                }
                throw new IllegalArgumentException("InternalThreadLocalMap.UNSET can not be initial value.");
            } catch (Exception e) {
                e = e;
                Y.throwException(e);
                mVar.setIndexedVariable(this.index, obj);
                addToVariablesToRemove(mVar, this);
                return obj;
            }
        } catch (Exception e8) {
            e = e8;
            obj = null;
            Y.throwException(e);
            mVar.setIndexedVariable(this.index, obj);
            addToVariablesToRemove(mVar, this);
            return obj;
        }
    }

    public static void removeAll() {
        C0980m ifSet = C0980m.getIfSet();
        if (ifSet != null) {
            try {
                Object indexedVariable = ifSet.indexedVariable(C0980m.VARIABLES_TO_REMOVE_INDEX);
                if (!(indexedVariable == null || indexedVariable == C0980m.UNSET)) {
                    for (C0934y remove : (C0934y[]) ((Set) indexedVariable).toArray(new C0934y[0])) {
                        remove.remove(ifSet);
                    }
                }
            } finally {
                C0980m.remove();
            }
        }
    }

    private static void removeFromVariablesToRemove(C0980m mVar, C0934y yVar) {
        Object indexedVariable = mVar.indexedVariable(C0980m.VARIABLES_TO_REMOVE_INDEX);
        if (indexedVariable != C0980m.UNSET && indexedVariable != null) {
            ((Set) indexedVariable).remove(yVar);
        }
    }

    private void setKnownNotUnset(C0980m mVar, Object obj) {
        if (mVar.setIndexedVariable(this.index, obj)) {
            addToVariablesToRemove(mVar, this);
        }
    }

    public final Object get() {
        C0980m mVar = C0980m.get();
        Object indexedVariable = mVar.indexedVariable(this.index);
        if (indexedVariable != C0980m.UNSET) {
            return indexedVariable;
        }
        return initialize(mVar);
    }

    public final Object getIfExists() {
        Object indexedVariable;
        C0980m ifSet = C0980m.getIfSet();
        if (ifSet == null || (indexedVariable = ifSet.indexedVariable(this.index)) == C0980m.UNSET) {
            return null;
        }
        return indexedVariable;
    }

    public Object initialValue() {
        return null;
    }

    public void onRemoval(Object obj) {
    }

    public final void remove() {
        remove(C0980m.getIfSet());
    }

    public final void set(Object obj) {
        if (obj != C0980m.UNSET) {
            setKnownNotUnset(C0980m.get(), obj);
        } else {
            remove();
        }
    }

    public final void remove(C0980m mVar) {
        Object removeIndexedVariable;
        if (mVar != null && (removeIndexedVariable = mVar.removeIndexedVariable(this.index)) != C0980m.UNSET) {
            removeFromVariablesToRemove(mVar, this);
            try {
                onRemoval(removeIndexedVariable);
            } catch (Exception e) {
                Y.throwException(e);
            }
        }
    }

    public final Object get(C0980m mVar) {
        Object indexedVariable = mVar.indexedVariable(this.index);
        if (indexedVariable != C0980m.UNSET) {
            return indexedVariable;
        }
        return initialize(mVar);
    }

    public final void set(C0980m mVar, Object obj) {
        if (obj != C0980m.UNSET) {
            setKnownNotUnset(mVar, obj);
        } else {
            remove(mVar);
        }
    }
}
