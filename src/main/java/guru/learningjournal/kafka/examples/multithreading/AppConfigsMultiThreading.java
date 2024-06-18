package guru.learningjournal.kafka.examples.multithreading;

class AppConfigsMultiThreading {
//    final static String applicationID = "StorageDemo";
//    final static String bootstrapServers = "localhost:9092,localhost:9093";
//    final static String topicName = "invoice";
//    final static int numEvents = 500000;


    // for multithreading example

    final static String applicationID = "Multi-Threaded-Producer";
    final static String topicName = "nse-eod-topic";
    final static String kafkaConfigFileLocation = "kafka.properties";
    final static String[] eventFiles = {"data/NSE05NOV2018BHAV.csv","data/NSE06NOV2018BHAV.csv"};

}
