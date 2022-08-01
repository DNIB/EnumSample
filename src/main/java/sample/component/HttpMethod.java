package sample.component;

import lombok.Getter;

public enum HttpMethod {
    GET("get", 0),
    POST("post", 1),
    PUT("put", 2),
    DELETE("delete", 3);

    @Getter
    private final String description;

    @Getter
    private final int identifier;

    HttpMethod(String description, int identifier) {
        this.description = description;
        this.identifier = identifier;
    }
}
