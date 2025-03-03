package de.ozerov.fully;

import android.nfc.NfcAdapter;
import java.util.HashMap;
import n2.a;

public final class B2 implements NfcAdapter.OnTagRemovedListener {
    public final void onTagRemoved() {
        if (P.f10235c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("$serial", a.g(P.f10235c.getId()));
            U0.e("onNfcTagRemoved", hashMap);
            P.f10235c = null;
        }
    }
}
