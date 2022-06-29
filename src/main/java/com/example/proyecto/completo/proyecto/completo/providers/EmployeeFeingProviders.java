package com.example.proyecto.completo.proyecto.completo.providers;

import com.example.proyecto.completo.api.ResponseBodyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

public interface EmployeeFeingProviders {
    @FeignClient(
            name = "restapiexample",
            url = "${restapiexample.url}"
    )
    public interface EmployeeFeingProvider {

        @GetMapping("/employees")
        ResponseBodyDTO getListEmployee();

    }


}
