package SoapClientRestService.soap.Client;

import SoapClientRestService.soap.Message;
import SoapClientRestService.soap.MessageService;
import SoapClientRestService.soap.MessageServiceImplService;

import java.util.ArrayList;
import java.util.List;

public class SoapClient {
    private static MessageServiceImplService messageServiceImplService = new MessageServiceImplService();
    private static MessageService messageService = messageServiceImplService.getMessageServiceImplPort();

    public static Message getMessage(int id){
        Message message = messageService.getMessage(id);
        return message;
    }
    public static List<Message> getAllMessages(){
        List<Message> messages = new ArrayList<Message>();
        messages = messageService.getAllMessages();
        return messages;
    }
    public static Message addMessage (String messageContent, String author){
        Message message = new Message();
        message.setMessageContent(messageContent);
        message.setAuthor(author);
        return messageService.addMessage(message);
    }
    public static Message updateMessage(int id, String messageContent, String author){
        Message message = new Message();
        message.setId(id);
        message.setMessageContent(messageContent);
        message.setAuthor(author);
        return messageService.updateMessage(message);
    }
    public static Message removeMessage(int id){
        return messageService.removeMessage(id);
    }
    public static String removeAllMessages(){
        return messageService.removeAllMessages();
    }
}
