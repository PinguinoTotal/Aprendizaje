package com.TodoCode.Restaurante.controller;

import com.TodoCode.Restaurante.Plato;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class applicationController {
    
    @GetMapping("/")
    public String hello(){
        return "seleccione del 1 al 10 para ver los platillos";
    }
    
    @GetMapping("/menu")
    public String traerPlato(@RequestParam int index){
        int fixelIndex = index -1;
        List<Plato> platos= new ArrayList<Plato>();
        String platillo = "";
        platos.add(new Plato(1, "Pizza Margarita", 12.5f, "Deliciosa pizza con salsa de tomate y queso mozzarella."));
        platos.add(new Plato(2, "Hamburguesa con Queso", 8.75f, "Jugosa hamburguesa con carne de res, queso cheddar y vegetales frescos."));
        platos.add(new Plato(3, "Pasta Carbonara", 10.0f, "Pasta italiana con salsa carbonara, panceta y huevo."));
        platos.add(new Plato(4, "Ensalada César", 7.0f, "Ensalada fresca con lechuga romana, aderezo César, y crutones."));
        platos.add(new Plato(5, "Sushi Variado", 15.25f, "Selección de sushi variado con nigiri, sashimi y rolls."));
        platos.add(new Plato(6, "Filete Mignon", 22.5f, "Filete de carne tierna servido con puré de papas y vegetales al vapor."));
        platos.add(new Plato(7, "Paella Valenciana", 18.75f, "Plato de arroz con mariscos, pollo, chorizo y verduras, típico de España."));
        platos.add(new Plato(8, "Tacos de Carnitas", 9.5f, "Tacos mexicanos con carne de cerdo cocida lentamente, cilantro y cebolla."));
        platos.add(new Plato(9, "Lasaña de Carne", 11.0f, "Lasaña italiana con capas de pasta, salsa de carne y queso."));
        platos.add(new Plato(10, "Sopa Ramen", 8.25f, "Sopa japonesa con fideos de ramen, caldo de huesos y huevo."));
        
        platillo = "el platillo que busca es: " + platos.get(fixelIndex).getNombre() + " descripcion: " + platos.get(fixelIndex).getDescripcion() + "con un precio de: " + platos.get(fixelIndex).getPrecio();
        
        return platillo;
    }
    
    

        
    
}
