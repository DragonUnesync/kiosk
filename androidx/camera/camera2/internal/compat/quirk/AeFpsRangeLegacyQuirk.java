package androidx.camera.camera2.internal.compat.quirk;

import D.C0061o0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import v.k;

public class AeFpsRangeLegacyQuirk implements C0061o0 {

    /* renamed from: a  reason: collision with root package name */
    public final Range f7611a;

    public AeFpsRangeLegacyQuirk(k kVar) {
        Range[] rangeArr = (Range[]) kVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range range = null;
        if (!(rangeArr == null || rangeArr.length == 0)) {
            for (Range range2 : rangeArr) {
                Range range3 = new Range(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (((Integer) range3.getUpper()).intValue() == 30 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
            }
        }
        this.f7611a = range;
    }
}
