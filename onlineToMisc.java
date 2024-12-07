import java.util.Scanner;

public class onlineToMisc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\A");
        System.out.println("Give me the @online annotated bib:");
        String userInput = scanner.next();
        reformat(userInput.trim());
    }

    private static void reformat(String online) {
        try {
            String[] onlineSegments = online.split("url");
            String misc = "@misc" + onlineSegments[0].substring(7) + "howpublished = {\\url{" +
                    onlineSegments[1].split("\\{")[1].replace("},","}},") + "lastchecked = {" +
                    onlineSegments[2].split("\\{")[1];
            System.out.println(misc);
        } catch (Exception e) {
            System.out.println("Incorrectly formatted String");
        }
    }
}
