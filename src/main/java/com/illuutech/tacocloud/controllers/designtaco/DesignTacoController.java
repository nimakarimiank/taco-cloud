package com.illuutech.tacocloud.controllers.designtaco;

import com.illuutech.tacocloud.domains.entities.Ingredients;
import com.illuutech.tacocloud.domains.entities.Ingredients.Type;
import com.illuutech.tacocloud.domains.entities.Taco;
import com.illuutech.tacocloud.domains.entities.TacoOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/design-taco")
@SessionAttributes("tacoOrder")
@Slf4j
public class DesignTacoController {

    @ModelAttribute
    public void addIngredientsToModel(Model model){
        List<Ingredients> ingredients = Arrays.asList(
                new Ingredients("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredients("COTO", "Corn Tortilla", Type.WRAP),
                new Ingredients("GRBF", "Ground Beef", Type.PROTEIN),
                new Ingredients("CARN", "Carnitas", Type.PROTEIN),
                new Ingredients("TMTO", "Diced Tomatoes", Type.VEGGIES),
                new Ingredients("LETC", "Lettuce", Type.VEGGIES),
                new Ingredients("CHED", "Cheddar", Type.CHEESE),
                new Ingredients("JACK", "Monterrey Jack", Type.CHEESE),
                new Ingredients("SLSA", "Salsa", Type.SAUCE),
                new Ingredients("SRCR", "Sour Cream", Type.SAUCE)
        );
    Type[] types = Type.values();
    for (Type type: types){
        model.addAttribute(type.toString().toLowerCase(),filterByType(ingredients,type));

    }
    }

    private Iterable<Ingredients> filterByType(List<Ingredients> ingredients, Type type) {
        return ingredients
                .stream()
                .filter(x->x.getType().equals(type))
                .collect(Collectors.toList());
    }

    @ModelAttribute("tacoOrder")
    public TacoOrder tacoOrder() {
        return new TacoOrder();
    }

    @ModelAttribute("taco")
    public Taco taco() {
        return new Taco();

    }
}
