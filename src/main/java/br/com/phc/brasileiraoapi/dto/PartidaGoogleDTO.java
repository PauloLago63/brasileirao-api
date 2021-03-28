package br.com.phc.brasileiraoapi.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PartidaGoogleDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String statusPartida;
    private String tempoPartida;
    //Informações equipe casa
    private String nomeEquipeCasa;
    private String urlLogoEquipeCasa;
    private Integer placarEquipeCasa;
    private String golsEquipeCasa;
    private String placarEstendidoEquipeCasa;
    //Informações equipe visitante
    private String nomeEquipeVisistante;
    private String urlLogoEquipeVisitante;
    private Integer placarEquipeVisistante;
    private String golsEquipeVisitante;
    private String placarEstendidoEquipeVisistante;
	
    
    
}
