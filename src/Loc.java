/**
 * Created with IntelliJ IDEA.
 * User: Carlos
 * Date: 11/01/14
 * Time: 12:41
 * To change this template use File | Settings | File Templates.
 */
public class Loc {
    public static int countLines(String content) {
        String[] breakLinesList = content.split("\n");
        int countLines = breakLinesList.length;

        return countLines;
    }
}
