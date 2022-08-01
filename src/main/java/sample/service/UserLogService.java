package sample.service;

import sample.component.HttpMethod;
import sample.repository.UserLogRepository;

public class UserLogService {

    private final UserLogRepository userLogRepository;

    public UserLogService() {
        this.userLogRepository = new UserLogRepository();
    }

    public boolean log(String username, HttpMethod httpMethod) {
        return this.userLogRepository.insertLog(
                username,
                httpMethod.getIdentifier()
        );
    }
}
