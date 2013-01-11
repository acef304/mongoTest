package mongo

import com.mongodb.casbah.Imports._

object TestSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(114); 
  println("Welcome to the Scala worksheet");$skip(38); 
  
  val mongoCon = MongoConnection();System.out.println("""mongoCon  : com.mongodb.casbah.MongoConnection = """ + $show(mongoCon ));$skip(39); 
  val mongoDB = mongoCon("mongo_test");System.out.println("""mongoDB  : com.mongodb.casbah.MongoDB = """ + $show(mongoDB ));$skip(37); 
  
 	val mongoCol = mongoDB("users");System.out.println("""mongoCol  : com.mongodb.casbah.MongoCollection = """ + $show(mongoCol ));$skip(81); val res$0 = 
  	
 	mongoCol += MongoDBObject("user" -> "New lolka", "email" -> "lol@lol.com");System.out.println("""res0: com.mongodb.WriteResult = """ + $show(res$0));$skip(48); 
                
  val q = "email" $exists true;System.out.println("""q  : com.mongodb.casbah.query.Imports.DBObject with com.mongodb.casbah.query.dsl.QueryExpressionObject = """ + $show(q ));$skip(53); 
                      
  val r = mongoCol.findOne(q);System.out.println("""r  : Option[mongo.TestSheet.mongoCol.T] = """ + $show(r ));$skip(70); val res$1 = 
  
  r match {
  	case None => None
  	case Some(x) => x("email")
  };System.out.println("""res1: AnyRef = """ + $show(res$1))}
  
 	
  //mongoCol += MongoDBObject("_id" -> "50ef5d0f44aea36c5fb9b263", "user" -> "Very Strange lolka")
 	
 	
}