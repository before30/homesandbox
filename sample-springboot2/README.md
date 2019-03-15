docker run --name some-cassandra -p 9042:9042 cassandra

brew install cassandra

cqlsh

CREATE KEYSPACE mykeyspace WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

