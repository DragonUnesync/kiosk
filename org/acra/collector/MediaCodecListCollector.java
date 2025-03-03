package org.acra.collector;

import D6.b;
import I6.a;
import P6.f;
import W6.d;
import W6.l;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.SparseArray;
import g7.C0996d;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.acra.ReportField;
import org.acra.collector.Collector;
import org.json.JSONArray;
import org.json.JSONObject;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class MediaCodecListCollector extends BaseReportFieldCollector {
    private static final String[] AAC_TYPES = {"aac", "AAC"};
    private static final String[] AVC_TYPES = {"avc", "h264", "AVC", "H264"};
    private static final String COLOR_FORMAT_PREFIX = "COLOR_";
    public static final i Companion = new Object();
    private static final String[] H263_TYPES = {"h263", "H263"};
    private static final String[] MPEG4_TYPES = {"mp4", "mpeg4", "MP4", "MPEG4"};
    private final SparseArray<String> mAACProfileValues = new SparseArray<>();
    private final SparseArray<String> mAVCLevelValues = new SparseArray<>();
    private final SparseArray<String> mAVCProfileValues = new SparseArray<>();
    private final SparseArray<String> mColorFormatValues = new SparseArray<>();
    private final SparseArray<String> mH263LevelValues = new SparseArray<>();
    private final SparseArray<String> mH263ProfileValues = new SparseArray<>();
    private final SparseArray<String> mMPEG4LevelValues = new SparseArray<>();
    private final SparseArray<String> mMPEG4ProfileValues = new SparseArray<>();

    public enum CodecType {
        AVC,
        H263,
        MPEG4,
        AAC;

        static {
            CodecType[] $values;
            $ENTRIES = C0996d.g($values);
        }

        public static a getEntries() {
            return $ENTRIES;
        }
    }

    public MediaCodecListCollector() {
        super(ReportField.MEDIA_CODEC_LIST);
    }

    @TargetApi(16)
    private JSONObject collectCapabilitiesForType(MediaCodecInfo mediaCodecInfo, String str) {
        JSONObject jSONObject = new JSONObject();
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int[] iArr = capabilitiesForType.colorFormats;
        f.b(iArr);
        if (iArr.length != 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(this.mColorFormatValues.get(i));
            }
            jSONObject.put("colorFormats", jSONArray);
        }
        CodecType identifyCodecType = identifyCodecType(mediaCodecInfo);
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
        f.b(codecProfileLevelArr);
        if (codecProfileLevelArr.length != 0) {
            JSONArray jSONArray2 = new JSONArray();
            b g8 = f.g(codecProfileLevelArr);
            while (true) {
                if (!g8.hasNext()) {
                    break;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = (MediaCodecInfo.CodecProfileLevel) g8.next();
                int i8 = codecProfileLevel.profile;
                int i9 = codecProfileLevel.level;
                if (identifyCodecType == null) {
                    jSONArray2.put(i8 + 45 + i9);
                    break;
                }
                int i10 = j.f14289a[identifyCodecType.ordinal()];
                if (i10 == 1) {
                    jSONArray2.put(i8 + this.mAVCProfileValues.get(i8) + "-" + this.mAVCLevelValues.get(i9));
                } else if (i10 == 2) {
                    jSONArray2.put(this.mH263ProfileValues.get(i8) + "-" + this.mH263LevelValues.get(i9));
                } else if (i10 == 3) {
                    jSONArray2.put(this.mMPEG4ProfileValues.get(i8) + "-" + this.mMPEG4LevelValues.get(i9));
                } else if (i10 == 4) {
                    jSONArray2.put(this.mAACProfileValues.get(i8));
                } else {
                    throw new C6.b(0);
                }
            }
            jSONObject.put("profileLevels", jSONArray2);
        }
        return jSONObject;
    }

    @TargetApi(16)
    private JSONObject collectMediaCodecList() {
        prepare();
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        f.b(codecInfos);
        JSONObject jSONObject = new JSONObject();
        int length = codecInfos.length;
        for (int i = 0; i < length; i++) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i];
            JSONObject jSONObject2 = new JSONObject();
            f.b(mediaCodecInfo);
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            jSONObject2.put("name", mediaCodecInfo.getName()).put("isEncoder", mediaCodecInfo.isEncoder());
            JSONObject jSONObject3 = new JSONObject();
            b g8 = f.g(supportedTypes);
            while (g8.hasNext()) {
                String str = (String) g8.next();
                f.b(str);
                jSONObject3.put(str, collectCapabilitiesForType(mediaCodecInfo, str));
            }
            jSONObject2.put("supportedTypes", jSONObject3);
            jSONObject.put(String.valueOf(i), jSONObject2);
        }
        return jSONObject;
    }

    @TargetApi(16)
    private CodecType identifyCodecType(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        f.d(name, "getName(...)");
        for (String c02 : AVC_TYPES) {
            if (d.c0(name, c02)) {
                return CodecType.AVC;
            }
        }
        for (String c03 : H263_TYPES) {
            if (d.c0(name, c03)) {
                return CodecType.H263;
            }
        }
        for (String c04 : MPEG4_TYPES) {
            if (d.c0(name, c04)) {
                return CodecType.MPEG4;
            }
        }
        for (String c05 : AAC_TYPES) {
            if (d.c0(name, c05)) {
                return CodecType.AAC;
            }
        }
        return null;
    }

    private void prepare() {
        try {
            b g8 = f.g(Class.forName("android.media.MediaCodecInfo$CodecCapabilities").getFields());
            while (g8.hasNext()) {
                Field field = (Field) g8.next();
                if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                    String name = field.getName();
                    f.d(name, "getName(...)");
                    if (l.a0(name, COLOR_FORMAT_PREFIX, false)) {
                        this.mColorFormatValues.put(field.getInt((Object) null), field.getName());
                    }
                }
            }
            b g9 = f.g(Class.forName("android.media.MediaCodecInfo$CodecProfileLevel").getFields());
            while (g9.hasNext()) {
                Field field2 = (Field) g9.next();
                if (Modifier.isStatic(field2.getModifiers()) && Modifier.isFinal(field2.getModifiers())) {
                    String name2 = field2.getName();
                    f.d(name2, "getName(...)");
                    if (l.a0(name2, "AVCLevel", false)) {
                        this.mAVCLevelValues.put(field2.getInt((Object) null), field2.getName());
                    } else {
                        String name3 = field2.getName();
                        f.d(name3, "getName(...)");
                        if (l.a0(name3, "AVCProfile", false)) {
                            this.mAVCProfileValues.put(field2.getInt((Object) null), field2.getName());
                        } else {
                            String name4 = field2.getName();
                            f.d(name4, "getName(...)");
                            if (l.a0(name4, "H263Level", false)) {
                                this.mH263LevelValues.put(field2.getInt((Object) null), field2.getName());
                            } else {
                                String name5 = field2.getName();
                                f.d(name5, "getName(...)");
                                if (l.a0(name5, "H263Profile", false)) {
                                    this.mH263ProfileValues.put(field2.getInt((Object) null), field2.getName());
                                } else {
                                    String name6 = field2.getName();
                                    f.d(name6, "getName(...)");
                                    if (l.a0(name6, "MPEG4Level", false)) {
                                        this.mMPEG4LevelValues.put(field2.getInt((Object) null), field2.getName());
                                    } else {
                                        String name7 = field2.getName();
                                        f.d(name7, "getName(...)");
                                        if (l.a0(name7, "MPEG4Profile", false)) {
                                            this.mMPEG4ProfileValues.put(field2.getInt((Object) null), field2.getName());
                                        } else {
                                            String name8 = field2.getName();
                                            f.d(name8, "getName(...)");
                                            if (l.a0(name8, "AAC", false)) {
                                                this.mAACProfileValues.put(field2.getInt((Object) null), field2.getName());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | SecurityException unused) {
        }
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        aVar.i(ReportField.MEDIA_CODEC_LIST, collectMediaCodecList());
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    public Collector.Order getOrder() {
        return Collector.Order.LATE;
    }

    public boolean shouldCollect(Context context, C1395d dVar, ReportField reportField, C1347b bVar) {
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(reportField, "collect");
        f.e(bVar, "reportBuilder");
        return super.shouldCollect(context, dVar, reportField, bVar);
    }
}
