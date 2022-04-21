package lk.codelabs.rentcloud.rentprocesstask.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class RentProcesServiceImpl implements RentProcesService {

    @Override
    public boolean validateDL(String dlNumber) {
        return dlNumber.length() > 5;
    }
}
