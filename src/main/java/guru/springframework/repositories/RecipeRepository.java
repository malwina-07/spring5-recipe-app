package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by @author malwina.k on 21.06.2021
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
