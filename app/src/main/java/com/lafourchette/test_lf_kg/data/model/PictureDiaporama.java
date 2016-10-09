package com.lafourchette.test_lf_kg.data.model;

import com.google.gson.annotations.SerializedName;

public class PictureDiaporama {

    @SerializedName("612x344")
    private String _612x344;

    @SerializedName("480x270")
    private String _480x270;

    @SerializedName("240x135")
    private String _240x135;

    @SerializedName("664x374")
    private String _664x374;

    @SerializedName("1350x759")
    private String _1350x759;

    @SerializedName("label")
    private String label;

    public String get_612x344() {
        return _612x344;
    }

    public void set_612x344(String _612x344) {
        this._612x344 = _612x344;
    }

    public String get_480x270() {
        return _480x270;
    }

    public void set_480x270(String _480x270) {
        this._480x270 = _480x270;
    }

    public String get_240x135() {
        return _240x135;
    }

    public void set_240x135(String _240x135) {
        this._240x135 = _240x135;
    }

    public String get_664x374() {
        return _664x374;
    }

    public void set_664x374(String _664x374) {
        this._664x374 = _664x374;
    }

    public String get_1350x759() {
        return _1350x759;
    }

    public void set_1350x759(String _1350x759) {
        this._1350x759 = _1350x759;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "PictureDiaporama{" +
                "_612x344='" + _612x344 + '\'' +
                ", _480x270='" + _480x270 + '\'' +
                ", _240x135='" + _240x135 + '\'' +
                ", _664x374='" + _664x374 + '\'' +
                ", _1350x759='" + _1350x759 + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
