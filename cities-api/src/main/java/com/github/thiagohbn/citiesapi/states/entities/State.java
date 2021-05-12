package com.github.thiagohbn.citiesapi.states.entities;

import java.util.List;
import javax.persistence.*;

import com.github.thiagohbn.citiesapi.countries.entities.Country;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

@Entity(name = "State")
@Table(name = "estado")
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;

   //1s
  //@Column(name = "pais")
  //private Integer countryId;

    // 2nd - @ManyToOne
    @ManyToOne // Varios estados têm um único país.
    @JoinColumn(name = "pais", referencedColumnName = "id") // A coluna que faz o relacionamento está na tabela
    private Country country;                                // 'pais' na coluna 'id'.

    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;

    public State() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public List<Integer> getDdd() {
        return ddd;
    }

    public Country getCountry() {
        return country;
    }

  /*public Integer getCountryId() {
      return countryId;
  }*/
}
