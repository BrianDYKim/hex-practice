package team.me.membership.adapter.`in`.web

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import team.me.common.annotations.WebAdapter
import team.me.membership.adapter.`in`.web.dto.RegisterMembership

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
@WebAdapter
@RestController
@RequestMapping("/api/membership")
class RegisterMembershipController {
    @PostMapping("/register")
    fun registerMembership(@RequestBody request: RegisterMembership.Request) {
        // --request

        // --request -> command

        // --usecase
    }
}