package com.fp.common.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author: Denial.AO
 * @date: 2020-12-02 16:48
 * @description: MD5
 **/
public class MD5Util {
    public static String md5(String str) {
        if (str == null) {
            return null;
        }
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            return str;
        } catch (UnsupportedEncodingException e) {
            return str;
        }
        byte[] byteArray = messageDigest.digest();
        StringBuffer md5StrBuff = new StringBuffer();
        int aa;

        for (int i = 0; i < byteArray.length; i++) {
            aa = byteArray[i];
            aa = aa & 0xff;
            if (Integer.toHexString(aa).length() == 1)
                md5StrBuff.append("0").append(Integer.toHexString(aa));
            else
                md5StrBuff.append(Integer.toHexString(aa));
        }
        return md5StrBuff.toString();
    }
}
