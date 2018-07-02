package allTest;

import kafka.MyKafkaConsumer;
import kafka.MyKafkaProducer;
import kafka.MyKafkaServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 类描述:
 *
 * @author hanyan
 * @createdtime 2018/7/2
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class KafkaTest {

    @Autowired
    private MyKafkaConsumer myKafkaConsumer;
    @Autowired
    private MyKafkaProducer myKafkaProducer;
    @Autowired
    private MyKafkaServer myKafkaServer;

    @Test
    public void testServerGetTopic(){
        myKafkaServer.ServerGetTopic();
    }
    @Test
    public void testServerCreateTopic(){
        myKafkaServer.ServerCreateTopic("FIRSTTOPIC-NAME",1,(short) 1);
    }

    @Test
    public void testProducer(){
        myKafkaProducer.Producer();
    }
    @Test
    public void testConsumer(){
        myKafkaConsumer.Consumer();
    }

}
