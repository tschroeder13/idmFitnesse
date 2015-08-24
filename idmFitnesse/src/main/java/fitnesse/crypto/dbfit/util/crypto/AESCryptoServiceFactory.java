package fitnesse.crypto.dbfit.util.crypto;

public class AESCryptoServiceFactory implements CryptoServiceFactory {

    private static CryptoService cryptoServiceInstance = null; // caching
    private CryptoKeyAccessor keyAccessor;

    public AESCryptoServiceFactory(CryptoKeyAccessor keyAccessor) {
        this.keyAccessor = keyAccessor;
    }

    public AESCryptoServiceFactory() {
        this(CryptoFactories.getCryptoKeyStoreFactory().newInstance());
    }

    public CryptoService getCryptoService() {
        if (cryptoServiceInstance == null) {
            cryptoServiceInstance = new AESCryptoService(keyAccessor);
        }

        return cryptoServiceInstance;
    }

    public CryptoService getCryptoService(CryptoKeyAccessor accessor) {
        return new AESCryptoService(accessor);
    }
}

