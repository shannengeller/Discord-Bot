import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

public class JoinGuildListener extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {

        System.out.println("Joined guild?");

        String user = event.getMember().getAsMention();

        JDA client = event.getJDA();
        List<TextChannel> channels = client.getTextChannelsByName("general", true);

        for(TextChannel channel : channels) {
            channel.sendMessage(user + " has joined the discord server, from bot!").queue();
        }
    }

}
