package team.me.membership.adapter.`in`.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
@RestController
class HealthCheckController {
    @GetMapping("/health")
    fun healthCheck(): String {
        return "hello";
    }
}