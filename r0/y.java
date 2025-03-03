package R0;

import P0.z;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import j$.nio.channels.DesugarChannels;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

public final class y extends C0158c {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f4316Y;

    /* renamed from: Z  reason: collision with root package name */
    public l f4317Z;

    /* renamed from: a0  reason: collision with root package name */
    public AssetFileDescriptor f4318a0;

    /* renamed from: b0  reason: collision with root package name */
    public FileInputStream f4319b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f4320c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f4321d0;

    public y(Context context) {
        super(false);
        this.f4316Y = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public final void close() {
        this.f4317Z = null;
        try {
            FileInputStream fileInputStream = this.f4319b0;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f4319b0 = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f4318a0;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f4318a0 = null;
                if (this.f4321d0) {
                    this.f4321d0 = false;
                    e();
                }
            } catch (IOException e) {
                throw new i((String) null, e, 2000);
            } catch (Throwable th) {
                this.f4318a0 = null;
                if (this.f4321d0) {
                    this.f4321d0 = false;
                    e();
                }
                throw th;
            }
        } catch (IOException e8) {
            throw new i((String) null, e8, 2000);
        } catch (Throwable th2) {
            this.f4319b0 = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f4318a0;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f4318a0 = null;
                if (this.f4321d0) {
                    this.f4321d0 = false;
                    e();
                }
                throw th2;
            } catch (IOException e9) {
                throw new i((String) null, e9, 2000);
            } catch (Throwable th3) {
                this.f4318a0 = null;
                if (this.f4321d0) {
                    this.f4321d0 = false;
                    e();
                }
                throw th3;
            }
        }
    }

    public final long f(l lVar) {
        int i;
        Resources resources;
        long j7;
        String str;
        Resources resources2;
        int identifier;
        l lVar2 = lVar;
        this.f4317Z = lVar2;
        g();
        Uri normalizeScheme = lVar2.f4277a.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f4316Y;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                try {
                    i = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new i("Resource identifier must be an integer.", (Exception) null, 1004);
                }
            } else {
                throw new i("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), (Exception) null, 2000);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                str = context.getPackageName();
            } else {
                str = normalizeScheme.getHost();
            }
            if (str.equals(context.getPackageName())) {
                resources2 = context.getResources();
            } else {
                try {
                    resources2 = context.getPackageManager().getResourcesForApplication(str);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new i("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new i("Resource identifier must be an integer.", (Exception) null, 1004);
                }
            } else {
                identifier = resources2.getIdentifier(str + ":" + path, "raw", (String) null);
                if (identifier == 0) {
                    throw new i("Resource not found.", (Exception) null, 2005);
                }
            }
            i = identifier;
            resources = resources2;
        } else {
            throw new i("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", (Exception) null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd != null) {
                this.f4318a0 = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(this.f4318a0.getFileDescriptor());
                this.f4319b0 = fileInputStream;
                long j8 = lVar2.e;
                int i8 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i8 == 0 || j8 <= length) {
                    long startOffset = this.f4318a0.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j8) - startOffset;
                    if (skip == j8) {
                        if (i8 == 0) {
                            FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                            if (convertMaybeLegacyFileChannelFromLibrary.size() == 0) {
                                this.f4320c0 = -1;
                            } else {
                                long size = convertMaybeLegacyFileChannelFromLibrary.size() - convertMaybeLegacyFileChannelFromLibrary.position();
                                this.f4320c0 = size;
                                if (size < 0) {
                                    throw new i((String) null, (Exception) null, 2008);
                                }
                            }
                        } else {
                            long j9 = length - skip;
                            this.f4320c0 = j9;
                            if (j9 < 0) {
                                throw new i(2008);
                            }
                        }
                        long j10 = lVar2.f4281f;
                        int i9 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
                        if (i9 != 0) {
                            long j11 = this.f4320c0;
                            if (j11 == -1) {
                                j7 = j10;
                            } else {
                                j7 = Math.min(j11, j10);
                            }
                            this.f4320c0 = j7;
                        }
                        this.f4321d0 = true;
                        h(lVar);
                        if (i9 != 0) {
                            return j10;
                        }
                        return this.f4320c0;
                    }
                    throw new i((String) null, (Exception) null, 2008);
                }
                try {
                    throw new i((String) null, (Exception) null, 2008);
                } catch (x e8) {
                    throw e8;
                } catch (IOException e9) {
                    throw new i((String) null, e9, 2000);
                }
            } else {
                throw new i("Resource is compressed: " + normalizeScheme, (Exception) null, 2000);
            }
        } catch (Resources.NotFoundException e10) {
            throw new i((String) null, e10, 2005);
        }
    }

    public final Uri p() {
        l lVar = this.f4317Z;
        if (lVar != null) {
            return lVar.f4277a;
        }
        return null;
    }

    public final int x(byte[] bArr, int i, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f4320c0;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, (long) i8);
            } catch (IOException e) {
                throw new i((String) null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.f4319b0;
        int i9 = z.f3748a;
        int read = fileInputStream.read(bArr, i, i8);
        if (read != -1) {
            long j8 = this.f4320c0;
            if (j8 != -1) {
                this.f4320c0 = j8 - ((long) read);
            }
            b(read);
            return read;
        } else if (this.f4320c0 == -1) {
            return -1;
        } else {
            throw new i("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }
}
