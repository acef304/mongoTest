package mongo

import com.mongodb.casbah.Imports._

object HelloWorld extends App {

  override def main(args: Array[String]): Unit = {
    println("Hello world")
    
    getUserNames() map (println(_))
  }

  def getUserNames(): List[String] = {
    val mongoCon = MongoConnection()

    val mongoDB = mongoCon("mongo_test")

    val mongoCol = mongoDB("users")
    
    //val q = "user" $exists true
        
    //val users:List[String] = mongoCol find(MongoDBObject("user" -> ".*Very.*".r)) map(_.toString()) toList
    
    val users:List[String] = mongoCol find() map(_.toString()) toList
    
    users    
  }

}