//package com.example.codewars.mapper.task;
//
//import com.example.codewars.dto.task.TaskDetailsResponse;
//import com.example.codewars.dto.task.TaskFileDtoResponse;
//import com.example.codewars.dto.task.TaskResponse;
//import com.example.codewars.entities.Task;
//import com.example.codewars.entities.TaskFile;
//import com.example.codewars.repositories.TaskRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//@RequiredArgsConstructor
//public class TaskMapperImpl implements TaskMapper{
//    private final TaskRepository taskRepository;
//    @Override
//    public List<TaskResponse> newTasksToDtoS() {
//        List<Task> allTasks = taskRepository.findAll();
//        List<TaskResponse> newTasks = new ArrayList<>();
//        for(Task task : allTasks){
//            if(!task.getApproved()){
//                TaskResponse response = new TaskResponse();
//                response.setId(task.getId());
//                response.setName(task.getName());
//                response.setDifficulty(task.getDifficulty().getName());
//                newTasks.add(response);
//            }
//        }
//        return newTasks;
//    }
//    @Override
//    public TaskDetailsResponse taskDetails(Task task) {
//        TaskDetailsResponse response = new TaskDetailsResponse();
//        response.setId(task.getId());
//        response.setName(task.getDifficulty().getName());
//        response.setDescription(task.getDescription());
//        List<TaskFileDtoResponse> taskFileDtoResponses = new ArrayList<>();
//        for(TaskFile taskFile : task.getTaskFiles()){
//            TaskFileDtoResponse taskFileDtoResponse = new TaskFileDtoResponse();
//            taskFileDtoResponse.setId(taskFile.getId());
//            taskFileDtoResponse.setName(taskFile.getName());
//            taskFileDtoResponse.setPath(taskFile.getPath());
//            taskFileDtoResponses.add(taskFileDtoResponse);
//        }
//        response.setTaskFiles(taskFileDtoResponses);
//        response.setPoints(task.getDifficulty().getPoints());
//        response.setSolved(task.getAnswered_users().size());
//        response.setVerified(task.getApproved());
//        return response;
//    }
//    @Override
//    public List<TaskResponse> toDtoS() {
//        List<TaskResponse> responseList = new ArrayList<>();
//        List<Task> allTasks = taskRepository.findAll();
//        for(Task task : allTasks){
//            TaskResponse response = new TaskResponse();
//            response.setId(task.getId());
//            response.setName(task.getName());
//            response.setDifficulty(task.getDifficulty().getName());
//            responseList.add(response);
//        }
//        return responseList;
//    }
//
//}
