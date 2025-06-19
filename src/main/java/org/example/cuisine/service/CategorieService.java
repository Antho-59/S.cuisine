package org.example.cuisine.service;


import org.example.cuisine.model.Categorie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategorieService {

    private List<Categorie> categories = new ArrayList<>();
    private Integer currentId = 1;


    // creer une categorie -> C

    public Categorie create(Categorie categorie) {
        categorie.setId(currentId++);
        categories.add(categorie);
        return categorie;
    }

    // retourner toutes les catégories -> R
    public List<Categorie> findAll() {
        return categories;
    }

    // retourner une catégore par l'id -> R
    public Categorie findById(Integer id) {
        for (Categorie c : categories) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
      return null;
    }

    // modifier une catégorie -> U
    public Categorie update(Categorie categorie) {
        for (Categorie c : categories) {
            if (c.getId().equals(categorie.getId())) {
                c.setNom(categorie.getNom());
                c.setDescription(categorie.getDescription());
                return c;
            }
        }
        return null;
    }

    // supprimer une catégorie -> D
    public void delete(Integer id) {
        for (Categorie c : categories) {
            if (c.getId().equals(id)) {
                categories.remove(c);
            }
        }
    }


}




