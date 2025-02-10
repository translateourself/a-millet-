package com.milletmall.milletgateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author xuxunne
 * @description:
 * @since 2025/1/31 19:03
 */
@Configuration
public class MilletmallCorsConfiguration {
    @Bean
  public CorsWebFilter corsWebFilter(){
      UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
      CorsConfiguration corsConfiguration = new CorsConfiguration();

      corsConfiguration.addAllowedHeader("*");
      corsConfiguration.addAllowedMethod("*");
      corsConfiguration.addAllowedOrigin("*");
      corsConfiguration.setAllowCredentials(true);

      source.registerCorsConfiguration("/**",corsConfiguration);

      return new CorsWebFilter(source);
  }
}
