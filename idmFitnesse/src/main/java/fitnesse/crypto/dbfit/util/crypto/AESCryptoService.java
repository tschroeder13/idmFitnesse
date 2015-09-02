package fitnesse.crypto.dbfit.util.crypto;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class AESCryptoService implements CryptoService {

    private CryptoKeyAccessor keyAccessor;
    private Key key;

    private Key getKey() {
        if (key == null) {
            key = keyAccessor.getKey();
        }

        return key;
    }

    public AESCryptoService(CryptoKeyAccessor keyAccessor) {
        this.keyAccessor = keyAccessor;
    }

    private Cipher getCipher(int opmode) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        byte[] raw = getKey().getEncoded();
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");

        cipher.init(opmode, skeySpec);
        return cipher;
    }

    public String encrypt(String msg) {
        try {
            byte[] encrypted = getCipher(Cipher.ENCRYPT_MODE).doFinal(msg.getBytes());
            return Base64.encodeBase64URLSafeString(encrypted);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String decrypt(String msg) {
        try {
            Cipher cipher = getCipher(Cipher.DECRYPT_MODE);
            byte[] b64 = Base64.decodeBase64(msg.getBytes());
			byte[] decrypted = cipher.doFinal(b64);
            return new String(decrypted);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}

