package com.sjq.common.util.phputil;


public interface Serializable {
    byte[] serialize();
    void unserialize(byte[] ss);
}
