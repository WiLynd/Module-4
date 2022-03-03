package medical.service;

import medical.model.MedicalForm;
import medical.repository.IMedicalFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalFormService implements IMedicalForm{
    @Autowired
    IMedicalFormRepository iMedicalFormRepository;
    @Override
    public List<MedicalForm> findAll() {
        return iMedicalFormRepository.findAll();
    }

    @Override
    public void creat(MedicalForm medicalForm) {
        iMedicalFormRepository.create(medicalForm);
    }
}
