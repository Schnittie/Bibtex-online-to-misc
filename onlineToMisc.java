public class onlineToMisc {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Incorrect number of arguments");
            return;
        }
        String online = args[0];
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
