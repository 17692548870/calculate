package Template;

/**
 * @author xinglimin
 * @version v1.0
 * @date 2022/09/14 13:16
 */
public abstract class  DodishTemplate {

    public final void dodish() {

        preparation();

        washVegetables();

        doing();

        eatting();

        if (haveTime()) {
            washDishes();
        }
    }

    protected abstract void preparation();

    protected abstract void washVegetables();

    protected abstract void doing();

    protected void eatting() {
        System.out.println("吃饭");
    }

    //钩子方法
    protected abstract boolean haveTime();

    protected void washDishes() {
        System.out.println("洗碗");
    }
}
