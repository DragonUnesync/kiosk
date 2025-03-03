package r7;

import P6.f;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15064a;

    public o() {
        this.f15064a = new ArrayList();
    }

    public final void a(Context context) {
        f.e(context, "context");
        File fileStreamPath = context.getFileStreamPath("ACRA-limiter.json");
        f.d(fileStreamPath, "getFileStreamPath(...)");
        String jSONArray = new JSONArray(this.f15064a).toString();
        f.d(jSONArray, "toString(...)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileStreamPath), "UTF-8");
        try {
            outputStreamWriter.write(jSONArray);
            outputStreamWriter.flush();
        } finally {
            try {
                outputStreamWriter.close();
            } catch (IOException unused) {
            }
        }
    }

    public o(String str) {
        this();
        if (str.length() > 0) {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                ArrayList arrayList = this.f15064a;
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                f.d(optJSONObject, "optJSONObject(...)");
                JSONArray names = optJSONObject.names();
                ArrayList arrayList2 = new ArrayList();
                if (names != null) {
                    int length2 = names.length();
                    for (int i8 = 0; i8 < length2; i8++) {
                        arrayList2.add(names.opt(i8).toString());
                    }
                }
                arrayList.add(new JSONObject(optJSONObject, (String[]) arrayList2.toArray(new String[0])));
            }
        }
    }
}
