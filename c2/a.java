package C2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

public final class a implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f542c = {"_data"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f543d = {"_data"};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f544a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f545b;

    public /* synthetic */ a(ContentResolver contentResolver, int i) {
        this.f544a = i;
        this.f545b = contentResolver;
    }

    public final Cursor a(Uri uri) {
        switch (this.f544a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f545b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f542c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f545b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f543d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, (String) null);
        }
    }
}
