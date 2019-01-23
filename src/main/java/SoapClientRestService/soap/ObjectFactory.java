
package SoapClientRestService.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the SoapClientRestService.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RemoveAllMessages_QNAME = new QName("http://webService/", "removeAllMessages");
    private final static QName _GetAllMessages_QNAME = new QName("http://webService/", "getAllMessages");
    private final static QName _RemoveAllMessagesResponse_QNAME = new QName("http://webService/", "removeAllMessagesResponse");
    private final static QName _UpdateMessage_QNAME = new QName("http://webService/", "updateMessage");
    private final static QName _GetAllMessagesResponse_QNAME = new QName("http://webService/", "getAllMessagesResponse");
    private final static QName _UpdateMessageResponse_QNAME = new QName("http://webService/", "updateMessageResponse");
    private final static QName _AddMessageResponse_QNAME = new QName("http://webService/", "addMessageResponse");
    private final static QName _Message_QNAME = new QName("http://webService/", "message");
    private final static QName _GetMessageResponse_QNAME = new QName("http://webService/", "getMessageResponse");
    private final static QName _RemoveMessage_QNAME = new QName("http://webService/", "removeMessage");
    private final static QName _AddMessage_QNAME = new QName("http://webService/", "addMessage");
    private final static QName _RemoveMessageResponse_QNAME = new QName("http://webService/", "removeMessageResponse");
    private final static QName _GetMessage_QNAME = new QName("http://webService/", "getMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: SoapClientRestService.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateMessageResponse }
     * 
     */
    public UpdateMessageResponse createUpdateMessageResponse() {
        return new UpdateMessageResponse();
    }

    /**
     * Create an instance of {@link GetAllMessagesResponse }
     * 
     */
    public GetAllMessagesResponse createGetAllMessagesResponse() {
        return new GetAllMessagesResponse();
    }

    /**
     * Create an instance of {@link GetMessage }
     * 
     */
    public GetMessage createGetMessage() {
        return new GetMessage();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link AddMessageResponse }
     * 
     */
    public AddMessageResponse createAddMessageResponse() {
        return new AddMessageResponse();
    }

    /**
     * Create an instance of {@link AddMessage }
     * 
     */
    public AddMessage createAddMessage() {
        return new AddMessage();
    }

    /**
     * Create an instance of {@link RemoveMessageResponse }
     * 
     */
    public RemoveMessageResponse createRemoveMessageResponse() {
        return new RemoveMessageResponse();
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link RemoveMessage }
     * 
     */
    public RemoveMessage createRemoveMessage() {
        return new RemoveMessage();
    }

    /**
     * Create an instance of {@link GetAllMessages }
     * 
     */
    public GetAllMessages createGetAllMessages() {
        return new GetAllMessages();
    }

    /**
     * Create an instance of {@link RemoveAllMessages }
     * 
     */
    public RemoveAllMessages createRemoveAllMessages() {
        return new RemoveAllMessages();
    }

    /**
     * Create an instance of {@link RemoveAllMessagesResponse }
     * 
     */
    public RemoveAllMessagesResponse createRemoveAllMessagesResponse() {
        return new RemoveAllMessagesResponse();
    }

    /**
     * Create an instance of {@link UpdateMessage }
     * 
     */
    public UpdateMessage createUpdateMessage() {
        return new UpdateMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAllMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "removeAllMessages")
    public JAXBElement<RemoveAllMessages> createRemoveAllMessages(RemoveAllMessages value) {
        return new JAXBElement<RemoveAllMessages>(_RemoveAllMessages_QNAME, RemoveAllMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getAllMessages")
    public JAXBElement<GetAllMessages> createGetAllMessages(GetAllMessages value) {
        return new JAXBElement<GetAllMessages>(_GetAllMessages_QNAME, GetAllMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAllMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "removeAllMessagesResponse")
    public JAXBElement<RemoveAllMessagesResponse> createRemoveAllMessagesResponse(RemoveAllMessagesResponse value) {
        return new JAXBElement<RemoveAllMessagesResponse>(_RemoveAllMessagesResponse_QNAME, RemoveAllMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "updateMessage")
    public JAXBElement<UpdateMessage> createUpdateMessage(UpdateMessage value) {
        return new JAXBElement<UpdateMessage>(_UpdateMessage_QNAME, UpdateMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getAllMessagesResponse")
    public JAXBElement<GetAllMessagesResponse> createGetAllMessagesResponse(GetAllMessagesResponse value) {
        return new JAXBElement<GetAllMessagesResponse>(_GetAllMessagesResponse_QNAME, GetAllMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "updateMessageResponse")
    public JAXBElement<UpdateMessageResponse> createUpdateMessageResponse(UpdateMessageResponse value) {
        return new JAXBElement<UpdateMessageResponse>(_UpdateMessageResponse_QNAME, UpdateMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "addMessageResponse")
    public JAXBElement<AddMessageResponse> createAddMessageResponse(AddMessageResponse value) {
        return new JAXBElement<AddMessageResponse>(_AddMessageResponse_QNAME, AddMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getMessageResponse")
    public JAXBElement<GetMessageResponse> createGetMessageResponse(GetMessageResponse value) {
        return new JAXBElement<GetMessageResponse>(_GetMessageResponse_QNAME, GetMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "removeMessage")
    public JAXBElement<RemoveMessage> createRemoveMessage(RemoveMessage value) {
        return new JAXBElement<RemoveMessage>(_RemoveMessage_QNAME, RemoveMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "addMessage")
    public JAXBElement<AddMessage> createAddMessage(AddMessage value) {
        return new JAXBElement<AddMessage>(_AddMessage_QNAME, AddMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "removeMessageResponse")
    public JAXBElement<RemoveMessageResponse> createRemoveMessageResponse(RemoveMessageResponse value) {
        return new JAXBElement<RemoveMessageResponse>(_RemoveMessageResponse_QNAME, RemoveMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getMessage")
    public JAXBElement<GetMessage> createGetMessage(GetMessage value) {
        return new JAXBElement<GetMessage>(_GetMessage_QNAME, GetMessage.class, null, value);
    }

}
