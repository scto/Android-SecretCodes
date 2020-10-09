package fr.simon.marquis.secretcodes;

import android.net.Uri;

import androidx.annotation.NonNull;

class SecretCode {
    private final String code;
    private final String label;
    private final Uri icon;
    private final String packageName;
    private final String componentName;

    public SecretCode(String code, Uri icon, String label, String packageName, String componentName) {
        this.code = code;
        this.icon = icon;
        this.label = label;
        this.packageName = packageName;
        this.componentName = componentName;
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

    public String getPackageName() {
        return packageName;
    }

    public String getComponentName() {
        return componentName;
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