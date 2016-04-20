package org.andy.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "acct_role")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AcctRole {
  private String id;
  private String name;
  
  @Id
  @Column(name = "id", unique = true, nullable = false, length = 36)
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  @Column(name = "name", nullable = false)
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  
}
