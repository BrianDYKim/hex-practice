package team.me.membership.adapter.out.persistence.jpa.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import team.me.membership.adapter.out.persistence.jpa.entity.MembershipJpaEntity

/**
 * @author Doyeop Kim
 * @since 2024/01/07
 */
@Repository
interface SpringDataMembershipRepository : JpaRepository<MembershipJpaEntity, Long> {

}