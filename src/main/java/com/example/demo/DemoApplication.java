package com.example.demo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DemoApplication {
	 static String jwtToken = "";
	 static String secretKey = "ARAVINDSAMUDRALfdjhgji9090314kj139daSJNSJSASECRETKEY" ;
	static void validateToken(){
		Claims claims = Jwts.parserBuilder()
				.setSigningKey(secretKey)
				.build()
				.parseClaimsJws(jwtToken)
				.getBody();

		System.out.println("Subject of previous token " + claims.getSubject());
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		validateToken();

//		String email = "aravind1708@gmail.com";
//		long expirationTime = 200202 ;
//		String secretKey = "ARAVINDSAMUDRALfdjhgji9090314kj139daSJNSJSASECRETKEY" ;
//
//		Map<String, Object> claims = new HashMap<>();
//		claims.put("password",  "aravind@123");
//		claims.put("username", "aravindSamudrala");
//
//		String token = Jwts.builder()
//				.setClaims(claims)
//				.setSubject(email)
//				.setExpiration(new Date(System.currentTimeMillis() + expirationTime))
//				.signWith(SignatureAlgorithm.HS256, secretKey)
//				.setIssuedAt(new Date(System.currentTimeMillis()))
//				.compact();
//		System.out.println(token + " JWT TOKEN");
//
//		try{
//			Claims extractedClaims = Jwts.parserBuilder()
//				.setSigningKey(secretKey)
//				.build()
//				.parseClaimsJws(token)
//				.getBody();
//
//			System.out.println(extractedClaims.getSubject() + " SUBJECT");
//		}
//		catch (Exception e){
//			System.out.println(e.getMessage());
//		}

//		System.out.println(extractedClaims.get("password") + "   expiration  : "+ extractedClaims.getExpiration() );


	}

}
