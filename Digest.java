/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Marina
 */
public class Digest {
    public static String hashString(String message, String algorithm)
            throws HashGenerationException {

        try {
            MessageDigest digest = MessageDigest.getInstance(algorithm);
            byte[] hashedBytes = digest.digest(message.getBytes("UTF-8"));
            return convertByteArrayToHexString(hashedBytes);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            throw new HashGenerationException("Não foi possível gerar um Hash para a senha.");       
        } 
    }

    private static String convertByteArrayToHexString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
                    .substring(1));
        }
        return stringBuffer.toString();
    }

}


