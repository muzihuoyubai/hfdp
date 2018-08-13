package com.hyb.hfdp.chapter03.charlowcase;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author HYB
 * @since 2018/8/13 23:12
 **/
public class LowcaseInputStream extends FilterInputStream {
    
    public LowcaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int readChar = super.read();
        if (readChar == -1) {
            return readChar;
        } else {
            return Character.toLowerCase(readChar);
        }
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int count = super.read(b, off, len);
        if (count != 0) {
            for (int i = off; i < off + count; i++) {
                b[i] = (byte) Character.toLowerCase(b[i]);
            }
        }
        return count;
    }
}
