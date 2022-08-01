package sample.controller;

import sample.component.HttpMethod;
import sample.service.UserLogService;

public class SampleController {

    private final UserLogService userLogService;

    public SampleController() {
        this.userLogService = new UserLogService();
    }

    public void index(String username) {
        boolean isLogSuccess = this.userLogService.log(username, HttpMethod.GET);

        System.out.print("Log Service Result: " + isLogSuccess);
    }

    public void store(String username) {
        boolean isLogSuccess = this.userLogService.log(username, HttpMethod.POST);

        System.out.print("Log Service Result: " + isLogSuccess);
    }

    public void update(String username) {
        boolean isLogSuccess = this.userLogService.log(username, HttpMethod.PUT);

        System.out.print("Log Service Result: " + isLogSuccess);
    }

    public void delete(String username) {
        boolean isLogSuccess = this.userLogService.log(username, HttpMethod.DELETE);

        System.out.print("Log Service Result: " + isLogSuccess);
    }
}
