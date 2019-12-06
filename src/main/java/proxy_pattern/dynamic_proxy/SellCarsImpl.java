package proxy_pattern.dynamic_proxy;

public class SellCarsImpl implements SellCars {
    @Override
    public void sellBMW() {
        System.out.println("售卖宝马！！！！");
    }

    @Override
    public void sellBenci() {
        System.out.println("售卖奔驰！！！");
    }

    @Override
    public void sellAodi() {
        System.out.println("售卖奥迪！！！");
    }
}
