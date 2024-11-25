package com.example.ood_coursework.DBConnector;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.*;

public class DBOperations {

    private static MongoDatabase database = MongoDBConnector.getDatabase();


    // common method to retrives all the document from a collection

    public static List<Document> findAll(String collectionName) {
        List<Document> documents = new ArrayList<>();
        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            collection.find().forEach(documents::add);

        }
        catch (Exception e) {
            System.err.println("Error in retriving documents: " + e.getMessage());

        }
        return documents;
    }

    // common method to find a document by filtering

    public static Document findDocument(String collectionName, Bson filter){
        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            return collection.find(filter).first();
            }
        catch (Exception e) {
            System.err.println("Error in finding  documents: " + e.getMessage());
        }
        return null;
    }


    // common method to insert data to db

    public static boolean insertDocument(String collectionName, Document document){
        try {
            MongoCollection<Document> collection =database.getCollection(collectionName);
            collection.insertOne(document);
            return true;
        }
        catch (Exception e) {
            System.err.println("Error in inserting document: " + e.getMessage());
        }
        return false;

    }

    // common method to update a document to db

    public static boolean updateDocument(String collectionName, Bson filter, Bson update){
        try {
            MongoCollection<Document> collection = database .getCollection(collectionName);
            collection.updateOne(filter,update);
            return true;
        }
        catch (Exception e) {
            System.err.println("Error in updating document: " + e.getMessage());
        }
        return false;
    }

    // common method to delete from db

    public static boolean deleteDocument(String collectionName, Bson filter){
        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            collection.deleteOne(filter);
            return true;
        }
        catch (Exception e) {
            System.err.println("Error in deleting document: " + e.getMessage());
        }
        return false;
    }

    // method to validate creadtials

    public static boolean validateCredentials(String collectionName, String username, String password){
        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            Bson filter = and(eq("username", username), eq("password", password));
            Document document = collection.find(filter).first();
            return document != null;    // return true if document found and otherwise fasle

        }
        catch (Exception e) {
            System.err.println("Error in validating document: " + e.getMessage());
        }
        return false;

    }


}
