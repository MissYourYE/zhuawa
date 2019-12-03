package strategy_and_factory;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        //网银充值100需要付多少
        Double money = context.calRecharge(100D, RechargeTypeEnum.E_BANK.code());
        System.out.println(money);

        //商户账户充值100需要付多少
        Double money2 = context.calRecharge(100D, RechargeTypeEnum.BUSI_ACCOUNT.code());
        System.out.println(money2);

        //手机充值100需要付多少
        Double money3 = context.calRecharge(100D, RechargeTypeEnum.MOBILE.code());
        System.out.println(money3);

    }
}
