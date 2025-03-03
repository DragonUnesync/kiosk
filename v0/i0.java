package v0;

import android.view.WindowInsets;

public abstract class i0 {
    public static int a(int i) {
        int b8;
        int i8 = 0;
        for (int i9 = 1; i9 <= 256; i9 <<= 1) {
            if ((i & i9) != 0) {
                if (i9 == 1) {
                    b8 = WindowInsets.Type.statusBars();
                } else if (i9 == 2) {
                    b8 = WindowInsets.Type.navigationBars();
                } else if (i9 == 4) {
                    b8 = WindowInsets.Type.captionBar();
                } else if (i9 == 8) {
                    b8 = WindowInsets.Type.ime();
                } else if (i9 == 16) {
                    b8 = WindowInsets.Type.systemGestures();
                } else if (i9 == 32) {
                    b8 = WindowInsets.Type.mandatorySystemGestures();
                } else if (i9 == 64) {
                    b8 = WindowInsets.Type.tappableElement();
                } else if (i9 == 128) {
                    b8 = WindowInsets.Type.displayCutout();
                }
                i8 |= b8;
            }
        }
        return i8;
    }
}
