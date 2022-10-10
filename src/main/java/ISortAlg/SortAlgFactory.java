package ISortAlg;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xinglimin
 * @version v1.0
 * @date 2022/09/14 13:04
 */
public class SortAlgFactory {
    private static final Map<String,ISortAlg> args =  new HashMap<>();

    static {
        args.put("QuickSort",new QuickISortAlg());
        args.put("SlowSort",new SlowSortAlg());
    }

    public ISortAlg getISort(String type) {
        return args.get(type);
    }
}
