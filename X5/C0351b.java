package X5;

/* renamed from: X5.b  reason: case insensitive filesystem */
public final class C0351b implements C0352c {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S5.C0185n cumulate(S5.C0187o r5, S5.C0185n r6, S5.C0185n r7) {
        /*
            r4 = this;
            if (r6 != r7) goto L_0x0006
            r7.release()
            return r6
        L_0x0006:
            boolean r0 = r6.isReadable()
            if (r0 != 0) goto L_0x0010
            r6.release()
            return r7
        L_0x0010:
            r0 = 0
            boolean r1 = r6 instanceof S5.E     // Catch:{ all -> 0x0035 }
            r2 = 1
            if (r1 == 0) goto L_0x003a
            int r1 = r6.refCnt()     // Catch:{ all -> 0x0035 }
            if (r1 != r2) goto L_0x003a
            r5 = r6
            S5.E r5 = (S5.E) r5     // Catch:{ all -> 0x0035 }
            int r0 = r5.writerIndex()     // Catch:{ all -> 0x0031 }
            int r1 = r5.capacity()     // Catch:{ all -> 0x0031 }
            if (r0 == r1) goto L_0x0033
            int r0 = r5.writerIndex()     // Catch:{ all -> 0x0031 }
            r5.capacity((int) r0)     // Catch:{ all -> 0x0031 }
            goto L_0x0033
        L_0x0031:
            r0 = move-exception
            goto L_0x004c
        L_0x0033:
            r0 = r5
            goto L_0x0048
        L_0x0035:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x004c
        L_0x003a:
            S5.c r5 = (S5.C0163c) r5     // Catch:{ all -> 0x0035 }
            r1 = 2147483647(0x7fffffff, float:NaN)
            S5.E r5 = r5.compositeBuffer(r1)     // Catch:{ all -> 0x0035 }
            S5.E r5 = r5.addFlattenedComponents(r2, r6)     // Catch:{ all -> 0x0035 }
            goto L_0x0033
        L_0x0048:
            r0.addFlattenedComponents(r2, r7)     // Catch:{ all -> 0x0035 }
            return r0
        L_0x004c:
            if (r7 == 0) goto L_0x0058
            r7.release()
            if (r5 == 0) goto L_0x0058
            if (r5 == r6) goto L_0x0058
            r5.release()
        L_0x0058:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X5.C0351b.cumulate(S5.o, S5.n, S5.n):S5.n");
    }
}
