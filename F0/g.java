package F0;

import G5.s;
import android.content.res.AssetManager;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public final class g {

    /* renamed from: A  reason: collision with root package name */
    public static final byte[] f1438A = {87, 69, 66, 80};

    /* renamed from: B  reason: collision with root package name */
    public static final byte[] f1439B = {69, 88, 73, 70};

    /* renamed from: C  reason: collision with root package name */
    public static final String[] f1440C = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f1441D = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: E  reason: collision with root package name */
    public static final byte[] f1442E = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: F  reason: collision with root package name */
    public static final d f1443F;

    /* renamed from: G  reason: collision with root package name */
    public static final d[][] f1444G;

    /* renamed from: H  reason: collision with root package name */
    public static final d[] f1445H;

    /* renamed from: I  reason: collision with root package name */
    public static final HashMap[] f1446I = new HashMap[10];

    /* renamed from: J  reason: collision with root package name */
    public static final HashMap[] f1447J = new HashMap[10];

    /* renamed from: K  reason: collision with root package name */
    public static final HashSet f1448K = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: L  reason: collision with root package name */
    public static final HashMap f1449L = new HashMap();

    /* renamed from: M  reason: collision with root package name */
    public static final Charset f1450M;

    /* renamed from: N  reason: collision with root package name */
    public static final byte[] f1451N;

    /* renamed from: O  reason: collision with root package name */
    public static final byte[] f1452O;

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f1453m = Log.isLoggable("ExifInterface", 3);

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f1454n = {8, 8, 8};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f1455o = {8};

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f1456p = {-1, -40, -1};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f1457q = {102, 116, 121, 112};

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f1458r = {109, 105, 102, 49};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f1459s = {104, 101, 105, 99};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f1460t = {79, 76, 89, 77, 80, 0};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f1461u = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f1462v = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f1463w = {101, 88, 73, 102};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f1464x = {73, 72, 68, 82};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f1465y = {73, 69, 78, 68};
    public static final byte[] z = {82, 73, 70, 70};

    /* renamed from: a  reason: collision with root package name */
    public final String f1466a = null;

    /* renamed from: b  reason: collision with root package name */
    public final FileDescriptor f1467b;

    /* renamed from: c  reason: collision with root package name */
    public final AssetManager.AssetInputStream f1468c;

    /* renamed from: d  reason: collision with root package name */
    public int f1469d;
    public final HashMap[] e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f1470f;

    /* renamed from: g  reason: collision with root package name */
    public ByteOrder f1471g = ByteOrder.BIG_ENDIAN;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1472h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f1473j;

    /* renamed from: k  reason: collision with root package name */
    public int f1474k;

    /* renamed from: l  reason: collision with root package name */
    public int f1475l;

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        String str = "StripOffsets";
        String str2 = "SubIFDPointer";
        String str3 = "ExifIFDPointer";
        String str4 = "GPSInfoIFDPointer";
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = dVarArr;
        d[] dVarArr3 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr4 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr5 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr6 = dVarArr5;
        d[] dVarArr7 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(str, 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d(str2, 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d(str3, 34665, 4), new d(str4, 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f1443F = new d(str, 273, 3);
        f1444G = new d[][]{dVarArr2, dVarArr3, dVarArr4, dVarArr6, dVarArr7, dVarArr2, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f1445H = new d[]{new d(str2, 330, 4), new d(str3, 34665, 4), new d(str4, 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        Charset forName = Charset.forName("US-ASCII");
        f1450M = forName;
        f1451N = "Exif\u0000\u0000".getBytes(forName);
        f1452O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i8 = 0;
        while (true) {
            d[][] dVarArr8 = f1444G;
            if (i8 < dVarArr8.length) {
                f1446I[i8] = new HashMap();
                f1447J[i8] = new HashMap();
                for (d dVar : dVarArr8[i8]) {
                    f1446I[i8].put(Integer.valueOf(dVar.f1432a), dVar);
                    f1447J[i8].put(dVar.f1433b, dVar);
                }
                i8++;
            } else {
                HashMap hashMap = f1449L;
                d[] dVarArr9 = f1445H;
                hashMap.put(Integer.valueOf(dVarArr9[0].f1432a), 5);
                hashMap.put(Integer.valueOf(dVarArr9[1].f1432a), 1);
                hashMap.put(Integer.valueOf(dVarArr9[2].f1432a), 2);
                hashMap.put(Integer.valueOf(dVarArr9[3].f1432a), 3);
                hashMap.put(Integer.valueOf(dVarArr9[4].f1432a), 7);
                hashMap.put(Integer.valueOf(dVarArr9[5].f1432a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(java.io.InputStream r8) {
        /*
            r7 = this;
            r7.<init>()
            F0.d[][] r0 = f1444G
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r7.e = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r7.f1470f = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r7.f1471g = r0
            r0 = 0
            r7.f1466a = r0
            boolean r1 = r8 instanceof android.content.res.AssetManager.AssetInputStream
            if (r1 == 0) goto L_0x0025
            r1 = r8
            android.content.res.AssetManager$AssetInputStream r1 = (android.content.res.AssetManager.AssetInputStream) r1
            r7.f1468c = r1
            r7.f1467b = r0
            goto L_0x0050
        L_0x0025:
            boolean r1 = r8 instanceof java.io.FileInputStream
            if (r1 == 0) goto L_0x004c
            r1 = r8
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1
            java.io.FileDescriptor r2 = r1.getFD()
            int r3 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0040 }
            r4 = 0
            F0.h.c(r2, r4, r3)     // Catch:{ Exception -> 0x0040 }
            r7.f1468c = r0
            java.io.FileDescriptor r0 = r1.getFD()
            r7.f1467b = r0
            goto L_0x0050
        L_0x0040:
            boolean r1 = f1453m
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r1, r2)
        L_0x004c:
            r7.f1468c = r0
            r7.f1467b = r0
        L_0x0050:
            boolean r0 = f1453m
            r1 = 0
            r2 = 0
        L_0x0054:
            F0.d[][] r3 = f1444G     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            int r3 = r3.length     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            if (r2 >= r3) goto L_0x006e
            java.util.HashMap[] r3 = r7.e     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            r4.<init>()     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            r3[r2] = r4     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            int r2 = r2 + 1
            goto L_0x0054
        L_0x0065:
            r8 = move-exception
            goto L_0x00e7
        L_0x0068:
            r8 = move-exception
            goto L_0x00dd
        L_0x006b:
            r8 = move-exception
            goto L_0x00dd
        L_0x006e:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            int r8 = r7.g(r2)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            r7.f1469d = r8     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L_0x00b6
            if (r8 == r5) goto L_0x00b6
            if (r8 == r4) goto L_0x00b6
            if (r8 != r3) goto L_0x008b
            goto L_0x00b6
        L_0x008b:
            F0.f r8 = new F0.f     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            r8.<init>((java.io.InputStream) r2)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            int r1 = r7.f1469d     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            r2 = 12
            if (r1 != r2) goto L_0x009a
            r7.e(r8)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            goto L_0x00ac
        L_0x009a:
            r2 = 7
            if (r1 != r2) goto L_0x00a1
            r7.h(r8)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            goto L_0x00ac
        L_0x00a1:
            r2 = 10
            if (r1 != r2) goto L_0x00a9
            r7.l(r8)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            goto L_0x00ac
        L_0x00a9:
            r7.k(r8)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
        L_0x00ac:
            int r1 = r7.i     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            long r1 = (long) r1     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            r8.l(r1)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            r7.v(r8)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            goto L_0x00d4
        L_0x00b6:
            F0.b r8 = new F0.b     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            r8.<init>((java.io.InputStream) r2)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            int r2 = r7.f1469d     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            if (r2 != r6) goto L_0x00c3
            r7.f(r8, r1, r1)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            goto L_0x00d4
        L_0x00c3:
            if (r2 != r4) goto L_0x00c9
            r7.i(r8)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            goto L_0x00d4
        L_0x00c9:
            if (r2 != r5) goto L_0x00cf
            r7.j(r8)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
            goto L_0x00d4
        L_0x00cf:
            if (r2 != r3) goto L_0x00d4
            r7.m(r8)     // Catch:{ IOException -> 0x006b, UnsupportedOperationException -> 0x0068 }
        L_0x00d4:
            r7.a()
            if (r0 == 0) goto L_0x00f6
        L_0x00d9:
            r7.q()
            goto L_0x00f6
        L_0x00dd:
            if (r0 == 0) goto L_0x00f0
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch:{ all -> 0x0065 }
            goto L_0x00f0
        L_0x00e7:
            r7.a()
            if (r0 == 0) goto L_0x00ef
            r7.q()
        L_0x00ef:
            throw r8
        L_0x00f0:
            r7.a()
            if (r0 == 0) goto L_0x00f6
            goto L_0x00d9
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.g.<init>(java.io.InputStream):void");
    }

    public static ByteOrder r(b bVar) {
        short readShort = bVar.readShort();
        boolean z6 = f1453m;
        if (readShort == 18761) {
            if (z6) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (z6) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    public final void a() {
        String b8 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.e;
        if (b8 != null && b("DateTime") == null) {
            hashMapArr[0].put("DateTime", c.a(b8));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.b(0, this.f1471g));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.b(0, this.f1471g));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.b(0, this.f1471g));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.b(0, this.f1471g));
        }
    }

    public final String b(String str) {
        if (str != null) {
            c d8 = d(str);
            if (d8 != null) {
                if (!f1448K.contains(str)) {
                    return d8.g(this.f1471g);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i8 = d8.f1428a;
                    if (i8 == 5 || i8 == 10) {
                        e[] eVarArr = (e[]) d8.h(this.f1471g);
                        if (eVarArr == null || eVarArr.length != 3) {
                            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                            return null;
                        }
                        e eVar = eVarArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) eVar.f1436a) / ((float) eVar.f1437b)));
                        e eVar2 = eVarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.f1436a) / ((float) eVar2.f1437b)));
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.f1436a) / ((float) eVar3.f1437b)))});
                    }
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i8);
                    return null;
                }
                try {
                    return Double.toString(d8.e(this.f1471g));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final int c(int i8, String str) {
        c d8 = d(str);
        if (d8 == null) {
            return i8;
        }
        try {
            return d8.f(this.f1471g);
        } catch (NumberFormatException unused) {
            return i8;
        }
    }

    public final c d(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f1453m) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i8 = 0; i8 < f1444G.length; i8++) {
                c cVar = (c) this.e[i8].get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013b, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013f, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0134 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(F0.f r14) {
        /*
            r13 = this;
            java.lang.String r0 = "yes"
            java.lang.String r1 = "Heif meta: "
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L_0x0140
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            F0.a r3 = new F0.a     // Catch:{ RuntimeException -> 0x0134 }
            r3.<init>(r14)     // Catch:{ RuntimeException -> 0x0134 }
            F0.i.a(r2, r3)     // Catch:{ RuntimeException -> 0x0134 }
            r3 = 33
            java.lang.String r3 = r2.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x0134 }
            r4 = 34
            java.lang.String r4 = r2.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0134 }
            r5 = 26
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0134 }
            r6 = 17
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ RuntimeException -> 0x0134 }
            boolean r5 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0134 }
            if (r5 == 0) goto L_0x004b
            r0 = 29
            java.lang.String r0 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0134 }
            r5 = 30
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0134 }
            r6 = 31
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ RuntimeException -> 0x0134 }
            goto L_0x0067
        L_0x0048:
            r14 = move-exception
            goto L_0x013c
        L_0x004b:
            boolean r0 = r0.equals(r6)     // Catch:{ RuntimeException -> 0x0134 }
            if (r0 == 0) goto L_0x0064
            r0 = 18
            java.lang.String r0 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0134 }
            r5 = 19
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0134 }
            r6 = 24
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ RuntimeException -> 0x0134 }
            goto L_0x0067
        L_0x0064:
            r0 = 0
            r5 = r0
            r6 = r5
        L_0x0067:
            java.util.HashMap[] r7 = r13.e
            r8 = 0
            if (r0 == 0) goto L_0x007d
            r9 = r7[r8]     // Catch:{ RuntimeException -> 0x0134 }
            java.lang.String r10 = "ImageWidth"
            int r11 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x0134 }
            java.nio.ByteOrder r12 = r13.f1471g     // Catch:{ RuntimeException -> 0x0134 }
            F0.c r11 = F0.c.d(r11, r12)     // Catch:{ RuntimeException -> 0x0134 }
            r9.put(r10, r11)     // Catch:{ RuntimeException -> 0x0134 }
        L_0x007d:
            if (r5 == 0) goto L_0x0090
            r9 = r7[r8]     // Catch:{ RuntimeException -> 0x0134 }
            java.lang.String r10 = "ImageLength"
            int r11 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x0134 }
            java.nio.ByteOrder r12 = r13.f1471g     // Catch:{ RuntimeException -> 0x0134 }
            F0.c r11 = F0.c.d(r11, r12)     // Catch:{ RuntimeException -> 0x0134 }
            r9.put(r10, r11)     // Catch:{ RuntimeException -> 0x0134 }
        L_0x0090:
            r9 = 6
            if (r6 == 0) goto L_0x00b8
            int r10 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x0134 }
            r11 = 90
            if (r10 == r11) goto L_0x00aa
            r11 = 180(0xb4, float:2.52E-43)
            if (r10 == r11) goto L_0x00a8
            r11 = 270(0x10e, float:3.78E-43)
            if (r10 == r11) goto L_0x00a5
            r10 = 1
            goto L_0x00ab
        L_0x00a5:
            r10 = 8
            goto L_0x00ab
        L_0x00a8:
            r10 = 3
            goto L_0x00ab
        L_0x00aa:
            r10 = 6
        L_0x00ab:
            r7 = r7[r8]     // Catch:{ RuntimeException -> 0x0134 }
            java.lang.String r11 = "Orientation"
            java.nio.ByteOrder r12 = r13.f1471g     // Catch:{ RuntimeException -> 0x0134 }
            F0.c r10 = F0.c.d(r10, r12)     // Catch:{ RuntimeException -> 0x0134 }
            r7.put(r11, r10)     // Catch:{ RuntimeException -> 0x0134 }
        L_0x00b8:
            if (r3 == 0) goto L_0x010b
            if (r4 == 0) goto L_0x010b
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x0134 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x0134 }
            if (r4 <= r9) goto L_0x0103
            long r10 = (long) r3     // Catch:{ RuntimeException -> 0x0134 }
            r14.l(r10)     // Catch:{ RuntimeException -> 0x0134 }
            byte[] r7 = new byte[r9]     // Catch:{ RuntimeException -> 0x0134 }
            int r10 = r14.read(r7)     // Catch:{ RuntimeException -> 0x0134 }
            if (r10 != r9) goto L_0x00fb
            int r3 = r3 + r9
            int r4 = r4 + -6
            byte[] r9 = f1451N     // Catch:{ RuntimeException -> 0x0134 }
            boolean r7 = java.util.Arrays.equals(r7, r9)     // Catch:{ RuntimeException -> 0x0134 }
            if (r7 == 0) goto L_0x00f3
            byte[] r7 = new byte[r4]     // Catch:{ RuntimeException -> 0x0134 }
            int r14 = r14.read(r7)     // Catch:{ RuntimeException -> 0x0134 }
            if (r14 != r4) goto L_0x00eb
            r13.i = r3     // Catch:{ RuntimeException -> 0x0134 }
            r13.s(r8, r7)     // Catch:{ RuntimeException -> 0x0134 }
            goto L_0x010b
        L_0x00eb:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0134 }
            java.lang.String r0 = "Can't read exif"
            r14.<init>(r0)     // Catch:{ RuntimeException -> 0x0134 }
            throw r14     // Catch:{ RuntimeException -> 0x0134 }
        L_0x00f3:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0134 }
            java.lang.String r0 = "Invalid identifier"
            r14.<init>(r0)     // Catch:{ RuntimeException -> 0x0134 }
            throw r14     // Catch:{ RuntimeException -> 0x0134 }
        L_0x00fb:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0134 }
            java.lang.String r0 = "Can't read identifier"
            r14.<init>(r0)     // Catch:{ RuntimeException -> 0x0134 }
            throw r14     // Catch:{ RuntimeException -> 0x0134 }
        L_0x0103:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0134 }
            java.lang.String r0 = "Invalid exif length"
            r14.<init>(r0)     // Catch:{ RuntimeException -> 0x0134 }
            throw r14     // Catch:{ RuntimeException -> 0x0134 }
        L_0x010b:
            boolean r14 = f1453m     // Catch:{ RuntimeException -> 0x0134 }
            if (r14 == 0) goto L_0x0130
            java.lang.String r14 = "ExifInterface"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0134 }
            r3.<init>(r1)     // Catch:{ RuntimeException -> 0x0134 }
            r3.append(r0)     // Catch:{ RuntimeException -> 0x0134 }
            java.lang.String r0 = "x"
            r3.append(r0)     // Catch:{ RuntimeException -> 0x0134 }
            r3.append(r5)     // Catch:{ RuntimeException -> 0x0134 }
            java.lang.String r0 = ", rotation "
            r3.append(r0)     // Catch:{ RuntimeException -> 0x0134 }
            r3.append(r6)     // Catch:{ RuntimeException -> 0x0134 }
            java.lang.String r0 = r3.toString()     // Catch:{ RuntimeException -> 0x0134 }
            android.util.Log.d(r14, r0)     // Catch:{ RuntimeException -> 0x0134 }
        L_0x0130:
            r2.release()
            return
        L_0x0134:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r14.<init>(r0)     // Catch:{ all -> 0x0048 }
            throw r14     // Catch:{ all -> 0x0048 }
        L_0x013c:
            r2.release()
            throw r14
        L_0x0140:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.g.e(F0.f):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0180 A[LOOP:0: B:8:0x0033->B:73:0x0180, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0187 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(F0.b r23, int r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            java.lang.String r3 = "ExifInterface"
            boolean r4 = f1453m
            if (r4 == 0) goto L_0x001d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getJpegAttributes starting with: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L_0x001d:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f1425V = r5
            byte r5 = r23.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r5 != r7) goto L_0x01ca
            byte r8 = r23.readByte()
            r9 = -40
            if (r8 != r9) goto L_0x01b2
            r5 = 2
        L_0x0033:
            byte r6 = r23.readByte()
            if (r6 != r7) goto L_0x0198
            byte r6 = r23.readByte()
            if (r4 == 0) goto L_0x0056
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Found JPEG segment indicator: "
            r8.<init>(r9)
            r9 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r3, r8)
        L_0x0056:
            r8 = -39
            if (r6 == r8) goto L_0x0193
            r8 = -38
            if (r6 != r8) goto L_0x0060
            goto L_0x0193
        L_0x0060:
            int r8 = r23.readUnsignedShort()
            int r9 = r8 + -2
            r10 = 4
            int r5 = r5 + r10
            if (r4 == 0) goto L_0x008e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "JPEG segment: "
            r11.<init>(r12)
            r12 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r12 = " (length: "
            r11.append(r12)
            r11.append(r8)
            java.lang.String r12 = ")"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.d(r3, r11)
        L_0x008e:
            java.lang.String r11 = "Invalid length"
            if (r9 < 0) goto L_0x018d
            java.util.HashMap[] r12 = r0.e
            r13 = 0
            r14 = 1
            r15 = -31
            if (r6 == r15) goto L_0x010b
            r15 = -2
            if (r6 == r15) goto L_0x00e0
            switch(r6) {
                case -64: goto L_0x00ab;
                case -63: goto L_0x00ab;
                case -62: goto L_0x00ab;
                case -61: goto L_0x00ab;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            switch(r6) {
                case -59: goto L_0x00ab;
                case -58: goto L_0x00ab;
                case -57: goto L_0x00ab;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            switch(r6) {
                case -55: goto L_0x00ab;
                case -54: goto L_0x00ab;
                case -53: goto L_0x00ab;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            switch(r6) {
                case -51: goto L_0x00ab;
                case -50: goto L_0x00ab;
                case -49: goto L_0x00ab;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x017e
        L_0x00ab:
            r1.k(r14)
            r6 = r12[r2]
            if (r2 == r10) goto L_0x00b5
            java.lang.String r9 = "ImageLength"
            goto L_0x00b7
        L_0x00b5:
            java.lang.String r9 = "ThumbnailImageLength"
        L_0x00b7:
            int r13 = r23.readUnsignedShort()
            long r13 = (long) r13
            java.nio.ByteOrder r15 = r0.f1471g
            F0.c r13 = F0.c.b(r13, r15)
            r6.put(r9, r13)
            r6 = r12[r2]
            if (r2 == r10) goto L_0x00cc
            java.lang.String r9 = "ImageWidth"
            goto L_0x00ce
        L_0x00cc:
            java.lang.String r9 = "ThumbnailImageWidth"
        L_0x00ce:
            int r10 = r23.readUnsignedShort()
            long r12 = (long) r10
            java.nio.ByteOrder r10 = r0.f1471g
            F0.c r10 = F0.c.b(r12, r10)
            r6.put(r9, r10)
            int r9 = r8 + -7
            goto L_0x017e
        L_0x00e0:
            byte[] r6 = new byte[r9]
            int r8 = r1.read(r6)
            if (r8 != r9) goto L_0x0103
            java.lang.String r8 = "UserComment"
            java.lang.String r9 = r0.b(r8)
            if (r9 != 0) goto L_0x0100
            r9 = r12[r14]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r12 = f1450M
            r10.<init>(r6, r12)
            F0.c r6 = F0.c.a(r10)
            r9.put(r8, r6)
        L_0x0100:
            r9 = 0
            goto L_0x017e
        L_0x0103:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x010b:
            byte[] r6 = new byte[r9]
            r1.readFully(r6)
            int r8 = r5 + r9
            byte[] r10 = f1451N
            if (r10 != 0) goto L_0x0117
            goto L_0x0125
        L_0x0117:
            int r14 = r10.length
            if (r9 >= r14) goto L_0x011b
            goto L_0x0125
        L_0x011b:
            r14 = 0
        L_0x011c:
            int r15 = r10.length
            if (r14 >= r15) goto L_0x0166
            byte r15 = r6[r14]
            byte r7 = r10[r14]
            if (r15 == r7) goto L_0x0162
        L_0x0125:
            byte[] r7 = f1452O
            if (r7 != 0) goto L_0x012a
            goto L_0x017c
        L_0x012a:
            int r10 = r7.length
            if (r9 >= r10) goto L_0x012e
            goto L_0x017c
        L_0x012e:
            r10 = 0
        L_0x012f:
            int r14 = r7.length
            if (r10 >= r14) goto L_0x013c
            byte r14 = r6[r10]
            byte r15 = r7[r10]
            if (r14 == r15) goto L_0x0139
            goto L_0x017c
        L_0x0139:
            int r10 = r10 + 1
            goto L_0x012f
        L_0x013c:
            int r10 = r7.length
            int r5 = r5 + r10
            int r7 = r7.length
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r7, r9)
            java.lang.String r7 = "Xmp"
            java.lang.String r9 = r0.b(r7)
            if (r9 != 0) goto L_0x017c
            r9 = r12[r13]
            F0.c r10 = new F0.c
            int r12 = r6.length
            long r14 = (long) r5
            r20 = 1
            r16 = r10
            r17 = r14
            r19 = r6
            r21 = r12
            r16.<init>(r17, r19, r20, r21)
            r9.put(r7, r10)
            goto L_0x017c
        L_0x0162:
            int r14 = r14 + 1
            r7 = -1
            goto L_0x011c
        L_0x0166:
            int r7 = r10.length
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r7, r9)
            int r5 = r24 + r5
            int r7 = r10.length
            int r5 = r5 + r7
            r0.i = r5
            r0.s(r2, r6)
            F0.b r5 = new F0.b
            r5.<init>((byte[]) r6)
            r0.v(r5)
        L_0x017c:
            r5 = r8
            goto L_0x0100
        L_0x017e:
            if (r9 < 0) goto L_0x0187
            r1.k(r9)
            int r5 = r5 + r9
            r7 = -1
            goto L_0x0033
        L_0x0187:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r11)
            throw r1
        L_0x018d:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r11)
            throw r1
        L_0x0193:
            java.nio.ByteOrder r2 = r0.f1471g
            r1.f1425V = r2
            return
        L_0x0198:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid marker:"
            r2.<init>(r3)
            r3 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01b2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01ca:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.g.f(F0.b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00bf, code lost:
        if (r8 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0134 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b8 A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fe A[SYNTHETIC, Splitter:B:88:0x00fe] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(java.io.BufferedInputStream r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r18.reset()
            r4 = 0
            r0 = 0
        L_0x0013:
            byte[] r5 = f1456p
            int r6 = r5.length
            r7 = 4
            if (r0 >= r6) goto L_0x018a
            byte r6 = r3[r0]
            byte r5 = r5[r0]
            if (r6 == r5) goto L_0x0186
            java.lang.String r0 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()
            byte[] r0 = r0.getBytes(r5)
            r5 = 0
        L_0x002a:
            int r6 = r0.length
            if (r5 >= r6) goto L_0x0183
            byte r6 = r3[r5]
            byte r8 = r0[r5]
            if (r6 == r8) goto L_0x017f
            F0.b r8 = new F0.b     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r8.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            int r0 = r8.readInt()     // Catch:{ Exception -> 0x0066 }
            long r9 = (long) r0     // Catch:{ Exception -> 0x0066 }
            byte[] r0 = new byte[r7]     // Catch:{ Exception -> 0x0066 }
            r8.read(r0)     // Catch:{ Exception -> 0x0066 }
            byte[] r11 = f1457q     // Catch:{ Exception -> 0x0066 }
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch:{ Exception -> 0x0066 }
            if (r0 != 0) goto L_0x004f
        L_0x004a:
            r8.close()
            goto L_0x00c2
        L_0x004f:
            r11 = 8
            r13 = 1
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0068
            long r9 = r8.readLong()     // Catch:{ Exception -> 0x0066 }
            r15 = 16
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0069
            goto L_0x004a
        L_0x0062:
            r0 = move-exception
            r6 = r8
            goto L_0x0179
        L_0x0066:
            r0 = move-exception
            goto L_0x00b4
        L_0x0068:
            r15 = r11
        L_0x0069:
            long r5 = (long) r2     // Catch:{ Exception -> 0x0066 }
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x006f
            r9 = r5
        L_0x006f:
            long r9 = r9 - r15
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            goto L_0x004a
        L_0x0075:
            byte[] r0 = new byte[r7]     // Catch:{ Exception -> 0x0066 }
            r5 = 0
            r2 = 0
            r11 = 0
        L_0x007b:
            r15 = 4
            long r15 = r9 / r15
            int r12 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r12 >= 0) goto L_0x004a
            int r12 = r8.read(r0)     // Catch:{ Exception -> 0x0066 }
            if (r12 == r7) goto L_0x008a
            goto L_0x004a
        L_0x008a:
            int r12 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x008f
            goto L_0x00ac
        L_0x008f:
            byte[] r12 = f1458r     // Catch:{ Exception -> 0x0066 }
            boolean r12 = java.util.Arrays.equals(r0, r12)     // Catch:{ Exception -> 0x0066 }
            if (r12 == 0) goto L_0x0099
            r2 = 1
            goto L_0x00a2
        L_0x0099:
            byte[] r12 = f1459s     // Catch:{ Exception -> 0x0066 }
            boolean r12 = java.util.Arrays.equals(r0, r12)     // Catch:{ Exception -> 0x0066 }
            if (r12 == 0) goto L_0x00a2
            r11 = 1
        L_0x00a2:
            if (r2 == 0) goto L_0x00ac
            if (r11 == 0) goto L_0x00ac
            r8.close()
            r0 = 12
            return r0
        L_0x00ac:
            long r5 = r5 + r13
            goto L_0x007b
        L_0x00ae:
            r0 = move-exception
            r6 = 0
            goto L_0x0179
        L_0x00b2:
            r0 = move-exception
            r8 = 0
        L_0x00b4:
            boolean r2 = f1453m     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x00bf
            java.lang.String r2 = "ExifInterface"
            java.lang.String r5 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r5, r0)     // Catch:{ all -> 0x0062 }
        L_0x00bf:
            if (r8 == 0) goto L_0x00c2
            goto L_0x004a
        L_0x00c2:
            F0.b r2 = new F0.b     // Catch:{ Exception -> 0x00eb, all -> 0x00e8 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00eb, all -> 0x00e8 }
            java.nio.ByteOrder r0 = r(r2)     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            r1.f1471g = r0     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            r2.f1425V = r0     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
            r5 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r5) goto L_0x00de
            r5 = 21330(0x5352, float:2.989E-41)
            if (r0 != r5) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r0 = 0
            goto L_0x00df
        L_0x00de:
            r0 = 1
        L_0x00df:
            r2.close()
            goto L_0x00fa
        L_0x00e3:
            r0 = move-exception
            r6 = r2
            goto L_0x00ee
        L_0x00e6:
            goto L_0x00f4
        L_0x00e8:
            r0 = move-exception
            r6 = 0
            goto L_0x00ee
        L_0x00eb:
            r2 = 0
            goto L_0x00f4
        L_0x00ee:
            if (r6 == 0) goto L_0x00f3
            r6.close()
        L_0x00f3:
            throw r0
        L_0x00f4:
            if (r2 == 0) goto L_0x00f9
            r2.close()
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            if (r0 == 0) goto L_0x00fe
            r0 = 7
            return r0
        L_0x00fe:
            F0.b r2 = new F0.b     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.nio.ByteOrder r0 = r(r2)     // Catch:{ Exception -> 0x011d, all -> 0x011a }
            r1.f1471g = r0     // Catch:{ Exception -> 0x011d, all -> 0x011a }
            r2.f1425V = r0     // Catch:{ Exception -> 0x011d, all -> 0x011a }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x011d, all -> 0x011a }
            r5 = 85
            if (r0 != r5) goto L_0x0115
            r0 = 1
            goto L_0x0116
        L_0x0115:
            r0 = 0
        L_0x0116:
            r2.close()
            goto L_0x0132
        L_0x011a:
            r0 = move-exception
            r6 = r2
            goto L_0x0126
        L_0x011d:
            r6 = r2
            goto L_0x012c
        L_0x0120:
            r0 = move-exception
            r6 = 0
            goto L_0x0126
        L_0x0123:
            r6 = 0
            goto L_0x012c
        L_0x0126:
            if (r6 == 0) goto L_0x012b
            r6.close()
        L_0x012b:
            throw r0
        L_0x012c:
            if (r6 == 0) goto L_0x0131
            r6.close()
        L_0x0131:
            r0 = 0
        L_0x0132:
            if (r0 == 0) goto L_0x0137
            r0 = 10
            return r0
        L_0x0137:
            r0 = 0
        L_0x0138:
            byte[] r2 = f1462v
            int r5 = r2.length
            if (r0 >= r5) goto L_0x0148
            byte r5 = r3[r0]
            byte r2 = r2[r0]
            if (r5 == r2) goto L_0x0145
            r0 = 0
            goto L_0x0149
        L_0x0145:
            int r0 = r0 + 1
            goto L_0x0138
        L_0x0148:
            r0 = 1
        L_0x0149:
            if (r0 == 0) goto L_0x014e
            r0 = 13
            return r0
        L_0x014e:
            r0 = 0
        L_0x014f:
            byte[] r2 = z
            int r5 = r2.length
            if (r0 >= r5) goto L_0x015f
            byte r5 = r3[r0]
            byte r2 = r2[r0]
            if (r5 == r2) goto L_0x015c
        L_0x015a:
            r5 = 0
            goto L_0x0173
        L_0x015c:
            int r0 = r0 + 1
            goto L_0x014f
        L_0x015f:
            r0 = 0
        L_0x0160:
            byte[] r5 = f1438A
            int r6 = r5.length
            if (r0 >= r6) goto L_0x0172
            int r6 = r2.length
            int r6 = r6 + r0
            int r6 = r6 + r7
            byte r6 = r3[r6]
            byte r5 = r5[r0]
            if (r6 == r5) goto L_0x016f
            goto L_0x015a
        L_0x016f:
            int r0 = r0 + 1
            goto L_0x0160
        L_0x0172:
            r5 = 1
        L_0x0173:
            if (r5 == 0) goto L_0x0178
            r0 = 14
            return r0
        L_0x0178:
            return r4
        L_0x0179:
            if (r6 == 0) goto L_0x017e
            r6.close()
        L_0x017e:
            throw r0
        L_0x017f:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x0183:
            r0 = 9
            return r0
        L_0x0186:
            int r0 = r0 + 1
            goto L_0x0013
        L_0x018a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.g.g(java.io.BufferedInputStream):int");
    }

    public final void h(f fVar) {
        int i8;
        int i9;
        k(fVar);
        HashMap[] hashMapArr = this.e;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f1431d);
            fVar2.f1425V = this.f1471g;
            byte[] bArr = f1460t;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.l(0);
            byte[] bArr3 = f1461u;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.l(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.l(12);
            }
            t(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.h(this.f1471g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i10 = iArr[2];
                int i11 = iArr[0];
                if (i10 > i11 && (i8 = iArr[3]) > (i9 = iArr[1])) {
                    int i12 = (i10 - i11) + 1;
                    int i13 = (i8 - i9) + 1;
                    if (i12 < i13) {
                        int i14 = i12 + i13;
                        i13 = i14 - i13;
                        i12 = i14 - i13;
                    }
                    c d8 = c.d(i12, this.f1471g);
                    c d9 = c.d(i13, this.f1471g);
                    hashMapArr[0].put("ImageWidth", d8);
                    hashMapArr[0].put("ImageLength", d9);
                }
            }
        }
    }

    public final void i(b bVar) {
        if (f1453m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f1425V = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f1462v;
        bVar.k(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i8 = length + 8;
                    if (i8 == 16) {
                        if (!Arrays.equals(bArr2, f1464x)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f1465y)) {
                        if (Arrays.equals(bArr2, f1463w)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.i = i8;
                                    s(0, bArr3);
                                    y();
                                    v(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + s.b(bArr2));
                        }
                        int i9 = readInt + 4;
                        bVar.k(i9);
                        length = i8 + i9;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(b bVar) {
        boolean z6 = f1453m;
        if (z6) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.k(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i8 = ByteBuffer.wrap(bArr).getInt();
        int i9 = ByteBuffer.wrap(bArr2).getInt();
        int i10 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i9];
        bVar.k(i8 - bVar.f1426W);
        bVar.read(bArr4);
        f(new b(bArr4), i8, 5);
        bVar.k(i10 - bVar.f1426W);
        bVar.f1425V = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z6) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i11 = 0; i11 < readInt; i11++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f1443F.f1432a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d8 = c.d(readShort, this.f1471g);
                c d9 = c.d(readShort2, this.f1471g);
                HashMap[] hashMapArr = this.e;
                hashMapArr[0].put("ImageLength", d8);
                hashMapArr[0].put("ImageWidth", d9);
                if (z6) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.k(readUnsignedShort2);
        }
    }

    public final void k(f fVar) {
        p(fVar);
        t(fVar, 0);
        x(fVar, 0);
        x(fVar, 5);
        x(fVar, 4);
        y();
        if (this.f1469d == 8) {
            HashMap[] hashMapArr = this.e;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f1431d);
                fVar2.f1425V = this.f1471g;
                fVar2.k(6);
                t(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void l(f fVar) {
        if (f1453m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        HashMap[] hashMapArr = this.e;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f1431d), (int) cVar.f1430c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void m(b bVar) {
        if (f1453m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f1425V = ByteOrder.LITTLE_ENDIAN;
        bVar.k(z.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f1438A;
        bVar.k(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i8 = length + 8;
                    if (Arrays.equals(f1439B, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.i = i8;
                            s(0, bArr3);
                            v(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + s.b(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i8 + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.k(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void n(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f8 = cVar.f(this.f1471g);
            int f9 = cVar2.f(this.f1471g);
            if (this.f1469d == 7) {
                f8 += this.f1473j;
            }
            if (f8 > 0 && f9 > 0 && this.f1466a == null && this.f1468c == null && this.f1467b == null) {
                bVar.skip((long) f8);
                bVar.read(new byte[f9]);
            }
            if (f1453m) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f8 + ", length: " + f9);
            }
        }
    }

    public final boolean o(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        int f8 = cVar.f(this.f1471g);
        int f9 = cVar2.f(this.f1471g);
        if (f8 > 512 || f9 > 512) {
            return false;
        }
        return true;
    }

    public final void p(f fVar) {
        ByteOrder r8 = r(fVar);
        this.f1471g = r8;
        fVar.f1425V = r8;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i8 = this.f1469d;
        if (i8 == 7 || i8 == 10 || readUnsignedShort == 42) {
            int readInt = fVar.readInt();
            if (readInt >= 8) {
                int i9 = readInt - 8;
                if (i9 > 0) {
                    fVar.k(i9);
                    return;
                }
                return;
            }
            throw new IOException(Q0.g.m(readInt, "Invalid first Ifd offset: "));
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void q() {
        int i8 = 0;
        while (true) {
            HashMap[] hashMapArr = this.e;
            if (i8 < hashMapArr.length) {
                StringBuilder p3 = Q0.g.p(i8, "The size of tag group[", "]: ");
                p3.append(hashMapArr[i8].size());
                Log.d("ExifInterface", p3.toString());
                for (Map.Entry entry : hashMapArr[i8].entrySet()) {
                    c cVar = (c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.g(this.f1471g) + "'");
                }
                i8++;
            } else {
                return;
            }
        }
    }

    public final void s(int i8, byte[] bArr) {
        f fVar = new f(bArr);
        p(fVar);
        t(fVar, i8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(F0.f r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            int r9 = r1.f1426W
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.util.HashSet r10 = r0.f1470f
            r10.add(r9)
            short r9 = r29.readShort()
            java.lang.String r11 = "ExifInterface"
            boolean r12 = f1453m
            if (r12 == 0) goto L_0x002c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "numberOfDirectoryEntry: "
            r13.<init>(r14)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            android.util.Log.d(r11, r13)
        L_0x002c:
            if (r9 > 0) goto L_0x002f
            return
        L_0x002f:
            r13 = 0
        L_0x0030:
            java.util.HashMap[] r14 = r0.e
            if (r13 >= r9) goto L_0x032f
            int r15 = r29.readUnsignedShort()
            int r6 = r29.readUnsignedShort()
            int r3 = r29.readInt()
            int r4 = r1.f1426W
            r22 = r9
            long r8 = (long) r4
            r16 = 4
            long r8 = r8 + r16
            java.util.HashMap[] r4 = f1446I
            r4 = r4[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            java.lang.Object r4 = r4.get(r7)
            F0.d r4 = (F0.d) r4
            if (r12 == 0) goto L_0x008f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r30)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r15)
            if (r4 == 0) goto L_0x0066
            java.lang.String r5 = r4.f1433b
            goto L_0x0067
        L_0x0066:
            r5 = 0
        L_0x0067:
            java.lang.Integer r19 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r3)
            r24 = r10
            r23 = r13
            r13 = 5
            java.lang.Object[] r10 = new java.lang.Object[r13]
            r13 = 0
            r10[r13] = r7
            r7 = 1
            r10[r7] = r18
            r7 = 2
            r10[r7] = r5
            r5 = 3
            r10[r5] = r19
            r5 = 4
            r10[r5] = r20
            java.lang.String r5 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r5 = java.lang.String.format(r5, r10)
            android.util.Log.d(r11, r5)
            goto L_0x0093
        L_0x008f:
            r24 = r10
            r23 = r13
        L_0x0093:
            r10 = 7
            if (r4 != 0) goto L_0x00ac
            if (r12 == 0) goto L_0x00a9
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r13.<init>(r7)
            r13.append(r15)
            java.lang.String r7 = r13.toString()
            android.util.Log.d(r11, r7)
        L_0x00a9:
            r5 = r14
            goto L_0x014b
        L_0x00ac:
            if (r6 <= 0) goto L_0x00b3
            int[] r7 = f1441D
            int r13 = r7.length
            if (r6 < r13) goto L_0x00b6
        L_0x00b3:
            r5 = r14
            goto L_0x0138
        L_0x00b6:
            int r13 = r4.f1434c
            if (r13 == r10) goto L_0x00d0
            if (r6 != r10) goto L_0x00bd
            goto L_0x00d0
        L_0x00bd:
            if (r13 == r6) goto L_0x00d0
            int r10 = r4.f1435d
            if (r10 != r6) goto L_0x00c4
            goto L_0x00d0
        L_0x00c4:
            r5 = 4
            if (r13 == r5) goto L_0x00c9
            if (r10 != r5) goto L_0x00cb
        L_0x00c9:
            r5 = 3
            goto L_0x00ce
        L_0x00cb:
            r5 = 9
            goto L_0x00d2
        L_0x00ce:
            if (r6 != r5) goto L_0x00cb
        L_0x00d0:
            r5 = 7
            goto L_0x0108
        L_0x00d2:
            if (r13 == r5) goto L_0x00d6
            if (r10 != r5) goto L_0x00db
        L_0x00d6:
            r5 = 8
            if (r6 != r5) goto L_0x00db
            goto L_0x00d0
        L_0x00db:
            r5 = 12
            if (r13 == r5) goto L_0x00e1
            if (r10 != r5) goto L_0x00e6
        L_0x00e1:
            r5 = 11
            if (r6 != r5) goto L_0x00e6
            goto L_0x00d0
        L_0x00e6:
            if (r12 == 0) goto L_0x00a9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Skip the tag entry since data format ("
            r5.<init>(r7)
            java.lang.String[] r7 = f1440C
            r7 = r7[r6]
            r5.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r5.append(r7)
            java.lang.String r7 = r4.f1433b
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r11, r5)
            goto L_0x00a9
        L_0x0108:
            if (r6 != r5) goto L_0x010b
            r6 = r13
        L_0x010b:
            r5 = r14
            long r13 = (long) r3
            r7 = r7[r6]
            r10 = r6
            long r6 = (long) r7
            long r6 = r6 * r13
            r13 = 0
            int r20 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r20 < 0) goto L_0x0123
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r20 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r20 <= 0) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r13 = 1
            goto L_0x014f
        L_0x0123:
            if (r12 == 0) goto L_0x0136
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Skip the tag entry since the number of components is invalid: "
            r13.<init>(r14)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            android.util.Log.d(r11, r13)
        L_0x0136:
            r13 = 0
            goto L_0x014f
        L_0x0138:
            if (r12 == 0) goto L_0x014b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "Skip the tag entry since data format is invalid: "
            r7.<init>(r10)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r11, r7)
        L_0x014b:
            r10 = r6
            r6 = 0
            goto L_0x0136
        L_0x014f:
            if (r13 != 0) goto L_0x015a
            r1.l(r8)
            r14 = r24
        L_0x0156:
            r2 = 1
            r6 = 3
            goto L_0x0325
        L_0x015a:
            java.lang.String r13 = "Compression"
            int r14 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x01d7
            int r14 = r29.readInt()
            r25 = r8
            if (r12 == 0) goto L_0x0179
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "seek to data offset: "
            r8.<init>(r9)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r11, r8)
        L_0x0179:
            int r8 = r0.f1469d
            r9 = 7
            if (r8 != r9) goto L_0x018a
            java.lang.String r8 = r4.f1433b
            java.lang.String r9 = "MakerNote"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x018f
            r0.f1473j = r14
        L_0x018a:
            r21 = r3
            r27 = r4
            goto L_0x01d2
        L_0x018f:
            r8 = 6
            if (r2 != r8) goto L_0x018a
            java.lang.String r9 = r4.f1433b
            java.lang.String r8 = "ThumbnailImage"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x018a
            r0.f1474k = r14
            r0.f1475l = r3
            java.nio.ByteOrder r8 = r0.f1471g
            r9 = 6
            F0.c r8 = F0.c.d(r9, r8)
            int r9 = r0.f1474k
            r21 = r3
            long r2 = (long) r9
            java.nio.ByteOrder r9 = r0.f1471g
            F0.c r2 = F0.c.b(r2, r9)
            int r3 = r0.f1475l
            r9 = r4
            long r3 = (long) r3
            r27 = r9
            java.nio.ByteOrder r9 = r0.f1471g
            F0.c r3 = F0.c.b(r3, r9)
            r4 = 4
            r9 = r5[r4]
            r9.put(r13, r8)
            r8 = r5[r4]
            java.lang.String r9 = "JPEGInterchangeFormat"
            r8.put(r9, r2)
            r2 = r5[r4]
            java.lang.String r4 = "JPEGInterchangeFormatLength"
            r2.put(r4, r3)
        L_0x01d2:
            long r2 = (long) r14
            r1.l(r2)
            goto L_0x01dd
        L_0x01d7:
            r21 = r3
            r27 = r4
            r25 = r8
        L_0x01dd:
            java.util.HashMap r2 = f1449L
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r12 == 0) goto L_0x0204
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "nextIfdType: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r4 = " byteCount: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r11, r3)
        L_0x0204:
            if (r2 == 0) goto L_0x02b2
            r3 = 3
            if (r10 == r3) goto L_0x0232
            r3 = 4
            if (r10 == r3) goto L_0x0226
            r3 = 8
            if (r10 == r3) goto L_0x0221
            r3 = 9
            if (r10 == r3) goto L_0x021b
            r3 = 13
            if (r10 == r3) goto L_0x021b
            r3 = -1
            goto L_0x0237
        L_0x021b:
            int r3 = r29.readInt()
        L_0x021f:
            long r3 = (long) r3
            goto L_0x0237
        L_0x0221:
            short r3 = r29.readShort()
            goto L_0x021f
        L_0x0226:
            int r3 = r29.readInt()
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            goto L_0x0237
        L_0x0232:
            int r3 = r29.readUnsignedShort()
            goto L_0x021f
        L_0x0237:
            if (r12 == 0) goto L_0x0256
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r8 = r27
            java.lang.String r6 = r8.f1433b
            r9 = 2
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r8 = 0
            r7[r8] = r5
            r5 = 1
            r7[r5] = r6
            java.lang.String r5 = "Offset: %d, tagName: %s"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            android.util.Log.d(r11, r5)
        L_0x0253:
            r5 = 0
            goto L_0x0258
        L_0x0256:
            r9 = 2
            goto L_0x0253
        L_0x0258:
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0297
            int r5 = (int) r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r14 = r24
            boolean r5 = r14.contains(r5)
            if (r5 != 0) goto L_0x0276
            r1.l(r3)
            int r2 = r2.intValue()
            r0.t(r1, r2)
        L_0x0273:
            r2 = r25
            goto L_0x02ad
        L_0x0276:
            if (r12 == 0) goto L_0x0273
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Skip jump into the IFD since it has already been read: IfdType "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " (at "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = ")"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.d(r11, r2)
            goto L_0x0273
        L_0x0297:
            r14 = r24
            if (r12 == 0) goto L_0x0273
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Skip jump into the IFD since its offset is invalid: "
            r2.<init>(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r11, r2)
            goto L_0x0273
        L_0x02ad:
            r1.l(r2)
            goto L_0x0156
        L_0x02b2:
            r14 = r24
            r2 = r25
            r8 = r27
            r9 = 2
            int r4 = r1.f1426W
            int r15 = r0.i
            int r4 = r4 + r15
            int r7 = (int) r6
            byte[] r6 = new byte[r7]
            r1.readFully(r6)
            F0.c r7 = new F0.c
            r15 = r10
            long r9 = (long) r4
            r16 = r7
            r17 = r9
            r19 = r6
            r20 = r15
            r16.<init>(r17, r19, r20, r21)
            r4 = r5[r30]
            java.lang.String r5 = r8.f1433b
            r4.put(r5, r7)
            java.lang.String r4 = r8.f1433b
            java.lang.String r5 = "DNGVersion"
            boolean r5 = r5.equals(r4)
            r6 = 3
            if (r5 == 0) goto L_0x02e7
            r0.f1469d = r6
        L_0x02e7:
            java.lang.String r5 = "Make"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x02f7
            java.lang.String r5 = "Model"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0305
        L_0x02f7:
            java.nio.ByteOrder r5 = r0.f1471g
            java.lang.String r5 = r7.g(r5)
            java.lang.String r8 = "PENTAX"
            boolean r5 = r5.contains(r8)
            if (r5 != 0) goto L_0x0316
        L_0x0305:
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x031a
            java.nio.ByteOrder r4 = r0.f1471g
            int r4 = r7.f(r4)
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r4 != r5) goto L_0x031a
        L_0x0316:
            r4 = 8
            r0.f1469d = r4
        L_0x031a:
            int r4 = r1.f1426W
            long r4 = (long) r4
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x0324
            r1.l(r2)
        L_0x0324:
            r2 = 1
        L_0x0325:
            int r13 = r23 + 1
            short r13 = (short) r13
            r2 = r30
            r10 = r14
            r9 = r22
            goto L_0x0030
        L_0x032f:
            r5 = r14
            r2 = 1
            r14 = r10
            int r3 = r29.readInt()
            if (r12 == 0) goto L_0x034a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r6 = 0
            r2[r6] = r4
            java.lang.String r4 = "nextIfdOffset: %d"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            android.util.Log.d(r11, r2)
        L_0x034a:
            long r6 = (long) r3
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x038c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r14.contains(r2)
            if (r2 != 0) goto L_0x0378
            r1.l(r6)
            r2 = 4
            r3 = r5[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x036b
            r0.t(r1, r2)
            goto L_0x039f
        L_0x036b:
            r2 = 5
            r3 = r5[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x039f
            r0.t(r1, r2)
            goto L_0x039f
        L_0x0378:
            if (r12 == 0) goto L_0x039f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r11, r1)
            goto L_0x039f
        L_0x038c:
            if (r12 == 0) goto L_0x039f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r11, r1)
        L_0x039f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.g.t(F0.f, int):void");
    }

    public final void u(int i8, String str, String str2) {
        HashMap[] hashMapArr = this.e;
        if (!hashMapArr[i8].isEmpty() && hashMapArr[i8].get(str) != null) {
            HashMap hashMap = hashMapArr[i8];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i8].remove(str);
        }
    }

    public final void v(b bVar) {
        c cVar;
        int f8;
        b bVar2 = bVar;
        HashMap hashMap = this.e[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 != null) {
            int f9 = cVar2.f(this.f1471g);
            int i8 = 1;
            if (f9 != 1) {
                if (f9 == 6) {
                    n(bVar2, hashMap);
                    return;
                } else if (f9 != 7) {
                    return;
                }
            }
            c cVar3 = (c) hashMap.get("BitsPerSample");
            if (cVar3 != null) {
                int[] iArr = (int[]) cVar3.h(this.f1471g);
                int[] iArr2 = f1454n;
                if (Arrays.equals(iArr2, iArr) || (this.f1469d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((f8 = cVar.f(this.f1471g)) == 1 && Arrays.equals(iArr, f1455o)) || (f8 == 6 && Arrays.equals(iArr, iArr2))))) {
                    c cVar4 = (c) hashMap.get("StripOffsets");
                    c cVar5 = (c) hashMap.get("StripByteCounts");
                    if (cVar4 != null && cVar5 != null) {
                        long[] f10 = s.f(cVar4.h(this.f1471g));
                        long[] f11 = s.f(cVar5.h(this.f1471g));
                        if (f10 == null || f10.length == 0) {
                            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                            return;
                        } else if (f11 == null || f11.length == 0) {
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        } else if (f10.length != f11.length) {
                            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                            return;
                        } else {
                            long j7 = 0;
                            for (long j8 : f11) {
                                j7 += j8;
                            }
                            byte[] bArr = new byte[((int) j7)];
                            this.f1472h = true;
                            int i9 = 0;
                            int i10 = 0;
                            int i11 = 0;
                            while (i9 < f10.length) {
                                int i12 = (int) f10[i9];
                                int i13 = (int) f11[i9];
                                if (i9 < f10.length - i8 && ((long) (i12 + i13)) != f10[i9 + 1]) {
                                    this.f1472h = false;
                                }
                                int i14 = i12 - i10;
                                if (i14 < 0) {
                                    Log.d("ExifInterface", "Invalid strip offset value");
                                    return;
                                }
                                long j9 = (long) i14;
                                if (bVar2.skip(j9) != j9) {
                                    Log.d("ExifInterface", "Failed to skip " + i14 + " bytes.");
                                    return;
                                }
                                int i15 = i10 + i14;
                                byte[] bArr2 = new byte[i13];
                                if (bVar2.read(bArr2) != i13) {
                                    Log.d("ExifInterface", "Failed to read " + i13 + " bytes.");
                                    return;
                                }
                                i10 = i15 + i13;
                                System.arraycopy(bArr2, 0, bArr, i11, i13);
                                i11 += i13;
                                i9++;
                                i8 = 1;
                            }
                            if (this.f1472h) {
                                long j10 = f10[0];
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (f1453m) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        n(bVar2, hashMap);
    }

    public final void w(int i8, int i9) {
        HashMap[] hashMapArr = this.e;
        boolean isEmpty = hashMapArr[i8].isEmpty();
        boolean z6 = f1453m;
        if (!isEmpty && !hashMapArr[i9].isEmpty()) {
            c cVar = (c) hashMapArr[i8].get("ImageLength");
            c cVar2 = (c) hashMapArr[i8].get("ImageWidth");
            c cVar3 = (c) hashMapArr[i9].get("ImageLength");
            c cVar4 = (c) hashMapArr[i9].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (z6) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int f8 = cVar.f(this.f1471g);
                int f9 = cVar2.f(this.f1471g);
                int f10 = cVar3.f(this.f1471g);
                int f11 = cVar4.f(this.f1471g);
                if (f8 < f10 && f9 < f11) {
                    HashMap hashMap = hashMapArr[i8];
                    hashMapArr[i8] = hashMapArr[i9];
                    hashMapArr[i9] = hashMap;
                }
            } else if (z6) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (z6) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void x(f fVar, int i8) {
        c cVar;
        c cVar2;
        HashMap[] hashMapArr = this.e;
        c cVar3 = (c) hashMapArr[i8].get("DefaultCropSize");
        c cVar4 = (c) hashMapArr[i8].get("SensorTopBorder");
        c cVar5 = (c) hashMapArr[i8].get("SensorLeftBorder");
        c cVar6 = (c) hashMapArr[i8].get("SensorBottomBorder");
        c cVar7 = (c) hashMapArr[i8].get("SensorRightBorder");
        if (cVar3 != null) {
            if (cVar3.f1428a == 5) {
                e[] eVarArr = (e[]) cVar3.h(this.f1471g);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                e eVar = eVarArr[0];
                e[] eVarArr2 = {eVar};
                cVar2 = c.c(eVarArr2, this.f1471g);
                e eVar2 = eVarArr[1];
                e[] eVarArr3 = {eVar2};
                cVar = c.c(eVarArr3, this.f1471g);
            } else {
                int[] iArr = (int[]) cVar3.h(this.f1471g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVar2 = c.d(iArr[0], this.f1471g);
                cVar = c.d(iArr[1], this.f1471g);
            }
            hashMapArr[i8].put("ImageWidth", cVar2);
            hashMapArr[i8].put("ImageLength", cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i8].get("ImageLength");
            c cVar9 = (c) hashMapArr[i8].get("ImageWidth");
            if (cVar8 == null || cVar9 == null) {
                c cVar10 = (c) hashMapArr[i8].get("JPEGInterchangeFormat");
                c cVar11 = (c) hashMapArr[i8].get("JPEGInterchangeFormatLength");
                if (cVar10 != null && cVar11 != null) {
                    int f8 = cVar10.f(this.f1471g);
                    int f9 = cVar10.f(this.f1471g);
                    fVar.l((long) f8);
                    byte[] bArr = new byte[f9];
                    fVar.read(bArr);
                    f(new b(bArr), f8, i8);
                }
            }
        } else {
            int f10 = cVar4.f(this.f1471g);
            int f11 = cVar6.f(this.f1471g);
            int f12 = cVar7.f(this.f1471g);
            int f13 = cVar5.f(this.f1471g);
            if (f11 > f10 && f12 > f13) {
                c d8 = c.d(f11 - f10, this.f1471g);
                c d9 = c.d(f12 - f13, this.f1471g);
                hashMapArr[i8].put("ImageLength", d8);
                hashMapArr[i8].put("ImageWidth", d9);
            }
        }
    }

    public final void y() {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap[] hashMapArr = this.e;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && o(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!o(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        u(0, "ThumbnailOrientation", "Orientation");
        u(0, "ThumbnailImageLength", "ImageLength");
        u(0, "ThumbnailImageWidth", "ImageWidth");
        u(5, "ThumbnailOrientation", "Orientation");
        u(5, "ThumbnailImageLength", "ImageLength");
        u(5, "ThumbnailImageWidth", "ImageWidth");
        u(4, "Orientation", "ThumbnailOrientation");
        u(4, "ImageLength", "ThumbnailImageLength");
        u(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
