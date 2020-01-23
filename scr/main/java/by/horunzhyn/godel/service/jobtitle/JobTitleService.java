package by.horunzhyn.godel.service.jobtitle;

import by.horunzhyn.godel.dao.JobTitleRepository;
import by.horunzhyn.godel.entity.JobTitle;
import by.horunzhyn.godel.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobTitleService extends BaseServiceImpl<JobTitle, JobTitleRepository> {

    @Autowired
    private JobTitleRepository jobTitleRepository;

    @Override
    protected JobTitleRepository getRepository()
    {
        return jobTitleRepository;
    }

}
