package com.msvvdv.bosessionscore.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.LocalTime;

@Data
@ToString
@EqualsAndHashCode
@Document(collection = "session")
public class Session {

	@Id
	@Field("_id")
	private String idMongo;

	@Setter
	private Long id;

	private Room room;

	private Long idMovie;
		
	private LocalTime horario;

	private BigDecimal price;
}