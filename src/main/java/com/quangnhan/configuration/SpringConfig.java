
package com.quangnhan.configuration;

import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.quangnhan.repository")
@EnableTransactionManagement
public class SpringConfig {
     /*@Bean
    DataSource dataSource(){
         DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/BookDB2");
        dataSource.setUsername("root");
        dataSource.setPassword("766692");
        return dataSource;
    
    } 
    @Bean
   public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource){
       LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
       entityManager.setDataSource((javax.sql.DataSource) dataSource);
       entityManager.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
       entityManager.setPackagesToScan("entity");
       Properties jpaProperties = new Properties();
       jpaProperties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
       // create ban đầu chạy lên nó sẽ khởi tạo lại database bằng entity
       // update là đang có database chỉ thay đổi trong data base inser update delete 
       jpaProperties.setProperty("hibernate.hbm2ddl.auto","update");
       entityManager.setJpaProperties(jpaProperties);
       return entityManager;
   }*/
   @Bean
   public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
       JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
       jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
       return  jpaTransactionManager;
   }
}
