import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

public class Ch13GuavaExample {
    public static void main(String[] args) throws Exception {
        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
            .maximumSize(100)
            .expireAfterWrite(10, TimeUnit.MINUTES)
            .build(
                new CacheLoader<String, String>() {
                    public String load(String key) {
                        return "Value for " + key;
                    }
                }
            );

        System.out.println(cache.get("key1"));
        System.out.println(cache.get("key2"));
        System.out.println(cache.get("key3"));
    }
}

