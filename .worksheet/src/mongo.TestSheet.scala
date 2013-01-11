package mongo

import com.mongodb.casbah.Imports._

object TestSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(114); 
  println("Welcome to the Scala worksheet");$skip(38); 
  
  val mongoCon = MongoConnection();System.out.println("""mongoCon  : com.mongodb.casbah.MongoConnection = """ + $show(mongoCon ));$skip(39); 
  val mongoDB = mongoCon("mongo_test");System.out.println("""mongoDB  : com.mongodb.casbah.MongoDB = """ + $show(mongoDB ));$skip(37); 
  
 	val mongoCol = mongoDB("users");System.out.println("""mongoCol  : com.mongodb.casbah.MongoCollection = """ + $show(mongoCol ));$skip(199); 
  	
 	/*mongoCol += MongoDBObject("user" -> "Strange lolka")
 	
  mongoCol += MongoDBObject("_id" -> "50ef5d0f44aea36c5fb9b263", "user" -> "Very Strange lolka")
 	*/
 	
 	val q = "user" $exists true;System.out.println("""q  : com.mongodb.casbah.query.Imports.DBObject with com.mongodb.casbah.query.dsl.QueryExpressionObject = """ + $show(q ));$skip(77); 
        
	val users:List[String] = mongoCol find(q) map(_.toString()) toList;System.out.println("""users  : List[String] = """ + $show(users ));$skip(8); val res$0 = 

	users;System.out.println("""res0: List[String] = """ + $show(res$0))}
}