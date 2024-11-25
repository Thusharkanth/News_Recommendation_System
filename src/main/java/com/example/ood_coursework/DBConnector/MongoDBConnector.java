package com.example.ood_coursework.DBConnector;
import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


public class MongoDBConnector {

        private static MongoClient mongoClient; // MongoClient instance
        private static MongoDatabase database; // Database instance
        private static final String CONNECTION_STRING = "mongodb://localhost:27017"; // MongoDB connection string
        private static final String DATABASE_NAME = "PersonalizedNews"; // Database name

        // Static method to get the database instance
        public static MongoDatabase getDatabase() {
            try {
                // Initialize MongoClient if not already created
                if (mongoClient == null) {
                    ConnectionString connectionString = new ConnectionString(CONNECTION_STRING);
                    mongoClient = MongoClients.create(connectionString);
                    System.out.println("MongoDB client created successfully.");
                }

                // Get database instance if not already retrieved
                if (database == null) {
                    database = mongoClient.getDatabase(DATABASE_NAME);
                    System.out.println("Connected to the database: " + DATABASE_NAME);
                }
            } catch (Exception e) {
                System.err.println("An error occurred while connecting to the database: " + e.getMessage());
            }
            return database;
        }
    }

