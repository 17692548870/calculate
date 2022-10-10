import com.google.common.collect.Lists;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xlm
 */
public class test {

  private static class Klass {
    private int field;

    public Klass(int field) {
      this.field = field;
    }

    @Override
    public String toString() {
      return "field=" + field;
    }
  }

  private static class KlassGroup {
    private List<Klass> group = new ArrayList<>();

    public KlassGroup(Klass... objList) {
      for (Klass item : objList) {
        this.group.add(item);
      }
    }

    public List<Klass> getKlassList() {
      return group;
    }
  }

  public static void main(String[] args) {
    List<KlassGroup> groupList = Arrays.asList(
            new KlassGroup(new Klass(1), new Klass(2), new Klass(3)),
            new KlassGroup(new Klass(4), new Klass(5), new Klass(6)),
            new KlassGroup(new Klass(7), new Klass(8), new Klass(9)),
            new KlassGroup(new Klass(10))
    );
    List<List<Klass>> result = groupList.stream()
            .map(KlassGroup::getKlassList)
            .collect(Collectors.toList());

    List<Klass> result3 = groupList.stream()
            .flatMap(it -> it.getKlassList().stream())
            .collect(Collectors.toList());

    for (Klass klass : result3) {
      System.out.println(klass.toString());
    }

    List<String> words = Lists.newArrayList("java", "python", "php");
    String collect = words.stream()
            .map((word) -> word.split(""))
            .flatMap(Arrays::stream)
            .distinct()
            .collect(Collectors.joining(","));
    System.out.println(collect);
  }
}
