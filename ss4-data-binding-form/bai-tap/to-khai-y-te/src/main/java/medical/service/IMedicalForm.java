package medical.service;

import medical.model.MedicalForm;

import java.util.List;

public interface IMedicalForm {
    public List<MedicalForm> findAll();
    public void creat(MedicalForm medicalForm);
}
