package org.example.cuisine.service;


import org.example.cuisine.model.Categorie;
import org.example.cuisine.model.Recette;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecetteService {


    private List<Recette> recettes = new ArrayList<>();
    private Integer currentId = 1;


    // creer une recette  -> C

    public Categorie create(Recette recette) {
        recette.setId(currentId++);
        recettes.add(recette);
        return recette.getCategorie();
    }

    // retourner toutes les catégories -> R
    public List<Recette> findAll() {
        return recettes;
    }


    // retourner une catégore par l'id -> R
    public Recette findById(Integer id) {
        for (Recette r : recettes) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null;
    }


    // modifier une catégorie -> U
    public Recette update(Recette recette) {
        for (Recette r : recettes) {
            if (r.getId().equals(recette.getId())) {
                r.setNom(recette.getNom());
                r.setInstruction(recette.getInstruction());
                r.setListeIngredient(recette.getListeIngredient());
                return r;
            }
        }
        return null;
    }

    // supprimer une catégorie -> D
    public void delete(Integer id) {
        for (Recette r : recettes) {
            if (r.getId().equals(id)) {
                recettes.remove(r);
            }
        }
    }
}



















