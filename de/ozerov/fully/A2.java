package de.ozerov.fully;

import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.os.Handler;
import android.util.Log;
import n2.a;

public final /* synthetic */ class A2 implements NfcAdapter.ReaderCallback {
    /* JADX WARNING: type inference failed for: r0v4, types: [de.ozerov.fully.B2, java.lang.Object] */
    public final void onTagDiscovered(Tag tag) {
        a.g(tag.getId());
        Ndef ndef = Ndef.get(tag);
        NdefMessage ndefMessage = null;
        if (ndef != null) {
            try {
                ndef.connect();
                ndefMessage = ndef.getNdefMessage();
            } catch (Exception e) {
                Log.w("P", "NFC failed to read NDEF message due to " + e.getClass().getSimpleName() + " message " + e.getMessage());
            }
        }
        P.u(tag, ndefMessage);
        if (P.f10234b >= 0 && a.z0()) {
            P.f10233a.ignore(tag, P.f10234b, new Object(), (Handler) null);
        }
    }
}
