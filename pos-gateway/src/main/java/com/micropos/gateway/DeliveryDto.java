package com.micropos.gateway;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class DeliveryDto {
        @JsonProperty("id")
        private Long id;
        @JsonProperty("orderId")
        private Long orderId;
        @JsonProperty("status")
        private StatusEnum status;

        public DeliveryDto() {
        }

        public DeliveryDto id(Long id) {
                this.id = id;
                return this;
        }

        public Long getId() {
                return this.id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public DeliveryDto orderId(Long orderId) {
                this.orderId = orderId;
                return this;
        }

        public @NotNull Long getOrderId() {
                return this.orderId;
        }

        public void setOrderId(Long orderId) {
                this.orderId = orderId;
        }

        public DeliveryDto status(StatusEnum status) {
                this.status = status;
                return this;
        }

        @NotNull
        public @NotNull StatusEnum getStatus() {
                return this.status;
        }

        public void setStatus(StatusEnum status) {
                this.status = status;
        }

        public boolean equals(Object o) {
                if (this == o) {
                        return true;
                } else if (o != null && this.getClass() == o.getClass()) {
                        DeliveryDto delivery = (DeliveryDto)o;
                        return Objects.equals(this.id, delivery.id) && Objects.equals(this.orderId, delivery.orderId) && Objects.equals(this.status, delivery.status);
                } else {
                        return false;
                }
        }

        public int hashCode() {
                return Objects.hash(new Object[]{this.id, this.orderId, this.status});
        }

        public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("class DeliveryDto {\n");
                sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
                sb.append("    orderId: ").append(this.toIndentedString(this.orderId)).append("\n");
                sb.append("    status: ").append(this.toIndentedString(this.status)).append("\n");
                sb.append("}");
                return sb.toString();
        }

        private String toIndentedString(Object o) {
                return o == null ? "null" : o.toString().replace("\n", "\n    ");
        }

        public static enum StatusEnum {
                CREATED("CREATED"),
                DELIVERED("DELIVERED"),
                CANCELED("CANCELED");

                private String value;

                private StatusEnum(String value) {
                        this.value = value;
                }

                @JsonValue
                public String getValue() {
                        return this.value;
                }

                public String toString() {
                        return String.valueOf(this.value);
                }

                @JsonCreator
                public static StatusEnum fromValue(String value) {
                        StatusEnum[] var1 = values();
                        int var2 = var1.length;

                        for(int var3 = 0; var3 < var2; ++var3) {
                                StatusEnum b = var1[var3];
                                if (b.value.equals(value)) {
                                        return b;
                                }
                        }

                        throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }
        }
}
