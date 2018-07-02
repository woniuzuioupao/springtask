package kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 类描述:
 *
 * @author hanyan
 * @createdtime 2018/7/2
 */
@Service
public class MyKafkaProducer {

    private Producer getProducer(){
        Properties props = new Properties();
        props.put("bootstrap.servers", "127.0.0.1:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        Producer<String, String> producer = new KafkaProducer<String,String>(props);
        return producer;
    }

    public void Producer(){
        Producer producer = getProducer();
        producer.send(new ProducerRecord<String, String>("firstTopic", "age", "销冠"));
        for (int i = 0; i < 100; i++){
            producer.send(new ProducerRecord<String, String>("firstTopic", Integer.toString(i), Integer.toString(i)));
        }
        producer.close();
    }

    public void ProducerFile()throws Exception{
        Producer producer = getProducer();
        String filePath = "G:\\kafka_2.12-1.1.0\\test.txt";
        File file = new File(filePath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = null;
        while (bufferedReader.readLine() != null){
            producer.
        }
    }

}
