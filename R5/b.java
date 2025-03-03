package R5;

import T5.C0250i;
import T5.C0251i0;
import T5.C0260n;
import T5.K;
import T5.O;
import T5.P;
import T5.P0;
import T5.W;
import T5.a1;
import e6.C0849h;
import e6.C0856o;
import f6.G;
import g6.B;
import g6.n0;
import h6.C1082c;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class b implements Cloneable {
    private static final Map.Entry<C0849h, Object>[] EMPTY_ATTRIBUTE_ARRAY = new Map.Entry[0];
    private static final Map.Entry<C0251i0, Object>[] EMPTY_OPTION_ARRAY = new Map.Entry[0];
    private final Map<C0849h, Object> attrs;
    private volatile j channelFactory;
    volatile a1 group;
    private volatile W handler;
    private volatile SocketAddress localAddress;
    private final Map<C0251i0, Object> options;

    public b() {
        this.options = new LinkedHashMap();
        this.attrs = new ConcurrentHashMap();
    }

    public static <K, V> Map<K, V> copiedMap(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    private b self() {
        return this;
    }

    public static void setAttributes(K k8, Map.Entry<C0849h, Object>[] entryArr) {
        int length = entryArr.length;
        int i = 0;
        while (i < length) {
            Map.Entry<C0849h, Object> entry = entryArr[i];
            if (entry.getKey() == null) {
                ((C0856o) k8).attr((C0849h) null).set(entry.getValue());
                i++;
            } else {
                throw new ClassCastException();
            }
        }
    }

    private static void setChannelOption(K k8, C0251i0 i0Var, Object obj, C1082c cVar) {
        try {
            if (!k8.config().setOption(i0Var, obj)) {
                cVar.warn("Unknown channel option '{}' for channel '{}'", i0Var, k8);
            }
        } catch (Throwable th) {
            cVar.warn("Failed to set channel option '{}' with value '{}' for channel '{}'", i0Var, obj, k8, th);
        }
    }

    public static void setChannelOptions(K k8, Map.Entry<C0251i0, Object>[] entryArr, C1082c cVar) {
        for (Map.Entry<C0251i0, Object> entry : entryArr) {
            setChannelOption(k8, entry.getKey(), entry.getValue(), cVar);
        }
    }

    public final Map<C0849h, Object> attrs() {
        return copiedMap(this.attrs);
    }

    public final Map<C0849h, Object> attrs0() {
        return this.attrs;
    }

    @Deprecated
    public b channelFactory(j jVar) {
        B.checkNotNull(jVar, "channelFactory");
        if (this.channelFactory == null) {
            this.channelFactory = jVar;
            return self();
        }
        throw new IllegalStateException("channelFactory set already");
    }

    public abstract c config();

    public b group(a1 a1Var) {
        B.checkNotNull(a1Var, "group");
        if (this.group == null) {
            this.group = a1Var;
            return self();
        }
        throw new IllegalStateException("group set already");
    }

    public b handler(W w2) {
        this.handler = (W) B.checkNotNull(w2, "handler");
        return self();
    }

    public abstract void init(K k8);

    public final P initAndRegister() {
        K k8 = null;
        try {
            k8 = this.channelFactory.newChannel();
            init(k8);
            P register = config().group().register(k8);
            if (register.cause() != null) {
                C0260n nVar = (C0260n) k8;
                if (nVar.isRegistered()) {
                    nVar.close();
                } else {
                    ((C0250i) nVar.unsafe()).closeForcibly();
                }
            }
            return register;
        } catch (Throwable th) {
            if (k8 == null) {
                return new P0(new m(), G.INSTANCE).setFailure(th);
            }
            ((C0250i) k8.unsafe()).closeForcibly();
            return new P0(k8, G.INSTANCE).setFailure(th);
        }
    }

    public final SocketAddress localAddress() {
        return this.localAddress;
    }

    public final Map.Entry<C0849h, Object>[] newAttributesArray() {
        return newAttributesArray(attrs0());
    }

    public final Map.Entry<C0251i0, Object>[] newOptionsArray() {
        return newOptionsArray(this.options);
    }

    public final Map<C0251i0, Object> options() {
        Map<C0251i0, Object> copiedMap;
        synchronized (this.options) {
            copiedMap = copiedMap(this.options);
        }
        return copiedMap;
    }

    public String toString() {
        return n0.simpleClassName((Object) this) + '(' + config() + ')';
    }

    public b validate() {
        if (this.group == null) {
            throw new IllegalStateException("group not set");
        } else if (this.channelFactory != null) {
            return self();
        } else {
            throw new IllegalStateException("channel or channelFactory not set");
        }
    }

    public static Map.Entry<C0849h, Object>[] newAttributesArray(Map<C0849h, Object> map) {
        return (Map.Entry[]) map.entrySet().toArray(EMPTY_ATTRIBUTE_ARRAY);
    }

    public static Map.Entry<C0251i0, Object>[] newOptionsArray(Map<C0251i0, Object> map) {
        Map.Entry<C0251i0, Object>[] entryArr;
        synchronized (map) {
            entryArr = (Map.Entry[]) new LinkedHashMap(map).entrySet().toArray(EMPTY_OPTION_ARRAY);
        }
        return entryArr;
    }

    public final W handler() {
        return this.handler;
    }

    public b(b bVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.options = linkedHashMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.attrs = concurrentHashMap;
        this.group = bVar.group;
        this.channelFactory = bVar.channelFactory;
        this.handler = bVar.handler;
        this.localAddress = bVar.localAddress;
        synchronized (bVar.options) {
            linkedHashMap.putAll(bVar.options);
        }
        concurrentHashMap.putAll(bVar.attrs);
    }

    public b channelFactory(O o2) {
        return channelFactory((j) o2);
    }

    @Deprecated
    public final a1 group() {
        return this.group;
    }

    public final j channelFactory() {
        return this.channelFactory;
    }
}
