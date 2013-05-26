# Gerard Ribas Persistence

##Descritpion
***
Base project for my database layer projects. Using this project you can get the facilities and the simplicity of Spring ORM with Java Persistence Api. Also this project includes an Abstract Jpa Dao that allows to create your database layer quickly and easy to maintain.

##What is in this package
***
	-src
		-es.gerardribas.persistence.dao
			-AbstractDao
			-AbstractJpaDao
		-es.gerardribas.persistence.dao.dao
			-AbstractJpaDaoImpl

	-test

##How it works? Let´s try it!
***
You can use this library as a maven dependency, only that you need is to add the repository in your pom.xml
	
	<repository>
		<id>cloudbees-public-release-repository</id>
		<name>Gerard Ribas Releases</name>
		<url>http://repository-gribas.forge.cloudbees.com/release/</url>
		<layout>default</layout>
	</repository>
	
And then add the dependency:

	<dependency>
		<groupId>es.gerardribas</groupId>
		<artifactId>reporting</artifactId>
		<version>1.0.1-RELEASE</version>
	</dependency>
	
If you need more information about how it works, you can find a lot of tests in src/test/java (entities, daos) and also the spring framework spring configuration.

The project tests use an embedded database (HSQLDB). 

***

##Who am I?

My name is Gerard Ribas and I am an experienced Software Engineer. You can find more information about me in [![Resize icon][1]](ie.linkedin.com/in/gerardribas "Linkedin") or you can follow me in [![Resize icon][2]](https://twitter.com/gerard_ribas "Twitter")

Thank´s for watching!

[1]: http://cdn3.iconfinder.com/data/icons/free-social-icons/67/linkedin_square_color-24.png "Linkedin"

[2]: http://cdn3.iconfinder.com/data/icons/free-social-icons/67/twitter_square-24.png "Twitter"