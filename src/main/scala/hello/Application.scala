package hello

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object Application {

    def main(args:Array[String]) =
        SpringApplication.run(Application.getClass, args)
}
