package com.TodoCode.Odontologo.Controller;

import com.TodoCode.Odontologo.Paciente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class odontologoController {
    @GetMapping("/traerTodosPaciente")
    public List<Paciente> traerTodosPacientes(){
        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        cargarListaPacientes(listaPacientes);
        return listaPacientes;
    }
    
    @GetMapping("/traerTodosPacienteMenores")
    public List<Paciente> traerTodosPacientesMenores(){
        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        cargarListaPacientes(listaPacientes);
        
        List<Paciente> listaPacientesMenores = new ArrayList<Paciente>();
        for (Paciente paciente : listaPacientes) {
            Period anos = Period.between(paciente.getFechaNacimiento(),LocalDate.now());
            
            System.out.println(anos.getYears());
            
            if(anos.getYears() < 18){
                listaPacientesMenores.add(paciente);
            }
        }
        
        return listaPacientesMenores;
    }
    
    
    private void cargarListaPacientes(List<Paciente> listReference){
        listReference.add(new Paciente(1,1,"pedro","martinez",LocalDate.of(2020,7,12)));
        listReference.add(new Paciente(2,2,"paco","perez",LocalDate.of(2021,7,12)));
        listReference.add(new Paciente(3,3,"alejandra","dias",LocalDate.of(2000,7,12)));
        listReference.add(new Paciente(4,4,"almejandra","sanchez",LocalDate.of(2001,7,12)));
        listReference.add(new Paciente(5,5,"chino","flores",LocalDate.of(2018,7,12)));
        listReference.add(new Paciente(6,6,"nacho","alvares",LocalDate.of(1998,7,12)));
        listReference.add(new Paciente(7,7,"bogueto","silva",LocalDate.of(1980,7,12)));
        listReference.add(new Paciente(8,8,"yerimua","vargas",LocalDate.of(1997,7,12)));
        listReference.add(new Paciente(9,9,"tokisha","rojas",LocalDate.of(2005,7,12)));
        listReference.add(new Paciente(10,10,"lunaBella","aguilar",LocalDate.of(2003,7,12)));
    }
}
