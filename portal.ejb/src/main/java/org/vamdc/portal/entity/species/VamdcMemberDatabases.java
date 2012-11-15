package org.vamdc.portal.entity.species;

// Generated 18.09.2012 16:57:53 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * VamdcMemberDatabases generated by hbm2java
 */
@Entity
@Table(name = "vamdc_member_databases", catalog = "vamdc_species")
public class VamdcMemberDatabases implements java.io.Serializable {

	private Integer id;
	private String shortName;
	private String description;
	private Set<VamdcMemberDatabaseIdentifiers> vamdcMemberDatabaseIdentifierses = new HashSet<VamdcMemberDatabaseIdentifiers>(
			0);

	public VamdcMemberDatabases() {
	}

	public VamdcMemberDatabases(String shortName) {
		this.shortName = shortName;
	}

	public VamdcMemberDatabases(String shortName, String description,
			Set<VamdcMemberDatabaseIdentifiers> vamdcMemberDatabaseIdentifierses) {
		this.shortName = shortName;
		this.description = description;
		this.vamdcMemberDatabaseIdentifierses = vamdcMemberDatabaseIdentifierses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "short_name", nullable = false, length = 20)
	@NotNull
	@Length(max = 20)
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vamdcMemberDatabases")
	public Set<VamdcMemberDatabaseIdentifiers> getVamdcMemberDatabaseIdentifierses() {
		return this.vamdcMemberDatabaseIdentifierses;
	}

	public void setVamdcMemberDatabaseIdentifierses(
			Set<VamdcMemberDatabaseIdentifiers> vamdcMemberDatabaseIdentifierses) {
		this.vamdcMemberDatabaseIdentifierses = vamdcMemberDatabaseIdentifierses;
	}

}