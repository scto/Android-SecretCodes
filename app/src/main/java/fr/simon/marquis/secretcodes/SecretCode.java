package fr.simon.marquis.secretcodes;

import android.net.Uri;

import androidx.annotation.NonNull;

class SecretCode {
    private final String code;
    private final String label;
    private final Uri icon;

    public SecretCode(String code, Uri icon, String label) {
        this.code = code;
        this.icon = icon;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public Uri getIcon() {
        return icon;
    }

    public String getCode() {
        return code;
    }

    @NonNull
    @Override
    public String toString() {
        return "SecretCode{" +
                "code='" + code + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}