package ejb;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Connection;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import fr.cpe.UserModel;

/**
 * Session Bean implementation class MessageSender
 */
@Stateless
@LocalBean
public class MessageSender {

	@Inject
	JMSContext context;
	@Resource(mappedName = "java:/jms/watcherAuthJMS")
	Topic topic;
	public void sendMessage(String message) {
		
		      try {
		         Session session =connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
		         MessageProducer messageProducer = context.createProducer();
		         TextMessage textMessage = session.createTextMessage(message);
		         messageProducer.send(textMessage);
		      } finally {
		         connection.close();
		      }
		   } catch (JMSException ex) {
		      // handle exception (details omitted)
		   
	}
	public void sendMessage(UserModel user) {
	// TODO
	}

}
