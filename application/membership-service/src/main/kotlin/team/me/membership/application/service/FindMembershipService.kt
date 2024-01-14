package team.me.membership.application.service

import org.springframework.transaction.annotation.Transactional
import team.me.common.annotations.UseCase
import team.me.membership.adapter.out.persistence.MembershipMapper
import team.me.membership.application.port.`in`.FindMembershipQuery
import team.me.membership.application.port.`in`.FindMembershipUseCase
import team.me.membership.application.port.out.FindMembershipPort
import team.me.membership.domain.Membership

/**
 * @author Doyeop Kim
 * @since 2024/01/14
 */
@UseCase
@Transactional(readOnly = true)
class FindMembershipService(private val findMembershipPort: FindMembershipPort, private val membershipMapper: MembershipMapper): FindMembershipUseCase {
    override fun fineMembership(query: FindMembershipQuery): Membership? {
        return findMembershipPort.findMembership(Membership.Companion.MembershipId(query.id))?.let {
            membershipMapper.mapToDomainEntity(it)
        }
    }
}