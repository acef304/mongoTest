package mongo

import com.mongodb.casbah.Imports._

object TestSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val mongoCon = MongoConnection()                //> SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
                                                  //| SLF4J: Defaulting to no-operation (NOP) logger implementation
                                                  //| SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further de
                                                  //| tails.
                                                  //| mongoCon  : com.mongodb.casbah.MongoConnection = com.mongodb.casbah.MongoCon
                                                  //| nection@10c1a3b4
  val mongoDB = mongoCon("mongo_test")            //> mongoDB  : com.mongodb.casbah.MongoDB = mongo_test
  
 	val mongoCol = mongoDB("users")           //> mongoCol  : com.mongodb.casbah.MongoCollection = MongoCollection({ "_id" : {
                                                  //|  "$oid" : "50ef5d0f44aea36c5fb9b262"} , "user" : "Strange lolka"}, { "_id" :
                                                  //|  { "$oid" : "50ef5d6f44aefa5543bc7efd"} , "user" : "Strange lolka"}, { "_id"
                                                  //|  : "50ef5d0f44aea36c5fb9b263" , "user" : "Very Strange lolka"}, { "_id" : { 
                                                  //| "$oid" : "50ef5d8f44aeb8d642b26da7"} , "user" : "Strange lolka"}, { "_id" : 
                                                  //| { "$oid" : "50ef877d44aedc5440d26d0a"} , "user" : "New lolka" , "email" : "l
                                                  //| ol@lol.com"}, { "_id" : { "$oid" : "50ef888944aee3b85663b546"} , "user" : "N
                                                  //| ew lolka" , "email" : "lol@lol.com"}, { "_id" : { "$oid" : "50ef889844ae7be6
                                                  //| a79e101b"} , "user" : "New lolka" , "email" : "lol@lol.com"}, { "_id" : { "$
                                                  //| oid" : "50ef88b644ae701cbf08f2e8"} , "user" : "New lolka" , "email" : "lol@l
                                                  //| ol.com"})
  	
 	mongoCol += MongoDBObject("user" -> "New lolka", "email" -> "lol@lol.com")
                                                  //> res0: com.mongodb.WriteResult = N/A
                
  val q = "email" $exists true                    //> q  : com.mongodb.casbah.query.Imports.DBObject with com.mongodb.casbah.query
                                                  //| .dsl.QueryExpressionObject = { "email" : { "$exists" : true}}
                      
  val r = mongoCol.findOne(q)                     //> r  : Option[mongo.TestSheet.mongoCol.T] = Some({ "_id" : { "$oid" : "50ef877
                                                  //| d44aedc5440d26d0a"} , "user" : "New lolka" , "email" : "lol@lol.com"})
  
  r match {
  	case None => None
  	case Some(x) => x("email")
  }                                               //> res1: AnyRef = lol@lol.com
  
 	
  //mongoCol += MongoDBObject("_id" -> "50ef5d0f44aea36c5fb9b263", "user" -> "Very Strange lolka")
 	
 	
}