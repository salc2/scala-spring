package hello

import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {
    val counter = new AtomicLong()

    @RequestMapping(value = Array("/greeting"))
    def greeting(@RequestParam(value = "name", defaultValue = "World") name:String) = {
	val id = counter.incrementAndGet()
	Greeting(id, s"Hello, $name" )
	}
    
}
