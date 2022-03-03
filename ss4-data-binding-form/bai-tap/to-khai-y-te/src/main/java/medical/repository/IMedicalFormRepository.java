package medical.repository;

import medical.model.MedicalForm;

import java.util.List;

public interface IMedicalFormRepository {
    public List<MedicalForm> findAll();
    public void create(MedicalForm medicalForm);
}
