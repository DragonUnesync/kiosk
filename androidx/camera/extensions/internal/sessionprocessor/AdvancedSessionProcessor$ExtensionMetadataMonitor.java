package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.lifecycle.z;
import j$.util.Objects;
import java.util.Map;

class AdvancedSessionProcessor$ExtensionMetadataMonitor {
    private final z mCurrentExtensionTypeLiveData;
    private final z mExtensionStrengthLiveData;

    public AdvancedSessionProcessor$ExtensionMetadataMonitor(z zVar, z zVar2) {
        this.mCurrentExtensionTypeLiveData = zVar;
        this.mExtensionStrengthLiveData = zVar2;
    }

    private int convertExtensionMode(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public void checkExtensionMetadata(Map<CaptureResult.Key, Object> map) {
        Object obj;
        Object obj2;
        if (Build.VERSION.SDK_INT >= 34) {
            if (!(this.mCurrentExtensionTypeLiveData == null || (obj2 = map.get(CaptureResult.EXTENSION_CURRENT_TYPE)) == null)) {
                Integer num = (Integer) obj2;
                if (!Objects.equals(this.mCurrentExtensionTypeLiveData.d(), Integer.valueOf(convertExtensionMode(num.intValue())))) {
                    this.mCurrentExtensionTypeLiveData.k(Integer.valueOf(convertExtensionMode(num.intValue())));
                }
            }
            if (this.mExtensionStrengthLiveData != null && (obj = map.get(CaptureResult.EXTENSION_STRENGTH)) != null && !Objects.equals(this.mExtensionStrengthLiveData.d(), obj)) {
                this.mExtensionStrengthLiveData.k((Integer) obj);
            }
        }
    }
}
