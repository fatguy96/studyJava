import org.json.JSONArray;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args){
        System.out.print("hello world");
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        JSONArray jsonArray2 = new JSONArray(list);
        System.out.print(jsonArray2);
    }
}
