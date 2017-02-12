import com.github.kama.*
import com.github.kama.vcs.GitHubRepository

project("KamaHQ/dummy") {
    repository = GitHubRepository("KamaHQ", "testcontainers-java-examples")

    triggers {
        cron("0 */10 * * * *")
        vcs()
    }
}

project("KamaHQ/dummy-fork") {
    repository = GitHubRepository("KamaHQ", "testcontainers-java-examples")

    triggers {
        cron("0 */5 * * * *")
    }
}
