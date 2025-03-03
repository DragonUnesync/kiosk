package v;

import B6.a;
import F.h;
import F2.e;
import M5.b;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import de.ozerov.fully.MyApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m0.C1197c;
import m4.C1214b;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.scheduler.SenderSchedulerFactory;
import r7.C1395d;
import u.C1465f;
import u.C1472m;
import u.C1474o;
import w.u;
import w.v;
import x.C1594a;
import x7.c;

public class i implements a, z7.a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15851U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f15852V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f15853W;

    public /* synthetic */ i(Object obj, int i, Object obj2) {
        this.f15851U = i;
        this.f15852V = obj;
        this.f15853W = obj2;
    }

    public static void b(CameraDevice cameraDevice, v vVar) {
        cameraDevice.getClass();
        u uVar = vVar.f16176a;
        uVar.c().getClass();
        List<w.i> d8 = uVar.d();
        if (d8 == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        } else if (uVar.f() != null) {
            String id = cameraDevice.getId();
            for (w.i iVar : d8) {
                String d9 = iVar.f16153a.d();
                if (d9 != null && !d9.isEmpty()) {
                    h.I("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + d9 + ". Ignoring.");
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid executor");
        }
    }

    public static ArrayList j(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((w.i) it.next()).f16153a.e());
        }
        return arrayList;
    }

    public int a(ArrayList arrayList, F.i iVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f15852V).captureBurst(arrayList, new C1465f(iVar, captureCallback), ((h) this.f15853W).f15850a);
    }

    public void c(v vVar) {
        CameraDevice cameraDevice = (CameraDevice) this.f15852V;
        b(cameraDevice, vVar);
        u uVar = vVar.f16176a;
        if (uVar.e() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        } else if (uVar.b() != 1) {
            try {
                cameraDevice.createCaptureSession(j(uVar.d()), new f(uVar.f(), uVar.c()), ((h) this.f15853W).f15850a);
            } catch (CameraAccessException e) {
                throw new C1502a(e);
            }
        } else {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
    }

    public CameraCharacteristics d(String str) {
        try {
            return ((CameraManager) this.f15852V).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new C1502a(e);
        }
    }

    public Set e() {
        return Collections.emptySet();
    }

    public void f(String str, F.i iVar, CameraDevice.StateCallback stateCallback) {
        iVar.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.f15852V).openCamera(str, new C1472m(iVar, stateCallback), (Handler) ((i) this.f15853W).f15853W);
        } catch (CameraAccessException e) {
            throw new C1502a(e);
        }
    }

    public void g(F.i iVar, C1474o oVar) {
        q qVar;
        i iVar2 = (i) this.f15853W;
        synchronized (((HashMap) iVar2.f15852V)) {
            try {
                qVar = (q) ((HashMap) iVar2.f15852V).get(oVar);
                if (qVar == null) {
                    qVar = new q(iVar, oVar);
                    ((HashMap) iVar2.f15852V).put(oVar, qVar);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ((CameraManager) this.f15852V).registerAvailabilityCallback(qVar, (Handler) iVar2.f15853W);
    }

    public Object get() {
        C1214b bVar = (C1214b) ((b) this.f15852V).f3175U;
        ((O4.a) ((b) this.f15853W).f3175U).getClass();
        throw new IllegalStateException("Auth mechanism must not be null. This must not happen and is a bug.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        g7.l.c(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(java.io.File r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x003e
            org.acra.ErrorReporter r1 = n7.C1247a.f13789a
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "ACRA-approved"
            java.lang.Object r3 = r11.f15852V
            F2.e r3 = (F2.e) r3
            android.content.Context r3 = r3.f1521V
            java.io.File r2 = r3.getDir(r2, r0)
            java.lang.String r3 = "getDir(...)"
            P6.f.d(r2, r3)
            java.lang.String r3 = r12.getName()
            r1.<init>(r2, r3)
            boolean r2 = r12.renameTo(r1)
            if (r2 != 0) goto L_0x003e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not rename approved report from "
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r12 = " to "
            r2.append(r12)
            r2.append(r1)
            java.lang.String r12 = r2.toString()
            n2.a.m1(r12)
        L_0x003e:
            org.acra.ErrorReporter r12 = n7.C1247a.f13789a
            java.lang.Object r12 = r11.f15853W
            z7.a r12 = (z7.a) r12
            v.i r12 = (v.i) r12
            r12.getClass()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.Object r2 = r12.f15853W
            r7.d r2 = (r7.C1395d) r2
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r4 = 0
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006d }
            r5.<init>(r3)     // Catch:{ IOException -> 0x006d }
            r5.writeObject(r2)     // Catch:{ all -> 0x006f }
            byte[] r3 = r3.toByteArray()     // Catch:{ all -> 0x006f }
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)     // Catch:{ all -> 0x006f }
            g7.l.c(r5, r4)     // Catch:{ IOException -> 0x006d }
            r4 = r3
            goto L_0x0079
        L_0x006d:
            r3 = move-exception
            goto L_0x0076
        L_0x006f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r6 = move-exception
            g7.l.c(r5, r3)     // Catch:{ IOException -> 0x006d }
            throw r6     // Catch:{ IOException -> 0x006d }
        L_0x0076:
            r3.printStackTrace()
        L_0x0079:
            java.lang.String r3 = "acraConfig"
            r1.putString(r3, r4)
            java.lang.String r3 = "onlySendSilentReports"
            r1.putBoolean(r3, r0)
            java.lang.Object r12 = r12.f15852V
            de.ozerov.fully.MyApplication r12 = (de.ozerov.fully.MyApplication) r12
            org.acra.ErrorReporter r3 = n7.C1247a.f13789a
            x7.b r3 = r2.f14977t0
            x7.c r3 = (x7.c) r3
            java.lang.Class<org.acra.sender.ReportSenderFactory> r4 = org.acra.sender.ReportSenderFactory.class
            java.util.ArrayList r5 = r3.a(r2, r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = D6.k.M(r5)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x00a0:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00b6
            java.lang.Object r7 = r5.next()
            org.acra.sender.ReportSenderFactory r7 = (org.acra.sender.ReportSenderFactory) r7
            B7.h r7 = r7.create(r12, r2)
            org.acra.ErrorReporter r8 = n7.C1247a.f13789a
            r6.add(r7)
            goto L_0x00a0
        L_0x00b6:
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L_0x00be
            goto L_0x0218
        L_0x00be:
            java.util.Iterator r5 = r6.iterator()
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0218
            java.lang.Object r5 = r5.next()
            B7.h r5 = (B7.h) r5
            r5.getClass()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 22
            if (r5 < r6) goto L_0x0203
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r5 = r12.getSystemService(r5)
            java.lang.String r6 = "null cannot be cast to non-null type android.app.job.JobScheduler"
            P6.f.c(r5, r6)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            android.app.job.JobInfo$Builder r6 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r7 = new android.content.ComponentName
            java.lang.Class<org.acra.sender.JobSenderService> r8 = org.acra.sender.JobSenderService.class
            r7.<init>(r12, r8)
            r6.<init>(r0, r7)
            android.os.PersistableBundle r0 = new android.os.PersistableBundle
            r0.<init>()
            java.util.Set r7 = r1.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00fd:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01ef
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r1.get(r8)
            boolean r10 = r9 instanceof android.os.PersistableBundle
            if (r10 != 0) goto L_0x0140
            boolean r10 = r9 instanceof java.lang.Integer
            if (r10 != 0) goto L_0x0140
            boolean r10 = r9 instanceof int[]
            if (r10 != 0) goto L_0x0140
            boolean r10 = r9 instanceof java.lang.Long
            if (r10 != 0) goto L_0x0140
            boolean r10 = r9 instanceof long[]
            if (r10 != 0) goto L_0x0140
            boolean r10 = r9 instanceof java.lang.Double
            if (r10 != 0) goto L_0x0140
            boolean r10 = r9 instanceof double[]
            if (r10 != 0) goto L_0x0140
            boolean r10 = r9 instanceof java.lang.String
            if (r10 != 0) goto L_0x0140
            boolean r10 = r9 instanceof java.lang.Object[]
            if (r10 == 0) goto L_0x0138
            r10 = r9
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            boolean r10 = r10 instanceof java.lang.String[]
            if (r10 != 0) goto L_0x0140
        L_0x0138:
            boolean r10 = r9 instanceof java.lang.Boolean
            if (r10 != 0) goto L_0x0140
            boolean r10 = r9 instanceof boolean[]
            if (r10 == 0) goto L_0x00fd
        L_0x0140:
            P6.f.b(r8)
            if (r9 == 0) goto L_0x01e7
            boolean r10 = r9 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x0153
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.putInt(r8, r9)
            goto L_0x00fd
        L_0x0153:
            boolean r10 = r9 instanceof int[]
            if (r10 == 0) goto L_0x015d
            int[] r9 = (int[]) r9
            r0.putIntArray(r8, r9)
            goto L_0x00fd
        L_0x015d:
            boolean r10 = r9 instanceof java.lang.Long
            if (r10 == 0) goto L_0x016b
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            r0.putLong(r8, r9)
            goto L_0x00fd
        L_0x016b:
            boolean r10 = r9 instanceof long[]
            if (r10 == 0) goto L_0x0175
            long[] r9 = (long[]) r9
            r0.putLongArray(r8, r9)
            goto L_0x00fd
        L_0x0175:
            boolean r10 = r9 instanceof java.lang.Double
            if (r10 == 0) goto L_0x0184
            java.lang.Number r9 = (java.lang.Number) r9
            double r9 = r9.doubleValue()
            r0.putDouble(r8, r9)
            goto L_0x00fd
        L_0x0184:
            boolean r10 = r9 instanceof double[]
            if (r10 == 0) goto L_0x018f
            double[] r9 = (double[]) r9
            r0.putDoubleArray(r8, r9)
            goto L_0x00fd
        L_0x018f:
            boolean r10 = r9 instanceof java.lang.String
            if (r10 == 0) goto L_0x019a
            java.lang.String r9 = (java.lang.String) r9
            r0.putString(r8, r9)
            goto L_0x00fd
        L_0x019a:
            boolean r10 = r9 instanceof java.lang.Object[]
            if (r10 == 0) goto L_0x01ac
            r10 = r9
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            boolean r10 = r10 instanceof java.lang.String[]
            if (r10 == 0) goto L_0x01ac
            java.lang.String[] r9 = (java.lang.String[]) r9
            r0.putStringArray(r8, r9)
            goto L_0x00fd
        L_0x01ac:
            boolean r10 = r9 instanceof java.lang.Boolean
            if (r10 == 0) goto L_0x01bb
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r0.putBoolean(r8, r9)
            goto L_0x00fd
        L_0x01bb:
            boolean r10 = r9 instanceof boolean[]
            if (r10 == 0) goto L_0x01c6
            boolean[] r9 = (boolean[]) r9
            r0.putBooleanArray(r8, r9)
            goto L_0x00fd
        L_0x01c6:
            boolean r8 = r9 instanceof android.os.PersistableBundle
            if (r8 == 0) goto L_0x01d1
            android.os.PersistableBundle r9 = (android.os.PersistableBundle) r9
            r0.putAll(r9)
            goto L_0x00fd
        L_0x01d1:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "Objects of type "
            java.lang.String r2 = " can not be put into a PersistableBundle"
            java.lang.String r0 = N.e.y(r1, r0, r2)
            r12.<init>(r0)
            throw r12
        L_0x01e7:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unable to determine type of null values"
            r12.<init>(r0)
            throw r12
        L_0x01ef:
            android.app.job.JobInfo$Builder r0 = r6.setExtras(r0)
            P6.f.b(r0)
            r6 = 0
            r0.setOverrideDeadline(r6)
            android.app.job.JobInfo r0 = r0.build()
            r5.schedule(r0)
            goto L_0x0218
        L_0x0203:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtras(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<org.acra.sender.LegacySenderService> r5 = org.acra.sender.LegacySenderService.class
            r1.<init>(r12, r5)
            r0.setComponent(r1)
            r12.startService(r0)
        L_0x0218:
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a
            java.util.ArrayList r0 = r3.a(r2, r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = D6.k.M(r0)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x022b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0241
            java.lang.Object r3 = r0.next()
            org.acra.sender.ReportSenderFactory r3 = (org.acra.sender.ReportSenderFactory) r3
            B7.h r3 = r3.create(r12, r2)
            org.acra.ErrorReporter r4 = n7.C1247a.f13789a
            r1.add(r3)
            goto L_0x022b
        L_0x0241:
            boolean r12 = r1.isEmpty()
            if (r12 == 0) goto L_0x0248
            goto L_0x025c
        L_0x0248:
            java.util.Iterator r12 = r1.iterator()
        L_0x024c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x025c
            java.lang.Object r0 = r12.next()
            B7.h r0 = (B7.h) r0
            r0.getClass()
            goto L_0x024c
        L_0x025c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.i.h(java.io.File):void");
    }

    public int i(CaptureRequest captureRequest, F.i iVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f15852V).setRepeatingRequest(captureRequest, new C1465f(iVar, captureCallback), ((h) this.f15853W).f15850a);
    }

    public void k(CameraManager.AvailabilityCallback availabilityCallback) {
        q qVar;
        if (availabilityCallback != null) {
            i iVar = (i) this.f15853W;
            synchronized (((HashMap) iVar.f15852V)) {
                qVar = (q) ((HashMap) iVar.f15852V).remove(availabilityCallback);
            }
        } else {
            qVar = null;
        }
        if (qVar != null) {
            qVar.a();
        }
        ((CameraManager) this.f15852V).unregisterAvailabilityCallback(qVar);
    }

    public String toString() {
        switch (this.f15851U) {
            case 4:
                return "Bounds{lower=" + ((C1197c) this.f15852V) + " upper=" + ((C1197c) this.f15853W) + "}";
            default:
                return super.toString();
        }
    }

    public i(MyApplication myApplication, C1395d dVar) {
        this.f15851U = 8;
        this.f15852V = new e(myApplication, 13);
        ArrayList a8 = ((c) dVar.f14977t0).a(dVar, SenderSchedulerFactory.class);
        if (a8.isEmpty()) {
            this.f15853W = new i(myApplication, 7, dVar);
            return;
        }
        z7.a create = ((SenderSchedulerFactory) a8.get(0)).create(myApplication, dVar);
        this.f15853W = create;
        if (a8.size() > 1) {
            ErrorReporter errorReporter = C1247a.f13789a;
            n2.a.m1("More than one SenderScheduler found. Will use only ".concat(create.getClass().getSimpleName()));
        }
    }

    public i(CameraCaptureSession cameraCaptureSession, h hVar) {
        this.f15851U = 0;
        cameraCaptureSession.getClass();
        this.f15852V = cameraCaptureSession;
        this.f15853W = hVar;
    }

    public i(CameraDevice cameraDevice, h hVar) {
        this.f15851U = 1;
        cameraDevice.getClass();
        this.f15852V = cameraDevice;
        this.f15853W = hVar;
    }

    public i(Context context, i iVar) {
        this.f15851U = 3;
        this.f15852V = (CameraManager) context.getSystemService("camera");
        this.f15853W = iVar;
    }

    public i(String str) {
        this.f15851U = 5;
        this.f15852V = (ExtraSupportedOutputSizeQuirk) C1594a.f16229a.j(ExtraSupportedOutputSizeQuirk.class);
        this.f15853W = new G3.e(str, false);
    }

    public i(Handler handler) {
        this.f15851U = 2;
        this.f15852V = new HashMap();
        this.f15853W = handler;
    }
}
