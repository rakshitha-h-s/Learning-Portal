package com.effigo.LearningPortal.entity;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long u_id;
	    private String username;
        private String password;	    
	    @Enumerated(EnumType.STRING)
	    private UserType userType; // Enum: LEARNER, AUTHOR
	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "created_on", nullable = false, updatable = false)
	    private LocalDateTime createdOn;
	    public UserType getUserType() {
			return userType;
		}

		public void setUserType(UserType userType) {
			this.userType = userType;
		}
		@Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "updated_on", nullable = false)
	    private LocalDateTime updatedOn;

	    @PrePersist
	    public void onCreate() {
	    	createdOn =  LocalDateTime.now();
	        updatedOn = createdOn;
	    }

	    @PreUpdate
	    public void onUpdate() {
	        updatedOn =LocalDateTime.now();
	    }
	public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
	public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	public enum UserType {
	    ADMIN,
	    AUTHOR,
	    LEARNER
	}

}
