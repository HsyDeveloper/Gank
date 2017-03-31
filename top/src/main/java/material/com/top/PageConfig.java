package material.com.top;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zjl on 16/7/6.
 */
public class PageConfig {
    private static List<String> pageTitles = new ArrayList<String>();

    public static List<String> getPageTitles() {
        pageTitles.clear();
        pageTitles.add("all");
        pageTitles.add("Android");
        pageTitles.add("iOS");
        pageTitles.add("福利");
        return pageTitles;
    }

    private static final String NewFragment = "material.com.news.ui.NewFragment";
    public static final String AllNewsFragment = "material.com.news.ui.AllNewsFragment";

    public static String[] fragmentNames = {
            NewFragment,
            NewFragment,
            NewFragment,
            NewFragment
    };
}