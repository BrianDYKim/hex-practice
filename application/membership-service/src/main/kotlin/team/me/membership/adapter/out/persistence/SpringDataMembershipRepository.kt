package team.me.membership.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author Doyeop Kim
 * @since 2024/01/07
 */
@Repository
interface SpringDataMembershipRepository : JpaRepository<MembershipJpaEntity, Long> {

}