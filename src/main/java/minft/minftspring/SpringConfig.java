package minft.minftspring;

import minft.minftspring.repository.MemberRepository;
import minft.minftspring.repository.MemoryMemberRepository;
import minft.minftspring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
