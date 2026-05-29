package by.innowise.commonstarter.config.jwt;

import by.innowise.commonstarter.security.JwtTokenProvider;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(JwtSecrets.class)
public class JwtAutoConfiguration {

    @Bean
    public JwtTokenProvider jwtTokenProvider(JwtSecrets jwtSecrets) {
        return new JwtTokenProvider(jwtSecrets);
    }
}