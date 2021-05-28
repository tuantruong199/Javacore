package com.vti.enity;

import java.time.LocalDateTime;

public class Exam {
		public int id;
		public String code;
		public String title;
		public CategoryQuestion category;
		public int duration;
		public Account creator;
		public LocalDateTime createDate;
}
