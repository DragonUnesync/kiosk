package androidx.camera.extensions.internal.sessionprocessor;

import D.C0055l0;
import D7.b;
import F.h;
import T.a;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    a mCaptureOutputSurface;
    final CaptureProcessorImpl mCaptureProcessorImpl;
    final b mCaptureResultImageMatcher = new b();
    HashMap<Integer, Pair<c, TotalCaptureResult>> mCaptureResults = new HashMap<>();
    boolean mIsClosed = false;
    private boolean mIsPostviewConfigured;
    final Object mLock = new Object();
    OnCaptureResultCallback mOnCaptureResultCallback = null;
    TotalCaptureResult mSourceCaptureResult = null;
    long mTimeStampForOutputImage = -1;

    public interface OnCaptureResultCallback {
        void onCaptureCompleted(long j7, List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i);

        void onError(Exception exc);

        void onProcessCompleted();
    }

    public StillCaptureProcessor(CaptureProcessorImpl captureProcessorImpl, Surface surface, Size size, C0055l0 l0Var, boolean z) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        a aVar = new a(surface, size, z);
        this.mCaptureOutputSurface = aVar;
        captureProcessorImpl.onOutputSurface(aVar.b(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = false;
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ae, code lost:
        F.h.j(TAG, "CaptureProcessorImpl.process() finish");
        r6 = r4.mOnCaptureResultCallback;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b7, code lost:
        if (r6 != null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b9, code lost:
        r6.onProcessCompleted();
        r4.mOnCaptureResultCallback = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00be, code lost:
        clearCaptureResults();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c3, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0013, B:42:0x0091] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void lambda$process$1(boolean r5, java.util.HashMap r6, final androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            r1 = 0
            boolean r2 = r4.mIsClosed     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x002d
            java.lang.String r5 = "StillCaptureProcessor"
            java.lang.String r6 = "Ignore process() in closed state."
            F.h.j(r5, r6)     // Catch:{ Exception -> 0x002b }
            java.lang.String r5 = "StillCaptureProcessor"
            java.lang.String r6 = "CaptureProcessorImpl.process() finish"
            F.h.j(r5, r6)     // Catch:{ all -> 0x0020 }
            androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$OnCaptureResultCallback r5 = r4.mOnCaptureResultCallback     // Catch:{ all -> 0x0020 }
            if (r5 == 0) goto L_0x0023
            r5.onProcessCompleted()     // Catch:{ all -> 0x0020 }
            r4.mOnCaptureResultCallback = r1     // Catch:{ all -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            r5 = move-exception
            goto L_0x00c2
        L_0x0023:
            r4.clearCaptureResults()     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0028:
            r5 = move-exception
            goto L_0x00ae
        L_0x002b:
            r5 = move-exception
            goto L_0x008d
        L_0x002d:
            java.lang.String r2 = "StillCaptureProcessor"
            java.lang.String r3 = "CaptureProcessorImpl.process() begin"
            F.h.j(r2, r3)     // Catch:{ Exception -> 0x002b }
            R.a r2 = R.a.f4224Z     // Catch:{ Exception -> 0x002b }
            boolean r3 = R.e.m(r2)     // Catch:{ Exception -> 0x002b }
            if (r3 == 0) goto L_0x0057
            boolean r2 = R.b.c(r2)     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x0057
            if (r5 == 0) goto L_0x0057
            boolean r5 = r4.mIsPostviewConfigured     // Catch:{ Exception -> 0x002b }
            if (r5 == 0) goto L_0x0057
            androidx.camera.extensions.impl.CaptureProcessorImpl r5 = r4.mCaptureProcessorImpl     // Catch:{ Exception -> 0x002b }
            androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$1 r2 = new androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$1     // Catch:{ Exception -> 0x002b }
            r2.<init>(r7)     // Catch:{ Exception -> 0x002b }
            F.a r3 = D7.b.l()     // Catch:{ Exception -> 0x002b }
            r5.processWithPostview(r6, r2, r3)     // Catch:{ Exception -> 0x002b }
            goto L_0x0079
        L_0x0057:
            R.a r5 = R.a.f4223Y     // Catch:{ Exception -> 0x002b }
            boolean r2 = R.e.m(r5)     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x0074
            boolean r5 = R.b.c(r5)     // Catch:{ Exception -> 0x002b }
            if (r5 == 0) goto L_0x0074
            androidx.camera.extensions.impl.CaptureProcessorImpl r5 = r4.mCaptureProcessorImpl     // Catch:{ Exception -> 0x002b }
            androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$2 r2 = new androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$2     // Catch:{ Exception -> 0x002b }
            r2.<init>(r7)     // Catch:{ Exception -> 0x002b }
            F.a r3 = D7.b.l()     // Catch:{ Exception -> 0x002b }
            r5.process(r6, r2, r3)     // Catch:{ Exception -> 0x002b }
            goto L_0x0079
        L_0x0074:
            androidx.camera.extensions.impl.CaptureProcessorImpl r5 = r4.mCaptureProcessorImpl     // Catch:{ Exception -> 0x002b }
            r5.process(r6)     // Catch:{ Exception -> 0x002b }
        L_0x0079:
            java.lang.String r5 = "StillCaptureProcessor"
            java.lang.String r6 = "CaptureProcessorImpl.process() finish"
            F.h.j(r5, r6)     // Catch:{ all -> 0x0020 }
            androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$OnCaptureResultCallback r5 = r4.mOnCaptureResultCallback     // Catch:{ all -> 0x0020 }
            if (r5 == 0) goto L_0x0089
            r5.onProcessCompleted()     // Catch:{ all -> 0x0020 }
            r4.mOnCaptureResultCallback = r1     // Catch:{ all -> 0x0020 }
        L_0x0089:
            r4.clearCaptureResults()     // Catch:{ all -> 0x0020 }
            goto L_0x00ac
        L_0x008d:
            java.lang.String r6 = "StillCaptureProcessor"
            java.lang.String r2 = "mCaptureProcessorImpl.process exception "
            F.h.m(r6, r2, r5)     // Catch:{ all -> 0x0028 }
            r4.mOnCaptureResultCallback = r1     // Catch:{ all -> 0x0028 }
            if (r7 == 0) goto L_0x009b
            r7.onError(r5)     // Catch:{ all -> 0x0028 }
        L_0x009b:
            java.lang.String r5 = "StillCaptureProcessor"
            java.lang.String r6 = "CaptureProcessorImpl.process() finish"
            F.h.j(r5, r6)     // Catch:{ all -> 0x0020 }
            androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$OnCaptureResultCallback r5 = r4.mOnCaptureResultCallback     // Catch:{ all -> 0x0020 }
            if (r5 == 0) goto L_0x0089
            r5.onProcessCompleted()     // Catch:{ all -> 0x0020 }
            r4.mOnCaptureResultCallback = r1     // Catch:{ all -> 0x0020 }
            goto L_0x0089
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x00ae:
            java.lang.String r6 = "StillCaptureProcessor"
            java.lang.String r7 = "CaptureProcessorImpl.process() finish"
            F.h.j(r6, r7)     // Catch:{ all -> 0x0020 }
            androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$OnCaptureResultCallback r6 = r4.mOnCaptureResultCallback     // Catch:{ all -> 0x0020 }
            if (r6 == 0) goto L_0x00be
            r6.onProcessCompleted()     // Catch:{ all -> 0x0020 }
            r4.mOnCaptureResultCallback = r1     // Catch:{ all -> 0x0020 }
        L_0x00be:
            r4.clearCaptureResults()     // Catch:{ all -> 0x0020 }
            throw r5     // Catch:{ all -> 0x0020 }
        L_0x00c2:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.lambda$process$1(boolean, java.util.HashMap, androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$OnCaptureResultCallback):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ void lambda$startCapture$0(java.util.List r6, androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.OnCaptureResultCallback r7, boolean r8, androidx.camera.extensions.internal.sessionprocessor.c r9, android.hardware.camera2.TotalCaptureResult r10, int r11) {
        /*
            r5 = this;
            java.lang.String r0 = "mCaptureResult has capture stage Id: "
            java.lang.String r1 = "onImageReferenceIncoming  captureStageId="
            java.lang.Object r2 = r5.mLock
            monitor-enter(r2)
            boolean r3 = r5.mIsClosed     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0019
            r9.a()     // Catch:{ all -> 0x0017 }
            java.lang.String r6 = "StillCaptureProcessor"
            java.lang.String r7 = "Ignore image in closed state"
            F.h.j(r6, r7)     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return
        L_0x0017:
            r6 = move-exception
            goto L_0x0062
        L_0x0019:
            java.lang.String r3 = "StillCaptureProcessor"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
            r4.<init>(r1)     // Catch:{ all -> 0x0017 }
            r4.append(r11)     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0017 }
            F.h.j(r3, r1)     // Catch:{ all -> 0x0017 }
            java.util.HashMap<java.lang.Integer, android.util.Pair<androidx.camera.extensions.internal.sessionprocessor.c, android.hardware.camera2.TotalCaptureResult>> r1 = r5.mCaptureResults     // Catch:{ all -> 0x0017 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0017 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0017 }
            r3.<init>(r9, r10)     // Catch:{ all -> 0x0017 }
            r1.put(r11, r3)     // Catch:{ all -> 0x0017 }
            java.lang.String r9 = "StillCaptureProcessor"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
            r10.<init>(r0)     // Catch:{ all -> 0x0017 }
            java.util.HashMap<java.lang.Integer, android.util.Pair<androidx.camera.extensions.internal.sessionprocessor.c, android.hardware.camera2.TotalCaptureResult>> r11 = r5.mCaptureResults     // Catch:{ all -> 0x0017 }
            java.util.Set r11 = r11.keySet()     // Catch:{ all -> 0x0017 }
            r10.append(r11)     // Catch:{ all -> 0x0017 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0017 }
            F.h.j(r9, r10)     // Catch:{ all -> 0x0017 }
            java.util.HashMap<java.lang.Integer, android.util.Pair<androidx.camera.extensions.internal.sessionprocessor.c, android.hardware.camera2.TotalCaptureResult>> r9 = r5.mCaptureResults     // Catch:{ all -> 0x0017 }
            java.util.Set r9 = r9.keySet()     // Catch:{ all -> 0x0017 }
            boolean r6 = r9.containsAll(r6)     // Catch:{ all -> 0x0017 }
            if (r6 == 0) goto L_0x0060
            java.util.HashMap<java.lang.Integer, android.util.Pair<androidx.camera.extensions.internal.sessionprocessor.c, android.hardware.camera2.TotalCaptureResult>> r6 = r5.mCaptureResults     // Catch:{ all -> 0x0017 }
            r5.process(r6, r7, r8)     // Catch:{ all -> 0x0017 }
        L_0x0060:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return
        L_0x0062:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.lambda$startCapture$0(java.util.List, androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$OnCaptureResultCallback, boolean, androidx.camera.extensions.internal.sessionprocessor.c, android.hardware.camera2.TotalCaptureResult, int):void");
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<c, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                if (!it.hasNext()) {
                    this.mCaptureResults.clear();
                } else if (it.next().first == null) {
                    throw null;
                } else {
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            h.j(TAG, "Close the StillCaptureProcessor");
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.c();
            this.mCaptureResultImageMatcher.b();
            this.mCaptureOutputSurface.a();
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult, int i) {
        Long l8;
        this.mCaptureResultImageMatcher.a(totalCaptureResult, i);
        if (this.mTimeStampForOutputImage == -1 && (l8 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long longValue = l8.longValue();
            this.mTimeStampForOutputImage = longValue;
            a aVar = this.mCaptureOutputSurface;
            if (aVar.f4601g) {
                aVar.f4602h = longValue;
            }
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyImage(c cVar) {
        this.mCaptureResultImageMatcher.d();
        throw null;
    }

    public void process(Map<Integer, Pair<c, TotalCaptureResult>> map, OnCaptureResultCallback onCaptureResultCallback, boolean z) {
        HashMap hashMap = new HashMap();
        synchronized (this.mLock) {
            Iterator<Integer> it = map.keySet().iterator();
            if (it.hasNext()) {
                if (map.get(it.next()).first == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
        b.z().execute(new d(this, z, hashMap, onCaptureResultCallback));
    }

    public void startCapture(boolean z, List<Integer> list, OnCaptureResultCallback onCaptureResultCallback) {
        h.j(TAG, "Start the capture: enablePostview=" + z);
        this.mTimeStampForOutputImage = -1;
        synchronized (this.mLock) {
            n2.a.m("StillCaptureProcessor is closed. Can't invoke startCapture()", !this.mIsClosed);
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.b();
        this.mCaptureResultImageMatcher.g(new e(this, list, onCaptureResultCallback, z));
    }
}
