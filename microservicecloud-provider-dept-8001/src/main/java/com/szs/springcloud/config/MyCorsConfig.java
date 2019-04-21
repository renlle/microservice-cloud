package com.szs.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 描述： 使用Filter 处理跨域请求，即CORS（跨来源资源共享）。
 *
 * @author city space
 *
 */
@Configuration
public class MyCorsConfig
{
    /**
     * 设置 跨域请求参数，处理跨域请求
     *
     * @return
     */
    @Bean
    public CorsFilter corsFilter()
    {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }



    private CorsConfiguration buildConfig()
    {
        CorsConfiguration corsConfiguration = new CorsConfiguration();

// 允许跨域访问的域名
        corsConfiguration.addAllowedOrigin("*");
// 请求头
        corsConfiguration.addAllowedHeader("*");
// 请求方法
        corsConfiguration.addAllowedMethod(HttpMethod.DELETE);
        corsConfiguration.addAllowedMethod(HttpMethod.POST);
        corsConfiguration.addAllowedMethod(HttpMethod.GET);
        corsConfiguration.addAllowedMethod(HttpMethod.PUT);
        corsConfiguration.addAllowedMethod(HttpMethod.DELETE);
        corsConfiguration.addAllowedMethod(HttpMethod.OPTIONS);
// 预检请求的有效期，单位为秒。
        corsConfiguration.setMaxAge(3600L);
// 是否支持安全证书
        corsConfiguration.setAllowCredentials(true);

        return corsConfiguration;
    }
}