package com.javatpoint.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.notificationTemplate;
import com.javatpoint.repository.NotificationDataBase;
//mark class as Controller

@RestController
public class notificationController 
{
@Autowired
NotificationDataBase notifi;

//creating a get mapping that retrieves the detail of a specific notification

@GetMapping("/notification/{notificationid}")
private notificationTemplate getNotification(@PathVariable("notificationid") int notificationid) 
{
return notifi.Read(notificationid);
}
//creating a delete mapping that deletes a specified book

@DeleteMapping("/notification/{notificationid}")
private boolean deleteNotification(@PathVariable("notificationid") int notificationid) 
{
	return notifi.delete(notificationid);
}
//creating post mapping that post the book detail in the database

@PostMapping("/notifications")
private boolean addNotification(@RequestBody notificationTemplate notification) 
{
return	notifi.create(notification);
}
//creating put mapping that updates the book detail 

@PutMapping("/notifications")
private notificationTemplate update(@RequestBody notificationTemplate notification) 
{
	notifi.update(notification);
return notification;
}
}
