package strategy_and_factory;

public enum RechargeTypeEnum {

    // 枚举
    E_BANK(1, "网银"),

    BUSI_ACCOUNT(2, "商户账号"),

    MOBILE(3, "手机卡充值"),

    CARD_RECHARGE(4, "充值卡");

    private int code;

    private String description;

    RechargeTypeEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int code() {
        return code;
    }

    public String description() {
        return description;
    }

    public static RechargeTypeEnum valueOf(int code) {
        for (RechargeTypeEnum typeEnum : RechargeTypeEnum.values()) {
            if (typeEnum.code == code) {
                return typeEnum;
            }
        }
        return E_BANK;
    }
}
