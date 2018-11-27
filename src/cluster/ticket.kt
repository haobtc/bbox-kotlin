package cluster
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

data class TicketData(
    val name: String,
    val prefix: String,
    @SerializedName("bind_ip") val bindIP: String,
    val etcd: List<String>,
    val extbind: String,
    @SerializedName("port_range") val portRange: List<Int>,
    val language: String = "kotlin/jvm"
)

fun loadTicket(): TicketData {
    val json = """{
        "bind_ip": "127.0.0.1",
        "etcd": [
            "127.0.0.1:2379"
        ],
        "extbind": "",
        "port_range": ["30000", 31000],
        "name": "testbbox",
        "language": "kotlin/jvm",
        "prefix": "abccdef"
    }
    """.trimIndent()
    return Gson().fromJson(json, TicketData::class.java)
}