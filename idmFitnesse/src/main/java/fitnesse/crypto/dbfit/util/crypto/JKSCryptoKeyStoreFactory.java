package fitnesse.crypto.dbfit.util.crypto;

import java.io.File;

public class JKSCryptoKeyStoreFactory implements CryptoKeyStoreFactory {

    public CryptoKeyStore newInstance() {
        return new JKSCryptoKeyStore();
    }

    public CryptoKeyStore newInstance(File keyStorePath) {
        return new JKSCryptoKeyStore(keyStorePath);
    }

}

