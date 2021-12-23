import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {

    public static String prefix = "/";

    private static final String DISCORD_TOKEN = "OTExMzQwNzA1NjkwMDUwNjAx.YZf-LA.FU4hgBjtYh83D9dczucSP7jM2lU";

    public static void main(String[] args) {

        try {

            JDA jda = JDABuilder.createDefault(DISCORD_TOKEN)
                    .enableIntents(GatewayIntent.GUILD_MEMBERS)
                    .enableIntents(GatewayIntent.GUILD_MESSAGES)
                    .addEventListeners(new JoinGuildListener())
                    .addEventListeners(new UserMessageReceiveEvent())
                    .build();

            jda.awaitReady();

            System.out.println("Finished building JDA");

        } catch(Exception e) {
            System.out.println("Error:" + e);
        }


    }

}
