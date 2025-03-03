package T5;

import e6.I;
import e6.P;
import f6.C0911a;
import f6.C0929t;
import f6.C0932w;
import f6.C0934y;
import g6.B;
import g6.n0;
import h6.C1082c;
import h6.d;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u.C1477r;

public final class O0 implements C0270s0 {
    private static final AtomicReferenceFieldUpdater<O0, f1> ESTIMATOR;
    /* access modifiers changed from: private */
    public static final String HEAD_NAME = generateName0(J0.class);
    /* access modifiers changed from: private */
    public static final String TAIL_NAME = generateName0(N0.class);
    static final C1082c logger;
    private static final C0934y nameCaches = new E0();
    /* access modifiers changed from: private */
    public final K channel;
    private Map<C0932w, C0929t> childExecutors;
    private volatile f1 estimatorHandle;
    private boolean firstRegistration = true;
    final J0 head;
    private L0 pendingHandlerCallbackHead;
    private boolean registered;
    private final P succeededFuture;
    final N0 tail;
    private final boolean touch = P.isEnabled();
    private final v1 voidPromise;

    static {
        Class<O0> cls = O0.class;
        logger = d.getInstance((Class<?>) cls);
        ESTIMATOR = AtomicReferenceFieldUpdater.newUpdater(cls, f1.class, "estimatorHandle");
    }

    public O0(K k8) {
        this.channel = (K) B.checkNotNull(k8, "channel");
        this.succeededFuture = new t1(k8, (C0929t) null);
        this.voidPromise = new v1(k8, true);
        N0 n02 = new N0(this, this);
        this.tail = n02;
        J0 j02 = new J0(this, this);
        this.head = j02;
        j02.next = n02;
        n02.prev = j02;
    }

    private static void addAfter0(F f8, F f9) {
        f9.prev = f8;
        f9.next = f8.next;
        f8.next.prev = f9;
        f8.next = f9;
    }

    private void addLast0(F f8) {
        F f9 = this.tail.prev;
        f8.prev = f9;
        f8.next = this.tail;
        f9.next = f8;
        this.tail.prev = f8;
    }

    /* access modifiers changed from: private */
    public synchronized void atomicRemoveFromHandlerList(F f8) {
        F f9 = f8.prev;
        F f10 = f8.next;
        f9.next = f10;
        f10.prev = f9;
    }

    /* access modifiers changed from: private */
    public void callHandlerAdded0(F f8) {
        try {
            f8.callHandlerAdded();
        } catch (Throwable th) {
            C1082c cVar = logger;
            if (cVar.isWarnEnabled()) {
                cVar.warn("Failed to remove a handler: " + f8.name(), th);
            }
            fireExceptionCaught(new C0272t0(f8.handler().getClass().getName().concat(".handlerAdded() has thrown an exception; also failed to remove."), th));
        }
    }

    private void callHandlerAddedForAllHandlers() {
        L0 l02;
        synchronized (this) {
            this.registered = true;
            this.pendingHandlerCallbackHead = null;
        }
        for (l02 = this.pendingHandlerCallbackHead; l02 != null; l02 = l02.next) {
            l02.execute();
        }
    }

    private void callHandlerAddedInEventLoop(F f8, C0929t tVar) {
        f8.setAddPending();
        tVar.execute(new I0(this, f8));
    }

    private void callHandlerCallbackLater(F f8, boolean z) {
        L0 l02;
        if (z) {
            l02 = new K0(this, f8);
        } else {
            l02 = new M0(this, f8);
        }
        L0 l03 = this.pendingHandlerCallbackHead;
        if (l03 == null) {
            this.pendingHandlerCallbackHead = l02;
            return;
        }
        while (true) {
            L0 l04 = l03.next;
            if (l04 != null) {
                l03 = l04;
            } else {
                l03.next = l02;
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void callHandlerRemoved0(F f8) {
        try {
            f8.callHandlerRemoved();
        } catch (Throwable th) {
            fireExceptionCaught(new C0272t0(f8.handler().getClass().getName().concat(".handlerRemoved() has thrown an exception."), th));
        }
    }

    private void checkDuplicateName(String str) {
        if (context0(str) != null) {
            throw new IllegalArgumentException(C1477r.d("Duplicate handler name: ", str));
        }
    }

    private static void checkMultiplicity(W w2) {
        if (w2 instanceof X) {
            X x8 = (X) w2;
            if (x8.isSharable() || !x8.added) {
                x8.added = true;
                return;
            }
            throw new C0272t0(x8.getClass().getName().concat(" is not a @Sharable handler, so can't be added or removed multiple times."));
        }
    }

    private C0929t childExecutor(C0932w wVar) {
        if (wVar == null) {
            return null;
        }
        Boolean bool = (Boolean) this.channel.config().getOption(C0251i0.SINGLE_EVENTEXECUTOR_PER_GROUP);
        if (bool != null && !bool.booleanValue()) {
            return wVar.next();
        }
        Map map = this.childExecutors;
        if (map == null) {
            map = new IdentityHashMap(4);
            this.childExecutors = map;
        }
        C0929t tVar = (C0929t) map.get(wVar);
        if (tVar != null) {
            return tVar;
        }
        C0929t next = wVar.next();
        map.put(wVar, next);
        return next;
    }

    private F context0(String str) {
        for (F f8 = this.head.next; f8 != this.tail; f8 = f8.next) {
            if (f8.name().equals(str)) {
                return f8;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public synchronized void destroy() {
        destroyUp(this.head.next, false);
    }

    /* access modifiers changed from: private */
    public void destroyDown(Thread thread, F f8, boolean z) {
        J0 j02 = this.head;
        while (f8 != j02) {
            C0929t executor = f8.executor();
            if (z || executor.inEventLoop(thread)) {
                atomicRemoveFromHandlerList(f8);
                callHandlerRemoved0(f8);
                f8 = f8.prev;
                z = false;
            } else {
                executor.execute(new H0(this, f8));
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void destroyUp(F f8, boolean z) {
        Thread currentThread = Thread.currentThread();
        N0 n02 = this.tail;
        while (f8 != n02) {
            C0929t executor = f8.executor();
            if (z || executor.inEventLoop(currentThread)) {
                f8 = f8.next;
                z = false;
            } else {
                executor.execute(new G0(this, f8));
                return;
            }
        }
        destroyDown(currentThread, n02.prev, z);
    }

    private String filterName(String str, W w2) {
        if (str == null) {
            return generateName(w2);
        }
        checkDuplicateName(str);
        return str;
    }

    private String generateName(W w2) {
        Map map = (Map) nameCaches.get();
        Class<?> cls = w2.getClass();
        String str = (String) map.get(cls);
        if (str == null) {
            str = generateName0(cls);
            map.put(cls, str);
        }
        if (context0(str) != null) {
            int i = 1;
            String substring = str.substring(0, str.length() - 1);
            while (true) {
                str = substring + i;
                if (context0(str) == null) {
                    break;
                }
                i++;
            }
        }
        return str;
    }

    private static String generateName0(Class<?> cls) {
        return n0.simpleClassName(cls) + "#0";
    }

    private F getContextOrDie(String str) {
        F f8 = (F) context(str);
        if (f8 != null) {
            return f8;
        }
        throw new NoSuchElementException(str);
    }

    private F newContext(C0932w wVar, String str, W w2) {
        return new C0(this, childExecutor(wVar), str, w2);
    }

    public final C0270s0 addAfter(String str, String str2, W w2) {
        return addAfter((C0932w) null, str, str2, w2);
    }

    public final C0270s0 addLast(String str, W w2) {
        return addLast((C0932w) null, str, w2);
    }

    public final K channel() {
        return this.channel;
    }

    public final P close() {
        return this.tail.close();
    }

    public final P connect(SocketAddress socketAddress, C0274u0 u0Var) {
        return this.tail.connect(socketAddress, u0Var);
    }

    public final Y context(String str) {
        return context0((String) B.checkNotNull(str, "name"));
    }

    public void decrementPendingOutboundBytes(long j7) {
        C0263o0 outboundBuffer = ((C0250i) this.channel.unsafe()).outboundBuffer();
        if (outboundBuffer != null) {
            outboundBuffer.decrementPendingOutboundBytes(j7);
        }
    }

    public final f1 estimatorHandle() {
        f1 f1Var = this.estimatorHandle;
        if (f1Var != null) {
            return f1Var;
        }
        f1 newHandle = ((V0) ((B0) this.channel.config()).getMessageSizeEstimator()).newHandle();
        AtomicReferenceFieldUpdater<O0, f1> atomicReferenceFieldUpdater = ESTIMATOR;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, newHandle)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return this.estimatorHandle;
            }
        }
        return newHandle;
    }

    public final C0270s0 fireChannelActive() {
        F.invokeChannelActive(this.head);
        return this;
    }

    public final C0270s0 fireChannelInactive() {
        F.invokeChannelInactive(this.head);
        return this;
    }

    public final C0270s0 fireChannelRead(Object obj) {
        F.invokeChannelRead(this.head, obj);
        return this;
    }

    public final C0270s0 fireChannelReadComplete() {
        F.invokeChannelReadComplete(this.head);
        return this;
    }

    public final C0270s0 fireChannelRegistered() {
        F.invokeChannelRegistered(this.head);
        return this;
    }

    public final C0270s0 fireChannelUnregistered() {
        F.invokeChannelUnregistered(this.head);
        return this;
    }

    public final C0270s0 fireChannelWritabilityChanged() {
        F.invokeChannelWritabilityChanged(this.head);
        return this;
    }

    public final C0270s0 fireExceptionCaught(Throwable th) {
        F.invokeExceptionCaught(this.head, th);
        return this;
    }

    public final C0270s0 fireUserEventTriggered(Object obj) {
        F.invokeUserEventTriggered(this.head, obj);
        return this;
    }

    public final W get(String str) {
        Y context = context(str);
        if (context == null) {
            return null;
        }
        return context.handler();
    }

    public void incrementPendingOutboundBytes(long j7) {
        C0263o0 outboundBuffer = ((C0250i) this.channel.unsafe()).outboundBuffer();
        if (outboundBuffer != null) {
            outboundBuffer.incrementPendingOutboundBytes(j7);
        }
    }

    public final void invokeHandlerAddedIfNeeded() {
        if (this.firstRegistration) {
            this.firstRegistration = false;
            callHandlerAddedForAllHandlers();
        }
    }

    public final Iterator<Map.Entry<String, W>> iterator() {
        return toMap().entrySet().iterator();
    }

    public final List<String> names() {
        ArrayList arrayList = new ArrayList();
        for (F f8 = this.head.next; f8 != null; f8 = f8.next) {
            arrayList.add(f8.name());
        }
        return arrayList;
    }

    public final P newFailedFuture(Throwable th) {
        return new c1(this.channel, (C0929t) null, th);
    }

    public final C0274u0 newPromise() {
        return new P0(this.channel);
    }

    public void onUnhandledChannelWritabilityChanged() {
    }

    public void onUnhandledInboundChannelActive() {
    }

    public void onUnhandledInboundChannelInactive() {
    }

    public void onUnhandledInboundChannelReadComplete() {
    }

    public void onUnhandledInboundException(Throwable th) {
        try {
            logger.warn("An exceptionCaught() event was fired, and it reached at the tail of the pipeline. It usually means the last handler in the pipeline did not handle the exception.", th);
        } finally {
            I.release(th);
        }
    }

    public void onUnhandledInboundMessage(Object obj) {
        try {
            logger.debug("Discarded inbound message {} that reached at the tail of the pipeline. Please check your pipeline configuration.", obj);
        } finally {
            I.release(obj);
        }
    }

    public void onUnhandledInboundUserEventTriggered(Object obj) {
        I.release(obj);
    }

    public final C0270s0 read() {
        this.tail.read();
        return this;
    }

    public final C0270s0 remove(W w2) {
        remove(getContextOrDie(w2));
        return this;
    }

    public final Map<String, W> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (F f8 = this.head.next; f8 != this.tail; f8 = f8.next) {
            linkedHashMap.put(f8.name(), f8.handler());
        }
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(n0.simpleClassName((Object) this));
        sb.append('{');
        F f8 = this.head.next;
        while (f8 != this.tail) {
            sb.append('(');
            sb.append(f8.name());
            sb.append(" = ");
            sb.append(f8.handler().getClass().getName());
            sb.append(')');
            f8 = f8.next;
            if (f8 == this.tail) {
                break;
            }
            sb.append(", ");
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object touch(Object obj, F f8) {
        if (this.touch) {
            return I.touch(obj, f8);
        }
        return obj;
    }

    public final C0274u0 voidPromise() {
        return this.voidPromise;
    }

    public final P writeAndFlush(Object obj) {
        return this.tail.writeAndFlush(obj);
    }

    public final C0270s0 addAfter(C0932w wVar, String str, String str2, W w2) {
        synchronized (this) {
            try {
                checkMultiplicity(w2);
                String filterName = filterName(str2, w2);
                F contextOrDie = getContextOrDie(str);
                F newContext = newContext(wVar, filterName, w2);
                addAfter0(contextOrDie, newContext);
                if (!this.registered) {
                    newContext.setAddPending();
                    callHandlerCallbackLater(newContext, true);
                    return this;
                }
                C0911a aVar = (C0911a) newContext.executor();
                if (!aVar.inEventLoop()) {
                    callHandlerAddedInEventLoop(newContext, aVar);
                    return this;
                }
                callHandlerAdded0(newContext);
                return this;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final C0270s0 addLast(C0932w wVar, String str, W w2) {
        synchronized (this) {
            try {
                checkMultiplicity(w2);
                F newContext = newContext(wVar, filterName(str, w2), w2);
                addLast0(newContext);
                if (!this.registered) {
                    newContext.setAddPending();
                    callHandlerCallbackLater(newContext, true);
                    return this;
                }
                C0911a aVar = (C0911a) newContext.executor();
                if (!aVar.inEventLoop()) {
                    callHandlerAddedInEventLoop(newContext, aVar);
                    return this;
                }
                callHandlerAdded0(newContext);
                return this;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final P connect(SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        return this.tail.connect(socketAddress, socketAddress2, u0Var);
    }

    public final Y context(W w2) {
        B.checkNotNull(w2, "handler");
        for (F f8 = this.head.next; f8 != null; f8 = f8.next) {
            if (f8.handler() == w2) {
                return f8;
            }
        }
        return null;
    }

    public final <T extends W> T remove(Class<T> cls) {
        return remove(getContextOrDie((Class<? extends W>) cls)).handler();
    }

    private F getContextOrDie(W w2) {
        F f8 = (F) context(w2);
        if (f8 != null) {
            return f8;
        }
        throw new NoSuchElementException(w2.getClass().getName());
    }

    private F remove(F f8) {
        synchronized (this) {
            try {
                atomicRemoveFromHandlerList(f8);
                if (!this.registered) {
                    callHandlerCallbackLater(f8, false);
                    return f8;
                }
                C0911a aVar = (C0911a) f8.executor();
                if (!aVar.inEventLoop()) {
                    aVar.execute(new F0(this, f8));
                    return f8;
                }
                callHandlerRemoved0(f8);
                return f8;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final <T extends W> T get(Class<T> cls) {
        Y context = context((Class<? extends W>) cls);
        if (context == null) {
            return null;
        }
        return context.handler();
    }

    public void onUnhandledInboundMessage(Y y8, Object obj) {
        onUnhandledInboundMessage(obj);
        C1082c cVar = logger;
        if (cVar.isDebugEnabled()) {
            cVar.debug("Discarded message pipeline : {}. Channel : {}.", ((O0) y8.pipeline()).names(), y8.channel());
        }
    }

    private F getContextOrDie(Class<? extends W> cls) {
        F f8 = (F) context(cls);
        if (f8 != null) {
            return f8;
        }
        throw new NoSuchElementException(cls.getName());
    }

    public final Y context(Class<? extends W> cls) {
        B.checkNotNull(cls, "handlerType");
        for (F f8 = this.head.next; f8 != null; f8 = f8.next) {
            if (cls.isAssignableFrom(f8.handler().getClass())) {
                return f8;
            }
        }
        return null;
    }

    public final C0270s0 addLast(W... wArr) {
        return addLast((C0932w) null, wArr);
    }

    public final C0270s0 addLast(C0932w wVar, W... wArr) {
        B.checkNotNull(wArr, "handlers");
        for (W w2 : wArr) {
            if (w2 == null) {
                break;
            }
            addLast(wVar, (String) null, w2);
        }
        return this;
    }
}
