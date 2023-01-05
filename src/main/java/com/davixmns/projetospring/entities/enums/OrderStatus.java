package com.davixmns.projetospring.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final Integer code;

    OrderStatus(Integer code){
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code){
        for (OrderStatus status: OrderStatus.values()) {
            if(status.getCode() == code){
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
