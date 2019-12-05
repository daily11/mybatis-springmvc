//package com.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//// 扫描 Mapper 接口并容器管理
//@MapperScan(basePackages = MyBatisDB.PACKAGE, sqlSessionFactoryRef = "localSqlSessionFactory")
//
//public class MyBatisDB {
//
//    // 精确到 local 目录，以便跟其他数据源隔离
//    static final String PACKAGE = "com.dao";
//
//    static final String MAPPER_LOCATION = "classpath:mapper/*.xml";
//
//    private String url = "jdbc:mysql://localhost:3306/springboot";
//
//    private String user = "root";
//
//    private String password = "123456";
//
//    private String driverClass = "com.mysql.cj.jdbc.Driver";
//
//    @Bean(name = "localDataSource")
//    public DataSource localDataSource() {
//        DruidDataSource localSource = new DruidDataSource();
//        localSource.setDriverClassName(driverClass);
//        localSource.setUrl(url);
//        localSource.setUsername(user);
//        localSource.setPassword(password);
//        return localSource;
//    }
//
//    @Bean(name = "localTransactionManager")
//    public DataSourceTransactionManager localTransactionManager() {
//        return new DataSourceTransactionManager(localDataSource());
//    }
//
//    @Bean(name = "localSqlSessionFactory")
//    public SqlSessionFactory localSqlSessionFactory(@Qualifier("localDataSource") DataSource localDataSource)
//            throws Exception {
//        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(localDataSource);
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
//                .getResources(MyBatisDB.MAPPER_LOCATION));
//        return sessionFactory.getObject();
//    }
//}
