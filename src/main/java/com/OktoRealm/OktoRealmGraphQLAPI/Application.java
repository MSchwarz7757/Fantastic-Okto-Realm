package com.OktoRealm.OktoRealmGraphQLAPI;

import com.OktoRealm.OktoRealmGraphQLAPI.model.Tasks;
import com.OktoRealm.OktoRealmGraphQLAPI.repository.TasksRepository;
import graphql.Scalars;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext apc = SpringApplication.run(Application.class, args);
/*		for(String s : apc.getBeanDefinitionNames()){
			System.out.println(s);
		}*/
	}

	@Bean
	GraphQLSchema schema() {
		return GraphQLSchema.newSchema()
				.query(GraphQLObjectType.newObject()
						.name("Query")
						.field(field -> field
								.name("id")
								.type(Scalars.GraphQLString)
								.dataFetcher(environment -> "response")
						)
						.build())
				.build();
	}
}
