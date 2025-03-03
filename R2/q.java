package r2;

import y2.C1632g;

public enum q implements C1632g {
    TYPE_HEADER_ITEM("header_item", 0),
    TYPE_STRING_ID_ITEM("string_id_item", 1),
    TYPE_TYPE_ID_ITEM("type_id_item", 2),
    TYPE_PROTO_ID_ITEM("proto_id_item", 3),
    TYPE_FIELD_ID_ITEM("field_id_item", 4),
    TYPE_METHOD_ID_ITEM("method_id_item", 5),
    TYPE_CLASS_DEF_ITEM("class_def_item", 6),
    TYPE_MAP_LIST("map_list", 4096),
    TYPE_TYPE_LIST("type_list", 4097),
    TYPE_CLASS_DATA_ITEM("class_data_item", 8192),
    TYPE_CODE_ITEM("code_item", 8193),
    TYPE_STRING_DATA_ITEM("string_data_item", 8194),
    TYPE_ENCODED_ARRAY_ITEM("encoded_array_item", 8197),
    TYPE_ANNOTATIONS_DIRECTORY_ITEM("annotations_directory_item", 8198),
    TYPE_MAP_ITEM("map_item", -1);
    

    /* renamed from: U  reason: collision with root package name */
    public final int f14921U;

    /* renamed from: V  reason: collision with root package name */
    public final String f14922V;

    /* renamed from: W  reason: collision with root package name */
    public final String f14923W;

    /* access modifiers changed from: public */
    q(String str, int i) {
        this.f14921U = i;
        this.f14922V = str;
        this.f14923W = (str.endsWith("_item") ? str.substring(0, str.length() - 5) : str).replace('_', ' ');
    }

    public final String a() {
        return this.f14923W;
    }
}
