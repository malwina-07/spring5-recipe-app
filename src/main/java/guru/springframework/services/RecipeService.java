package guru.springframework.services;

import guru.springframework.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by @author malwina.k on 22.06.2021
 */
@Service
public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
