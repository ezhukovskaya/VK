package application.builders;

import java.util.HashMap;
import java.util.Map;

public class ParamsBuilder {

    private  Map<String, String> builder = new HashMap<>();
    protected final String AMP = "&";


    public ParamsBuilder(String key, String value) {
        this.builder.put(key, value);
    }


    @Override
    public String toString() {
        for (Map.Entry<String, String> item : this.builder.entrySet()) {
            return item.getKey() + item.getValue() + AMP;
        }
        return null;
    }

}
