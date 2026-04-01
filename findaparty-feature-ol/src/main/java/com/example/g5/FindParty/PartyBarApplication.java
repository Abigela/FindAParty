package com.example.g5.FindParty;

import Model.Club;
import Model.Events;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PartyBarApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartyBarApplication.class, args);
		SpringApplication.run(Club.class);
		SpringApplication.run(Events.class);

	}
}