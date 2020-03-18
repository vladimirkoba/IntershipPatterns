package ru.liga.pattern.task2.entity;

import java.math.BigDecimal;

public class CreditRequest {
    private final String fio;
    private final BigDecimal sum;
    private final String param1;
    private final String param2;
    private final String param3;
    private final String param4;
    private final String param5;
    private final String param6;
    private final String param7;

    private CreditRequest(String fio, BigDecimal sum, String param1, String param2, String param3, String param4, String param5, String param6, String param7) {
        this.fio = fio;
        this.sum = sum;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
        this.param6 = param6;
        this.param7 = param7;
    }


    public static Builder create(String fio, BigDecimal sum) {
        return new Builder(fio, sum);
    }

    public static class Builder {
        private String fio;
        private BigDecimal sum;
        private String param1;
        private String param2;
        private String param3;
        private String param4;
        private String param5;
        private String param6;
        private String param7;

        public Builder(String fio, BigDecimal sum) {
            this.fio = fio;
            this.sum = sum;
            this.param1 = "";
            this.param2 = "";
            this.param3 = "";
            this.param4 = "";
            this.param5 = "";
            this.param6 = "";
            this.param7 = "";
        }


        public Builder setParam1(String param1) {
            this.param1 = param1;
            return this;
        }

        public Builder setParam2(String param2) {
            this.param2 = param2;
            return this;
        }

        public Builder setParam3(String param3) {
            this.param3 = param3;
            return this;
        }

        public Builder setParam4(String param4) {
            this.param4 = param4;
            return this;
        }

        public Builder setParam5(String param5) {
            this.param5 = param5;
            return this;
        }

        public Builder setParam6(String param6) {
            this.param6 = param6;
            return this;
        }

        public Builder setParam7(String param7) {
            this.param7 = param7;
            return this;
        }

        public CreditRequest build() {
            return new CreditRequest(
                    fio,
                    sum,
                    param1,
                    param2,
                    param3,
                    param4,
                    param5,
                    param6,
                    param7);
        }

    }

    @Override
    public String toString() {
        return "CreditRequest{" +
                "fio='" + fio + '\'' +
                ", sum=" + sum +
                ", param1='" + param1 + '\'' +
                ", param2='" + param2 + '\'' +
                ", param3='" + param3 + '\'' +
                ", param4='" + param4 + '\'' +
                ", param5='" + param5 + '\'' +
                ", param6='" + param6 + '\'' +
                ", param7='" + param7 + '\'' +
                '}';
    }
}
