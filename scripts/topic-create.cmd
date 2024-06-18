C:\kafka_2.12-3.4.0\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --topic nse-eod-topic
--partitions 5 --replication-factor 3
--config segment.bytes=1000000