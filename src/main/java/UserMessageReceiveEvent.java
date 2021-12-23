import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class UserMessageReceiveEvent extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        JDA jda = event.getJDA();

        User author = event.getAuthor();

        MessageChannel channel = event.getChannel();

        channel.sendMessage("Sending a message from bot").queue();
        System.out.println("Message received");
    }

}
