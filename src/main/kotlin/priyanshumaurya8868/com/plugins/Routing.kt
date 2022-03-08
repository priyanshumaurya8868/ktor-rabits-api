package priyanshumaurya8868.com.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import priyanshumaurya8868.com.routes.randomRabbit

fun Application.configureRouting() {
    

    routing {

       randomRabbit()

        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
