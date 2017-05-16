import com.github.kama.*
import com.github.kama.triggers
import com.github.openvcs.github.GitHubRepository

project("KamaHQ/dummy") {
    repository = GitHubRepository("KamaHQ", "testcontainers-java-examples")

    triggers {
        cron("0 */10 * * * *")
        vcs()
    }
}
