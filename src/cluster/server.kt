package cluster
import io.javalin.Javalin

fun startServer(name: String) {
    val app = Javalin.create().start(7000)
    app.get("/") { ctx -> ctx.result("Hello " + name) }
}