package com.github.webee.rn.utils;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;

/**
 * Created by webee on 16/11/24.
 */

public class XReadableMap implements ReadableMap {
    protected ReadableMap readableMap;

    public XReadableMap(ReadableMap readableMap) {
        this.readableMap = readableMap;
    }

    public XReadableArray getXArray(String name) {
        if (readableMap.hasKey(name)) {
            if (readableMap.isNull(name)) {
                return null;
            }
            return new XReadableArray(readableMap.getArray(name));
        }
        return null;
    }

    public XReadableMap getXMap(String name) {
        if (readableMap.hasKey(name)) {
            if (readableMap.isNull(name)) {
                return null;
            }
            return new XReadableMap(readableMap.getMap(name));
        }
        return null;
    }

    public Boolean getDefaultBoolean(String name, Boolean def) {
        if (readableMap.hasKey(name)) {
            if (readableMap.isNull(name)) {
                return null;
            }
            return readableMap.getBoolean(name);
        }
        return def;
    }

    public Boolean getDefaultBoolean(String name) {
        return getDefaultBoolean(name, null);
    }

    public Double getDefaultDouble(String name, Double def) {
        if (readableMap.hasKey(name)) {
            if (readableMap.isNull(name)) {
                return null;
            }
            return readableMap.getDouble(name);
        }
        return def;
    }

    public Double getDefaultDouble(String name) {
        return getDefaultDouble(name, null);
    }

    public Integer getDefaultInt(String name, Integer def) {
        if (readableMap.hasKey(name)) {
            if (readableMap.isNull(name)) {
                return null;
            }
            return readableMap.getInt(name);
        }
        return def;
    }

    public Integer getDefaultInt(String name) {
        return getDefaultInt(name, null);
    }

    public Long getDefaultLong(String name, Long def) {
        if (readableMap.hasKey(name)) {
            if (readableMap.isNull(name)) {
                return null;
            }
            return (long)readableMap.getDouble(name);
        }
        return def;
    }

    public Long getDefaultLong(String name) {
        return getDefaultLong(name, null);
    }

    public String getDefaultString(String name, String def) {
        if (readableMap.hasKey(name)) {
            if (readableMap.isNull(name)) {
                return null;
            }
            return readableMap.getString(name);
        }
        return def;
    }

    public String getDefaultString(String name) {
        return getDefaultString(name, null);
    }

    public ReadableArray getDefaultArray(String name) {
        if (readableMap.hasKey(name)) {
            if (readableMap.isNull(name)) {
                return null;
            }
            return readableMap.getArray(name);
        }
        return null;
    }

    public ReadableMap getDefaultMap(String name) {
        if (readableMap.hasKey(name)) {
            if (readableMap.isNull(name)) {
                return null;
            }
            return readableMap.getMap(name);
        }
        return null;
    }

    @Override
    public boolean hasKey(String name) {
        return readableMap.hasKey(name);
    }

    @Override
    public boolean isNull(String name) {
        return readableMap.isNull(name);
    }

    @Override
    public boolean getBoolean(String name) {
        return readableMap.getBoolean(name);
    }

    @Override
    public double getDouble(String name) {
        return readableMap.getDouble(name);
    }

    @Override
    public int getInt(String name) {
        return readableMap.getInt(name);
    }

    @Override
    public String getString(String name) {
        return readableMap.getString(name);
    }

    @Override
    public ReadableArray getArray(String name) {
        return readableMap.getArray(name);
    }

    @Override
    public ReadableMap getMap(String name) {
        return readableMap.getMap(name);
    }

    @Override
    public ReadableType getType(String name) {
        return readableMap.getType(name);
    }

    @Override
    public ReadableMapKeySetIterator keySetIterator() {
        return readableMap.keySetIterator();
    }
}
