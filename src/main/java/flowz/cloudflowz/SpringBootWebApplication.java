package flowz.cloudflowz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import flowz.cloudflowz.utils.FlowzReceiver;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;

@SpringBootApplication
public class SpringBootWebApplication {

	/*final static String queueName = "flowzQueue";

    @Bean
    Queue queue() {    	
        return new Queue(queueName, false);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("flowzExchange");
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(queueName);
    }

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
            								 MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(queueName);
        container.setMessageListener(listenerAdapter);
        return container;
    }

    @Bean
    FlowzReceiver flowzReceiver() {
        return new FlowzReceiver();
    }

    @Bean
    MessageListenerAdapter listenerAdapter(FlowzReceiver flowzReceiver) {
        return new MessageListenerAdapter(flowzReceiver, "receiveMessage");
    }
    */
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);               
    }
    
}
