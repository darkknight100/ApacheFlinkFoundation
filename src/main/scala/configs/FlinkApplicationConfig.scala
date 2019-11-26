package configs

import org.apache.flink.configuration.Configuration


object FlinkApplicationConfig {

  def getConfig(): Configuration = {
    val configuration = new Configuration()
    configuration
  }

}
