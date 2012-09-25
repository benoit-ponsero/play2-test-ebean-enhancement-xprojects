package models;

import javax.persistence.*;
import play.db.ebean.*;

@Entity
public class EntityA extends Model {

	@Id
	public Long id;
} 