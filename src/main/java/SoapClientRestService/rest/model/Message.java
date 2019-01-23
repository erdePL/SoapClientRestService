package SoapClientRestService.rest.model;

import java.util.Date;

public class Message {
    private long id;
    private String messageContent;
    private Date creationDate;
    private String author;
    public Message(SoapClientRestService.soap.Message message){
        this.id = message.getId();
        this.messageContent = message.getMessageContent();
        this.creationDate = message.getCreationDate().toGregorianCalendar().getTime();
        this.author = message.getAuthor();
    }
    public Message() {
    }
    public Message(long id, String messageContent, String author) {
        this.id = id;
        this.messageContent = messageContent;
        this.creationDate = new Date();
        this.author = author;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getMessageContent() {
        return messageContent;
    }
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
