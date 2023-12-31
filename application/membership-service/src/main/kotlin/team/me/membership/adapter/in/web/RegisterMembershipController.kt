package team.me.membership.adapter.`in`.web

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import team.me.common.annotations.WebAdapter
import team.me.membership.adapter.`in`.web.dto.RegisterMembership
import team.me.membership.application.port.`in`.RegisterMembershipCommand
import team.me.membership.application.port.`in`.RegisterMembershipUseCase

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
@WebAdapter
@RestController
@RequestMapping("/api/membership")
class RegisterMembershipController(
    private val registerMembershipUseCase: RegisterMembershipUseCase
) {
    @PostMapping("/register")
    fun registerMembership(@RequestBody request: RegisterMembership.Request) {
        // --request -> command
        val command = RegisterMembershipCommand(
            name = request.name,
            email = request.email,
            address = request.address,
            isValid = true,
            isCorp = request.isCorp
        )

        // --usecase (command)
        val membership = registerMembershipUseCase.registerMembership(command)
    }
}