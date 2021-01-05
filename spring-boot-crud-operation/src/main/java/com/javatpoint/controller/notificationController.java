package com.javatpoint.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Type;
import com.javatpoint.model.criteria;
import com.javatpoint.model.notificationTemplate;
import com.javatpoint.repository.NotificationDataBase;
//mark class as Controller

@RestController
public class notificationController 
{
@Autowired
NotificationDataBase notifi;

//creating a get mapping that retrieves the detail of a specific notification

@GetMapping("/notification/{Type}")
private notificationTemplate getNotification(@PathVariable("Type") Type type) 
{
return notifi.Read(type);
}
//get all notification/////////////////////////////////////////////////////

//creating a delete mapping that deletes a specified notification

@DeleteMapping("/notification/{Type}")
private boolean deleteNotification(@PathVariable("type") Type type) 
{
	return notifi.delete(type);
}
//creating post mapping that post the notification detail in the database

@PostMapping("/notifications")
private boolean addNotification(@RequestBody notificationTemplate notification) 
{
return	notifi.create(notification);
}
//creating put mapping that updates the notification detail 

@PutMapping("/notifications")
private boolean update(@RequestBody notificationTemplate notification) 
{
	
return notifi.update(notification);
}

@GetMapping("/SearchNotification/{criteria}")
private ArrayList<notificationTemplate> getNotification(@PathVariable("criteria") criteria searchCriteria) 
{
return notifi.Search(searchCriteria);
}


}