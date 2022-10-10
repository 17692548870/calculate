package Template;

/**
 * @author xinglimin
 * @version v1.0
 * @date 2022/09/14 13:18
 */
public class EggsWithTomato extends DodishTemplate{
    @Override
    protected void preparation() {
        System.out.println("购买西红柿和鸡蛋");
    }

    @Override
    protected void washVegetables() {
        System.out.println("清洗蔬菜");
    }

    @Override
    protected void doing() {
        System.out.println("开始做西红柿炒鸡蛋");
    }

    @Override
    protected boolean haveTime() {
        return true;
    }
}
