package SoapClientRestService.rest.service;

import SoapClientRestService.rest.model.Message;
import SoapClientRestService.soap.Client.SoapClient;
import java.util.ArrayList;
import java.util.List;

public class MessageService {
    public MessageService(){

    }
    public List<Message> getAllMessages(){
        List<SoapClientRestService.soap.Message> soapMessages = SoapClient.getAllMessages();
        List<Message> restMessages = new ArrayList<>();
        for(SoapClientRestService.soap.Message soapMessage : soapMessages){
            restMessages.add( new Message( soapMessage ));
        }
        return restMessages;
    }
    public Message getMessage(int id){
        Message message = new Message( SoapClient.getMessage(id) );
        return message;
    }
    public Message addMessage(Message message){
        if(message.getAuthor()!=null && message.getMessageContent()!=null) {
            SoapClientRestService.soap.Message returnedSoapMessage = SoapClient.addMessage(message.getMessageContent(), message.getAuthor());
            Message convertedToRestMessage = new Message(returnedSoapMessage);
            return convertedToRestMessage;
        }
        else
            return null;
    }
    public Message updateMessage(Message restMessageToPut){
        int intId = (int) restMessageToPut.getId();
        SoapClientRestService.soap.Message soapMessageOld = SoapClient.getMessage(intId);
        if(restMessageToPut.getAuthor()!=null && restMessageToPut.getMessageContent()!=null && soapMessageOld!=null) {
            SoapClientRestService.soap.Message soapMessageReturned = SoapClient.updateMessage(intId, restMessageToPut.getMessageContent(), restMessageToPut.getAuthor());
            Message restMessageReturned = new Message(soapMessageReturned);
            return restMessageReturned;
        }else
            return null;
    }
    public Message removeMessage(long id){
        int intId = (int) id;
        SoapClientRestService.soap.Message soapMessage = SoapClient.removeMessage(intId);
        Message restMessage = new Message(soapMessage);
        return restMessage;
    }
    public String removeAllMessages(){
        return SoapClient.removeAllMessages();
    }
}