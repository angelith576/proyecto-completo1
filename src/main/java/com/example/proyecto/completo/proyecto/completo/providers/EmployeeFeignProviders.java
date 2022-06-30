package com.example.proyecto.completo.proyecto.completo.providers;



import com.example.proyecto.completo.proyecto.completo.dto.api.ResponseBodyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
            name = "restapiexample",
            url = "${restapiexample.url}"
    )
public interface EmployeeFeignProviders {

        @GetMapping("/employees")
        ResponseBodyDTO getListEmployee();

    }



