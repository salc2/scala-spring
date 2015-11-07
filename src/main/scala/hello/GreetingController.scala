package hello

import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {
    val counter = new AtomicLong()

    @RequestMapping(value = "/greeting")
    @RequestParam(value = "name", defaultValue = "World")
    def greeting(name:String) = {
	val id = counter.incrementAndGet()
	Greeting(id, s"Hello, $name" )
	}
    
}
