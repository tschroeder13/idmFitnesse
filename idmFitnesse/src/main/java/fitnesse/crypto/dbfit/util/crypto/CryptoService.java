package fitnesse.crypto.dbfit.util.crypto;

public interface CryptoService {
    public String encrypt(String msg);
    public String decrypt(String msg);
}

