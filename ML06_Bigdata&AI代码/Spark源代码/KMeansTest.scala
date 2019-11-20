import org.apache.spark.ml.clustering.KMeans
import org.apache.spark.sql.SparkSession

// please note that this script is the object file, it is not necessary to new a SparkSession if you debug in spark-shell 

object KMeansTest {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("KMeansTest")
      .getOrCreate()
      
    // Loads data.
    val dataset = spark.read.format("libsvm").load("data/mllib/sample_kmeans_data.txt")

    // Trains a k-means model.
    val kmeans = new KMeans().setK(2).setSeed(1L)
    val model = kmeans.fit(dataset)

    // Evaluate clustering by computing Within Set Sum of Squared Errors.
    val WSSSE = model.computeCost(dataset)
    println(s"Within Set Sum of Squared Errors = $WSSSE")

    // Shows the result.
    println("Cluster Centers: ")
    model.clusterCenters.foreach(println)
  }
}