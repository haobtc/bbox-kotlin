
fun main(args: Array<String>) {
    println("args ${args[0]}")
    var ticketData = cluster.loadTicket()
    //println("hello bbox is running! bindIP =" + ticketData.bindIP + ", name=" + ticketData.name + ", language=" + ticketData.language)
    println("hello bbox is running! bindIP=${ticketData.bindIP}, name=${ticketData.name}, lang=${ticketData.language}")

    cluster.startServer(ticketData.name)
}