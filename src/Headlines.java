public class Headlines {
    public static void main(String[] args)
    {
        System.out.printf("The world news headline is '%s'%n",
                                            fetchHeadline("world news"));

        System.out.printf("The sports headline is '%s'%n",
                fetchHeadline("sports"));

        System.out.printf("The politics headline is '%s'%n",
                fetchHeadline("politics"));


    }

    /**
     * This method will return a String with the headline
     * for a given topic
     */
    public static String fetchHeadline(String topic)
    {
        if (topic.equalsIgnoreCase("world news"))
            return "breaking the world";

        if (topic.equalsIgnoreCase("sports"))
            return "new host for baseball";

        if (topic.equalsIgnoreCase("politics"))
            return "Trudeau's horrifying past";

        //default String to return
        return "that topic does not have a headline";
    }
}
