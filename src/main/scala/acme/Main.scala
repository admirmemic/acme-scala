package acme

import org.slf4j.{LoggerFactory, MDC}

object Main extends App {
  val logger = LoggerFactory.getLogger(Main.getClass)
  MDC.put("correlation_id", "42")
  logger.info("This log event will have the 'correlation_id' in the MDC")

  val anotherThread = new Thread() {
    override def run(): Unit = {
      logger.info("This log event will not have the 'correlation_id' in the MDC because it is logged in another thread")
    }
  }

  anotherThread.start()
  anotherThread.join()
}
