package com.iwxyi.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SettingsUtil {

    public static String getVal(Context ct, String key) {
        if (ct == null) {
            return "";
        }
        SharedPreferences sp = ct.getSharedPreferences("config", 0);
        return sp.getString(key, "");
    }

    public static void setVal(Context ct, String key, String val) {
        SharedPreferences sp = ct.getSharedPreferences("config", 0);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(key, val);
        edit.commit();
    }

    public static void setVal(Context ct, String key, int val) {
        SharedPreferences sp = ct.getSharedPreferences("config", 0);
        SharedPreferences.Editor edit = sp.edit();
        edit.putInt(key, val);
        edit.commit();
    }

    public static void setVal(Context ct, String key, long val) {
        SharedPreferences sp = ct.getSharedPreferences("config", 0);
        SharedPreferences.Editor edit = sp.edit();
        edit.putLong(key, val);
        edit.commit();
    }

    public static int getInt(Context ct, String key) {
        if (ct == null) {
            return 0;
        }
        SharedPreferences sp = ct.getSharedPreferences("config", 0);
        return sp.getInt(key, 0);
    }

    public static long getLong(Context ct, String key) {
        if (ct == null) {
            return 0;
        }
        SharedPreferences sp = ct.getSharedPreferences("config", 0);
        return sp.getLong(key, 0);
    }
}
