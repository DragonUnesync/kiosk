package E0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.j;
import java.nio.ByteBuffer;
import z3.e;

public final class b extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f1298a;

    /* renamed from: b  reason: collision with root package name */
    public final e f1299b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i;
        e eVar = new e(20);
        this.f1298a = editText;
        this.f1299b = eVar;
        if (j.f7792k != null) {
            j a8 = j.a();
            if (a8.b() == 1 && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                androidx.emoji2.text.e eVar2 = a8.e;
                eVar2.getClass();
                Bundle bundle = editorInfo.extras;
                D0.b bVar = (D0.b) eVar2.f7784c.f449U;
                int a9 = bVar.a(4);
                if (a9 != 0) {
                    i = ((ByteBuffer) bVar.f980d).getInt(a9 + bVar.f977a);
                } else {
                    i = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
                Bundle bundle2 = editorInfo.extras;
                eVar2.f7782a.getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    public final boolean deleteSurroundingText(int i, int i8) {
        Editable editableText = this.f1298a.getEditableText();
        this.f1299b.getClass();
        if (e.m(this, editableText, i, i8, false) || super.deleteSurroundingText(i, i8)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i8) {
        Editable editableText = this.f1298a.getEditableText();
        this.f1299b.getClass();
        if (e.m(this, editableText, i, i8, true) || super.deleteSurroundingTextInCodePoints(i, i8)) {
            return true;
        }
        return false;
    }
}
