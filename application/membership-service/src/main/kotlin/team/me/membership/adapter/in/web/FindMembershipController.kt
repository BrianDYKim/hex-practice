package team.me.membership.adapter.`in`.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import team.me.common.annotations.WebAdapter
import team.me.common.result.ResultFactory
import team.me.common.result.Results
import team.me.membership.application.port.`in`.query.FindMembershipQuery
import team.me.membership.application.service.FindMembershipService
import team.me.membership.domain.Membership

/**
 * @author Doyeop Kim
 * @since 2024/01/14
 */
@WebAdapter
@RestController
@RequestMapping("/api/membership")
class FindMembershipController(private val findMembershipService: FindMembershipService) {
    @GetMapping("/{membershipId}")
    fun findMembershipByMemberId(@PathVariable membershipId: String): Results.Single<Membership?> {
        val query = FindMembershipQuery(membershipId)

        val findMembershipResult = findMembershipService.fineMembership(query)

        return findMembershipResult?.let { ResultFactory.generateSingleSuccess(it) }
            ?: ResultFactory.generateSingleFailWithNullable(null)
    }
}