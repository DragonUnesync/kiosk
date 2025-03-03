package de.ozerov.fully;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: de.ozerov.fully.r0  reason: case insensitive filesystem */
public final class C0764r0 extends SQLiteOpenHelper {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10909U;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0764r0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i8) {
        super(context, str, cursorFactory, i);
        this.f10909U = i8;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f10909U) {
            case 0:
                sQLiteDatabase.execSQL("CREATE TABLE fully_log (_id INTEGER PRIMARY KEY AUTOINCREMENT, time TEXT NOT NULL, type INTEGER, tag TEXT, message TEXT, version INTEGER);");
                return;
            default:
                sQLiteDatabase.execSQL("CREATE TABLE daily_stats (_id INTEGER PRIMARY KEY AUTOINCREMENT, date TEXT NOT NULL, pageViews INTEGER, pageErrors INTEGER, startUrlReloads INTEGER, screenOns INTEGER, screensaverStarts INTEGER, networkReconnects INTEGER, internetReconnects INTEGER, motionDetections INTEGER, appStarts INTEGER, appCrashes INTEGER, touches INTEGER, movementDetections INTEGER, playlistPlays INTEGER, itemPlays INTEGER);");
                return;
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i8) {
        switch (this.f10909U) {
            case 0:
                if (i8 > i && i < 2) {
                    sQLiteDatabase.execSQL("ALTER TABLE fully_log ADD COLUMN version INTEGER DEFAULT 1");
                    return;
                }
                return;
            default:
                if (i8 > i && i < 2) {
                    sQLiteDatabase.execSQL("ALTER TABLE daily_stats ADD COLUMN appCrashes INTEGER DEFAULT 0");
                    sQLiteDatabase.execSQL("ALTER TABLE daily_stats ADD COLUMN touches INTEGER DEFAULT 0");
                }
                if (i8 > i && i < 3) {
                    sQLiteDatabase.execSQL("ALTER TABLE daily_stats ADD COLUMN movementDetections INTEGER DEFAULT 0");
                }
                if (i8 > i && i < 4) {
                    sQLiteDatabase.execSQL("ALTER TABLE daily_stats ADD COLUMN playlistPlays INTEGER DEFAULT 0");
                    sQLiteDatabase.execSQL("ALTER TABLE daily_stats ADD COLUMN itemPlays INTEGER DEFAULT 0");
                    return;
                }
                return;
        }
    }
}
