package junit.tutorial.chapter18;

public class StringUtils {

    public static String toSnakeCase(String string) {
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c >= 'A' && c <= 'Z') {
                // 前に文字があるときのみアンダースコアを入れる（"_foo_bar"のようにアンダースコアが先頭にならないように）
                if (sb.length() > 0) {
                    sb.append('_');
                }
                sb.append(new String(new char[] { c }).toLowerCase());
            } else {
                sb.append(c);
            }
        }
        return new String(sb);
    }

}
