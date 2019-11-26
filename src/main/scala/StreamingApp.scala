import com.typesafe.scalalogging.Logger
import configs.FlinkApplicationConfig
import org.apache.flink.streaming.api.scala._

object StreamingApp extends App{

  override def main(args: Array[String]): Unit = super.main(args)

  val logger = Logger(StreamingApp.getClass)

  val streamExecutionEnvironment: StreamExecutionEnvironment  = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(FlinkApplicationConfig.getConfig())

  streamExecutionEnvironment.execute("Generic Streaming Application")

}
