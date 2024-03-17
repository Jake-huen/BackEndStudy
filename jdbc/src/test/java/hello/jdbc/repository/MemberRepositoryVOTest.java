package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class MemberRepositoryVOTest {

    MemberRepositoryVO repository = new MemberRepositoryVO();

    @Test
    void crud() throws SQLException {
        // save
        Member member = new Member("memverV1", 10000);
        repository.save(member);

        // findById
        Member findMember = repository.findById(member.getMemberId());
        log.info("findMember={}", findMember);
        log.info("member == findMember {}", member == findMember);
        log.info("member eqauls findMember {}", member.equals(findMember)) ;
        assertThat(findMember).isEqualTo(member);
    }

}