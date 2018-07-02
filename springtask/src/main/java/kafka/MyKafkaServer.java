package kafka;

import org.apache.kafka.clients.admin.*;
import org.apache.kafka.common.KafkaFuture;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * 类描述:
 *
 * @author hanyan
 * @createdtime 2018/7/2
 */
@Service
public class MyKafkaServer {

    public void ServerCreateTopic(String topicName,int partitions,short replication){
        Properties properties = new Properties();
        properties.put("bootstrap.servers","127.0.0.1:9092");
        AdminClient adminClient = AdminClient.create(properties);
        NewTopic topic1 = new NewTopic(topicName,partitions,replication);
        List<NewTopic> newTopicList = new ArrayList<>();
        newTopicList.add(topic1);
        CreateTopicsResult result = adminClient.createTopics(newTopicList);
        try{
            System.out.println("result.all().get():  "+result.all().get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void ServerGetTopic(){
        Properties properties = new Properties();
        properties.put("bootstrap.servers","127.0.0.1:9092");
        AdminClient adminClient = AdminClient.create(properties);
        NewTopic topic1 = new NewTopic("FIRSTTOPIC-NAME",1,(short) 1);
        List<NewTopic> newTopicList = new ArrayList<>();
        newTopicList.add(topic1);
        ListTopicsResult result = adminClient.listTopics();
        DescribeClusterResult describeClusterResult = adminClient.describeCluster();
        DescribeTopicsResult describeTopicsResult = adminClient.describeTopics(Arrays.asList("firstTopic"));
        try{
            System.out.println("adminClient.listTopics().listings().get():  "+result.listings().get());
            System.out.println("adminClient.listTopics().names():  "+result.names());
            System.out.println("adminClient.listTopics().namesToListings():  "+result.namesToListings());
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$:  ");
            System.out.println("adminClient.describeCluster().controller().get():  "+describeClusterResult.controller().get());
            System.out.println("adminClient.describeTopics(Arrays.asList(\"firstTopic\").get():  "+describeTopicsResult.all().get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
