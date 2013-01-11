package mongo

import com.mongodb.casbah.Imports._

object TestSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val mongoCon = MongoConnection()                //> SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
                                                  //| SLF4J: Defaulting to no-operation (NOP) logger implementation
                                                  //| SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further de
                                                  //| tails.
                                                  //| mongoCon  : com.mongodb.casbah.MongoConnection = com.mongodb.casbah.MongoCon
                                                  //| nection@33d6798
  val mongoDB = mongoCon("mongo_test")            //> mongoDB  : com.mongodb.casbah.MongoDB = mongo_test
  
 	val mongoCol = mongoDB("users")           //> mongoCol  : com.mongodb.casbah.MongoCollection = MongoCollection({ "_id" : {
                                                  //|  "$oid" : "50ef5d0f44aea36c5fb9b262"} , "user" : "Strange lolka"}, { "_id" :
                                                  //|  { "$oid" : "50ef5d6f44aefa5543bc7efd"} , "user" : "Strange lolka"}, { "_id"
                                                  //|  : "50ef5d0f44aea36c5fb9b263" , "user" : "Very Strange lolka"}, { "_id" : { 
                                                  //| "$oid" : "50ef5d8f44aeb8d642b26da7"} , "user" : "Strange lolka"})
  	
 	/*mongoCol += MongoDBObject("user" -> "Strange lolka")
 	
  mongoCol += MongoDBObject("_id" -> "50ef5d0f44aea36c5fb9b263", "user" -> "Very Strange lolka")
 	*/
 	
 	val q = "user" $exists true               //> q  : com.mongodb.casbah.query.Imports.DBObject with com.mongodb.casbah.query
                                                  //| .dsl.QueryExpressionObject = { "user" : { "$exists" : true}}
        
	val users:List[String] = mongoCol find(q) map(_.toString()) toList
                                                  //> users  : List[String] = List({ "_id" : { "$oid" : "50ef5d0f44aea36c5fb9b262"
                                                  //| } , "user" : "Strange lolka"}, { "_id" : { "$oid" : "50ef5d6f44aefa5543bc7ef
                                                  //| d"} , "user" : "Strange lolka"}, { "_id" : "50ef5d0f44aea36c5fb9b263" , "use
                                                  //| r" : "Very Strange lolka"}, { "_id" : { "$oid" : "50ef5d8f44aeb8d642b26da7"}
                                                  //|  , "user" : "Strange lolka"})

	users                                     //> res0: List[String] = List({ "_id" : { "$oid" : "50ef5d0f44aea36c5fb9b262"} ,
                                                  //|  "user" : "Strange lolka"}, { "_id" : { "$oid" : "50ef5d6f44aefa5543bc7efd"}
                                                  //|  , "user" : "Strange lolka"}, { "_id" : "50ef5d0f44aea36c5fb9b263" , "user" 
                                                  //| : "Very Strange lolka"}, { "_id" : { "$oid" : "50ef5d8f44aeb8d642b26da7"} , 
                                                  //| "user" : "Strange lolka"})
}