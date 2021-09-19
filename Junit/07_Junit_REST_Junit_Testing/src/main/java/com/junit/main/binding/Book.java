package com.junit.main.binding;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
}
