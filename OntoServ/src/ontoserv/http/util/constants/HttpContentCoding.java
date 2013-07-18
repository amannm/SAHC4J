/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ontoserv.http.util.constants;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author Administrator
 */
public enum HttpContentCoding {

    gzip("gzip"),
    compress("compress"),
    deflate("deflate"),
    identity("identity"),
    sdhc("sdhc");
    private final byte[] byteValue;

    private HttpContentCoding(final String s) {
        try {
            this.byteValue = s.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    public byte[] getBytes() {
        return this.byteValue;
    }
}
