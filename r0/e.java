package R0;

import P0.z;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import j$.nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class e extends C0158c {

    /* renamed from: Y  reason: collision with root package name */
    public final ContentResolver f4254Y;

    /* renamed from: Z  reason: collision with root package name */
    public Uri f4255Z;

    /* renamed from: a0  reason: collision with root package name */
    public AssetFileDescriptor f4256a0;

    /* renamed from: b0  reason: collision with root package name */
    public FileInputStream f4257b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f4258c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f4259d0;

    public e(Context context) {
        super(false);
        this.f4254Y = context.getContentResolver();
    }

    public final void close() {
        this.f4255Z = null;
        try {
            FileInputStream fileInputStream = this.f4257b0;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f4257b0 = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f4256a0;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f4256a0 = null;
                if (this.f4259d0) {
                    this.f4259d0 = false;
                    e();
                }
            } catch (IOException e) {
                throw new i(e, 2000);
            } catch (Throwable th) {
                this.f4256a0 = null;
                if (this.f4259d0) {
                    this.f4259d0 = false;
                    e();
                }
                throw th;
            }
        } catch (IOException e8) {
            throw new i(e8, 2000);
        } catch (Throwable th2) {
            this.f4257b0 = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f4256a0;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f4256a0 = null;
                if (this.f4259d0) {
                    this.f4259d0 = false;
                    e();
                }
                throw th2;
            } catch (IOException e9) {
                throw new i(e9, 2000);
            } catch (Throwable th3) {
                this.f4256a0 = null;
                if (this.f4259d0) {
                    this.f4259d0 = false;
                    e();
                }
                throw th3;
            }
        }
    }

    public final long f(l lVar) {
        AssetFileDescriptor assetFileDescriptor;
        long j7;
        l lVar2 = lVar;
        int i = 2000;
        try {
            Uri normalizeScheme = lVar2.f4277a.normalizeScheme();
            this.f4255Z = normalizeScheme;
            g();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f4254Y;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f4256a0 = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f4257b0 = fileInputStream;
                long j8 = lVar2.e;
                int i8 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i8 == 0 || j8 <= length) {
                    long startOffset = assetFileDescriptor.getStartOffset();
                    long j9 = length;
                    long skip = fileInputStream.skip(startOffset + j8) - startOffset;
                    if (skip == j8) {
                        if (i8 == 0) {
                            FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                            long size = convertMaybeLegacyFileChannelFromLibrary.size();
                            if (size == 0) {
                                this.f4258c0 = -1;
                            } else {
                                long position = size - convertMaybeLegacyFileChannelFromLibrary.position();
                                this.f4258c0 = position;
                                if (position < 0) {
                                    throw new i((Exception) null, 2008);
                                }
                            }
                        } else {
                            long j10 = j9 - skip;
                            this.f4258c0 = j10;
                            if (j10 < 0) {
                                throw new i((Exception) null, 2008);
                            }
                        }
                        long j11 = lVar2.f4281f;
                        int i9 = (j11 > -1 ? 1 : (j11 == -1 ? 0 : -1));
                        if (i9 != 0) {
                            long j12 = this.f4258c0;
                            if (j12 == -1) {
                                j7 = j11;
                            } else {
                                j7 = Math.min(j12, j11);
                            }
                            this.f4258c0 = j7;
                        }
                        this.f4259d0 = true;
                        h(lVar);
                        if (i9 != 0) {
                            return j11;
                        }
                        return this.f4258c0;
                    }
                    throw new i((Exception) null, 2008);
                }
                throw new i((Exception) null, 2008);
            }
            throw new i(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
        } catch (d e) {
            throw e;
        } catch (IOException e8) {
            if (e8 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new i(e8, i);
        }
    }

    public final Uri p() {
        return this.f4255Z;
    }

    public final int x(byte[] bArr, int i, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f4258c0;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, (long) i8);
            } catch (IOException e) {
                throw new i(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.f4257b0;
        int i9 = z.f3748a;
        int read = fileInputStream.read(bArr, i, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f4258c0;
        if (j8 != -1) {
            this.f4258c0 = j8 - ((long) read);
        }
        b(read);
        return read;
    }
}
