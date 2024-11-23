//package com.example.ood_coursework.DBConnector;
//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;
//import com.mongodb.client.MongoDatabase;
//
//public class dbConnector {
//    public class DBConnector {
//        private MongoClient mongoClient;
//        private MongoDatabase database;
//
//        public DBConnector(String uri, String dbName) {
//            mongoClient = new MongoClient(new MongoClientURI(uri));
//            database = mongoClient.getDatabase(dbName);
//        }
//
//        public MongoDatabase getDatabase() {
//            return database;
//        }
//
//        public void close() {
//            mongoClient.close();
//        }
//    }
//}
