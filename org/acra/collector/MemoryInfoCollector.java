package org.acra.collector;

import D7.e;
import P6.f;
import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.ReportField;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class MemoryInfoCollector extends BaseReportFieldCollector {
    public MemoryInfoCollector() {
        super(ReportField.DUMPSYS_MEMINFO, ReportField.TOTAL_MEM_SIZE, ReportField.AVAILABLE_MEM_SIZE);
    }

    private String collectMemInfo() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("dumpsys");
            arrayList.add("meminfo");
            arrayList.add(String.valueOf(Process.myPid()));
            InputStream inputStream = Runtime.getRuntime().exec((String[]) arrayList.toArray(new String[0])).getInputStream();
            f.d(inputStream, "getInputStream(...)");
            return new e(inputStream).a();
        } catch (IOException e) {
            ErrorReporter errorReporter = C1247a.f13789a;
            a.B("MemoryInfoCollector.meminfo could not retrieve data", e);
            return null;
        }
    }

    private long getAvailableInternalMemorySize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    private long getTotalInternalMemorySize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        int i = k.f14290a[reportField.ordinal()];
        if (i == 1) {
            aVar.h(ReportField.DUMPSYS_MEMINFO, collectMemInfo());
        } else if (i == 2) {
            aVar.g(ReportField.TOTAL_MEM_SIZE, getTotalInternalMemorySize());
        } else if (i == 3) {
            aVar.g(ReportField.AVAILABLE_MEM_SIZE, getAvailableInternalMemorySize());
        } else {
            throw new IllegalArgumentException();
        }
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    public boolean shouldCollect(Context context, C1395d dVar, ReportField reportField, C1347b bVar) {
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(reportField, "collect");
        f.e(bVar, "reportBuilder");
        if (!super.shouldCollect(context, dVar, reportField, bVar) || (bVar.f14677c instanceof OutOfMemoryError)) {
            return false;
        }
        return true;
    }
}
