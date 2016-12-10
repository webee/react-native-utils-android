package com.github.webee.rn.utils;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/**
 * Created by webee on 16/11/24.
 */

public class XReadableArray implements ReadableArray {
    protected int size;
    protected ReadableArray readableArray;

    public XReadableArray(ReadableArray readableArray) {
        this.readableArray = readableArray;
        this.size = readableArray.size();
    }

    public XReadableArray getXArray(int index) {
        if (index < size) {
            if (readableArray.isNull(index)) {
                return null;
            }
            return new XReadableArray(readableArray.getArray(index));
        }
        return null;
    }

    public XReadableMap getXMap(int index) {
        if (index < size) {
            if (readableArray.isNull(index)) {
                return null;
            }
            return new XReadableMap(readableArray.getMap(index));
        }
        return null;
    }

    public Boolean getDefaultBoolean(int index, Boolean def) {
        if (index < size) {
            if (readableArray.isNull(index)) {
                return null;
            }
            return readableArray.getBoolean(index);
        }
        return def;
    }

    public Boolean getDefaultBoolean(int index) {
        return getDefaultBoolean(index, null);
    }

    public Double getDefaultDouble(int index, Double def) {
        if (index < size) {
            if (readableArray.isNull(index)) {
                return null;
            }
            return readableArray.getDouble(index);
        }
        return def;
    }

    public Double getDefaultDouble(int index) {
        return getDefaultDouble(index);
    }

    public Integer getDefaultInt(int index, Integer def) {
        if (index < size) {
            if (readableArray.isNull(index)) {
                return null;
            }
            return readableArray.getInt(index);
        }
        return def;
    }

    public Integer getDefaultInt(int index) {
        return getDefaultInt(index, null);
    }

    public Long getDefaultLong(int index, Long def) {
        if (index < size) {
            if (readableArray.isNull(index)) {
                return null;
            }
            return (long)readableArray.getDouble(index);
        }
        return def;
    }

    public Long getDefaultLong(int index) {
        return getDefaultLong(index, null);
    }

    public String getDefaultString(int index, String def) {
        if (index < size) {
            if (readableArray.isNull(index)) {
                return null;
            }
            return readableArray.getString(index);
        }
        return def;
    }

    public String getDefaultString(int index) {
        return getDefaultString(index, null);
    }

    public ReadableArray getDefaultArray(int index) {
        if (index < size) {
            if (readableArray.isNull(index)) {
                return null;
            }
            return readableArray.getArray(index);
        }
        return null;
    }

    public ReadableMap getDefaultMap(int index) {
        if (index < size) {
            if (readableArray.isNull(index)) {
                return null;
            }
            return readableArray.getMap(index);
        }
        return null;
    }

    @Override
    public int size() {
        return readableArray.size();
    }

    @Override
    public boolean isNull(int index) {
        return readableArray.isNull(index);
    }

    @Override
    public boolean getBoolean(int index) {
        return readableArray.getBoolean(index);
    }

    @Override
    public double getDouble(int index) {
        return readableArray.getDouble(index);
    }

    @Override
    public int getInt(int index) {
        return readableArray.getInt(index);
    }

    @Override
    public String getString(int index) {
        return readableArray.getString(index);
    }

    @Override
    public ReadableArray getArray(int index) {
        return readableArray.getArray(index);
    }

    @Override
    public ReadableMap getMap(int index) {
        return readableArray.getMap(index);
    }

    @Override
    public ReadableType getType(int index) {
        return readableArray.getType(index);
    }
}
