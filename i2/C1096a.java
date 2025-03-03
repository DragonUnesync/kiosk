package i2;

import Y.e;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: i2.a  reason: case insensitive filesystem */
public abstract class C1096a {

    /* renamed from: a  reason: collision with root package name */
    public final e f12713a;

    /* renamed from: b  reason: collision with root package name */
    public final e f12714b;

    /* renamed from: c  reason: collision with root package name */
    public final e f12715c;

    public C1096a(e eVar, e eVar2, e eVar3) {
        this.f12713a = eVar;
        this.f12714b = eVar2;
        this.f12715c = eVar3;
    }

    public abstract C1097b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.f12715c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        String simpleName = cls.getSimpleName();
        Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
        eVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        e eVar = this.f12713a;
        Method method = (Method) eVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<C1096a> cls = C1096a.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        eVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        e eVar = this.f12714b;
        Method method = (Method) eVar.get(name);
        if (method != null) {
            return method;
        }
        Class b8 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b8.getDeclaredMethod("write", new Class[]{cls, C1096a.class});
        eVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i8) {
        if (!e(i8)) {
            return i;
        }
        return ((C1097b) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((C1097b) this).e.readParcelable(C1097b.class.getClassLoader());
    }

    public final C1098c h() {
        String readString = ((C1097b) this).e.readString();
        if (readString == null) {
            return null;
        }
        C1097b a8 = a();
        try {
            return (C1098c) c(readString).invoke((Object) null, new Object[]{a8});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e8) {
            if (e8.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e8.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i8) {
        i(i8);
        ((C1097b) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((C1097b) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(C1098c cVar) {
        if (cVar == null) {
            ((C1097b) this).e.writeString((String) null);
            return;
        }
        try {
            ((C1097b) this).e.writeString(b(cVar.getClass()).getName());
            C1097b a8 = a();
            try {
                d(cVar.getClass()).invoke((Object) null, new Object[]{cVar, a8});
                int i = a8.i;
                if (i >= 0) {
                    int i8 = a8.f12716d.get(i);
                    Parcel parcel = a8.e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i8);
                    parcel.writeInt(dataPosition - i8);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e8) {
                if (e8.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e8.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e11);
        }
    }
}
