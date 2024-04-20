package com.owol.friko.base.config;

import com.owol.friko.base.util.PropertiesUtil;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.owol.friko.base.mappers", annotationClass = org.apache.ibatis.annotations.Mapper.class)
public class MybatisConfig {
    @Autowired
    ApplicationContext applicationContext;
    // MariaDb 설정

    @Autowired
    private PropertiesUtil propertiesUtil;

    @Bean
    public DataSource getDataSource() {
        String databaseUrl = propertiesUtil.getProperty("mysql.info.url", "");

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver"); // MySQL 드라이버 클래스명
        dataSourceBuilder.driverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy"); // Log4JDBC 드라이버 클래스
        dataSourceBuilder.url("jdbc:mysql://" + databaseUrl); // MySQL 연결 URL
        dataSourceBuilder.username(propertiesUtil.getProperty("mysql.info.usernm", ""));
        dataSourceBuilder.password(propertiesUtil.getProperty("mysql.info.userpw", ""));
        return dataSourceBuilder.build();
    }
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());

        Resource[] mapperLocations = new PathMatchingResourcePatternResolver()
                .getResources("classpath*:static/mappers/**/*.xml");
        sessionFactory.setMapperLocations(mapperLocations);
//        sessionFactory.setTypeAliasesPackage("com.owol.friko.app.dto.*");
//        sessionFactory.setTypeAliasesPackage("com.owol.friko.app.entity.*");
        sessionFactory.setConfigLocation(applicationContext.getResource("classpath:base/mybatis-config.xml"));
        return sessionFactory;
    }
}
