package hello

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MySpringApplication

object Application {
    def main(args:Array[String]):Unit =
        SpringApplication.run(classOf[MySpringApplication])
}
